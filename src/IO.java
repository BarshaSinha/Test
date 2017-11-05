
//ackage excelExportAndFileIO;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IO {
	
	WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		
		IO Obj=new IO();
		//Prepare the path of excel file

	    String filePath = "E:\\selenium\\Webdriver\\Practice\\04_June\\Input from Execlfile";

	    //Call read file method of the class to read data

	    Obj.readExcel(filePath,"InputSheet.xlsx","ExcelGuru99Demo");
	   

	}
	public void readExcel(String filePath,String fileName,String sheetName) throws IOException{

	    //Create an object of File class to open xlsx file

	    File file =    new File(filePath+"\\"+fileName);

	    //Create an object of FileInputStream class to read excel file

	    FileInputStream inputStream = new FileInputStream(file);

	    Workbook guru99Workbook = null;

	    //Find the file extension by splitting file name in substring  and getting only extension name

	    String fileExtensionName = fileName.substring(fileName.indexOf("."));

	    //Check condition if the file is xlsx file

	    if(fileExtensionName.equals(".xlsx")){

	    //If it is xlsx file then create object of XSSFWorkbook class

	    guru99Workbook = new XSSFWorkbook(inputStream);

	    }

	    //Check condition if the file is xls file

	    else if(fileExtensionName.equals(".xls")){

	        //If it is xls file then create object of XSSFWorkbook class

	        guru99Workbook = new HSSFWorkbook(inputStream);

	    }

	    //Read sheet inside the workbook by its name

	    Sheet guru99Sheet = guru99Workbook.getSheet(sheetName);

	    //Find number of rows in excel file

	    int rowCount = guru99Sheet.getLastRowNum()-guru99Sheet.getFirstRowNum();

	    //Create a loop over all the rows of excel file to read it

	    for (int i = 0; i < rowCount+1; i++) {

	        Row row = guru99Sheet.getRow(i);

	        //Create a loop to print cell values in a row

	        for (int j = 0; j < row.getLastCellNum(); j++) {

	            //Print Excel data in console

	            //System.out.print(row.getCell(j).getStringCellValue()+"|| ");
	        	String str=row.getCell(j).getStringCellValue();
	        	String username=row.getCell(j).getStringCellValue();
	        	if (str.contains("Chrome") && username.contains("mercury"))
	        	{
	        		String path="E:\\selenium\\Workspace\\NewSelenumBasic\\chromedriver.exe";		
	        		System.setProperty("webdiver.chromedriver.driver", path);
	        		System.out.println("This is done");
	        		 driver=new ChromeDriver();		
	        	 Validation Val=new Validation();
	        	 Val.operation(driver);	 
	        	 String login=row.getCell(1).getStringCellValue();
	        	 String name=driver.findElement(By.name("userName")).getAttribute("Value");	 
	        	 driver.findElement(By.name("userName")).sendKeys(login);
	        	
	        	 //Or other code is	        	 
	        	 //Val.username=login;
	        	 
	        	 
	        	 
	        	 Cell cell=row.getCell(2);
	        	 
	        	 System.out.println(row.getCell(2));
	        	 if (name.contains("Barsha"))
	        	 {
	        	 cell.setCellValue("Failed");   
	        	 }
	        	}
	        	
	        	/*if (str.contains("IE"))
	        	{
	        		String path="E:\\selenium\\Workspace\\NewSelenumBasic\\IEDriverServer.exe";		
	        		System.setProperty("webdiver.InternetExplorerDriver.driver", path);
	        		System.out.println("This is done");
	        		 driver=new ChromeDriver();		
	        	 Validation Val=new Validation();
	        	 Val.operation(driver);	 
	        	 String login=row.getCell(1).getStringCellValue();
	        	 driver.findElement(By.name("userName")).sendKeys(login);	        	 
	        	 //Or other code is	        	 
	        	 //Val.username=login;
	        	 
	        	 Cell cell=row.getCell(2);
	        	 cell.setCellValue("Passed");     
	        	}*/
	        	
	        }
	        inputStream.close();
	        //Create an object of FileOutputStream class to create write data in excel file

	        FileOutputStream outputStream = new FileOutputStream(file);

	        //write data in the excel file

	        guru99Workbook.write(outputStream);

	        //close output stream

	        outputStream.close();

	    

	       // System.out.println();

	    }

	   
	    }

}
