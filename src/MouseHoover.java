import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoover {

	public static void main(String[] args) {
		String path="E:\\selenium\\Workspace\\NewSelenumBasic\\geckodriver.exe";
		System.setProperty("webdiver.FirefoxDriver.driver", path);
		WebDriver driver=new FirefoxDriver();
		String url="http://www.yatra.com/";
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Actions Act=new Actions(driver);
	WebElement MainMenu=driver.findElement(By.xpath(".//*[@id='cutomerSupportNav']/a"));
	Act.moveToElement(MainMenu).moveToElement(driver.findElement(By.xpath(".//*[@id='cutomerSupportNav']/div/div[2]/ul/li[1]/a"))).click().build().perform();
	
	
		

	}

}
