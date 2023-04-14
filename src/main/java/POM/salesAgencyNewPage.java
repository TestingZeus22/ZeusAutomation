package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class salesAgencyNewPage {
	 @FindBy (xpath ="//div[@class='page-title-heading']//div[2]") private WebElement salesagencyNewHeadingandBreadcrumbs;
	 @FindBy (xpath ="//div[@class='page-title-heading']//div[2]//li[1]") private WebElement dashboardLink;
	 @FindBy (xpath ="//div[@class='page-title-heading']//div[2]//li[2]") private WebElement salesAgencyLink;
	 @FindBy (xpath ="//div[@class='page-title-heading']//div[2]//li[3]") private WebElement salesAgencyCreateText;
	 
	 @FindBy (id ="SalesAgencyModel_Type") private WebElement travelAgecnyTypedropdown;
	 
	 @FindBy (id ="SalesAgencyModel_FrameworkContractID") private WebElement FrameworkContractDropdown;
	 @FindBy (id ="SalesAgencyModel_RevenueClass") private WebElement revenueclassField;
	 
	 @FindBy (id ="SalesAgencyModel_UMV1") private WebElement UmvDropdown;
	 
	 @FindBy (id ="agencyName") private WebElement salesOfficefield;
	 @FindBy (id ="SalesAgencyModel_Street") private WebElement streetNamefield;
	 @FindBy (id ="SalesAgencyModel_AddressAddition") private WebElement addressAdditionField;
	 @FindBy (id ="SalesAgencyModel_ZipCode") private WebElement zipcodeField;
	 
	 @FindBy (id ="SalesAgencyModel_CountryID") private WebElement countryDropdown;
	 @FindBy (id ="SalesAgencyModel_StateID") private WebElement stateNameDropdown;
	 @FindBy (id ="SalesAgencyModel_CityID") private WebElement cityOrLocationDropdown;
	 
	 @FindBy (id ="SalesAgencyModel_Web") private WebElement webField;
	 @FindBy (id ="SalesAgencyModel_AgencyTelephone") private WebElement agencyTelephoneField;
	 @FindBy (id ="SalesAgencyModel_AgencyEmail") private WebElement agencyEmailField;
	 
	 @FindBy (id ="SalesAgencyModel_Language") private WebElement languageDropdown;
	 @FindBy (id ="SalesAgencyModel_InternalContactPerson") private WebElement internalContactPersonField;
	 @FindBy (id ="drName") private WebElement drSalesAgencyField;
	 
	public salesAgencyNewPage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	
	public String getSalesagencyNewHeadingandBreadcrumbs()
	{
		String actualText = salesagencyNewHeadingandBreadcrumbs.getText();
		return actualText;
	}
	
	public void clickOndashboardlink()
	{
		dashboardLink.click();
	}
	
	public void clickOnSalesAgencyLink()
	{
		salesAgencyLink.click();
	}
	
	public String getSalesAgencyCreateText()
	{
		String actualText = salesAgencyCreateText.getText();
		return actualText;
	}
	
	public WebElement selectTravelAgecnyTypedropdown()
	{
		WebElement Element = travelAgecnyTypedropdown;
		return Element;
	}
	
	public WebElement selectFrameworkContractDropdown()
	{
		WebElement Element = FrameworkContractDropdown;
		return Element;
	}
	
	public void sendRevenueclassField(String revenue)
	{
		revenueclassField.sendKeys(revenue);
	}
	
	public WebElement selectUmvDropdown()
	{
		WebElement Element = UmvDropdown;
		return Element;
	}
	
	public void sendsalesOfficefield(String revenue)
	{
		salesOfficefield.sendKeys(revenue);
	}
	
	public void sendStreetNamefield(String street)
	{
		streetNamefield.sendKeys(street);
	}
	
	public void sendAddressAdditionField(String Addit)
	{
		addressAdditionField.sendKeys(Addit);
	}
	
	public void sendZipcodeField(String zipcode)
	{
		zipcodeField.sendKeys(zipcode);
	}
	
	public WebElement selectCountryDropdown()
	{
		WebElement Element = countryDropdown;
		return Element;
	}
	
	public WebElement selectStateNameDropdown()
	{
		WebElement Element = stateNameDropdown;
		return Element;
	}
	
	public WebElement selectCityOrLocationDropdown()
	{
		WebElement Element = cityOrLocationDropdown;
		return Element;
	}
	
	public void sendWebField(String web)
	{
		webField.sendKeys(web);
	}
	
	public void sendagencyTelephoneField(String tele)
	{
		agencyTelephoneField.sendKeys(tele);
	}
	
	public void sendAgencyEmailField(String AEmail)
	{
		agencyEmailField.sendKeys(AEmail);
	}
	
	public WebElement selectLanguageDropdown()
	{
		WebElement Element = languageDropdown;
		return Element;
	}
	
	public void sendinternalContactPersonField(String intCPerson)
	{
		internalContactPersonField.sendKeys(intCPerson);
	}
	
	public void sendDrSalesAgencyField(String drsales)
	{
		drSalesAgencyField.sendKeys(drsales);
	}

}