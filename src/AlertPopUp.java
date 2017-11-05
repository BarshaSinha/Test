import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		String path="E:\\selenium\\Workspace\\NewSelenumBasic\\geckodriver.exe";
		System.setProperty("webdiver.FirefoxDriver.driver", path);
		WebDriver driver=new FirefoxDriver();
		String url="http://demo.guru99.com/V4/";
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.get("http://demo.guru99.com/V4/");			
 		
         driver.findElement(By.name("uid")).sendKeys("mngr86937");					
         driver.findElement(By.name("password")).sendKeys("hYbUpAd");					
         driver.findElement(By.name("btnLogin")).submit();			
         driver.findElement(By.linkText("Delete Customer")).click();			
         driver.findElement(By.name("cusid")).sendKeys("53920");
         driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
         
  		
 		
         driver.findElement(By.name("AccSubmit")).click();	
         Thread.sleep(3000);
       
             // Switching to Alert        
         Alert alert=driver.switchTo().alert();		
         		
         // Capturing alert message.    
         String alertMessage=driver.switchTo().alert().getText();		
         		
         // Displaying alert message		
         System.out.println(alertMessage);			
         		
         // Accepting alert		
         alert.dismiss();	

	}

}
