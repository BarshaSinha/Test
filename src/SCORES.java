
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class SCORES {

	public static void main(String[] args) {
		
		String path="D:\\Barsha sinha\\E\\selenium\\Webdriver\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdiver.FirefoxDriver.driver", path);
		WebDriver driver=new ChromeDriver();
		String url="https://10.65.1.54/wps/portal/Home/loginPage";
		driver.get(url);

	}

}
