package automation;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class ScreenshotTest extends Base {
	@BeforeTest
	public void setUp()
	{
		initialization();
	}	
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}	
	@Test
	public void Login()
	{
		Assert.assertEquals(false, true);
				
	}
	
	@Test
	public void addDetails()
	{
		Assert.assertEquals(false, true);
				
	}
	
	@Test
	public void editDetails()
	{
		Assert.assertEquals(false, true);
				
	}
		
}

