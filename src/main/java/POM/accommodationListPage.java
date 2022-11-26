package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class accommodationListPage {

	@FindBy(xpath ="//a[@class='btn-shadow btn btn-primary']") private WebElement createAccommodationButton;

	
	public accommodationListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickcreateAccommodationButton()
	{
		createAccommodationButton.click();
	}
	
	
	
	
	
	
	
	
	
	
}






