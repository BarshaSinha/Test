import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class InitialReg {

	public static void main(String[] args) throws InterruptedException {

		
		
		String path="E:\\selenium\\Webdriver\\Srikanth\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdiver.chromedriver.driver", path);
		WebDriver driver=new ChromeDriver();		

		
		String url="https://10.65.1.74/intermediary/index.html";
		
		driver.get(url);
		driver.manage().window().maximize();
		//driver.findElement(By.id("overridelink")).click();		
		driver.findElement(By.cssSelector("button.selfRegDashBlock.one")).click();
		driver.findElement(By.xpath("//*[@id='userName']")).sendKeys("301889");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Techm@123");
		driver.findElement(By.id("login")).click();
		driver.findElement(By.xpath("//*[@id='header-tooltip']")).click();
		Actions Act=new Actions(driver);
		Thread.sleep(2000);
		Act.moveToElement(driver.findElement(By.xpath("/html/body/div[4]/nav/div/div/ul[1]/li[3]/ul/li[1]/a"))).perform();
		driver.findElement(By.xpath("/html/body/div[4]/nav/div/div/ul[1]/li[3]/ul/li[1]/ul/form/li[1]/button")).click();
		Thread.sleep(2000);
		
		 int size = driver.findElements(By.tagName("iframe")).size();
		 System.out.println(size);
		 driver.switchTo().frame(0);
		//WebElement Upload=driver.findElement(By.id("PanCopy"));
		//Act.moveToElement(driver.findElement(By.xpath("//*[@id='PanCopy']"))).perform();		
		//Thread.sleep(2000);
		WebElement Upload=driver.findElement(By.id("PanCopy"));		
		Upload.sendKeys("C:\\Users\\bs00128597\\Downloads\\Vodafone_EIDB4261792414");
		driver.findElement(By.id("reitAddressLine1")).sendKeys("MUMBAI");		
		driver.findElement(By.id("reitPincode")).sendKeys("400072");
		driver.findElement(By.id("reitCountry")).sendKeys("INDIA");
		driver.findElement(By.id("reitTelephoneCountryCode")).sendKeys("91");
		driver.findElement(By.id("reitTelephoneExt")).sendKeys("45456");
		driver.findElement(By.id("reitTelephone")).sendKeys("464557567");
		driver.findElement(By.id("reitEmail")).sendKeys("bs00128597@techmahindra.com");
	}

}
