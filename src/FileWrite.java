
import java.io.File;
import java.io.FileWriter;


public class FileWrite {

	public static void main(String[] args) {
		try{
		FileWriter FW=new FileWriter("E:\\selenium\\Webdriver\\Practice\\Write.txt", true);
				FW.write("We are learning file....\r\n");
				FW.write("We are learning file2....\r\n");
				FW.close();
				System.out.println("Done");
				
		}
		catch(Exception e)
		{
			System.out.println("Exception"+ e.getMessage());
		}

	}

}
