package aug11;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SecondTestNG {
WebDriver driver;
@BeforeMethod
public void setup()throws Throwable{
	

driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://calc.qedgetech.com/");
Thread.sleep(5000);
Reporter.log("Running precondition",true);

}
@Test
public void addtion() throws Throwable {
	driver.findElement(By.name("display")).sendKeys("916");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//tbody/tr[2]/td[5]/input[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("display")).sendKeys("122");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//tbody/tr[5]/td[4]/input[1]")).click();
	Reporter.log("Executing addition",true);
	
}
@Test
public void subtraction() throws Throwable {
	driver.findElement(By.name("display")).sendKeys("450");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//tbody/tr[3]/td[5]/input[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("display")).sendKeys("50");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//tbody/tr[5]/td[4]/input[1]")).click();
	Reporter.log("Executing subtraction",true); 
}
@Test
public void clear() throws Throwable {
	driver.findElement(By.name("display")).sendKeys("9153998555");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//tbody/tr[6]/td[5]/input[1]")).click();
	Thread.sleep(2000);
	Reporter.log("Clear the input values",true);
}
public void tearDown()
{
	Reporter.log("Running post condition",true);
	driver.close();
}
}

