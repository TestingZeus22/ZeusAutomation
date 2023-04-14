package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class roomsPage {

	@FindBy (xpath ="(//a[@class='btn-shadow btn btn-primary'])[1]") private WebElement createButton;
	@FindBy (xpath ="(//input[@type='search'])[1]") private WebElement searchField;
	@FindBy (xpath ="//select[@name='RoomTable_length']") private WebElement showEnteriesDropdown;
	
	@FindBy (xpath ="(//input[@class='form-control text-box single-line valid'])[1]") private WebElement roomCodeField;
	@FindBy (xpath ="(//input[@class='form-control text-box single-line valid'])[2]") private WebElement roomNameField;
	@FindBy (xpath ="(//input[@class='form-control text-box single-line valid'])[3]") private WebElement minAdultField;
	@FindBy (xpath ="(//input[@class='form-control text-box single-line valid'])[4]") private WebElement maxAdultField;
	@FindBy (xpath ="(//input[@class='form-control text-box single-line valid'])[5]") private WebElement minChildrenField;
	@FindBy (xpath ="(//input[@class='form-control text-box single-line valid'])[6]") private WebElement maxChildrenField;
	@FindBy (xpath ="(//input[@class='form-control text-box single-line valid'])[7]") private WebElement minPersonField;
	@FindBy (xpath ="(//input[@class='form-control text-box single-line valid'])[8]") private WebElement maxPersonField;
	
	@FindBy (xpath ="(//i[@class='lnr-pencil'])[1]") private WebElement editRoom1;
	@FindBy (xpath ="(//i[@class='lnr-pencil'])[2]") private WebElement editRoom2;
	
	
	public roomsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnCreateButton()
	{
		createButton.click();
	}
	
	public void sendsearchField(String search)
	{
		searchField.sendKeys(search);
	}
	
	public WebElement selectShowEnteriesDropdown()
	{
		WebElement Element = showEnteriesDropdown;
		return Element;
	}
	
	public void sendRoomCodeField(String roomCode)
	{
		roomCodeField.sendKeys(roomCode);
	}
	
	public void sendRoomNameField(String roomName)
	{
		roomNameField.sendKeys(roomName);
	}
	
	public void sendMinAdultField(String minAdult)
	{
		minAdultField.sendKeys(minAdult);
	}
	
	public void sendMaxAdultField(String maxAdult)
	{
		maxAdultField.sendKeys(maxAdult);
	}
	
	public void sendMinChildrenField(String minChildren)
	{
		minChildrenField.sendKeys(minChildren);
	}
	
	public void sendMaxChildrenField(String maxChildren)
	{
		maxChildrenField.sendKeys(maxChildren);
	}
	
	public void sendMinPersonField(String minPerson)
	{
		minPersonField.sendKeys(minPerson);
	}
	
	public void sendMaxPersonField(String maxPerson)
	{
		maxPersonField.sendKeys(maxPerson);
	}
	
	public void clickOnEditRoom1()
	{
		editRoom1.click();
	}
	
	public void clickOnEditRoom2()
	{
		editRoom2.click();
	}

}
