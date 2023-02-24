package automation;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2
{
public static void main(String[] args) throws InterruptedException 
{	
System.setProperty("webdriver.chrome.driver","D:\\Automation\\automationpractice\\drivers\\chromedriver.exe"); 
WebDriver driver = new ChromeDriver(); //Creating an object of Chrome Driver
driver.manage().window().maximize(); 

driver.get("https://www.ironspider.ca/forms/checkradio.htm");

driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
System.out.println("Launched browser and entered url");
Thread.sleep(2000);

List<WebElement> rv1= driver.findElements(By.xpath("//input[@type='checkbox']"));
for(int i=0; i<=rv1.size()-1; i++)
{
rv1.get(i).click();
}
}
}