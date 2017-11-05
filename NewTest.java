import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class UnderstandingTestNG {
  @Test
  public void f() {
  }
  
  @Test
  public void MyHome() {
	  System.out.println("We are in MyHome");
  }
  
  @Test
  public void MyConfirmation() {
	  System.out.println("We are in MyConfirmation");
  }
  
  @Test
  public void MyApproval() {
	  System.out.println("We are in MyApproval");
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("We are in BeforeTest");
  }

  @AfterTest
  public void afterTest() {
  }

}