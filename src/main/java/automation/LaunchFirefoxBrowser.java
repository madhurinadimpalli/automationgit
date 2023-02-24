package automation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Automation\\automationpractice\\drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println("Launched browser and entered url");
		driver.quit();

	}

}
