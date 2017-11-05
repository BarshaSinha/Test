import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class TableForeach {

	public static void main(String[] args) {
		String path="E:\\selenium\\Workspace\\NewSelenumBasic\\geckodriver.exe";
		System.setProperty("webdiver.FirefoxDriver.driver", path);
		WebDriver driver=new FirefoxDriver();
				
		String url="http://jqueryui.com/resources/demos/datepicker/other-months.html";
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.id("datepicker")).click();
		String date="26";
		WebElement table=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']"));
		List<WebElement> rowCount=table.findElements(By.xpath("//tr"));
		int TotalRowCount=rowCount.size();				
		System.out.print("row size"+ TotalRowCount);
		
		for (WebElement row:rowCount)
		{
			List<WebElement> columnCount=table.findElements(By.xpath("//td"));
			int TotalColumnCount=columnCount.size();				
			System.out.print("row size"+ TotalColumnCount);
			for(WebElement cell:columnCount)
			{
				if(cell.getText().equals(date))
				{
					driver.findElement(By.linkText(date)).click();
					break;
				}
			}
		}
	
		//table.click();
		//driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[4]/a[text()='"+date+"']")).click();

	}

}
