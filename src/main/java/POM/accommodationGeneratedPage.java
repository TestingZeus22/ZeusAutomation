package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class accommodationGeneratedPage 

{
@FindBy (id ="TBMSearch") private WebElement TBMSearch;
@FindBy (id ="SearchByTBM") private WebElement SearchBy;

@FindBy (xpath ="//span[text()='Rooms']") private WebElement rooms;	
@FindBy (xpath ="(//span[@class='btn-icon-wrapper pr-2 opacity-7'])[2]") private WebElement roomcreateButton;

@FindBy (xpath ="//span[text()='Accommodation Details']") private WebElement accommodationDetails;
//@FindBy (xpath ="//span[text()='Rooms']") private WebElement rooms;
@FindBy (xpath ="//span[text()='Contracts']") private WebElement contracts;
@FindBy (xpath ="//span[text()='Allotment']") private WebElement allotment;
@FindBy (xpath ="//span[text()='Media/Text']") private WebElement mediaAndText;

	
	public accommodationGeneratedPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendTBMSearch(String TBM)
	{
		TBMSearch.sendKeys(TBM);
	}
	
	public void clickOnSearchBy()
	{
		SearchBy.click();
	}
	
	public void clickOnaccommodationDetails()
	{
		accommodationDetails.click();
	}
	
	public void clickOnrooms()
	{
		rooms.click();
	}
	
	public void clickOnroomCreateButton()
	{
		roomcreateButton.click();
	}
	
	public void clickOncontracts()
	{
		contracts.click();
	}
	
	public void clickOnallotment()
	{
		allotment.click();
	}
	
	public void clickOnmediaAndText()
	{
		mediaAndText.click();
	}
	
	// changes 
	

}
