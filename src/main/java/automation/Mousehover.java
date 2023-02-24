package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover
{
public static void main(String[] args) throws InterruptedException 
{	
System.setProperty("webdriver.chrome.driver","D:\\Automation\\automationpractice\\drivers\\chromedriver.exe"); 
WebDriver driver = new ChromeDriver(); //Creating an object of Chrome Driver
driver.manage().window().maximize();

driver.get("https://www.amazon.in//");
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
System.out.println("Launched browser and entered url");
Thread.sleep(2000);
WebElement element1= driver.findElement(By.xpath("//span[text()='Prime']"));
Actions action= new  Actions(driver);
action.moveToElement(element1).build().perform();

System.out.println("Execution ends");
}
}