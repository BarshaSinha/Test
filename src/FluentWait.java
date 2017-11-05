import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import.org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Function;

public class FluentWait {

	public static void main(String[] args) {
		String path="E:\\selenium\\Workspace\\NewSelenumBasic\\geckodriver.exe";
		System.setProperty("webdiver.FirefoxDriver.driver", path);
		WebDriver driver=new FirefoxDriver();
		String url="http://toolsqa.com/automation-practice-form/";
		
		driver.get(url);
		driver.manage().window().maximize();
		
		List<WebElement> elements=driver.findElements(By.xpath("//*[@class='control-group']//strong[contains(text(),'Link Test')]"));
		//for(int i=0;i<2;i++)	
		{
			elements.get(1).click();
			
		}
		System.out.println("Action Done");
		
		 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				 
				    .withTimeout(30, SECONDS)
				 
				    .pollingEvery(5, SECONDS)
				 
				    .ignoring(NoSuchElementException.class);
				 
				  WebElement foo = wait.until(new Function<WebDriver,WebElement>() {
				 
				    public WebElement apply(WebDriver driver) {
				 
				    return driver.findElement(By.id("foo"));
				 
				    }
				 
				   });

	}

}
