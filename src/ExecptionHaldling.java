import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExecptionHaldling {

	public static void main(String[] args) {
		String path="E:\\selenium\\Workspace\\NewSelenumBasic\\geckodriver.exe";
		System.setProperty("webdiver.FirefoxDriver.driver", path);
		WebDriver driver=new FirefoxDriver();
		String url="http://toolsqa.com/automation-practice-form/";
		
		driver.get(url);
		driver.manage().window().maximize();
		
		try
		{
		driver.findElement(By.name("name")).sendKeys("Barsha");
		}	
		catch(Exception e)
		{
			System.out.println("Error Message"+ e.getMessage());			
			e.printStackTrace();
			System.out.println("Error Displayed");
		}
		driver.findElement(By.name("firstname")).sendKeys("Barsha");
		System.out.println("Done");
		//driver.findElement(By.xpath("//*[@id='content']/form/fieldset/div[1]/input[2]")).sendKeys("Sinha");
		//driver.findElement(By.xpath("//*[@id='content']/form/fieldset/div[2]/label")).click();
	}

}
