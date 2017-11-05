import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class OpeningAPage {

	public static void main(String[] args) throws InterruptedException {
		
		//String path="E:\\selenium\\Workspace\\NewSelenumBasic\\chromedriver.exe";
		//String path="E:\\selenium\\Workspace\\NewSelenumBasic\\IEDriverServer.exe";
		//System.setProperty("webdiver.firefox.driver", "./chromedriver.exe");
		//System.setProperty("webdiver.chromedriver.driver", path);
		//System.setProperty("webdiver.InternetExplorerDriver.driver", path);
		//System.out.println("This is done");
		
		//WebDriver driver=new InternetExplorerDriver();	
		
		String path="E:\\selenium\\Workspace\\NewSelenumBasic\\geckodriver.exe";
		System.setProperty("webdiver.FirefoxDriver.driver", path);
		WebDriver driver=new FirefoxDriver();
		String url="https://10.65.1.57/intermediary/index.html";
		String ExpectedTitle="TitleSebi Login Page";
		String ActualTitle="";				
		
		
		
		//launch firefox and direct it to the url		
		driver.get(url);
		
		System.out.println("Browser is getting open");
		
		//Locate and click of button		
		
		//driver.findElement(By.id("overridelink")).click();
		
		driver.findElement(By.cssSelector("id.advancedButton")).click();
		//driver.findElement(By.id("exceptionDialogButton")).click();
		driver.findElement(By.cssSelector("id.exceptionDialogButton")).click();
		
		driver.switchTo().alert().accept();
		
		
		
		
		driver.findElement(By.cssSelector("button.selfRegDashBlock.two")).click();
		//System.out.println("This is done 2");
		
		driver.findElement(By.id("companyName")).sendKeys("Barsha");
		
		//System.out.println("This is done 3");
		
		//driver.findElement(By.cssSelector("id.panNo")).sendKeys("BZQPS1234Z");
		driver.findElement(By.id("panNo")).sendKeys("BZQPS1267Z");
		//driver.findElement(By.id("roleName")).
		//Select Dropdown1=new Select(driver.findElement(By.id("roleName")));
		//Dropdown1.selectByVisibleText("Merchant Bankers");
		new Select(driver.findElement(By.id("roleName"))).selectByVisibleText("Merchant Bankers");
		new Select(driver.findElement(By.id("contactNameTitle"))).selectByIndex(2);
		driver.findElement(By.id("contctFirstName")).sendKeys("Barsha");
		driver.findElement(By.id("contctLastName")).sendKeys("Sinha");
		driver.findElement(By.id("contactDesig")).sendKeys("Test Lead");
		
		driver.findElement(By.id("contctMobileCountryCode")).sendKeys("91");
		driver.findElement(By.id("contctMobNo")).sendKeys("9619911050");
		driver.findElement(By.id("contctEmail")).sendKeys("bs00128597@techmahindra.com");
		driver.switchTo().alert().accept();
		driver.findElement(By.id("contctAltEmail")).sendKeys("bs00128597@techmahindra.com");
		Thread.sleep(5);
		driver.findElement(By.id("ApplicantAddressLine1")).sendKeys("Mumbai");
		driver.findElement(By.id("ApplicantPinCode")).sendKeys("400072");
		Select Dropdown3=new Select(driver.findElement(By.id("ApplicantCountry")));
		Dropdown3.selectByIndex(0);
		Select Dropdown4=new Select(driver.findElement(By.id("ApplicantState")));
		Dropdown4.selectByVisibleText("MAHA");
		
		Select Dropdown5=new Select(driver.findElement(By.id("ApplicantCity")));
		Dropdown5.selectByVisibleText("MUM");
		
		Thread.sleep(30);
		
		
		driver.findElement(By.cssSelector("button.btn-submit")).sendKeys("BZQPS1234Z");
		
		//Get the actual value of the title
		ActualTitle=driver.getTitle();
		System.out.println("Title"+ ActualTitle);
		
		System.out.println("Title"+ ActualTitle);
		
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
