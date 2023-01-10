package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import utility.utilityClass;

public class BSAutomation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rohan.patil\\Jar files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	 	driver.get("https://dcspl.dhyey.com:506/D365BC_20_3_US/");

	 	driver.manage().window().maximize();
	 	
	 	Thread.sleep(5000);
	 	
	 	driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys("navadmin");
	 	
	 	Thread.sleep(500);
		
	 	driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Dcspl@2022");
	 	Thread.sleep(500);
	 	
	 	driver.findElement(By.xpath("//button[@id='submitButton']")).click();
	 	Thread.sleep(5000);
	 	//driver.findElement(By.id("search")).click();
	 	driver.findElement(By.xpath("//a[@id='search']")).click();
	 	
	 	
	 	Thread.sleep(30000);
	 	
	 	driver.findElement(By.xpath("//span[text()='Sales Orders']")).click();
	 	
	 	//driver.findElement(By.xpath("//span[text()='Sales']")).click();
	 	
	 	
	 	//driver.findElement(By.xpath("//div[@id='b5c']//input")).sendKeys("Sales order");
	 	
//	 	
// 	     WebElement send = driver.findElement(By.id("b5cee"));
// 	     send.sendKeys("abc");
	 	//driver.findElement(By.xpath("(//input[@id='b5cee'])[1]")).sendKeys("abc");
	 	
	 	
    // driver.findElement(By.xpath("//input[@class='cursorinherit stringcontrol-edit thm-cont-u1-font-size thm-cont-u1-font-stack thm-cont-g2-bdrcolor-1 thm-cont-s1-bdrcolor--focus thm-cont-s1-outlinecolor--focus thm-cont-u1-color-2--medflat thm-cont-h1-bdrcolor--hover thm-cont-h1-bdrcolor--prev-sib-hover]'")).sendKeys("abc");
	 	
	 	//driver.findElement(By.xpath("//input[@id='b5cee']")).sendKeys("abc");
	 	//driver.findElement(By.xpath("//div[@id='b5c']")).sendKeys("apd");
	 	//driver.findElement(By.xpath("//div[@id='b5c']//input")).sendKeys("sales order");
	 	
//	 	JavascriptExecutor jse = ((JavascriptExecutor)driver);
//	 	WebElement email = driver. findElement(By.id("b5cee"));
//	 	jse. executeScript("arguments[0]. value='rohan';", email);
	 	
	}

}
