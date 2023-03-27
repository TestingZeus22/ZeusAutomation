package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tbmCodeNewCreatePage {

	@FindBy (xpath ="//div[@class='page-title-heading']//div[2]") private WebElement tbmcodeNewHeadingAndBreadcrumbs;
	@FindBy (xpath ="//div[@style='font-size:small;']//li[1]") private WebElement dashboard;
	@FindBy (xpath ="//div[@style='font-size:small;']//li[2]") private WebElement tbmcodeMaster;
	
	@FindBy (id = "TBMCodeModel_TBMCodeTypeID") private WebElement KindOfservice;
	@FindBy (id = "TBMCodeModel_Name") private WebElement TbmCodeMasterNameField;
	@FindBy (id = "TBMCodeModel_CountryID") private WebElement selectCountry;
	@FindBy (id ="TBMCodeModel_GiataID") private WebElement GIATAIDfield;
	
	@FindBy (id ="TBMCodeModel_PurchaseAgencyID") private WebElement purchaseAgencyDropdown;
	@FindBy (id = "TBMCodeModel_ExternalID") private WebElement TBMCodeModel_ExternalIDField;
	@FindBy (id = "TBMCodeModel_ChannelManagerID") private WebElement ChannelManagerDropdown;
	@FindBy (id = "TBMCodeModel_ChannelManagerExternalID") private WebElement externalIDField;
	
	@FindBy (xpath ="//div[@class='float-right']//a") private WebElement viewList;
	@FindBy (id = "btnSubmit") private WebElement createTbmCode;
	
	
	public tbmCodeNewCreatePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String gettbmcodeNewHeadingAndBreadcrumbsText()
	{
		String actualText = tbmcodeNewHeadingAndBreadcrumbs.getText();
		return actualText;
	}
	
	public void clickOnDashboard()
	{
		dashboard.click();
	}
	
	public String getdashboardText()
	{
		String actualText = dashboard.getText();
		return actualText;
	}
	
	public void clickOnTbmcodeMaster()
	{
		tbmcodeMaster.click();
	}
	
	public String gettbmcodeMasterText()
	{
		String actualText = tbmcodeMaster.getText();
		return actualText;
	}

	public WebElement selectKindOfservice()
	{
		WebElement Element = KindOfservice;
		return Element;
	}
	
	public void sendTbmCodeMasterName(String tbmC)
	{
		TbmCodeMasterNameField.sendKeys(tbmC);
	}
	
	public WebElement selectCountry()
	{
		WebElement Element = selectCountry;
		return Element;
	}
	
	public void sendGIATAID(String GIATAID)
	{
		GIATAIDfield.sendKeys(GIATAID);
	}
	
	public WebElement selectPurchaseAgency()
	{
		WebElement Element = purchaseAgencyDropdown;
		return Element;
	}
	
	public void sendTBMCodeModel_ExternalIDFieldCodeMapping(String ExternalID)
	{
		TBMCodeModel_ExternalIDField.sendKeys(ExternalID);
	}
	
	public WebElement selectChannelManagerDropdown()
	{
		WebElement Element = ChannelManagerDropdown;
		return Element;
	}
	
	public void sendTBMCodeModel_ExternalIDFieldChannelManager(String ExternalID)
	{
		externalIDField.sendKeys(ExternalID);
	}
	
	public void clickOnViewList()
	{
		viewList.click();
	}
	
	public void clickOncreateTbmCode()
	{
		createTbmCode.click();
	}
	
}
