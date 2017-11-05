import java.io.File;

public class Directory {

	public static void main(String[] args) {
		File Folder=new File("E:\\selenium\\Webdriver\\Practice");
		File listofFile[]=Folder.listFiles();
		for (int i=0;i<listofFile.length;i++)
		{
			if(listofFile[i].isFile())
			{
				System.out.println(listofFile[i].getName());
			}
			else if(listofFile[i].isDirectory())
			{
				System.out.println(listofFile[i].getName());
			}
		}
		

	}

}
