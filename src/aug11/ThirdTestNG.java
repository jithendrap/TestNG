package aug11;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ThirdTestNG extends Apputil {
	@Test
	public void branches()throws Throwable {
		driver.findElement(By.xpath("//a[@href='admin_banker_master.aspx']//img")).click();
		Thread.sleep(5000);
	}
	@Test
	public void roles()throws Throwable {

		driver.findElement(By.xpath("//a[@href='Admin_Roles_details.aspx']//img")).click();
	
		Thread.sleep(5000);
	}
	@Test(enabled = false)
	public void users()throws Throwable {

		driver.findElement(By.xpath("//a[@href='userdetails.aspx']//img")).click();
		Thread.sleep(5000);
	}

}
