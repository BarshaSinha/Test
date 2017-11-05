
public class Split {

	public static void main(String[] args) {
		//System.out.println("Please note the application No. 504012  for future reference.");
		String A="Please note the application No. 504012  for future reference.";
		String B[]= A.split("\\s");
		/*for (int i=0; i<=6; i++)
		{
			System.out.println(B[i]);
		
		}*/
		
				
		System.out.println(B[5]);
		String C=B[5].toString();
		
		String D=null;
		
		if (C.equals(D))
		{
			System.out.println("Test Failed");
		}
      else
      {
    	  System.out.println("Test Passed");
		
      }
	}

}
