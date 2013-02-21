import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class HomepageTest 
{
	WebDriver driver = new FirefoxDriver();
	
	@Before
	public void before()
	{
		driver.get("http://bellmore.staging.i.patch.com");
	}
	
	@After
	public void after()
	{
		driver.close();
	}
	
	@Test
	public void testLogin()
	{
		driver.findElement(By.linkText("Sign In")).click();
	}
	
	@Test
	public void testJoin()
	{
		driver.findElement(By.linkText("Join")).click();
	}
	

}
