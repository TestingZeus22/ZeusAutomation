package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class calculationSettingPage {
	
	@FindBy(id = "Markup") private WebElement clearDbPercentagefield;
	@FindBy(id = "Markup") private WebElement dbPercentagevalue;
	@FindBy(xpath = "//button[@type='button']") private WebElement readPopUpOnDB;
	
	@FindBy(xpath ="(//button[@class='btn btn-primary btn-lg'])[1]") private WebElement saveSetting;
	@FindBy(xpath ="(//button[@class='btn btn-primary btn-lg'])[3]") private WebElement saveandCalculate;
	@FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']") private WebElement popUpAftersaveAndCalculate;
	@FindBy(xpath ="(//button[@class='btn btn-primary btn-lg'])[2]") private WebElement transferPriceOnline;
	
	@FindBy(id ="j2_13_anchor") private WebElement testNG;
	@FindBy(xpath ="(//a[@class='jstree-anchor'])[7]") private WebElement selectautoinTichiboAT;
	@FindBy(id ="j1_14_anchor") private WebElement selectautoinTichiboDE;
	@FindBy(xpath ="(//a[@class='jstree-anchor'])[14]") private WebElement selectautoinTichiboDEAfterSavecalculation;
	@FindBy(xpath="//span[text()='Block1']") private WebElement block1;
	@FindBy(xpath="//span[text()='room1']") private WebElement room1;
	@FindBy(id = "btnsave") private WebElement savePrice;
	
	
	public calculationSettingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clearDbPercentage()
	{
		clearDbPercentagefield.clear();
	}
	
	public void senddbPercentagevalue(String value)
	{
		dbPercentagevalue.sendKeys(value);
	}
	
	public void readErrorMsgOnDB()
	{
		readPopUpOnDB.click();
	}
	
	public void clickOnSaveSetting()
	{
		saveSetting.click();
	}
	
	public void clickOnSaveandCalculate()
	{
		saveandCalculate.click();
	}
	
	public void clickOnpopUpAftersaveAndCalculate()
	{
		popUpAftersaveAndCalculate.click();
	}
	
	public void clickOnTransferPriceOnline()
	{
		transferPriceOnline.click();
	}
	
	public void clickOnTestNG()
	{
		testNG.click();
	}
	
	public void clickOnselectautofieldinTichoAT()
	{
		selectautoinTichiboAT.click();
	}
	
	public void clickOnselectautofieldinTichiboDE()
	{
		selectautoinTichiboDE.click();
	}
	
	public void clickOnselectautoinTichiboDEAfterSavecalculation()
	{
		selectautoinTichiboDEAfterSavecalculation.click();
	}

	public void clickOnBlock1()
	
	{
		block1.click();
	}
	
	public void clickOnRoom1()
	
	{
		room1.click();
	}
	
	public void clickOnsavePrice()
	
	{
		savePrice.click();
	}
	
	
	
	
	
}
