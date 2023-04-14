package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class purchaseAgencyNewPage {
	
 @FindBy (xpath ="//div[@class='page-title-heading']//div[2]") private WebElement purchaseAgencyNewHeadingAndBreadcrumbs;
 @FindBy (xpath ="//div[@class='page-title-heading']//div[2]//li[1]") private WebElement dashboardLink; 
 @FindBy (xpath ="//div[@class='page-title-heading']//div[2]//li[2]") private WebElement purchaseAgencyLink;
 @FindBy (xpath ="//div[@class='page-title-heading']//div[2]//li[3]") private WebElement purchaseAgencyCreateText;
 
 @FindBy (id ="PAModel_AgencyName") private WebElement AgencyNameField;
 @FindBy (id ="PAModel_AgencyID") private WebElement AgencyIDField;
 @FindBy (id ="PAModel_Street") private WebElement streetNameField;
 @FindBy (id ="PAModel_LanguageID") private WebElement languageListBox;
 @FindBy (id ="PAModel_ZipCode") private WebElement zipcodeField;
 @FindBy (id ="PAModel_CountryID") private WebElement countryListBox;
 @FindBy (id ="PAModel_StateID") private WebElement stateNameListBox;
 @FindBy (id ="PAModel_CityID") private WebElement cityOrLocationListBox;
 @FindBy (id ="PAModel_ManagingDirector") private WebElement managingDirectorField;
 @FindBy (id ="PAModel_ContactName") private WebElement contactPersonField;
 @FindBy (id ="PAModel_AgencyTelephone") private WebElement agencyTelephoneField;
 @FindBy (id ="PAModel_ContactTelephone") private WebElement contactTelephoneField;
 @FindBy (id ="PAModel_ReservationEmail") private WebElement reservationEmailField;
 @FindBy (id ="PAModel_ContactEmail") private WebElement contactEmailField;
 
 @FindBy (xpath ="//a[@class='btn-shadow btn btn-success']") private WebElement viewListButton;
 @FindBy (id ="btn_CreatePA") private WebElement createPurchaseAgencyButton;
 
	public purchaseAgencyNewPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getPurchaseAgencyNewHeadingAndBreadcrumbs()
	{
		String actualText = purchaseAgencyNewHeadingAndBreadcrumbs.getText();
		return actualText;
	}
	
	public void clickOndashboardlink()
	{
		dashboardLink.click();
	}
	
	public String getdashboardText()
	{
		String actualText = dashboardLink.getText();
		return actualText;
	}
	
	public void clickOnPurchaseAgencyLink()
	{
		purchaseAgencyLink.click();
	}
	
	public String getPurchaseAgencyCreateText()
	{
		String actualText = purchaseAgencyCreateText.getText();
		return actualText;
	}
	
	public void sendAgencyNameField(String agencyName)
	{
		AgencyNameField.sendKeys(agencyName);
	}
	
	public void sendAgencyIDField(String agencyID)
	{
		AgencyIDField.sendKeys(agencyID);
	}
	
	public void sendStreetNameField(String street)
	{
		streetNameField.sendKeys(street);
	}
	
	public WebElement selectCityOrLocationListBox()
	{
		WebElement Element = cityOrLocationListBox;
		return Element;
	}
	
	public void sendZipcodeField(String zipcode)
	{
		zipcodeField.sendKeys(zipcode);
	}
	
	public WebElement selectcountryListBox()
	{
		WebElement Element = countryListBox;
		return Element;
	}
	
	public WebElement selectStateNameListBox()
	{
		WebElement Element = stateNameListBox;
		return Element;
	}
	
	public void sendManagingDirectorField(String MD)
	{
		managingDirectorField.sendKeys(MD);
	}
	
	public void sendContactPersonField(String contactPerson)
	{
		contactPersonField.sendKeys(contactPerson);
	}
	
	public void sendAgencyTelephoneField(String agencyTel)
	{
		agencyTelephoneField.sendKeys(agencyTel);
	}
	
	public void sendContactTelephoneField(String contactTel)
	{
		contactTelephoneField.sendKeys(contactTel);
	}
	
	public void sendreservationEmailField(String reservEmail)
	{
		reservationEmailField.sendKeys(reservEmail);
	}
	
	public void sendcontactEmailField(String contactEmail)
	{
		contactEmailField.sendKeys(contactEmail);
	}
	
	public void clickOnViewListButton()
	{
		viewListButton.click();
	}
	
	public void clickOnCreatePurchaseAgencyButton()
	{
		createPurchaseAgencyButton.click();
	}
	
}
