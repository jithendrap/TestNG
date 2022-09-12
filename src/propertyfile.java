import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class propertyfile {
WebDriver driver;
Properties p;
@BeforeTest
public void setup()throws Throwable {
	p=new Properties();
	//load file
	p.load(new FileInputStream("G:\\selenium\\TestNG_Frameworks\\Repository.properties"));
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(p.getProperty("URL"));
	Thread.sleep(5000);
}
@Test
public void validateRegister() throws Throwable {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	driver.findElement(By.xpath(p.getProperty("objAccount"))).click();
	driver.findElement(By.xpath(p.getProperty("objRegister"))).click();
	driver.findElement(By.xpath(p.getProperty("objFname"))).sendKeys("jithendra");
	driver.findElement(By.xpath(p.getProperty("objLname"))).sendKeys("d");
	driver.findElement(By.xpath(p.getProperty("objEmail"))).sendKeys("jithendra@gmail.com");
	driver.findElement(By.xpath(p.getProperty("objPass"))).sendKeys("prasad");
	js.executeScript("document.querySelector(\"#input-newsletter-yes\").click()");
	Thread.sleep(2000);
	js.executeScript("document.querySelector(\"input[value='1'][name='agree']\").click()");
	Thread.sleep(2000);
	js.executeScript("document.querySelector(\"button[type='submit']\").click()");
	Thread.sleep(2000);
}
@AfterTest
public void tearDown()throws Throwable
{
	Thread.sleep(5000);
}
}


