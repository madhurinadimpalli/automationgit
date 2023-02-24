package automation;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WriteDataToExcel {
	public static void main(String[] args) throws InterruptedException {
		try {			
			System.setProperty("webdriver.chrome.driver",
					"D:\\Automation\\automationpractice\\drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in//");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			System.out.println("Launched browser and entered url");
			
			String title = driver.getTitle();
			System.out.println(title);	
			
			String testdata= "test";
			
			/*FileInputStream file= new FileInputStream("D:\\Automation\\automationpractice\\src\\Utilities\\TestData.xlsx");
			Workbook w1= WorkbookFactory.create(file);
			w1.getSheet("Sheet1").createRow(2).createCell(1).setCellValue(title);
			FileOutputStream f = new FileOutputStream("D:\\Automation\\automationpractice\\src\\Utilities\\TestData.xlsx");
			w1.write(f);*/
			
			
			HelperClass.writeData("Sheet1", 2, 1, testdata);
			
			
			System.out.println("Success");				
		} catch (Exception e) {
		} } }

	