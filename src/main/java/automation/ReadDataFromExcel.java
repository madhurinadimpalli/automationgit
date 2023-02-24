package automation;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ReadDataFromExcel {
	public static void main(String[] args) throws InterruptedException {
		try {			
			System.setProperty("webdriver.chrome.driver",
					"D:\\Automation\\automationpractice\\drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in//");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			System.out.println("Launched browser and entered url");
			
			/*FileInputStream file= new FileInputStream("D:\\Automation\\automationpractice\\src\\Utilities\\TestData.xlsx");		
			Workbook w1= WorkbookFactory.create(file);
			String data= w1.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
			System.out.println(data);*/			
			
			WebElement test= driver.findElement(By.name("field-keywords"));
			
			test.sendKeys(HelperClass.readData("Sheet1", 1, 0) + Keys.ENTER);
			
		} catch (Exception e) {
		} } }

	