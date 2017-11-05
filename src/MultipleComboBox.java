import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleComboBox {

	public static void main(String[] args) {
		String path="E:\\selenium\\Workspace\\NewSelenumBasic\\geckodriver.exe";
		System.setProperty("webdiver.FirefoxDriver.driver", path);
		WebDriver driver=new FirefoxDriver();
				
		String url="http://toolsqa.com/automation-practice-form/";
		
		driver.get(url);
		driver.manage().window().maximize();
		
		Select Fruit=new Select(driver.findElement(By.id("selenium_commands")));
		Fruit.selectByVisibleText("Navigation Commands");
		Fruit.selectByVisibleText("Switch Commands");
		Fruit.selectByVisibleText("Wait Commands");

	}

}
