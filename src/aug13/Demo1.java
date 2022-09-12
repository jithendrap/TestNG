package aug13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo1 {
	WebDriver driver;
	@Test
	public void verifytitle()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://gmail.com/");
		String expected ="gmail";
		String actual =driver.getCurrentUrl();
		try {
		Assert.assertEquals(actual, expected,"title is not matching");
		}
		catch(Throwable t)
		{
			System.out.println(t.getMessage());
		}
		driver.close();
	}

}
