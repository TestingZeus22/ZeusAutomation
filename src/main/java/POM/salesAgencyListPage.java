package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class salesAgencyListPage {
	
	@FindBy (xpath ="//div[@class='page-title-heading']//div[2]") private WebElement salesAgencyListHeadingandBreadcrumbs;
	@FindBy (xpath ="//div[@class='page-title-heading']//div[2]//li[1]") private WebElement dashboardLink;
	@FindBy (xpath ="//div[@class='page-title-heading']//div[2]//li[2]") private WebElement salesAgencyText;
	
	@FindBy (xpath ="//a[@class='btn-shadow btn btn-primary']") private WebElement createButton;
	@FindBy (xpath ="//input[@type='search']") private WebElement searchField;
	@FindBy (xpath ="//select[@name='SalesAgencyTable_length']") private WebElement showEntriesDropdown;
	
	@FindBy (id ="ContractStatusDD") private WebElement ContractStatusTypeDropdown;
	@FindBy (xpath ="(//input[@class='form-control text-box single-line valid'])[1]") private WebElement frameworkContractField;
	@FindBy (xpath ="(//input[@class='form-control text-box single-line valid'])[2]") private WebElement UmvField;
	@FindBy (xpath ="(//input[@class='form-control text-box single-line valid'])[3]") private WebElement salesOfficeField;
	@FindBy (xpath ="(//input[@class='form-control text-box single-line valid'])[4]") private WebElement agencyCodeField;
	@FindBy (xpath ="(//input[@class='form-control text-box single-line valid'])[5]") private WebElement countryField;
	@FindBy (xpath ="(//input[@class='form-control text-box single-line valid'])[6]") private WebElement cityField;
	@FindBy (xpath ="(//input[@class='form-control text-box single-line valid'])[7]") private WebElement revenueClassField;
	
	@FindBy (id ="AgencyFrom") private WebElement agencyFromDropdown;
	@FindBy (id ="Confirmationflag") private WebElement confirmationFlagDropdown;
	 
	public salesAgencyListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getSalesAgencyListHeadingandBreadcrumbs()
	{
		String actualText = salesAgencyListHeadingandBreadcrumbs.getText();
		return actualText;
	}
	
	public void clickOndashboardlink()
	{
		dashboardLink.click();
	}
	
	public String getSalesAgencyText()
	{
		String actualText = salesAgencyText.getText();
		return actualText;
	}
	
	public void clickOnCreateButton()
	{
		createButton.click();
	}
	
	public void sendsearchField(String Search)
	{
		searchField.sendKeys(Search);
	}
	
	public WebElement selectshowEntriesDropdown()
	{
		WebElement Element = showEntriesDropdown;
		return Element;
	}
	
	public WebElement selectContractStatusTypeDropdown()
	{
		WebElement Element = ContractStatusTypeDropdown;
		return Element;
	}
	
	public void sendFrameworkContractField(String framework)
	{
		frameworkContractField.sendKeys(framework);
	}
	
	public void sendUmvField(String Umv)
	{
		UmvField.sendKeys(Umv);
	}
	
	public void sendSalesOfficeField(String salesOffice)
	{
		salesOfficeField.sendKeys(salesOffice);
	}
	
	public void sendAgencyCodeField(String agencyCode)
	{
		agencyCodeField.sendKeys(agencyCode);
	}
	
	public void sendCountryField(String country)
	{
		countryField.sendKeys(country);
	}
	
	public void sendCityField(String city)
	{
		cityField.sendKeys(city);
	}
	
	public void sendRevenueClassField(String revenue)
	{
		revenueClassField.sendKeys(revenue);
	}
	
	public WebElement selectAgencyFromDropdown()
	{
		WebElement Element = agencyFromDropdown;
		return Element;
	}
	
	public WebElement selectconfirmationFlagDropdown()
	{
		WebElement Element = confirmationFlagDropdown;
		return Element;
	}
	
	
}