import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SupportedClass {
	
	
public void LaunchUrl()
{
	WebDriver driver=new InternetExplorerDriver();
	System.setProperty("webdriver.ie.driver", "./IEDriverServer.exe");
	String ActualTitle="";
	String ExpectedTitle=("Welcome: Mercury Tours");
	String URL="http://newtours.demoaut.com";
	
	
	//Launch URL
driver.get(URL);

//Insert value of title in actual title
ActualTitle=driver.getTitle();

if (ActualTitle.contentEquals(ExpectedTitle))
		{
	System.out.println("Test Passed");
		}
	
else
{
	System.out.println("Test Failed");
}
	
}


}
