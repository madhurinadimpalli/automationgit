package automation;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class WindowHandle
{
public static void main(String[] args) throws InterruptedException 
{	
System.setProperty("webdriver.chrome.driver","D:\\Automation\\automationpractice\\drivers\\chromedriver.exe"); 
WebDriver driver = new ChromeDriver(); //Creating an object of Chrome Driver
driver.manage().window().maximize();

driver.get("https://www.amazon.in//");
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
System.out.println("Launched browser and entered url");

WebElement test= driver.findElement(By.name("field-keywords"));
test.sendKeys("headphones", Keys.ENTER);

driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[3]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/h2[1]/a[1]/span[1]")).click();
Thread.sleep(2000);

String parenthandle= driver.getWindowHandle();
System.out.println("parent window:" + parenthandle);

Set<String> handles = driver.getWindowHandles();

for (String handle: handles)
{
System.out.println(handle);	
if(!handle.equals(parenthandle))
{
	driver.switchTo().window(handle);
	//driver.close();
	Thread.sleep(2000);	
}
}
driver.switchTo().window(parenthandle);
Thread.sleep(2000);	
JavascriptExecutor js = (JavascriptExecutor)driver; 
js.executeScript("scrollBy(0, 5000)"); 
Thread.sleep(2000);	
}
}