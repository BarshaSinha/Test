import java.io.File;

public class FileTxt {

	public static void main(String[] args) {
		File MyTxt=new File ("E:\\selenium\\Webdriver\\Practice\\test.txt");
		
		try
		{
		boolean var=MyTxt.createNewFile();
		
			if(var)
			{
				System.out.println("File Created");
				
			}
			else
			{
				System.out.println("File Already Created");
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Exception"+ e.getMessage());
		}

	}

}
