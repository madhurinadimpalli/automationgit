package automation;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(CustomListener.class)
public class Assertions extends Base {
	
	@Test(priority=1, description = "assertions")
	public static void assertlabels() throws Exception {
		try {

            initialization();
			driver.get("https://www.amazon.in//");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			System.out.println("Launched browser and entered url");
			
			driver.findElement(By.xpath("//span[text()='Hello, Sign in']")).click();
			driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
		    Thread.sleep(2000);
		    WebElement Createaccount= driver.findElement(By.xpath("//h1[contains(text(),'Create Account')]"));
		    WebElement Yourname= driver.findElement(By.xpath("//label[contains(text(),'Your name')]"));
			/*Assert.assertEquals(Createaccount.getText(), "Create Account");
			System.out.println("asserted Create Account label");
			
			Assert.assertEquals(Yourname.getText(), "Your name");
			System.out.println("asserted Your name label");*/
		    
		    
		    SoftAssert softAssertion = new SoftAssert();
		    
			softAssertion.assertEquals(Createaccount.getText(), "Create Account");
			System.out.println("asserted Create Account label");
			
			softAssertion.assertEquals(Yourname.getText(), "Your name");
			System.out.println("asserted your name label");
			
			softAssertion.assertAll();
			 

			System.out.println("Execution ends");
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
			throw new Exception("exception in main page");
		}
	}
	@Test(priority=2, description = "testcase2")
	public static void testcase2() throws Exception {
		try {

           
			System.out.println("testcase 2 eecuted");
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
			throw new Exception("exception in testcase2");
		}
	}
	
	
	

}