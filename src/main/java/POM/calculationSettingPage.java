package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class calculationSettingPage {
	
	@FindBy (xpath ="//div[@class='page-title-heading']//div[2]//li[1]") private WebElement dashboardLink;
	@FindBy (xpath ="//div[@class='page-title-heading']//div[2]//li[1]") private WebElement accommodationLink;
	
	@FindBy (id = "Markup") private WebElement dbPercentagevalueField;
	@FindBy (id ="AvgMarkupLastYear") private WebElement averageDBpercentageLastYearField;
	@FindBy (xpath ="(//input[@id='IsGrossYes'])[1]") private WebElement ignoreGrossContractsYEScheckBox;
	@FindBy (xpath ="(//input[@id='IsGrossYes'])[1]") private WebElement ignoreGrossContractsNOcheckBox;
	@FindBy (xpath ="(//button[@class='btn btn-primary btn-lg'])[1]") private WebElement saveSettingButton;
	@FindBy (xpath ="(//button[@class='btn btn-primary btn-lg'])[3]") private WebElement saveandCalculateButton;
	@FindBy (xpath ="(//button[@class='btn btn-primary btn-lg'])[2]") private WebElement transferPriceOnlineButton;
	
	@FindBy (xpath = "//button[@type='button']") private WebElement readPopUpOnDB;
	@FindBy (xpath = "//button[@class='swal2-confirm swal2-styled']") private WebElement popUpAftersaveAndCalculate;
	
	@FindBy (xpath ="//a[@id='j1_40_anchor']") private WebElement testNG;
	@FindBy (xpath ="//a[@id='j3_40_anchor']") private WebElement testNGOptionClickAfterSave;
	@FindBy (xpath="//span[text()='room1']") private WebElement room1;
	@FindBy (xpath="//span[text()='room1']") private WebElement room1ByJSE;
	@FindBy (id = "btnsave") private WebElement savePrice;
	
	public calculationSettingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement clickOnDashboardLinkByJSE()
	{
		return dashboardLink;
	}
	
	public WebElement clickOnaccommodationLinkByJSE()
	{
		return accommodationLink;
	}
	
	public void clearDbPercentage()
	{
		dbPercentagevalueField.clear();
	}
	
	public void senddbPercentagevalue(String value)
	{
		dbPercentagevalueField.sendKeys(value);
	}
	
	public void clickOnAverageDBpercentageLastYearField()
	{
		averageDBpercentageLastYearField.click();
	}
	
	public void clickOnIgnoreGrossContractsYEScheckBox()
	{
		ignoreGrossContractsYEScheckBox.click();
	}
	
	public void clickOnIgnoreGrossContractsNOcheckBox()
	{
		ignoreGrossContractsNOcheckBox.click();
	}
	
	public void clickOnSaveSetting()
	{
		saveSettingButton.click();
	}
	
	public void clickOnSaveandCalculate()
	{
		saveandCalculateButton.click();
	}
	
	public void clickOnTransferPriceOnline()
	{
		transferPriceOnlineButton.click();
	}
	
	public void readErrorMsgOnDB()
	{
		readPopUpOnDB.click();
	}
	
	public void clickOnpopUpAftersaveAndCalculate()
	{
		popUpAftersaveAndCalculate.click();
	}
	
	public void clickOnTestNGoption()
	{
		testNG.click();
	}

	public void clickOntestNGOptionAfterSave()
	{
		testNGOptionClickAfterSave.click();
	}
	
	public void clickOnRoom1()
	{
		room1.click();
	}
	
	public WebElement clickOnRoom1ByJSE()
	{
		return room1ByJSE;
	}
	
	public void clickOnsavePrice()
	{
		savePrice.click();
	}	
	
}
