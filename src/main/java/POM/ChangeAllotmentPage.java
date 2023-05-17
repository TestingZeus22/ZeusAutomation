package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangeAllotmentPage 
	{
	
	@FindBy (id ="ChangeAllotmentId") private WebElement changeAllotmentDropdown;
	@FindBy (id ="btn_change_allotment") private WebElement addRowButton;
	
	@FindBy (xpath ="(//span[@class='multiselect-selected-text'])[1]") private WebElement multiselectdropdown1;
	@FindBy (xpath ="(//li[@class='multiselect-item multiselect-all'])[1]") private WebElement selectAllRoomsmultiselectdropdown1;
	@FindBy (xpath ="(//label[@class='checkbox']//input)[2]") private WebElement selectRoom1multiselectdropdown1;
	@FindBy (xpath ="(//label[@class='checkbox']//input)[3]") private WebElement selectRoom2multiselectdropdown1;
	
	@FindBy (xpath ="(//input[@id='incentive_StartDate'])[1]") private WebElement dateFromForRoom1Field;
	@FindBy (xpath ="(//input[@id='incentive_EndDAte'])[1]") private WebElement dateUntilTo1Field;
	@FindBy (xpath ="(//input[@id='incentive_ChangeAllotment'])[1]") private WebElement amount1Field;
	@FindBy (xpath ="(//input[@id='incentive_IsAll'])[1]") private WebElement allDayRoom1CheckBox;
	@FindBy (xpath ="(//input[@id='incentive_IsMonday'])[1]") private WebElement MondayRoom1CheckBox;
	@FindBy (xpath ="(//input[@id='incentive_IsTuesday'])[1]") private WebElement tuesdayRoom1CheckBox;
	@FindBy (xpath ="(//input[@id='incentive_IsWednesday'])[1]") private WebElement wednesdayRoom1CheckBox;
	@FindBy (xpath ="(//input[@id='incentive_IsThursday'])[1]") private WebElement thursdayRoom1CheckBox;
	@FindBy (xpath ="(//input[@id='incentive_IsFriday'])[1]") private WebElement fridayRoom1CheckBox;
	@FindBy (xpath ="(//input[@id='incentive_IsSaturday'])[1]") private WebElement saturdayRoom1CheckBox;
	@FindBy (xpath ="(//input[@id='incentive_IsSunday'])[1]") private WebElement sundayRoom1CheckBox;
	
	@FindBy (xpath ="(//input[@id='incentive_ReleaseDays'])[1]") private WebElement releaseDaysField;
	@FindBy (xpath ="(//input[@id='incentive_ReleaseDate'])[1]") private WebElement releaseDateField;
	
	@FindBy (xpath ="(//span[@class='multiselect-selected-text'])[2]") private WebElement multiselectdropdown2;
	@FindBy (xpath ="(//label[@class='checkbox']//input)[4]") private WebElement selectAllRoomsmultiselectdropdown2;
	@FindBy (xpath ="(//label[@class='checkbox']//input)[5]") private WebElement selectRoom1multiselectdropdown2;
	@FindBy (xpath ="(//label[@class='checkbox']//input)[6]") private WebElement selectRoom2multiselectdropdown2;
	
	@FindBy (xpath ="(//input[@id='incentive_StartDate'])[2]") private WebElement dateFromForRoom2Field;
	@FindBy (xpath ="(//input[@id='incentive_EndDAte'])[2]") private WebElement dateUntilTo2Field;
	@FindBy (xpath ="(//input[@id='incentive_ChangeAllotment'])[2]") private WebElement amount2Field;
	@FindBy (xpath ="(//input[@id='incentive_IsAll'])[2]") private WebElement allDayRoom2CheckBox;
	@FindBy (xpath ="(//input[@id='incentive_IsMonday'])[2]") private WebElement MondayRoom2CheckBox;
	@FindBy (xpath ="(//input[@id='incentive_IsTuesday'])[2]") private WebElement tuesdayRoom2CheckBox;
	@FindBy (xpath ="(//input[@id='incentive_IsWednesday'])[2]") private WebElement wednesdayRoom2CheckBox;
	@FindBy (xpath ="(//input[@id='incentive_IsThursday'])[2]") private WebElement thursdayRoom2CheckBox;
	@FindBy (xpath ="(//input[@id='incentive_IsFriday'])[2]") private WebElement fridayRoom2CheckBox;
	@FindBy (xpath ="(//input[@id='incentive_IsSaturday'])[2]") private WebElement saturdayRoom2CheckBox;
	@FindBy (xpath ="(//input[@id='incentive_IsSunday'])[2]") private WebElement sundayRoom2CheckBox;
	
	@FindBy (id ="closeImageFeature") private WebElement closeButton;
	@FindBy (xpath ="//button[text()='Confirm']") private WebElement confirmButton;
	
	@FindBy (xpath ="//button[text()='OK']") private WebElement OkPopUP;
	@FindBy (xpath ="(//div[@class='btn-group'])[2]//span") private WebElement multiselectDropdwn;
	


	public ChangeAllotmentPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement selectChangeAllotmentDropdown()
	{
		WebElement Element = changeAllotmentDropdown;
		return Element;
	}
	
	public void clickOnAddRowButton()
	{
		addRowButton.click();
	}
	
	public void clickOnMultiselectdropdown()
	{
		multiselectdropdown1.click();
	}
	
	public void clickOnSelectAllRoomsmultiselectdropdown1()
	{
		selectAllRoomsmultiselectdropdown1.click();
	}
	
	public void clickOnSelectRoom1multiselectdropdown1()
	{
		selectRoom1multiselectdropdown1.click();
	}
	
	public void clickOnSelectRoom2multiselectdropdown1()
	{
		selectRoom2multiselectdropdown1.click();
	}
	
	public void sendDateFromForRoom1Field(String dateFrom)
	{
		dateFromForRoom1Field.sendKeys(dateFrom);
	}
	
	public void sendDateUntilTo1Field(String dateUntil)
	{
		dateUntilTo1Field.sendKeys(dateUntil);
	}
	
	public void sendNEWUNTILDATE(double number)
	
	{
		String actual=Double.toString(number);
		dateUntilTo1Field.sendKeys(actual);
	}
	
	public void sendAmount1(String amount)
	{
		amount1Field.sendKeys(amount);
	}
	
	public void clickOnAllDayRoom1CheckBox()
	{
		allDayRoom1CheckBox.click();
	}
	
	public void clickOnMondayRoom1CheckBox()
	{
		MondayRoom1CheckBox.click();
	}
	
	public void clickOnTuesdayRoom1CheckBox()
	{
		tuesdayRoom1CheckBox.click();
	}
	
	public void clickOnWednesdayRoom1CheckBox()
	{
		wednesdayRoom1CheckBox.click();
	}
	
	public void clickOnthursdayRoom1CheckBox()
	{
		thursdayRoom1CheckBox.click();
	}
	
	public void clickOnFridayRoom1CheckBox()
	{
		fridayRoom1CheckBox.click();
	}
	
	public void clickOnSaturdayRoom1CheckBox()
	{
		saturdayRoom1CheckBox.click();
	}
	
	public void clickOnSundayRoom1CheckBox()
	{
		sundayRoom1CheckBox.click();
	}
	
	public void sendReleaseDaysField(String ReleaseDays)
	{
		releaseDaysField.sendKeys(ReleaseDays);
	}
	
	
	
	
	
	public void clickOnMultiselectdropdown2()
	{
		multiselectdropdown2.click();
	}
	
	public void clickOnSelectAllRoomsmultiselectdropdown2()
	{
		selectAllRoomsmultiselectdropdown2.click();
	}
	
	public void clickOnSelectRoom1multiselectdropdown2()
	{
		selectRoom1multiselectdropdown2.click();
	}
	
	public void clickOnSelectRoom2multiselectdropdown2()
	{
		selectRoom2multiselectdropdown2.click();
	}
	
	public void senddateFromForRoom2Field(String dateFrom)
	{
		dateFromForRoom2Field.sendKeys(dateFrom);
	}
	
	public void senddateUntilTo2Field(String dateUntil)
	{
		dateUntilTo2Field.sendKeys(dateUntil);
	}
	
	public void sendamount2Field(String amount)
	{
		amount2Field.sendKeys(amount);
	}
	
	public void clickOnAllDayRoom2CheckBox()
	{
		allDayRoom2CheckBox.click();
	}
	
	public void clickOnMondayRoom2CheckBox()
	{
		MondayRoom2CheckBox.click();
	}
	
	public void clickOntuesdayRoom2CheckBox()
	{
		tuesdayRoom2CheckBox.click();
	}
	
	public void clickOnWednesdayRoom2CheckBox()
	{
		wednesdayRoom2CheckBox.click();
	}
	
	public void clickOnThursdayRoom2CheckBox()
	{
		thursdayRoom2CheckBox.click();
	}
	
	public void clickOnFridayRoom2CheckBox()
	{
		fridayRoom2CheckBox.click();
	}
	
	public void clickOnSaturdayRoom2CheckBox()
	{
		saturdayRoom2CheckBox.click();
	}
	
	public void clickOnSundayRoom2CheckBox()
	{
		sundayRoom2CheckBox.click();
	}
	
	public void clickOnCloseButton()
	{
		closeButton.click();
	}
	
	public WebElement clickOncloseButtonByJSE()
	{
		return closeButton;
	}
	
	public void clickOnConfirmButton()
	{
		confirmButton.click();
	}
	
	public WebElement clickOnConfirmButtonByJSE()
	{
		return confirmButton;
	}
	
	public void clickOnPopUp()
	{
		OkPopUP.click();
	}
	
	public WebElement clickOnOkPopUPByJSE()
	{
		return OkPopUP;
	}
	
	public void clickOnMultiselectDropdwn()
	{
		multiselectDropdwn.click();
	}
	
	
}