package aug11;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Apputil {
	public static WebDriver driver;
	@BeforeSuite
	public static void setup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://primusbank.qedgetech.com/");
		driver.findElement(By.name("txtuId")).sendKeys("Admin");
		driver.findElement(By.name("txtPword")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='login']")).click();

	}
	@AfterSuite
	public static void tearDown()
	{
		driver.close();
	}

}
