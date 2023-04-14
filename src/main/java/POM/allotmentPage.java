package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class allotmentPage {
	
@FindBy (xpath ="//a[@data-toggle='dropdown']") private WebElement logoutDropDown;
@FindBy (xpath ="//a[@class='btn-pill btn-shadow btn-shine btn btn-focus']") private WebElement logoutOnAllotment;
	
@FindBy (xpath ="//div[@class='page-title-heading']//div[2]//li[1]") private WebElement dashboardLink;
@FindBy (xpath ="//div[@class='page-title-heading']//div[2]//li[2]") private WebElement accommodationLink;
	
@FindBy (id ="AllotmentStartDate") private WebElement startDateField;
@FindBy (id ="AllotmentEndDate") private WebElement endDateField;

@FindBy (xpath ="//button[@class='btn btn-primary btn-lg ']") private WebElement loadAllotmentButton;	
@FindBy (xpath ="//button[text()='Change Allotment']") private WebElement changeAllotmentButton;	
@FindBy (id ="accardshowlog") private WebElement showLogButton;

//Load allotment table.

@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[8]//td[3]") private WebElement initialAllotRoom1R1C1;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[9]//td[3]") private WebElement currentAllotRoom1R1C1;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[10]//td[3]") private WebElement soldAllotRoom1R1C1;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[11]//td[3]") private WebElement stopSalesRoom1R1C1;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[12]//td[3]") private WebElement remainingAllotRoom1R1C1;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[14]//td[3]") private WebElement releaseDaysAllotRoom1R1c1;


	public allotmentPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnLogoutButtonOfAllotment()
	{
		logoutDropDown.click();
	}
	
	public void logoutClickOFAllotment()
	{
		logoutOnAllotment.click();
	}
	
	public void clickOnDashboardLink()
	{
		dashboardLink.click();
	}
	
	public void clickOnAccommodationLink()
	{
		accommodationLink.click();
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
	
	public String getInitialAllotRoom1R1C1()
	{
		String actualText = initialAllotRoom1R1C1.getText();
		return actualText;
	}
	
	public String getCurrentAllotRoom1R1C1()
	{
		String actualText = currentAllotRoom1R1C1.getText();
		return actualText;
	}
	
	public String getSoldAllotRoom1R1C1()
	{
		String actualText = soldAllotRoom1R1C1.getText();
		return actualText;
	}
	
	public String getstopSalesRoom1R1C1()
	{
		String actualText = stopSalesRoom1R1C1.getText();
		return actualText;
	}
	
	public String getRemainingAllotRoom1R1C1()
	{
		String actualText = remainingAllotRoom1R1C1.getText();
		return actualText;
	}
	
	public String getReleaseDaysAllotRoom1R1c1()
	{
		String actualText = releaseDaysAllotRoom1R1c1.getText();
		return actualText;
	}
	
	

	
}
