package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class purchaseAgencyListPage {
	
@FindBy (xpath ="//div[@class='page-title-heading']//div[2]") private WebElement purchaseAgencylistheadingandBreadcrumbs; 
@FindBy (xpath ="//a[text()='Dashboard']") private WebElement dashboardlink;
@FindBy (xpath ="(//li[@class='breadcrumb-item'])[2]") private WebElement purchaseAgency;

@FindBy (xpath ="//a[@class='btn-shadow btn btn-primary']") private WebElement createButton;

@FindBy (xpath ="//select[@name='PATable_length']") private WebElement showEnteriesDropdown;
@FindBy (xpath ="//input[@type='search']") private WebElement searchField;

@FindBy (xpath ="(//input[@type='text'])[1]") private WebElement agencyNameField;
@FindBy (xpath ="(//input[@type='text'])[2]") private WebElement contactPersonField;
@FindBy (xpath ="(//input[@type='text'])[3]") private WebElement countryField;
@FindBy (xpath ="(//input[@type='text'])[4]") private WebElement locationField;
@FindBy (xpath ="(//input[@type='text'])[5]") private WebElement emailField;
@FindBy (xpath ="//table[@id='PATable']/tbody//tr[1]") private WebElement column1Row1data;
@FindBy (xpath ="//table[@id='PATable']/tbody//tr[2]") private WebElement column2Row2data;
@FindBy (xpath ="//table[@id='PATable']/tbody//tr[3]") private WebElement column3Row3data;
@FindBy (xpath ="(//i[@class='lnr-pencil'])[1]") private WebElement editRow1Column1;
@FindBy (xpath ="(//i[@class='lnr-pencil'])[2]") private WebElement editRow2Column2;
@FindBy (xpath ="(//i[@class='lnr-pencil'])[3]") private WebElement editRow3Column3;
@FindBy (xpath ="(//i[@class='pe-7s-trash btn-icon-wrapper'])[1]") private WebElement deleterow1column1;
@FindBy (xpath ="(//i[@class='pe-7s-trash btn-icon-wrapper'])[2]") private WebElement deleterow2column2;
@FindBy (xpath ="(//i[@class='pe-7s-trash btn-icon-wrapper'])[3]") private WebElement deleterow3column3;


	public purchaseAgencyListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getPurchaseAgencylistheadingandBreadcrumbs()
	{
		String actualText = purchaseAgencylistheadingandBreadcrumbs.getText();
		return actualText;
	}
	
	public void clickOndashboardlink()
	{
		dashboardlink.click();
	}
	
	public String getPurchaseAgencyText()
	{
		String actualText = purchaseAgency.getText();
		return actualText;
	}
	
	public void clickOnCreateButton()
	{
		createButton.click();
	}
	
	public WebElement selectShowEnteriesDropdown()
	{
		WebElement Element = showEnteriesDropdown;
		return Element;
	}
	
	public void sendSearchField(String search)
	{
		searchField.sendKeys(search);
	}
	
	public void sendAgencyNameField(String AgencyName)
	{
		agencyNameField.sendKeys(AgencyName);
	}
	
	public void sendContactPersonField(String contactperson)
	{
		contactPersonField.sendKeys(contactperson);
	}
	
	public void sendCountryField(String country)
	{
		countryField.sendKeys(country);
	}
	
	public void sendLocationField(String location)
	{
		locationField.sendKeys(location);
	}
	
	public void sendEmailField(String email)
	{
		emailField.sendKeys(email);
	}
	
	public String getColumn1Row1data()
	{
		String actualText = column1Row1data.getText();
		return actualText;
	}
	
	public String getColumn2Row2data()
	{
		String actualText = column2Row2data.getText();
		return actualText;
	}
	
	public String getColumn3Row3data()
	{
		String actualText = column3Row3data.getText();
		return actualText;
	}
	
	public void clickOnEditRow1Column1()
	{
		editRow1Column1.click();
	}
	
	public void clickOnEditRow2Column2()
	{
		editRow2Column2.click();
	}
	
	public void clickOnEditRow3Column3()
	{
		editRow3Column3.click();
	}
	
	public void clickOnDeleterow1column1()
	{
		deleterow1column1.click();
	}
	
	public void clickOnDeleterow2column2()
	{
		deleterow2column2.click();
	}
	
	public void clickOnDeleterow3column3()
	{
		deleterow3column3.click();
	}
	
}