package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseQuitExample
{
public static void main(String[] args) throws InterruptedException 
{	
	
System.setProperty("webdriver.chrome.driver","D:\\Automation\\automationpractice\\drivers\\chromedriver.exe"); 
WebDriver driver = new ChromeDriver(); //Creating an object of Chrome Driver

driver.manage().window().maximize();

driver.get("https://www.amazon.in//");
driver.navigate().back();
driver.navigate().forward();

driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

System.out.println("Launched browser and entered url");

WebElement test= driver.findElement(By.name("field-keywords"));
test.sendKeys("Headphones");
test.clear();
//Searching for Headphones
test.sendKeys("Headphones" + Keys.ENTER);

//get page source
boolean result = driver.getPageSource().contains("Electronics");
System.out.println(result);

//to get title
String title = driver.getTitle();
System.out.println(title);

//to get current url
String url= driver.getCurrentUrl();
System.out.println(url);

//to get data
String data = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/span[1]/div[1]/h1[1]/div[1]/div[1]/div[1]/div[1]")).getText();
Objects.element1.getText();


System.out.println(data);

JavascriptExecutor js = (JavascriptExecutor)driver; 
js.executeScript("scrollBy(0, 8000)"); 

js.executeScript("scrollBy(8000, 0)"); 

Thread.sleep(2000);
driver.navigate().refresh(); 
Thread.sleep(3000);


driver.close();
}
}