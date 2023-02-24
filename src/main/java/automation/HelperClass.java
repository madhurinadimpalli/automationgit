package automation;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class HelperClass
{
	
	public static String excelPath=  System.getProperty("user.dir") + "\\src\\Utilities\\TestData.xlsx";	
	public static WebDriver driver;
	
	public HelperClass(WebDriver driver) {
		this.driver = driver;
	}

	public static WebDriver getDriver() {
		return driver;
	}
	
public static void upload(String uploadpath) throws AWTException, InterruptedException
{
Thread.sleep(2000);
//Uploading file through robot class
StringSelection ss = new StringSelection(uploadpath);
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//copy the above string to clip board
Robot robot;
robot = new Robot();
robot.keyPress(KeyEvent.VK_ENTER);
//robot.keyRelease(KeyEvent.VK_ENTER);
robot.delay(2000);
robot.keyPress(KeyEvent.VK_CONTROL);
robot.keyPress(KeyEvent.VK_V);
//paste the copied string into the dialog box robot.
robot.keyPress(KeyEvent.VK_ENTER);
Thread.sleep(2000);
}



public static String readData(String SheetName, int rowNumber, int cellNumber)
{
	try
	{
		FileInputStream file= new FileInputStream("D:\\Automation\\automationpractice\\src\\Utilities\\TestData.xlsx");
		Workbook w1= WorkbookFactory.create(file);
		 String data= w1.getSheet(SheetName).getRow(rowNumber).getCell(cellNumber).getStringCellValue();
		  return data;
	}
	catch (Exception e) {
	}
	return SheetName;
}


public static void writeData(String SheetName, int rowNumber, int cellNumber, String data)
{
	try
	{
		FileInputStream file= new FileInputStream("D:\\Automation\\automationpractice\\src\\Utilities\\TestData.xlsx");
		Workbook w1= WorkbookFactory.create(file);
		w1.getSheet(SheetName).createRow(rowNumber).createCell(cellNumber).setCellValue(data);
		FileOutputStream f = new FileOutputStream("D:\\Automation\\automationpractice\\src\\Utilities\\TestData.xlsx");
		w1.write(f);			
		
	}
	catch (Exception e) {
	}
}



public static void captureScreenshot() throws IOException, InterruptedException
{

	Date currentdate= new Date();
	String screenshotfilename= currentdate.toString().replace(" ", "-").replace(":", "-");
	Thread.sleep(2000);
    System.out.println(screenshotfilename);
	TakesScreenshot ts= (TakesScreenshot)driver;
	File ScreenshotFile= ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(ScreenshotFile, new File(".//screenshot//"+screenshotfilename+".png"));
	
	}

}




