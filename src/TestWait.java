import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.*;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import java.util.concurrent.TimeUnit;

public class TestWait {

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
		
		Wait<WebDriver> wait= new FluentWait<WebDriver>(driver)
				.withTimout(10,TimeUnit.SECONDS)
				.pollingEvery(5,TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		
	}

}
