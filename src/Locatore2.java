import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class Locatore2 {

	public static void main(String[] args) {
		//String path="E:\\selenium\\Workspace\\NewSelenumBasic\\geckodriver.exe";
		//System.setProperty("webdiver.FirefoxDriver.driver", path);
		//WebDriver driver=new FirefoxDriver();
		
		String path="E:\\selenium\\Workspace\\NewSelenumBasic\\IEDriverServer.exe";
		System.setProperty("webdiver.InternetExplorerDriver.driver", path);
		WebDriver driver=new InternetExplorerDriver();
				
		String url="http://toolsqa.com/automation-practice-form/";
		
		driver.get(url);
		driver.manage().window().maximize();
		//driver.findElement(By.linkText("Partial Link Test")).click();
		//driver.findElement(By.name("firstname")).sendKeys("Barsha");		
		//driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Barsha");
		
		//driver.findElement(By.xpath("//*[@id='content']/form/fieldset/div[1]/input[1]")).sendKeys("Barsha");
		driver.findElement(By.xpath("//*[@class='form-horizontal']//*[@class='control-group']/input[@type='text' and @name='firstname']")).sendKeys("Barsha");
		
		driver.findElement(By.id("sex-1")).click();
		driver.findElement(By.id("exp-6")).click();
		
		driver.findElement(By.id("datepicker")).sendKeys("11-June");
		driver.findElement(By.id("profession-1")).click();
		driver.findElement(By.id("tool-1")).click();
		driver.findElement(By.linkText("Test File to Download")).click();
		Select Continents= new Select(driver.findElement(By.id("continents")));
		Continents.selectByIndex(0);
		
		driver.findElement(By.id("submit")).click();

	}

}
