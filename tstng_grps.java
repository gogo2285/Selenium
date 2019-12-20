package testng;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.thoughtworks.selenium.webdriven.commands.Refresh;

public class tstng_grps {
WebDriver driver;   /// declared here so that it is available in all methods of class
	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("before suite test 1");
	}

	@BeforeMethod
	public void beforetest()
	{
		System.out.println("before test 1 ");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gb152\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		
	}
	
		
	@Test(groups = {"group1","group2","group3"})
	
	public void FlowTest1()
	{
		/*driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");*/
		
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.name("login")).click();
		WebElement fromport = driver.findElement(By.name("fromPort")) ;
		Select fromport1 = new Select(fromport);
		WebElement frommon = driver.findElement(By.name("fromMonth")) ;
		Select frommon1 = new Select(frommon);
		WebElement fromd = driver.findElement(By.name("fromDay")) ;
		Select frompd1 = new Select(fromd);
		fromport1.selectByValue("London");
		frommon1.selectByIndex(11);	
		frompd1.selectByVisibleText("19");
		driver.findElement(By.name("findFlights")).click();
		driver.findElement(By.name("reserveFlights")).click();
		driver.findElement(By.name("passFirst0")).sendKeys("Gayatri");
		driver.findElement(By.name("passLast0")).sendKeys("Bhagwani");
		driver.findElement(By.name("creditnumber")).sendKeys("1234567891234567");
		driver.findElement(By.name("buyFlights")).click();
		WebElement confno=driver.findElement(By.xpath("//font[contains(text(),\"Flight\")]"));
		String s= confno.getText();
		System.out.println("confirmation no. is" + s);
				
		System.out.println("main test 1 executed successfully  "  + Thread.currentThread().getId());
		//driver.close();
		
	}
	
	@Test(groups = {"group1"})

	public void FlowTest2()
	{
		
		//driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.name("login")).click();
		WebElement fromport = driver.findElement(By.name("fromPort")) ;
		Select fromport1 = new Select(fromport);
		WebElement frommon = driver.findElement(By.name("fromMonth")) ;
		Select frommon1 = new Select(frommon);
		WebElement fromd = driver.findElement(By.name("fromDay")) ;
		Select frompd1 = new Select(fromd);
		fromport1.selectByValue("London");
		frommon1.selectByIndex(11);	
		frompd1.selectByVisibleText("19");
		driver.findElement(By.name("findFlights")).click();
		driver.findElement(By.name("reserveFlights")).click();
		driver.findElement(By.name("passFirst0")).sendKeys("malini");
		driver.findElement(By.name("passLast0")).sendKeys("arya");
		driver.findElement(By.name("creditnumber")).sendKeys("9234567891234569");
		driver.findElement(By.name("buyFlights")).click();
		WebElement confno=driver.findElement(By.xpath("//font[contains(text(),\"Flight\")]"));
		String s= confno.getText();
		System.out.println("confirmation no. for second traveller is   " + s);
				
		System.out.println("main test 2 executed successfully " + Thread.currentThread().getId());
	}
	
@Test(groups = {"group3"})

public void FlowTest3()
{
	//driver.get("http://newtours.demoaut.com/");
	driver.findElement(By.name("userName")).sendKeys("tutorial");
	driver.findElement(By.name("password")).sendKeys("tutorial");
	driver.findElement(By.name("login")).click();
	WebElement fromport = driver.findElement(By.name("fromPort")) ;
	Select fromport1 = new Select(fromport);
	WebElement frommon = driver.findElement(By.name("fromMonth")) ;
	Select frommon1 = new Select(frommon);
	WebElement fromd = driver.findElement(By.name("fromDay")) ;
	Select frompd1 = new Select(fromd);
	fromport1.selectByValue("London");
	frommon1.selectByIndex(11);	
	frompd1.selectByVisibleText("19");
	driver.findElement(By.name("findFlights")).click();
	driver.findElement(By.name("reserveFlights")).click();
	driver.findElement(By.name("passFirst0")).sendKeys("pihu");
	driver.findElement(By.name("passLast0")).sendKeys("hirani");
	driver.findElement(By.name("creditnumber")).sendKeys("1234567891238888");
	driver.findElement(By.name("buyFlights")).click();
	WebElement confno=driver.findElement(By.xpath("//font[contains(text(),\"Flight\")]"));
	String s= confno.getText();
	System.out.println("confirmation no. for third traveller is  " + s);
			
	System.out.println("main test 3 executed successfully " + + Thread.currentThread().getId());
}
	@Test(groups = {"group2"})
	
	public void last1()
	{
		System.out.println("4th test");
	}


@AfterClass
public void afterclass()
{
	//driver.quit();
}
	
	@AfterMethod
	public void Aftermethod()
	{
		driver.close();
		System.out.println("after method ");
	}
	@AfterSuite
	public void aftersuite()
	{
		driver.quit();
	}
	

}