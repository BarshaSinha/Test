import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		  list.add("Ravi");//Adding object in arraylist  
		  list.add("1,Vijay");  
		  list.add("Ravi");  
		  list.add("Ajay");  
		  list.remove("Ajay");
		  //Traversing list through Iterator  
		  Iterator itr=list.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next()); 

	}
	}
}
