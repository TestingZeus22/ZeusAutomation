package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tbmCodeNewCreatePage {

	@FindBy (id = "TBMCodeModel_TBMCodeTypeID") private WebElement KindOfservice;
	@FindBy (id = "TBMCodeModel_Name") private WebElement TbmCodeMasterName;
	@FindBy (id = "TBMCodeModel_CountryID") private WebElement selectCountry;
	@FindBy (id = "btnSubmit") private WebElement createTbmCode;
	
	
	public tbmCodeNewCreatePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement selectKindOfservice()
	{
		WebElement Element = KindOfservice;
		return Element;
	}
	
	public void sendTbmCodeMasterName(String tbmC)
	{
		TbmCodeMasterName.sendKeys(tbmC);
	}
	
	public WebElement selectCountry()
	{
		WebElement Element = selectCountry;
		return Element;
	}
	
	public void clickOncreateTbmCode()
	{
		createTbmCode.click();
	}
	
}
