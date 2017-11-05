import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Validation {
	
	public String username="";
	public String Url="http://newtours.demoaut.com";
	public String ExpectedTitle="Welcome: Mercury Tours";
	public String ActualTitle="";		
	
	public void operation(WebDriver d)
	{
		d.get(Url);
		ActualTitle=d.getTitle();
	
	
	System.out.println("Title"+ ActualTitle);
	
		
	if (ActualTitle.contentEquals(ExpectedTitle))
	{
		System.out.println("Test Passed");
		
	}
	else
	{
	System.out.println("Test Failed");	
	}
	
	//Close browser
	
		System.out.println("Username"+ username );
		d.findElement(By.name("userName")).sendKeys(username);
		//d.findElement(By.name("password")).sendKeys(username);
		//d.findElement(By.name("login")).click();
		//d.close();
}
	
	
}

