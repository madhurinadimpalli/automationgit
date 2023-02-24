package automation;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Program1
{
public static void main(String[] args) throws InterruptedException 
{	
System.setProperty("webdriver.chrome.driver","D:\\Automation\\automationpractice\\drivers\\chromedriver.exe"); 
WebDriver driver = new ChromeDriver(); //Creating an object of Chrome Driver
driver.manage().window().maximize();

driver.get("https://sit.jevaa.jvts.net/dm/#/signin");

driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
System.out.println("Launched browser and entered url");

WebElement Login= driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/app-signin[1]/div[1]/div[50]/div[1]/form[1]/div[1]/button[1]"));

boolean status = Login.isEnabled();

System.out.println(status);
driver.findElement(By.name("eid")).sendKeys("jsp");
driver.findElement(By.name("email/mobile")).sendKeys("jsp@gmail.com");
driver.findElement(By.name("password")).sendKeys("Jio@1234");

boolean status2 = Login.isEnabled();
System.out.println(status2);

if(status2= true)
{
	Login.click();
}
driver.findElement(By.name("eid")).sendKeys("jsp");



//driver.quit();
}
}