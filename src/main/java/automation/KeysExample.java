package automation;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeysExample {
	public static void main(String[] args) throws InterruptedException {
		try {
			System.setProperty("webdriver.chrome.driver",
					"D:\\Automation\\automationpractice\\drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver(); // Creating an object of Chrome Driver
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in//");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			System.out.println("Launched browser and entered url");
			
			WebElement test = driver.findElement(By.name("field-keywords"));

            //Context click
			WebElement link = driver.findElement(By.xpath("//a[contains(text(),'Electronics')]"));
			
			Actions action = new Actions(driver);
			action.contextClick(link).build().perform();
			
				
			Robot r1 = new Robot();
			r1.keyPress(KeyEvent.VK_DOWN);
			r1.keyPress(KeyEvent.VK_ENTER);
			
			
			test.sendKeys("Headphones" + Keys.ENTER);
			driver.findElement(By.xpath("//span[text()='Hello, Sign in']")).click();
			driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("Name" + Keys.TAB);
			driver.findElement(By.xpath("//input[@id='ap_phone_number']")).sendKeys("7" + Keys.BACK_SPACE);

		} catch (Exception e) {
		}

	}
}