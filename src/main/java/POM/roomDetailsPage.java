package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class roomDetailsPage 
{
	
@FindBy (xpath ="//span[text()='Rooms']") private WebElement rooms;	
@FindBy (xpath ="//a[@class='btn-shadow btn btn-primary'])[1]") private WebElement roomcreateButton;
			
@FindBy (id ="LocalityID") private WebElement localityDropdown;	
@FindBy (id ="RoomName") private WebElement roomName;

@FindBy (id ="RoomTypeID") private WebElement roomTypeDropdown;
@FindBy (id ="Description") private WebElement descriptionField;

@FindBy (id ="SeaViewID") private WebElement seaviewDropdown;
@FindBy (id ="RoomCode") private WebElement roomcodeField;

@FindBy (id ="MinAdults") private WebElement minAdultPersonField;
@FindBy (id ="MaxAdults") private WebElement maxAdultPersonField;

@FindBy (id ="MinChildren") private WebElement minChildrenField;
@FindBy (id ="MaxChildren") private WebElement maxChildrenField;

//@FindBy (id ="MInTotal") private WebElement mInTotal;
@FindBy (id ="MaxPersonTotal") private WebElement maxPersonTotalField;

@FindBy (id ="MinAge") private WebElement minAgeField;

@FindBy (id ="btn_RoomCreate") private WebElement createRoomButton;


	
	public roomDetailsPage(WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnroom()
	{
		rooms.click();
	}
	
	public void clickOnroomcreateButton()
	{
		roomcreateButton.click();
	}
	
	public WebElement localitydropdown()
	{
		WebElement Element = roomTypeDropdown;
		return Element;
	}
	
	public void sendroomName(String RoomName)
	{
		roomName.sendKeys(RoomName);
	}
	
	public WebElement dropdownRoomType()
	{
		WebElement Element = roomTypeDropdown;
		return Element;
	}
	
	public void senddescription(String Description)
	{
		descriptionField.sendKeys(Description);
	}
	
	public WebElement dropdownseaView()
	{
		WebElement Element = seaviewDropdown;
		return Element;
	}
	
	public void sendroomcode(String Roomcode)
	{
		roomcodeField.sendKeys(Roomcode);
	}
	
	public void sendminAdultPerson(String MinAdultPerson)
	{
		minAdultPersonField.sendKeys(MinAdultPerson);
	}
	
	public void clearMinAdultPerson()
	{
		minAdultPersonField.clear();
	}
	
	public void sendmaxAdultPerson(String MaxAdultPerson)
	{
		maxAdultPersonField.sendKeys(MaxAdultPerson);
	}
	
	public void clearMaxAdultPerson()
	{
		maxAdultPersonField.clear();
	}
	
	public void sendminChildren(String MinChildren)
	{
		minChildrenField.sendKeys(MinChildren);
	}
	
	public void clearMinChildren()
	{
		minChildrenField.clear();
	}
	
	public void sendmaxChildren(String MaxChildren)
	{
		maxChildrenField.sendKeys(MaxChildren);
	}
	
	public void clearMaxChildren()
	{
		maxChildrenField.clear();
	}
	
	public void sendmaxTotalPerson(String MaxTotalPersons)
	{
		maxPersonTotalField.sendKeys(MaxTotalPersons);
	}
	
	public void clearMaxTotalPerson()
	{
		maxPersonTotalField.clear();
	}
	
	public void sendminAge(String MinAge)
	{
		minAgeField.sendKeys(MinAge);
	}
	
	public void clickOncreateRoomButton()
	{
		createRoomButton.click();
	}
	
}
