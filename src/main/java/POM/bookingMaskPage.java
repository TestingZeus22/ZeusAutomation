package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class bookingMaskPage {

	@FindBy (id = "ddlCompany") private WebElement CompanyTopDropDown;
	@FindBy (xpath ="//a[@data-toggle='dropdown']") private WebElement logoutDropDown;
	@FindBy (xpath ="//a[@class='btn-pill btn-shadow btn-shine btn btn-focus']") private WebElement logoutOnBookingMask;
	
	@FindBy (xpath = "//a[text()='SalesBooking']") private WebElement salesBookingClick;
	
	@FindBy (id ="SalesHeader_Tbmcode") private WebElement productCodeDropDown;
	@FindBy (id ="SalesHeader_Room") private WebElement roomCodeDropDown;
	@FindBy (id ="SalesHeader_Board") private WebElement boardDropDown;
	
	@FindBy (id="SalesBookingHeaderNewModel_Remarks") private WebElement remarkField;
	
	@FindBy (id="SalesBookingHeaderNewModel_PromotionCode") private WebElement promotionCodeField;
	@FindBy (id="SalesBookingHeaderNewModel_ExternalReservationNumber") private WebElement externalReservationNumberField;
	
	@FindBy (id="SalesBookingHeaderNewModel_BookingAction") private WebElement bookingActionFieldclear;
	@FindBy (id="SalesBookingHeaderNewModel_BookingAction") private WebElement bookingActionField;
	@FindBy (id="SalesBookingHeaderNewModel_CompanyID") private WebElement companyIDDropDown;
	@FindBy (id="SalesBookingHeaderNewModel_TravelTypeID") private WebElement TravelTypeDropDown;
	@FindBy(id="SalesBookingHeaderNewModel_NoOfPax") private WebElement NOofPaxclear;
	@FindBy (id="SalesBookingHeaderNewModel_NoOfPax") private WebElement noOfPaxField;
	@FindBy (id="SalesBookingHeaderNewModel_ReservationNo") private WebElement reservationNoField;
	
	@FindBy (id="SalesBookingHeaderNewModel_ReservationVersion") private WebElement reservationVersionField;
	@FindBy (id="SalesBookingHeaderNewModel_BookingDate") private WebElement bookingDateField;
	@FindBy (id="SalesBookingHeaderNewModel_NewVersionCreatedDate") private WebElement bookingDateVersionField;
	@FindBy (id="SalesBookingHeaderNewModel_AgencyCode") private WebElement agencyCodeField;
	@FindBy (xpath="//a[@class='btn btn-primary btn-lg']") private WebElement resetButton;
	@FindBy (id="sendbooking") private WebElement sendbookingButton;

	@FindBy (id="bookinglines_Selected_2") private WebElement bookingDataCheckBox1;
	@FindBy (id="bookinglines_Ancilaries_2") private WebElement kOS1;
	@FindBy (id="bookinglines_TBMCodeID_2") private WebElement productCode1;
	@FindBy (id="bookinglines_RoomID_2") private WebElement roomCode1;
	@FindBy (id="bookinglines_BoardTypeID_2") private WebElement board1;
	@FindBy (id="bookinglines_Occupancy_2") private WebElement occupancy1;
	@FindBy (id="bookinglines_No_2") private WebElement totalPax1;
	@FindBy (id="bookinglines_TravelFrom_2") private WebElement travelFrom1;
	@FindBy (id="bookinglines_TravelTo_2") private WebElement travelTo1;
	@FindBy (id="bookinglines_PassengerNo_2") private WebElement Passengers1;
	@FindBy (id="bookinglines_Price_1") private WebElement PriceFieldValue1;
	@FindBy (xpath ="(//i[@class='pe-7s-trash btn-icon-wrapper'])[1]") private WebElement deleteButton1;
	
	@FindBy (id="bookinglines_Selected_3") private WebElement bookingDataCheckBox2;
	@FindBy (id="bookinglines_Ancilaries_3") private WebElement kOS2;
	@FindBy (id="bookinglines_TBMCodeID_3") private WebElement productCode2;
	@FindBy (id="bookinglines_RoomID_3") private WebElement roomCode2;
	@FindBy (id="bookinglines_BoardTypeID_3") private WebElement board2;
	@FindBy (id="bookinglines_Occupancy_3") private WebElement occupancy2;
	@FindBy (id="bookinglines_No_3") private WebElement totalPax2;
	@FindBy (id="bookinglines_TravelFrom_3") private WebElement travelFrom2;
	@FindBy (id="bookinglines_TravelTo_3") private WebElement travelTo2;
	@FindBy (id="bookinglines_PassengerNo_3") private WebElement passengers2;
	@FindBy (xpath ="(//i[@class='pe-7s-trash btn-icon-wrapper'])[2]") private WebElement deleteButton2;
	
	@FindBy (id ="bookinglines_Selected_4") private WebElement bookingDataCheckBox3;
	@FindBy (id="bookinglines_Ancilaries_4") private WebElement kOS3;
	@FindBy (id="bookinglines_TBMCodeID_4") private WebElement productCode3;
	@FindBy (id="bookinglines_RoomID_4") private WebElement roomCode3;
	@FindBy (id="bookinglines_BoardTypeID_4") private WebElement board3;
	@FindBy (id="bookinglines_Occupancy_4") private WebElement occupancy3;
	@FindBy (id="bookinglines_No_4") private WebElement totalPax3;
	@FindBy (id="bookinglines_TravelFrom_4") private WebElement travelFrom3;
	@FindBy (id="bookinglines_TravelTo_4") private WebElement travelTo3;
	@FindBy (id="bookinglines_PassengerNo_4") private WebElement passengers3;
	@FindBy (xpath ="(//i[@class='pe-7s-trash btn-icon-wrapper'])[3]") private WebElement deleteButton3;
	
	@FindBy (id="bookinglines_Selected_5") private WebElement bookingDataCheckBox4;
	@FindBy (id="bookinglines_Ancilaries_5") private WebElement kOS4;
	@FindBy (id="bookinglines_TBMCodeID_5") private WebElement productCode4;
	@FindBy (id="bookinglines_RoomID_5") private WebElement roomCode4;
	@FindBy (id="bookinglines_BoardTypeID_5") private WebElement board4;
	@FindBy (id="bookinglines_Occupancy_5") private WebElement occupancy4;
	@FindBy (id="bookinglines_No_5") private WebElement totalPax4;
	@FindBy (id="bookinglines_TravelFrom_5") private WebElement travelFrom4;
	@FindBy (id="bookinglines_TravelTo_5") private WebElement travelTo4;
	@FindBy (id="bookinglines_TravelTo_5") private WebElement passengers4;
	@FindBy (xpath ="(//i[@class='pe-7s-trash btn-icon-wrapper'])[4]") private WebElement deleteButton4;
	
	@FindBy (id="SalesBookingHeaderNewModel_Gender") private WebElement titleGenderDropDown;
	
	@FindBy (id="LastName_New") private WebElement lastNameField;
	
	@FindBy (id="FirstName_New") private WebElement firstNameField;
	
	@FindBy (id="CountryName_New") private WebElement countryNameField;
	@FindBy (id="StateName_New") private WebElement stateNameField;
	@FindBy (id="CityName_New") private WebElement cityNameField;
	
	@FindBy(id="CAP_New") private WebElement zipCodeField;
	@FindBy(id="Street_New") private WebElement streetNoField;
	
	@FindBy(id="Phone_New") private WebElement phoneField;
	
	@FindBy(id="Email_New") private WebElement emailField;
	
	
	@FindBy(id="swal2-content") private WebElement travelFromAndToPopUp;
	@FindBy(id="swal2-content") private WebElement travelFromDateLessThanTravelToDatePopUp;
	@FindBy(xpath="//textarea[@id='SalesBookingHeaderNewModel_ResponseInformationMessage']") private WebElement travelToDateOutOfContractDateNotification;
	
	
	public bookingMaskPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement ListBoxTopCompany()
	{
		WebElement Element = CompanyTopDropDown;
		return Element;
	}
	
	public void ClickOnLogoutButtonOFBookingMask()
	{
		logoutDropDown.click();
	}
	
	public void logoutClickOFBookingMask()
	{
		logoutOnBookingMask.click();
	}
	
	public WebElement productCodeDropDownMethod()
	{
		WebElement Element = productCodeDropDown;
		return Element;
	}
	
	public void clickOnsalesBookinButton()
	{
		salesBookingClick.click();
	}
	
	
	public WebElement roomCodeDropDownMethod()
	{
		WebElement Element = roomCodeDropDown;
		return Element;
	}
	
	public WebElement boardDropDownMethod()
	{
		WebElement Element = boardDropDown;
		return Element;
	}
		
	public void sendremarkPoints(String remark)
	{
		remarkField.sendKeys(remark);
	}
	
	public void sendPromotionCode(String PromotionCode)
	{
		promotionCodeField.sendKeys(PromotionCode);
	}
	
	public void sendExternalReservationNumber(String ExternalReservation)
	{
		externalReservationNumberField.sendKeys(ExternalReservation);
	}

	public void bookingActionFieldclear()
	{
		bookingActionFieldclear.clear();
	}
	
	public void sendBookingAction(String BookingAction)
	{
		bookingActionField.sendKeys(BookingAction);
	}
	
	public WebElement companyIDDropDownMethod()
	{
		WebElement Element = companyIDDropDown;
		return Element;
	}
	
	public WebElement TravelTypeDropDownMethod()
	{
		WebElement Element = TravelTypeDropDown;
		return Element;
	}
	
	public void clearNoOfPax()
	{
		NOofPaxclear.clear();
	}
	
	public void sendNoOfPax(String Pax)
	{
		noOfPaxField.sendKeys(Pax);
	}
	
	public void sendReservationNo(String ReservationNO)
	{
		reservationNoField.sendKeys(ReservationNO);
	}
	
	public String getValueOnReservationNO(String value1)
	{
		String actualText = reservationNoField.getAttribute(value1);
		return actualText;
	}
	
	public void sendReservationVersion(String ReservationVersions)
	{
		reservationVersionField.sendKeys(ReservationVersions);
	}
	
	public void bookingDateFieldMethod(String bookingDateInput)
	{
		bookingDateField.sendKeys(bookingDateInput);
	}
	
	public void bookingDateVersionFieldMethod(String bookingDateVersionInput)
	{
		bookingDateVersionField.sendKeys(bookingDateVersionInput);
	}
	
	public void sendAgencyCode(String AgencyCodes)
	{
		agencyCodeField.sendKeys(AgencyCodes);
	}
	
	public void clickOnResetButton()
	{
		resetButton.click();
	}
	
	public WebElement clickOnSendbookingButton()
	{
		sendbookingButton.click();
		return sendbookingButton;
	}
		
	public void bookingDataCheckBox1Method()
	{
		bookingDataCheckBox1.click();
	}
	
	public void sendKOS(String kk)
	{
		kOS1.sendKeys(kk);
	}
	public void sendproductCode(String Productcode)
	{
		productCode1.sendKeys(Productcode);
	}
	
	public void sendRoomCode(String room)
	{
		roomCode1.sendKeys(room);
	}
	
	public void sendBoard(String Board)
	{
		board1.sendKeys(Board);
	}
	public void sendOccupancy(String Occupancy)
	{
		occupancy1.sendKeys(Occupancy);
	}
	
	public void sendTotalPax(String TotalPAX)
	{
		totalPax1.sendKeys(TotalPAX);
	}
	
	public void sendTravelFromDate(String TravelFROM)
	{
		travelFrom1.sendKeys(TravelFROM);
	}
	
	public void sendTravelToDate(String TravelTO)
	{
		travelTo1.sendKeys(TravelTO);
	}
	
	public void sendPassenger(String Passenger)
	{
		Passengers1.sendKeys(Passenger);
	}
	
	public String getPriceFieldValue1(String value1)
	{
		String actualText = PriceFieldValue1.getAttribute(value1);
		return actualText;
	}
	
	public void clickOnDeleteButton1()
	{
		deleteButton1.click();
	}
	
	public void bookingDataCheckBox2Method()
	{
		bookingDataCheckBox2.click();
	}

	public void sendKOS2(String Kos)
	{
		kOS2.sendKeys(Kos);
	}
	public void sendproductCode2(String Productcode)
	{
		productCode2.sendKeys(Productcode);
	}
	
	public void sendRoomCode2(String Roomcode)
	{
		roomCode2.sendKeys(Roomcode);
	}
	
	public void sendBoard2(String Board)
	{
		board2.sendKeys(Board);
	}
	
	public void sendOccupancy2(String Occupancy)
	{
		occupancy2.sendKeys(Occupancy);
	}
	
	public void sendTotalPax2(String TotalPAX)
	{
		totalPax2.sendKeys(TotalPAX);
	}

	public void sendTravelFromDate2(String TravelFROM)
	{
		travelFrom2.sendKeys(TravelFROM);
	}
	
	public void sendTravelToDate2(String TravelTO)
	{
		
	travelTo2.sendKeys(TravelTO);
	}
	
	public void sendPassenger2(String Passenger)
	{
	passengers2.sendKeys(Passenger);
	}

	public void clickOnDeleteButton2()
	{
		deleteButton2.click();
	}
	
	public void bookingDataCheckBox3Method()
	{
		bookingDataCheckBox3.click();
	}

	public void sendKOS3(String Kos)
	{
		kOS3.sendKeys(Kos);
	}
	public void sendproductCode3(String Productcode)
	{
		productCode3.sendKeys(Productcode);
	}
	
	public void sendRoomCode3(String Roomcode)
	{
		roomCode3.sendKeys(Roomcode);
	}
	
	public void sendBoard3(String Board)
	{
		board3.sendKeys(Board);
	}
	public void sendOccupancy3(String Occupancy)
	{
		occupancy3.sendKeys(Occupancy);
	}
	
	public void sendTotalPax3(String TotalPAX)
	{
		totalPax3.sendKeys(TotalPAX);
	}
	
	public void sendTravelFromDate3(String TravelFROM)
	{
		travelFrom3.sendKeys(TravelFROM);
	}
	
	public void sendTravelToDate3(String TravelTO)
	{	
		travelTo3.sendKeys(TravelTO);
	}
	
	public void sendPassenger3(String Passenger)
	{
	passengers3.sendKeys(Passenger);
	}
	
	public void clickOnDeleteButton3()
	{
		deleteButton3.click();
	}

	public void bookingDataCheckBox4Method()
	{
		bookingDataCheckBox4.click();
	}

	public void sendKOS4(String Kos)
	{
		kOS4.sendKeys(Kos);
	}
	
	public void sendproductCode4(String Productcode)
	{
		productCode4.sendKeys(Productcode);
	}
	
	public void sendRoomCode4(String Roomcode)
	{
		roomCode4.sendKeys(Roomcode);
	}
	
	public void sendBoard4(String Board)
	{
		board4.sendKeys(Board);
	}
	public void sendOccupancy4(String Occupancy)
	{
		occupancy4.sendKeys(Occupancy);
	}
	
	public void sendTotalPax4(String TotalPAX)
	{
		totalPax4.sendKeys(TotalPAX);
	}

	public void sendTravelFromDate4(String TravelFROM)
	{
		travelFrom4.sendKeys(TravelFROM);
	}
	
	public void sendTravelToDate4(String TravelTO)

	{
		travelTo4.sendKeys(TravelTO);
	}
	
	public void sendPassenger4(String Passenger)
	{
	passengers4.sendKeys(Passenger);
	}
	
	public void clickOnDeleteButton4()
	{
		deleteButton4.click();
	}
	
	public WebElement ListBoxTitleGender()
	{
		WebElement Element = titleGenderDropDown;
		return Element;
	}
	
	public void sendLastName(String LastNAME)
	{
		lastNameField.sendKeys(LastNAME);
	}
	
	public void sendFirstName(String FirstNAME)
	{
		firstNameField.sendKeys(FirstNAME);
	}
	public void sendCountryName(String Country)

	{
		countryNameField.sendKeys(Country);
	}
	
	public void sendStateName(String State)
	{
		stateNameField.sendKeys(State);
	}
	
	public void sendCityName(String city)
	{
		cityNameField.sendKeys(city);
	}
	
	public void sendZipCode(String ZIPcode)
	{
		zipCodeField.sendKeys(ZIPcode);
	}
	
	public void sendStreetNo(String StreetNO)
	{
		streetNoField.sendKeys(StreetNO);
	}
	public void sendPhoneNum(String Phone)
	{
		phoneField.sendKeys(Phone);
	}
	
	public void sendEmail(String Email)
	{
		emailField.sendKeys(Email);
	}
	
	public String getTravelFromAndToPopUpMsg()
	{
		String actualText = travelFromAndToPopUp.getText();
		return actualText;
	}
	
	public String getTravelFromDateLessThanTravelToDatePopUpMsg()
	{
		String actualText = travelFromDateLessThanTravelToDatePopUp.getText();
		return actualText;
	}
	
	public String getTravelToDateOutOfContractDateNotification()
	{
		String actualText = travelToDateOutOfContractDateNotification.getText();
		return actualText;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
