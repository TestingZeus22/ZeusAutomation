package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tbmCodeMasterPage {

	
	@FindBy (xpath = "//a[@class='btn-shadow btn btn-primary']") private WebElement createButtoninTbmMaster;
	@FindBy (xpath = "//a[text()='Dashboard']") private WebElement clickOnDashboard;

	
	public tbmCodeMasterPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOncreateButtoninTbmMaster()
	
	{
		createButtoninTbmMaster.click();
	}
	
	public void clickOnDashboard()
	
	{
		clickOnDashboard.click();
	}
	
}
