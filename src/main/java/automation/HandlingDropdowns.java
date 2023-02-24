package automation;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class HandlingDropdowns {
	public static void main(String[] args) throws Exception {
		try {

			System.setProperty("webdriver.chrome.driver",
					"D:\\Automation\\automationpractice\\drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver(); // Creating an object of Chrome Driver
			driver.manage().window().maximize();

			driver.get("https://www.amazon.in//");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			System.out.println("Launched browser and entered url");
			HelperClass helperclass = new HelperClass(driver);
			WebElement dropdownlocator = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));

			Select dropdown = new Select(dropdownlocator);

			boolean dropdownstatus = dropdown.isMultiple();

			System.out.println(dropdownstatus);
			dropdown.selectByVisibleText("Amazon Fresh");
			HelperClass.captureScreenshot();
			
			/*
			 * driver.findElement(By.xpath("//span[text()='Hello, Sign in']")).click();
			 * driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
			 * Thread.sleep(2000);
			 * driver.findElement(By.xpath("//span[contains(text(),'IN +91')]")).click();
			 * driver.findElement(By.xpath("//a[text()='Iceland +354']")).click();
			 */

			System.out.println("Execution ends");
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
			throw new Exception("exception in main page");
		}
	}
}