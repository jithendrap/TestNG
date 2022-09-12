package aug10;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestNGClass {
	WebDriver driver;
	@BeforeTest
	public void begining() throws Throwable
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://primusbank.qedgetech.com/");
		Thread.sleep(5000);
		Reporter.log("Running precondition",true);
	}
	@Test
	public void Cbanking()throws Throwable{
		driver.findElement(By.xpath("(//img)[5]")).click();
		Thread.sleep(2000);
		Reporter.log("executing Cbanking",true);
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
		Reporter.log("running post condition",true);
	}


}
