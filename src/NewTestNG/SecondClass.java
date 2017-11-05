package NewTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class SecondClass {
	WebDriver driver=new FirefoxDriver();
	
 /* @Test
  @Parameters({"sfname","slname"})
  public void f(String firstname, String lastname) 
  {
	  System.out.println("We are in method f");
	  driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys(firstname);
	  driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys(lastname);
  }*/
  
  @Test(dataProvider="getData")
  public void Barsha(String firstname, String lastname)
  {
	  System.out.println("We are in method Barsha");
	  System.out.println("We are in Method Barsha----" +firstname );
	  System.out.println("We are in Method Barsha--" +lastname );
  }
  
  @DataProvider
  public Object[][] getData()
  {
	  //Rows -Number of times your test has to be repeated
	  //Column-Number of parameter inn test data
	  Object[][] data=new Object[3][2];
	  
	// 1st row
		data[0][0] ="sampleuser1";
		data[0][1] = "abcdef";

		// 2nd row
		data[1][0] ="testuser2";
		data[1][1] = "zxcvb";
		
		// 3rd row
		data[2][0] ="guestuser3";
		data[2][1] = "pass123";

	  return data;
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("We are in BeforeMethod");
	  
	  String path="E:\\selenium\\Workspace\\NewSelenumBasic\\geckodriver.exe";
		System.setProperty("webdiver.FirefoxDriver.driver", path);
		//WebDriver driver=new FirefoxDriver();
		String url="http://toolsqa.com/automation-practice-form/";
		
		//driver.get(url);
		//driver.manage().window().maximize();	
  }
  

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("We are in AfterMethod");
	 // driver.close();
	  
  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("We are in BeforeClass");
  }

}
