package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class selectCompanyPage {
	
	@FindBy (xpath = "//span[text()='Please select company to proceed.']") private static WebElement DisplayedText;
	@FindBy (xpath = "//button[@class='btn btn-primary btn-lg']") private WebElement proceed;
	@FindBy (id = "companyselectionmodel_CompanyId") private WebElement SelectDropdown;
	
	
	public selectCompanyPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement SelectDropDownList()
	{
		WebElement Element = SelectDropdown;
		return Element;
	}
	
	public String getActualText()
	{
		String actualText = DisplayedText.getText();
		return actualText;
	}
	
	public void ClickOnProceedButton()
	{
		proceed.click();
	}

}
