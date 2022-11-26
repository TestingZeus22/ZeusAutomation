package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class allotmentPage {

	
@FindBy (id ="AllotmentStartDate") private WebElement startDateField;
@FindBy (id ="AllotmentEndDate") private WebElement endDateField;	
@FindBy (xpath ="//button[@class='btn btn-primary btn-lg ']") private WebElement loadAllotmentButton;	
@FindBy (xpath ="//button[text()='Change Allotment']") private WebElement changeAllotmentButton;	
@FindBy (id ="accardshowlog") private WebElement showLogButton;

	public allotmentPage(WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendStartDate(String Start)
	
	{
		startDateField.sendKeys(Start);
	}
	
	public void sendendDate(String End)
	
	{
		endDateField.sendKeys(End);
	}
	
	public void clickOnLoadAllotment()
	{
		loadAllotmentButton.click();
	}
	
	public void clickOnchangeAllotment()
	{
		changeAllotmentButton.click();
	}
	
	public void clickOnshowLogButton()
	{
		showLogButton.click();
	}
}
