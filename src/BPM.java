import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class BPM {

	public static void main(String[] args) throws InterruptedException {
		String path="E:\\selenium\\Workspace\\NewSelenumBasic\\chromedriver.exe";
		System.setProperty("webdiver.chromedriver.driver", path);
		WebDriver driver=new ChromeDriver();
		String url="https://10.65.1.73";
		
		driver.get(url);
		driver.findElement(By.xpath("//*[@id='userName']")).sendKeys("1479T");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Sebi@321");
		driver.findElement(By.xpath("//*[@id='login']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		Thread.sleep(3000);
		//driver.switchTo().frame(1);		
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//*[@id='layoutContainers']/div/div[2]/div[3]/div/section/div[3]/div[1]/div[1]/div/ul/li[2]/a/img"))).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='layoutContainers']/div/div[2]/div[3]/div/section/div[3]/div[1]/div[1]/div/ul/li[2]/a/img")).click();
		driver.findElement(By.xpath("//*[@id='newComplaints']/tbody/tr/td[1]/span")).click();
		
		

	}

}
