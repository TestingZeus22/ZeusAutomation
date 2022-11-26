package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createRoomsPage {

	@FindBy (xpath ="(//a[@class='btn-shadow btn btn-primary'])[1]") private WebElement createButton;
	
	
	public createRoomsPage(WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
	}
	

	public void clickOncreateButton()
	{
		createButton.click();
	}
	
}
