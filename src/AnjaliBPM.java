import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AnjaliBPM {

	public static void main(String[] args) {
		String path="E:\\selenium\\Workspace\\NewSelenumBasic\\chromedriver.exe";
		System.setProperty("webdiver.chromedriver.driver", path);
		WebDriver driver=new ChromeDriver();
		String url="https://10.65.1.54/wps/portal/Home/loginPage/";
		driver.get(url);
//BPM Flow
		
		driver.manage().window().maximize() ;
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("#userName")).sendKeys("1757Z");
		driver.findElement(By.cssSelector("#password")).sendKeys("Sebi@321");
		driver.findElement(By.cssSelector("#login")).click();
		WebElement element1 = driver.findElement(By.linkText("APPS"));
		
		Actions action1 = new Actions(driver);
		action1.moveToElement(element1).perform();
		WebElement subElement1 = driver.findElement(By.linkText("CORPORATE BOND"));
		subElement1.click();

		//Submit daily corporate bond trading data

		driver.findElement(By.cssSelector("#parentHorizontalTab > div > div.resp-tab-content.hor_1.resp-tab-content-active > div > div:nth-child(1) > div > label")).click();

		//select date picker

		driver.findElement(By.cssSelector("#dailyTradingForm > div > div:nth-child(1) > div > div > div > span > span")).click();

		//select  date

		driver.findElement(By.xpath(".//*[@id='dailyTradingForm']/div/div[1]/div/div/div/div/ul/li[1]/div/div[1]/table/tbody/tr[3]/td[1]")).click();

		//Search

		driver.findElement(By.cssSelector("#dailyTradingSubmit")).click();	
		
		action1.moveToElement(driver.findElement(By.xpath("//input[starts-with,'data-masterid']"))).perform();
		System.out.println("Done");

	}

}
