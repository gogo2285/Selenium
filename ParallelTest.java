package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class ParallelTest {
  @Test 
  public void f() 
  {
	  System.out.println("main test 1 - thread =" + Thread.currentThread().getId());
	  Reporter.log("main test 1 gayatri bhagwani");
	  }
	  
@Test 
  public void g() 
{
System.out.println("main test 2 - thread = "+ Thread.currentThread().getId());
Reporter.log("main test 2 gayatri bhagwani");
}
		  
@Test 
  public void j()
{
System.out.println("main test 3 - thread =" + Thread.currentThread().getId());
//Assert.fail("test case failed");
Reporter.log("test 3 is executed");
}
  
@Test 
public void h() 
{
System.out.println("main test 4 - thread =" + Thread.currentThread().getId());
Reporter.log("main test 4 gayatri bhagwani");
}

 @BeforeMethod
  public void beforeMethod()
  {
	  System.out.println("before method");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("after method");
  }

}
