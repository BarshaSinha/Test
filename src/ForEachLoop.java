import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ForEachLoop {

	public static void main(String[] args) {
		
		/*String path="E:\\selenium\\Workspace\\NewSelenumBasic\\geckodriver.exe";
		System.setProperty("webdiver.FirefoxDriver.driver", path);
		WebDriver driver=new FirefoxDriver();
				
		String url="http://jqueryui.com/resources/demos/datepicker/other-months.html";
		
		driver.get(url);
		driver.manage().window().maximize();
		String date="26";
		WebElement table=driver.findElement(By.xpath("//*[@id='datepicker']"));
		table.click();
		driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[4]/a[text()='"+date+"']")).click();*/
				
		
		int arr[]={12,14,16};
		for(int j:arr)
		{
			System.out.println("Array value using for each" + j);
			
		}
		for (int i=0;i<arr.length; i++)
		{
			System.out.println("Array value using for loop" + arr[i]);
		}

	}

}
