package aug19;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
// import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Advancedreports {
ExtentReports report;
ExtentTest test;
WebDriver driver;
@BeforeTest 
public void generatereports()
{
	report= new ExtentReports("./Reports/Demo.html",true);
}
@BeforeMethod
public void setup() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}
@Test
public void passTest() {
	test=report.startTest("my test case pass");
	test.assignAuthor("prasad");
	String expected="google";
	String actual=driver.getTitle();
	if (expected.equalsIgnoreCase(actual)) {
		test.log(LogStatus.PASS,"my test case pass");
	}
	else
	{
		test.log(LogStatus.FAIL,"mu test case fail");
	}
}
@Test
public void failTest() {
	test=report.startTest("my test case fail");
	test.assignAuthor("prasad");
	String expected="gmail";
	String actual=driver.getTitle();
	if (expected.equalsIgnoreCase(actual)) {
		test.log(LogStatus.PASS,"my test case pass");
	}
	else
	{
		test.log(LogStatus.FAIL,"mu test case failed");
	}
}
@AfterMethod
public void tearDown()
{
	report.endTest(test);
	report.flush();
	driver.close();
}
}
