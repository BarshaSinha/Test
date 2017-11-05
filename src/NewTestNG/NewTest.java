package NewTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	/*@Test(priority=4)
	  public void f() {
	  }
	  @Test(priority=1)  
	  public void MyHome() {
		  System.out.println("MyHome");
	  }
	  @Test(priority=2)
	  
	  
	  public void MyConfirmation() {
		  System.out.println("MyConfirmation");
	  }
	  @Test(priority=3)
	  @Parameters("MyName")
	  public void Submit(String MyName) {
		  System.out.println("Parameter value"+MyName);
	  }*/
	
	  @BeforeTest
	  public void beforeMethod() {
		 // System.out.println("I am in BeforeMethod");
		  String path="E:\\selenium\\Workspace\\NewSelenumBasic\\geckodriver.exe";
			System.setProperty("webdiver.FirefoxDriver.driver", path);
			WebDriver driver=new FirefoxDriver();
			String url="http://toolsqa.com/automation-practice-form/";
			
			driver.get(url);
			driver.manage().window().maximize();
	  }
	  
	  @Test(priority=0)
	  public void f() {
		  driver.
	
	  }
	  

	  @AfterTest
	  public void afterTest() {
	  }

	}
