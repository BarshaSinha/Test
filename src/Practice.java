import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpeningAPage {

	public static void main(String[] args) {
		
		String path="E:\\selenium\\Workspace\\NewSelenumBasic\\chromedriver.exe";
		//System.setProperty("webdiver.firefox.driver", "./chromedriver.exe");
		System.setProperty("webdiver.chromedriver.driver", path);
		System.out.println("This is done");
		WebDriver driver=new ChromeDriver();		
		String url="https://10.65.1.57/";
		String ExpectedTitle="TitleSebi Login Page";
		String ActualTitle="";				
		
		
		//launch firefox and direct it to the url		
		driver.get(url);
					
		
					
		//Get the actual value of the title
		ActualTitle=driver.getTitle();
		System.out.println("Title"+ ActualTitle);
		
		System.out.println("Title"+ ActualTitle);
		
		if (ActualTitle.contentEquals(ExpectedTitle))
		{
			System.out.println("Test Passed");
			
		}
		else
		{
		System.out.println("Test Failed");	
		}
		
		

	}


}
