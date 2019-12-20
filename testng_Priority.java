package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testng_Priority {

	WebDriver driver;

	@BeforeClass
	public void beforeclass() {
		System.out.println("before test 1 ");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gb152\\selenium\\chromedriver_win32\\chromedriver.exe");

	}

	@Test(priority = 0)
	public void openbrowser() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
	}

	@Test(priority = 1)

	public void login() {
		// System.setProperty("webdriver.chrome.driver",
		// "D:\\java\\GB\\Selenium_Practise\\Driver\\chromedriver.exe");
		// WebDriver driver = new ChromeDriver(); //launch url
		// driver.manage().window().maximize();
		// driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.name("login")).click();
	}

	@Test(priority = 2)

	public void enterdetails() {
		WebElement fromport = driver.findElement(By.name("fromPort"));
		Select fromport1 = new Select(fromport);
		WebElement frommon = driver.findElement(By.name("fromMonth"));
		Select frommon1 = new Select(frommon);
		WebElement fromd = driver.findElement(By.name("fromDay"));
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

	}

	@Test(priority = 2)

	public void agetconfno() {
		WebElement confno = driver.findElement(By.xpath("//font[contains(text(),\"Flight\")]"));
		String s = confno.getText();
		System.out.println("confirmation no. is" + s);

		System.out.println("main test 1 executed successfully");
	}

	@AfterClass
	public void Afterclass() {
		driver.close();
		System.out.println("after suite");
	}

}
