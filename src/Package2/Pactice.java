package Package2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;

public class Pactice {
  @Test(priority=4)
  public void f() {
  }
  @Test(priority=1)  
  public void MyHome() {
	  System.out.println("MyHome");
  }
  @Test(priority=2)
  
  
  public void MyConfirmation() {
	  System.out.println("MyConfirmation");
  }
  @Test(priority=3)
  @Parameters("MyName")
  public void Submit(String MyName) {
	  System.out.println("Parameter value"+ MyName);
  }
  @BeforeTest
  public void beforeMethod() {
	  System.out.println("I am in BeforeMethod");
  }

  @AfterTest
  public void afterTest() {
  }

}
