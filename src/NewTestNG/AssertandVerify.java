package NewTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class AssertandVerify {
	
	public WebDriver driver;
	public String aTitle;
  @Test
  public void Test() {
	  
	  //driver.findElement(By.xpath("//*[@id='content']/form/fieldset/div[1]/input[1]")).sendKeys("Barsha");
	  String eTitle="Demo Form for practicing Selenium Automation";
	  
	  
	  //Compare Actual Title with expected title
	  if(aTitle.equals(eTitle))
	  {
		System.out.println("Test Passed");  
	  }
	  else
	  {
		  System.out.println("Test Failed");
	  }
	Assert.assertEquals(aTitle, eTitle);		  
	System.out.println("Finished");
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  String path="E:\\selenium\\Workspace\\NewSelenumBasic\\geckodriver.exe";
		System.setProperty("webdiver.FirefoxDriver.driver", path);
		WebDriver driver=new FirefoxDriver();
		String url="http://toolsqa.com/automation-practice-form/";
		
		driver.get(url);
		driver.manage().window().maximize();
		aTitle=driver.getTitle();		
		System.out.println(driver.getTitle());
  }


 /* @AfterTest
  public void afterTest() {
	  System.out.println("After Test");
  }*/

}
