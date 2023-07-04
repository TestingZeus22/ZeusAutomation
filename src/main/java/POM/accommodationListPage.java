package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 public class accommodationListPage {

	@FindBy (xpath ="//div[@class='page-title-heading']//div[2]") private WebElement accommodationListHeadingAndBreadcrumbs;
	@FindBy (xpath ="//div[@class='page-title-heading']//div[2]//li[1]") private WebElement dashboardLink;
	@FindBy (xpath ="//div[@class='page-title-heading']//div[2]//li[2]") private WebElement accommodationText;
	
	@FindBy(xpath ="//a[@class='btn-shadow btn btn-primary']") private WebElement createAccommodationButton;
	@FindBy (xpath ="//select[@name='LocalityTable_length']") private WebElement showEnteriesDropdown;
	
	@FindBy (xpath ="(//input[@class='form-control text-box single-line valid'])[1]") private WebElement tbmCodeField;
	@FindBy (xpath ="(//input[@class='form-control text-box single-line valid'])[2]") private WebElement accommodationNameField;
	@FindBy (xpath ="(//input[@class='form-control text-box single-line valid'])[3]") private WebElement locationField;
	@FindBy (xpath ="(//input[@class='form-control text-box single-line valid'])[4]") private WebElement countryField;
	@FindBy (id ="StatusDD") private WebElement statusDropdown;
	@FindBy (xpath ="(//input[@class='form-control text-box single-line valid'])[5]") private WebElement purchaserField;
	@FindBy (xpath ="//table[@id='LocalityTable']/tbody//tr[1]") private WebElement column1Row1data;
	@FindBy (xpath ="//table[@id='LocalityTable']/tbody//tr[1]") private WebElement column2Row2data;
	@FindBy (xpath ="//table[@id='LocalityTable']/tbody//tr[1]") private WebElement column3Row3data;
	@FindBy (xpath ="//i[@class='lnr-pencil']") private WebElement editRow1Column1;
	@FindBy (xpath ="(//i[@class='lnr-pencil'])[2]") private WebElement editRow2Column2;
	@FindBy (xpath ="(//i[@class='lnr-pencil'])[3]") private WebElement editRow3Column3;
	@FindBy (xpath ="(//i[@class='pe-7s-trash btn-icon-wrapper'])[1]") private WebElement deleterow1column1;
	@FindBy (xpath ="(//i[@class='pe-7s-trash btn-icon-wrapper'])[1]") private WebElement deleterow2column2;
	@FindBy (xpath ="(//i[@class='pe-7s-trash btn-icon-wrapper'])[1]") private WebElement deleterow3column3;
	
	public accommodationListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getAccommodationListHeadingAndBreadcrumbs()
	{
		String actualText = accommodationListHeadingAndBreadcrumbs.getText();
		return actualText;
	}
	
	public void clickOnDashboardLink()
	{
		dashboardLink.click();
	}
	
	public String getAccommodationText()
	{
		String actualText = accommodationText.getText();
		return actualText;
	}
	
	public void clickcreateAccommodationButton()
	{
		createAccommodationButton.click();
	}
	
	public WebElement selectShowEnteriesDropdown()
	{
		WebElement Element = showEnteriesDropdown;
		return Element;
	}
	
	public void sendTbmCodeField(String tbmcode)
	{
		tbmCodeField.sendKeys(tbmcode);
	}
	
	public void sendAccommodationNameField(String accommodation)
	{
		accommodationNameField.sendKeys(accommodation);
	}
	
	public void sendLocationField(String location)
	{
		locationField.sendKeys(location);
	}
	
	public void sendCountryField(String country)
	{
		countryField.sendKeys(country);
	}
	
	public WebElement selectStatusDropdown()
	{
		WebElement Element = statusDropdown;
		return Element;
	}
	
	public void sendpurchaserField(String purchaser)
	{
		purchaserField.sendKeys(purchaser);
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

