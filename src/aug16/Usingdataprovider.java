package aug16;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Usingdataprovider {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	@Test(dataProvider="dp")
	public void verifylogin(String user,String pass) {
		driver.manage().window().maximize();
		driver.get("http://orangehrm.qedgetech.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.name("txtUsername")).sendKeys(user);
		driver.findElement(By.name("txtPassword")).sendKeys(pass);
		driver.findElement(By.name("Submit")).click();
		String expected="dashboard";
		String actual=driver.getCurrentUrl();
		Assert.assertTrue(actual.contains(expected),"login fail");
	}
	@DataProvider
	public Object[][]dp(){
		Object login[][]=new Object[5][2];
		login[0][0]="Admin";
		login[0][1]="Qedge123!@#";
		login[1][0]="Admin1";
		login[1][1]="Admin";
		login[2][0]="admin";
		login[2][1]="ad";
		login[3][0]="Admin";
		login[3][1]="Qedge123!@#";
		login[4][0]="heloo";
		login[4][1]="admin";
		return login;
	}
	@AfterSuite
	public void tearDown() {
		driver.close();
		
		
	}
	

}
