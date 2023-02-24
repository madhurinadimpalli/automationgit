package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class LaunchEdgeBrowser {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "D:\\Automation\\automationpractice\\drivers\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println("Launched browser and entered url");
		driver.quit();

	}

}
