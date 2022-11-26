package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	
	@FindBy (xpath ="//a[text()='Dashboard']") private WebElement dashboard;
	@FindBy (xpath ="//a[@class='p-0 btn']") private WebElement logoutButton;
	@FindBy (xpath ="//a[text()='Logout ']") private WebElement logoutclick;
	@FindBy (xpath ="//a[text()='Dashboard']") private WebElement getDashboardText;
	@FindBy (xpath ="(//i[@class='metismenu-state-icon pe-7s-angle-down caret-left'])[12]") private WebElement PurchaseList;
	@FindBy (xpath ="//i[@class='metismenu-icon pe-7s-shopbag']") private WebElement sales;
	@FindBy (xpath ="//label[text()='Sales Booking']") private WebElement salesBooking;
	
	
	@FindBy (xpath = "//i[@class='metismenu-icon pe-7s-folder']") private WebElement masterOption;
	@FindBy (xpath = "//label[text()='TBM']") private WebElement TbmOption;
	@FindBy (xpath = "//label[text()='TBM Code']") private WebElement TbmCode;
	
	
	@FindBy (xpath = "//i[@class='metismenu-icon lnr-cart']") private WebElement purchasebutton;
	@FindBy (xpath = "(//label[text()='Accommodation'])[1]") private WebElement accommodation;
	

	@FindBy (xpath ="//i[@class='metismenu-icon pe-7s-calculator']") private WebElement calculationList;
	@FindBy (xpath ="//label[text()='Offer Calculation']") private WebElement offerCalculation;
	@FindBy (xpath ="//label[text()='Offer Definition']") private WebElement offerDefination;
	
	public DashboardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void getText(String DashboardText)
	{
		dashboard.getText();
	}
	
	public void ClickOnLogoutButton()
	{
		logoutButton.click();
	}
	
	public void logoutClick()
	{
		logoutclick.click();
	}
	
	public String getActualTextOnDashboard()
	{
		String actualText=getDashboardText.getText();
		return actualText;
	}
	
	public void PurchaseListClick()
	{
		PurchaseList.click();
	}
	
	public void SalesClick()
	{
		sales.click();
	}
	
	public void salesBookingClick()
	{
		salesBooking.click();
	}
	
	
	public void clickOnMaster()
	{
		masterOption.click();
	}
	
	public void clickOnTbm()
	{
		TbmOption.click();
	}
	
	public void clickOnTbmCode()
	{
		TbmCode.click();
	}
	
	public void clickOnPurchaseButton()
	{
		purchasebutton.click();
	}
	
	public void clickOnAccommodation()
	{
		accommodation.click();
	}
	
	public void clickOncalculationList()
	{
		calculationList.click();
	}
	
	public void clickOnOffercalculationList()
	{
		offerCalculation.click();
	}
	
	public void clickOnOfferdefination()
	{
		offerDefination.click();
    }
}