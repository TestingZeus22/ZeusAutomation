package Base;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test123 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
	      
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://zeuscloud.azurewebsites.net/Index?Status=SE");
	Thread.sleep(1000);
	
	driver.findElement(By.id("loginmodel_UserName")).sendKeys("Tester");
	driver.findElement(By.id("loginmodel_Password")).sendKeys("Pp@12345678");
	
	
	String Pwd = driver.findElement(By.id("loginmodel_Password")).getText();
	System.out.println(Pwd);
	
//	Thread.sleep(1000);
//	driver.findElement(By.xpath("//button[text()='Login to Dashboard']")).click();
//	Thread.sleep(1000);
//	WebElement SelectBox = driver.findElement(By.id("companyselectionmodel_CompanyId"));
//	
//	
//	Select s = new Select(SelectBox);
//	
//	s.selectByVisibleText("Falk Tours AG");
//	driver.findElement(By.xpath("//button[text()='Proceed']")).click();
//	Thread.sleep(2000);
//	driver.navigate().to("https://zeuscloud.azurewebsites.net/Accommodation/AccommodationCard?id=2476#");
//	Thread.sleep(1000);
//	driver.findElement(By.id("seasonModel_SeasonAFrom")).sendKeys("01.01.2024");
//	Thread.sleep(1000);
//	String value = driver.findElement(By.id("seasonModel_SeasonAFrom")).getAttribute("value");
//	System.out.println("The Value is "+value);
//	Thread.sleep(1000);
		
		//String inputDate = "20.07.23"; // Change this to your desired input date in the format "DD.MM.YY"

	        try {
	            Date date = parseDate(Pwd);
	            String outputDate = formatDate(date);
	            System.out.println("Converted date: " + outputDate);
	        } catch (ParseException e) {
	            System.out.println("Error: Invalid date format. Please use the format \"DD.MM.YY\".");
	        }
	    }

	    public static Date parseDate(String inputDate) throws ParseException {
	        SimpleDateFormat inputFormat = new SimpleDateFormat("dd.MM.yy");
	        return inputFormat.parse(inputDate);
	    }

	    public static String formatDate(Date date) {
	        SimpleDateFormat outputFormat = new SimpleDateFormat("dd MMMM yyyy");
	        return outputFormat.format(date);
	    }
	}