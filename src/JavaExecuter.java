import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class JavaExecuter {

	public static void main(String[] args) {
		
		String path="E:\\selenium\\Workspace\\NewSelenumBasic\\geckodriver.exe";
		System.setProperty("webdiver.FirefoxDriver.driver", path);
		WebDriver driver=new FirefoxDriver();
				
		String url="http://toolsqa.com/automation-practice-form/";
		
		driver.get(url);
		driver.manage().window().maximize();
		
JavascriptExecutor executor=(JavascriptExecutor) driver;
executor.executeScript("document.getElementsByName('firstname')[0].value='Barsha'");
executor.executeScript("document.getElementById('datepicker').value='26/07/2017'");
executor.executeScript("window.document.getElementById('sex-1').click();");

WebElement element= driver.findElement(By.xpath("//*[@id='exp-0']"));
executor.executeScript("arguments[0].click();",element);



	}

}
