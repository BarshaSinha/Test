import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.*;



public class FluentDemo {
	
	public static void main(String[] args) {
		String path="E:\\selenium\\Workspace\\NewSelenumBasic\\geckodriver.exe";
		System.setProperty("webdiver.FirefoxDriver.driver", path);
		WebDriver driver=new FirefoxDriver();
		String url="http://toolsqa.com/automation-practice-form/";
		
		driver.get(url);
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			.withTimeout(30, TimeUnit.SECONDS)
			.pollingEvery(5, TimeUnit.SECONDS)
		.ignoring(NoSuchElementException.class);
		
		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {

		   public WebElement apply(WebDriver driver) {

		   return driver.findElement(By.xpath("//span[@class='menu-text']"));
		   }

		  });	
		foo.click();
		
		System.out.println("Fluent wait checks after ");
	}

}
