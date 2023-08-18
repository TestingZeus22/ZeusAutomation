package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contractsPage {

	@FindBy (xpath ="(//a[@class='btn-shadow btn btn-primary'])[3]") private WebElement createConractButton;
	@FindBy (xpath ="(//input[@type='search'])[1]") private WebElement searchField;
	@FindBy (xpath ="//select[@name='RoomTable_length']") private WebElement showEnteriesDropdown;
	
	@FindBy (xpath ="(//input[@class='form-control text-box single-line valid'])[9]") private WebElement contractNumberField;
	@FindBy (xpath ="(//input[@class='form-control text-box single-line valid'])[10]") private WebElement contractNameField;
	@FindBy (xpath ="(//input[@class='form-control text-box single-line valid datepicker'])[1]") private WebElement startDateField;
	@FindBy (xpath ="(//input[@class='form-control text-box single-line valid datepicker'])[2]") private WebElement endDateField;
	@FindBy (id ="ContractStatusDD") private WebElement statusDropdown;
	@FindBy (xpath ="(//i[@class='lnr-pencil'])[2]") private WebElement editContract;
	@FindBy (xpath ="(//i[@class='pe-7s-trash btn-icon-wrapper'])[1]") private WebElement deleteContract;
	
	
	public contractsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOncreateContractButton()
	
	{
		createConractButton.click();
	}
	
	public void sendsearchField(String search)
	{
		searchField.sendKeys(search);
	}
	
	public WebElement selectShowEnteriesDropdown()
	{
		WebElement Element = showEnteriesDropdown;
		return Element;
	}
	
	public void sendContractNumberField(String contractNumber)
	{
		contractNumberField.sendKeys(contractNumber);
	}
	
	public void sendContractNameField(String contractName)
	{
		contractNameField.sendKeys(contractName);
	}
	
	public void sendStartDateField(String startDate)
	{
		startDateField.sendKeys(startDate);
	}
	
	public void sendEndDateField(String endDate)
	{
		endDateField.sendKeys(endDate);
	}
	
	public WebElement selectStatusDropdown()
	{
		WebElement Element = statusDropdown;
		return Element;
	}
	
	public void ClickOneditContract()
	
	{
		editContract.click();
	}
	
	public void ClickOnDeleteContract()
	
	{
		deleteContract.click();
	}
	

}
	