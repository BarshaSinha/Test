import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

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
		//For Implicit Wait
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		//driver.findElement(By.xpath("//span[contains(.,'HOME')]")).click();
		
		
		//For Explicit wait
		
		WebDriverWait wait=new WebDriverWait(driver,60);
		
		WebElement element;
		element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(.,'HOME')]")));
		element.click();
		System.out.println("Done");		
		

	}

}
