import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Table {

	public static void main(String[] args) {
		String path="E:\\selenium\\Workspace\\NewSelenumBasic\\geckodriver.exe";
		System.setProperty("webdiver.FirefoxDriver.driver", path);
		WebDriver driver=new FirefoxDriver();
		

		String url="http://toolsqa.com/automation-practice-form/";
		
		driver.get(url);
		driver.manage().window().maximize();				
		
List<WebElement> elements=driver.findElements(By.xpath("//*[@class='control-group']//strong[contains(text(),'Link Test')]"));
	for(int i=0;i<2;i++)	
	{
		elements.get(1).click();
		
	}
	System.out.println("Action Done");
	


driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	WebElement Webtable=driver.findElement(By.className("tsc_table_s13"));	

	
	List<WebElement> rowCount=Webtable.findElements(By.tagName("tr"));
	int TotalRowCount=rowCount.size();
	System.out.println("Total Row Count"+ TotalRowCount);
	
	for (int i=0; i<TotalRowCount; i ++)
	{
		List<WebElement> columnCount=rowCount.get(i).findElements(By.xpath("td"));
		int TotalColumnCount=columnCount.size();
	
		
		for(int j=0;j<TotalColumnCount;j++)
		{
			System.out.println("Row"+i+"Column"+j+"Data"+columnCount.get(j).getText());
		}
		System.out.println("");
		
		System.out.println("");
		
		
	}

	}

}
