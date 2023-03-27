package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tbmCodeMasterPage {

	@FindBy (xpath = "//a[@class='btn-shadow btn btn-primary']") private WebElement createButtoninTbmMaster;
	@FindBy (xpath = "//a[text()='Dashboard']") private WebElement Dashboard;
	
	@FindBy (xpath ="//input[@type='search']") private WebElement searchField;

    @FindBy (xpath ="(//input[@type='text'])[1]") private WebElement nameField;
    @FindBy (xpath ="(//input[@type='text'])[1]") private WebElement codeField;
    @FindBy (xpath ="(//input[@type='text'])[1]") private WebElement GIATAIDField;
   
    
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
		Dashboard.click();
	}
	
	public String geTDashboardtEXT()
	{
		String actualText = Dashboard.getText();
		return actualText;
	}
	
	public void sendSearchField(String name)
	{
		searchField.sendKeys(name);
	}
	
	public void sendName(String name)
	{
		nameField.sendKeys(name);
	}
	
	public void sendcode(String code)
	{
		nameField.sendKeys(code);
	}

	public void sendGIATAID(String GIATAID)
	{
	nameField.sendKeys(GIATAID);
	}
	
	}
