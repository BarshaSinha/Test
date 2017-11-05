import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RobotFileUpload {

	public static void main(String[] args) throws AWTException {
		String path="E:\\selenium\\Workspace\\NewSelenumBasic\\geckodriver.exe";
		System.setProperty("webdiver.FirefoxDriver.driver", path);
		WebDriver driver=new FirefoxDriver();
		String url="http://toolsqa.com/automation-practice-form/";
		
		driver.get(url);
		driver.manage().window().maximize();
		
/*		Simple Way
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.id("photo")).sendKeys("D:\\Practice.txt");*/
		
		/*Via Robot Class*/
		driver.findElement(By.id("photo")).click();
		Robot robot=new Robot();
		String Path1="E:\\Practice.txt";
		StringSelection Strselect= new StringSelection(Path1);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Strselect, null);
		
		 robot.keyPress(KeyEvent.VK_CONTROL);
         robot.keyPress(KeyEvent.VK_V);
         robot.keyRelease(KeyEvent.VK_V);
         robot.keyRelease(KeyEvent.VK_CONTROL);
         System.out.println("Paste Done");
         robot.delay(30);
         
         robot.keyPress(KeyEvent.VK_ENTER);
         robot.keyRelease(KeyEvent.VK_ENTER);
         
         System.out.println("Done");
		
		

	}

}
