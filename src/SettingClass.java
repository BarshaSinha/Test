import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class SettingClass {

	public static void main(String[] args) {
		
		WebDriver driver;
		String path="E:\\selenium\\Workspace\\NewSelenumBasic\\chromedriver.exe";		
		System.setProperty("webdiver.chromedriver.driver", path);
		System.out.println("This is done");
		 driver=new ChromeDriver();		
	 Validation Val=new Validation();
	 Val.operation(driver);	 
	 
	 String path2="E:\\selenium\\Workspace\\NewSelenumBasic\\IEDriverServer.exe";		
		System.setProperty("webdiver.InternetExplorer.driver", path2);
		System.out.println("This is done");
		 driver=new ChromeDriver();		
	 //Validation Val=new Validation();
	 Val.operation(driver);	 

	}

}
