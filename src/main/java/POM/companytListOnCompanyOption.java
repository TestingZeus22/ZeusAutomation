package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class companytListOnCompanyOption {

	
@FindBy (xpath ="//i[@class='pe-7s-flag btn-icon-wrapper']") private WebElement restartStadisService;
@FindBy (xpath ="//a[@class='btn-shadow btn btn-primary']") private WebElement createButton;
@FindBy (xpath ="//button[@id='create']") private WebElement stardixButton;

@FindBy (xpath ="//select[@name='CompanyTable_length']") private WebElement companyTableLength;
@FindBy (xpath ="//input[@class='form-control form-control-sm']") private WebElement search;

@FindBy (xpath ="(//input[@class='form-control text-box single-line valid'])[1]") private WebElement companyNameField;
@FindBy (xpath ="(//input[@class='form-control text-box single-line valid'])[2]") private WebElement companyRegistrationNoField;
@FindBy (xpath ="(//input[@class='form-control text-box single-line valid'])[3]") private WebElement vatNumberField;
@FindBy (xpath ="(//input[@class='form-control text-box single-line valid'])[4]") private WebElement taxNumberField;
	
@FindBy (id ="CompanyTable_previous") private WebElement companyTablePrevious;
@FindBy (id ="CompanyTable_next") private WebElement companyTableNext;


	public companytListOnCompanyOption(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
   public void ClickOnRestartStadisService()
	{
	   restartStadisService.click();
	}
   
   public void ClickOnCreateButton()
	{
	   createButton.click();
	}
   
   public void ClickOnstardixButton()
	{
	   stardixButton.click();
	}

	public WebElement companyTableLengthDropdown()
	{
		WebElement Element = companyTableLength;
		return Element;
	}
	
	public void sendSearchField(String searchField)
	{
		search.sendKeys(searchField);
	}
	
	public void sendCompanyNameField(String companyName)
	{
		companyNameField.sendKeys(companyName);
	}
	
	public void sendCompanyRegistrationNoField(String companyRegist)
	{
		companyRegistrationNoField.sendKeys(companyRegist);
	}
	
	public void sendVatNumberField(String VatNO)
	{
		vatNumberField.sendKeys(VatNO);
	}
	
	public void sendTaxNumberField(String taxNO)
	{
		taxNumberField.sendKeys(taxNO);
	}
	
	public void ClickOnCompanyTablePrevious()
	{
		companyTablePrevious.click();
	}
	
	public void ClickOnCompanyTableNext()
	{
		companyTableNext.click();
	}
	
}
