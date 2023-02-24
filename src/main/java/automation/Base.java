package automation;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;
	
	public static void initialization()
	{
        System.setProperty("webdriver.chrome.driver", "D:\\Automation\\automationpractice\\drivers\\chromedriver.exe");		
		driver= new ChromeDriver(); 		
		driver.manage().window().maximize();
		//driver.get("https://www.google.com/");
	}
	
	public void failed(String testMethodName)
	{
		Date currentdate= new Date();
		String screenshotfilename= currentdate.toString().replace(" ", "-").replace(":", "-");
		File scrFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File("D:\\Automation\\automationpractice\\screenshot\\" +testMethodName +screenshotfilename + ".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
}
