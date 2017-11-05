import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStream {

	public static void main(String[] args) throws IOException {
		File inFile=new File("E:\\selenium\\Webdriver\\Practice\\test.txt");
		File outFile=new File("E:\\selenium\\Webdriver\\Practice\\16-July\\test2.txt");
	
		/*	FileInputStream FileInput= new FileInputStream(FileInput);
			FileOutputStream FileOut=new FileOutputStream(FileOut);*/
					try {
						FileInputStream input=new FileInputStream(inFile);
						FileOutputStream output=new FileOutputStream(outFile);
						byte buffer[]=new byte[1024];
						int length;
						while((length=input.read(buffer))>0)
						{
							output.write(buffer, 0, length);
						}
						input.close();
						output.close();
						System.out.println("File Copied");
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
		   
		

	}

}
