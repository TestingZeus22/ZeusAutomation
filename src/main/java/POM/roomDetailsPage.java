package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class roomDetailsPage {
				
@FindBy (xpath ="(//a[@class='btn-shadow btn btn-success pull-right'])[2]") private WebElement viewRoomList;

@FindBy (id ="LocalityID") private WebElement localityDropdown;	
@FindBy (id ="RoomTypeID") private WebElement roomTypeDropdown;

@FindBy (id ="RoomName") private WebElement roomNameField;
@FindBy (id ="Description") private WebElement descriptionField;

@FindBy (id ="SeaViewID") private WebElement seaviewDropdown;
@FindBy (id ="RoomCode") private WebElement roomcodeField;

@FindBy (id ="MinAdults") private WebElement minAdultPersonField;
@FindBy (id ="MaxAdults") private WebElement maxAdultPersonField;

@FindBy (id ="MinChildren") private WebElement minChildrenField;
@FindBy (id ="MaxChildren") private WebElement maxChildrenField;

@FindBy (id ="MInTotal") private WebElement minTotalPerson;
@FindBy (id ="MaxPersonTotal") private WebElement maxTotalPerson;

@FindBy (id ="MinAge") private WebElement minAgeField;

@FindBy (id ="btn_RoomCreate") private WebElement createRoomButton;

	
	public roomDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnViewRoomList()
	{
		viewRoomList.click();
	}

	public WebElement localitydropdown()
	{
		WebElement Element = localityDropdown;
		return Element;
	}
	
	public WebElement dropdownRoomType()
	{
		WebElement Element = roomTypeDropdown;
		return Element;
	}
	
	public void sendroomName(String RoomName)
	{
		roomNameField.sendKeys(RoomName);
	}
	
	public void sendDescription(String Description)
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
	
	public void sendMinTotalPerson(String MinTotalPerson)
	{
		minTotalPerson.sendKeys(MinTotalPerson);
	}
	
	public void clearMinTotalPerson()
	{
		minTotalPerson.clear();
	}
	
	public void sendmaxTotalPerson(String MaxTotalPersons)
	{
		maxTotalPerson.sendKeys(MaxTotalPersons);
	}
	
	public void clearMaxTotalPerson()
	{
		maxTotalPerson.clear();
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
