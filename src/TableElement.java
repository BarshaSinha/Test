import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class TableElement {

	public static void main(String[] args) throws InterruptedException {
		String path="E:\\selenium\\Workspace\\NewSelenumBasic\\geckodriver.exe";
				System.setProperty("webdiver.FirefoxDriver.driver", path);
				WebDriver driver=new FirefoxDriver();
				
				//String path="E:\\selenium\\Workspace\\NewSelenumBasic\\IEDriverServer.exe";
				//System.setProperty("webdiver.InternetExplorerDriver.driver", path);
				//WebDriver driver=new InternetExplorerDriver();
						
				String url="http://toolsqa.com/automation-practice-form/";
				
				driver.get(url);
				driver.manage().window().maximize();				
				
		List<WebElement> elements=driver.findElements(By.xpath("//*[@class='control-group']//strong[contains(text(),'Link Test')]"));
			//for(int i=0;i<2;i++)	
			{
				elements.get(1).click();
				
			}
			System.out.println("Action Done");
			
			//Get the number of rows in table
			
			//int RowCount=driver.findElements(By.xpath("//*[@id='content']/table/tbody/tr")).size();
			//System.out.println("Number of row "+ RowCount);
			
			//Get the number of column in table
			
			//int ColumnCount=driver.findElements(By.xpath("//*[@id='content']/table/tbody/tr[1]/td")).size();
			//System.out.println("Number of column "+ ColumnCount);
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			//WebElement Webtable=driver.findElement(By.xpath("//*[@class='tsc_table_s13']"));
			WebElement Webtable=driver.findElement(By.className("tsc_table_s13"));
			
			System.out.println("This is done");
			
			//Thread.sleep(40000);
			
			
			List<WebElement> TotalrowCount=Webtable.findElements(By.tagName("tr"));
			System.out.println(TotalrowCount.size());
			int RowIndex=1;
			for(WebElement rowElement:TotalrowCount)
			{
				List<WebElement> TotalColumnCount=Webtable.findElements(By.tagName("td"));
				int ColumnIndex=1;
				for(WebElement colElement:TotalColumnCount)
				{
					System.out.println("Row"+RowIndex+"Column"+ColumnIndex+"Data"+colElement.getText());
					ColumnIndex=ColumnIndex+1;
				}
			}
			//for (int i=1; i<TotalRowCount; i ++)
			//{
			//	List<WebElement> columnCount=Webtable.findElements(By.xpath("//*[@class='tsc_table_s13']/tr/td)"));
			//	int TotalColumnCount=columnCount.size();
			//	for(int j=1;j<TotalColumnCount;j++)
			//	{
					//System.out.println("Row"+TotalRowCount+"Column"+TotalColumnCount+"Data"+columnCount.get(j));
				//}
			//}
	}

}
