package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.BaseClass;

	public class UtilityClass extends BaseClass {
	
	
	public static String readDataFromStringExcel(int rowNum, int cellNum, String SheetName) throws EncryptedDocumentException, IOException
	{
		//FileInputStream File =new FileInputStream(System.getProperty("user.dir")+"\\TestData\\data.xlsx");
		//File myfile = new File("C:\\Users\\rohan.patil\\Jar files\\data.xlsx");
		File myfile = new File("D:\\OneDrive - Dhyey Consulting Services Pvt. Ltd\\Jar files\\data.xlsx");
		String value = WorkbookFactory.create(myfile).getSheet(SheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
		return value;	
	}
	
	public static double readDataFromNumericExcel(int rowNum, int cellNum, String SheetName) throws EncryptedDocumentException, IOException
	{
		File myfile = new File("C:\\Users\\rohan.patil\\Jar files\\data.xlsx");
		double value = WorkbookFactory.create(myfile).getSheet(SheetName).getRow(rowNum).getCell(cellNum).getNumericCellValue();
		return value;	
	}
	
	public static boolean readDataFromBooleanExcel(int rowNum, int cellNum, String SheetName) throws EncryptedDocumentException, IOException
	{
		File myfile = new File("C:\\Users\\rohan.patil\\Jar files\\data.xlsx");
		boolean value = WorkbookFactory.create(myfile).getSheet(SheetName).getRow(rowNum).getCell(cellNum).getBooleanCellValue();
		return value;	
	}

	public static void screenshot(WebDriver driver, String TCNO1) throws IOException
	{
		File SourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File DestFile = new File("C:\\Users\\rohan.patil\\Jar files\\TC_Screenshots\\TC\\"+TCNO1+".png");
		FileHandler.copy(SourceFile, DestFile);
	}	
	
	public static void implicitlyWaitInMillis(int timeMillis)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(timeMillis));
	}
	
	public static void implicitlyWaitInsec(int timeSec)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(timeSec));
	}
	
	public static void explicitWaitInMillsTillClickable (int timeMills, WebElement element)
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofMillis(timeMills));
		w.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static void explicitWaitInMillsTillSelected(int timeMills, WebElement element)
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofMillis(timeMills));
		w.until(ExpectedConditions.elementToBeSelected(element));
	}	
	
	public static void explicitWaitInSecTillVisibility(int timeSec, WebElement element)
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofMillis(timeSec));
		w.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void explicitWaitInSecTillClickable (int timeSec, WebElement element)
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofMillis(timeSec));
		w.until(ExpectedConditions.elementToBeClickable(element));
	} 
	
	public static void explicitWaitInSecTillSelected(int timeSec, WebElement element)
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofMillis(timeSec));
		w.until(ExpectedConditions.elementToBeSelected(element));
	}	
	
	public static void scrollByAxis(int x,int y)
	{
		JavascriptExecutor JSE = ((JavascriptExecutor)driver);
		JSE.executeScript("window.scrollBy("+x+","+y+")");
	}
	
	public static void scrollIntoView(WebElement element)
	{
		JavascriptExecutor JSE = ((JavascriptExecutor)driver);
		JSE.executeScript("arguments[0].scrollIntoView();", element);
	}
	
	public static void listBoxHandlingUsingDeselectIndex(WebElement Element, int index)
	{
		Select S = new Select(Element);
		if (S.isMultiple())
		{
		S.deselectByIndex(index);
		}	
	}
	
	public static void listBoxHandlingUsingDeselectValue(WebElement Element, String value)
	{
		Select S = new Select(Element);
		if (S.isMultiple())
		{
		S.deselectByValue(value);
		}
	}
	
	public static void listBoxHandlingUsingDeselectByText(String ByText, WebElement Element)
	{
		Select S = new Select(Element);
		if (S.isMultiple())
		{
		S.deselectByVisibleText(ByText);
		}
	}
	public static void listBoxHandlingUsingIndex(WebElement Element, int index)
	{
		Select S = new Select(Element);
		S.selectByIndex(index);
	}
	
	public static void listBoxHandlingUsingValue(WebElement Element, String value)
	{
		Select S = new Select(Element);
		S.selectByValue(value);
	}
	
	public static void listBoxHandlingUsingByText(String ByText, WebElement Element)
	{
		Select S = new Select(Element);
		S.selectByVisibleText(ByText);
	}
	
	public static void listBoxHandlingUsingDeselectAll(WebElement Element)
	{
		Select S = new Select(Element);
		if (S.isMultiple())
		{
		S.deselectAll();
		}
	}
	
	public static void clickUsingJSE (WebElement ElementName)
	{
		JavascriptExecutor JSE = (JavascriptExecutor)driver;
		JSE.executeScript("arguments[0].click();", ElementName);
		
	}
		
	}

