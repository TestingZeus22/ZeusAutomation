package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class bookingUpdatePage {

	
@FindBy (id="SalesBookingHeaderNewModel_ReservationNo") private WebElement reserNO;
@FindBy (id="SalesBookingHeaderNewModel_ReservationVersion") private WebElement reserVER;	
	
@FindBy (id="bookinglines_RoomID_1") private WebElement roomCode1;

@FindBy (id="bookingline_TravelFrom_1") private WebElement TravelFrom1;
@FindBy (id="bookinglines_TravelTo_1") private WebElement TravelTo1;
@FindBy (id ="bookinglines_Price_1") private WebElement priceField1;

@FindBy (id="bookingline_TravelFrom_2") private WebElement TravelFrom2;
@FindBy (id="bookinglines_TravelTo_2") private WebElement TravelTo2;
@FindBy (id ="bookinglines_Price_2") private WebElement priceField2;

@FindBy (id="bookingline_TravelFrom_3") private WebElement TravelFrom3;
@FindBy (id="bookinglines_TravelTo_3") private WebElement TravelTo3;
@FindBy (id ="bookinglines_Price_3") private WebElement priceField3;


@FindBy(id="btn_saveFirstTraveller") private WebElement saveButton;

@FindBy (xpath="(//button[text()='OK'])[3]") private WebElement OKbuttonPopUp;
	
	
	public bookingUpdatePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getReservationNoBM(String RNO)
	{
		String actualText = reserNO.getAttribute(RNO);
		return actualText;
	}
	
	public String getReservationVerNoBM(String RVer)
	{
		String actualText = reserVER.getAttribute(RVer);
		return actualText;
	}
	
	public void sendRoomcode1(String RoomCode)
	{
		roomCode1.sendKeys(RoomCode);
	}
	
	public void clearRoomcode1()
	{
		roomCode1.clear();	
	}
	
	public String getPriceFieldValue1(String value1)
	{
		String actualText = priceField1.getAttribute(value1);
		return actualText;
	}
	
	public void sendTravelFrom1(String TravF1)
	{
		TravelFrom1.sendKeys(TravF1);
	}
	
	public void clearTravelFrom1()
	{
		TravelFrom1.clear();
	}
	
	public void sendTravelTo1(String TravT1)
	{
		TravelTo1.sendKeys(TravT1);	
	}
	
	public void clearTravelTo1()
	{
		TravelTo1.clear();
	}
	
	public void sendTravelFrom2(String TravF2)
	{
		TravelFrom2.sendKeys(TravF2);
	}
	
	public void clearTravelFrom2()
	{
		TravelFrom2.clear();
	}
	
	public void sendTravelTo2(String TravT2)
	{
		TravelTo2.sendKeys(TravT2);	
	}
	
	public void clearTravelTo2()
	{
		TravelTo2.clear();
	}
	
	public void sendTravelFrom3(String TravF3)
	{
		TravelFrom3.sendKeys(TravF3);
	}
	
	public void clearTravelFrom3()
	{
		TravelFrom3.clear();
	}
	
	public void sendTravelTo3(String TravT3)
	{
		TravelTo3.sendKeys(TravT3);	
	}
	
	public void clearTravelTo3()
	{
		TravelTo3.clear();
	}
	
	public void clickOnsaveButton()
	{
		saveButton.click();
	}
	
	public void clickOnOKbuttonPopUp()
	{
		OKbuttonPopUp.click();
	}
}
