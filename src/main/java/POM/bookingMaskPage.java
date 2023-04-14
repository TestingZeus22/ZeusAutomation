package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class bookingMaskPage {

	@FindBy (id = "ddlCompany") private WebElement CompanyTopDropDown;
	@FindBy (xpath ="//a[@data-toggle='dropdown']") private WebElement logoutDropDown;
	@FindBy (xpath ="//a[@class='btn-pill btn-shadow btn-shine btn btn-focus']") private WebElement logoutOnBookingMask;
	
	@FindBy (xpath ="//div[@class='page-title-heading']//div[2]") private WebElement createBookingformpageheadingandbreadcrumbs;
	@FindBy (xpath ="//div[@class='page-title-heading']//div[2]//li[1]") private WebElement dashboardLink;
	@FindBy (xpath ="//div[@style='font-size:small;']//li[2]") private WebElement salesBookingLink;
	@FindBy (xpath ="//div[@style='font-size:small;']//li[3]") private WebElement salesbookingCreateLink;
	@FindBy (xpath ="//a[@class='btn-shadow btn btn-success']") private WebElement viewList;
	
	@FindBy (xpath ="//span[text()='Booking']") private WebElement BookingText;
	@FindBy (id ="SalesHeader_Tbmcode") private WebElement productCodeDropDown;
	@FindBy (id ="SalesHeader_Room") private WebElement roomCodeDropDown;
	@FindBy (id ="SalesHeader_Board") private WebElement boardDropDown;
	
	@FindBy (xpath ="//span[text()='Booking Mask']") private WebElement BookingMaskText;
	@FindBy (id="SalesBookingHeaderNewModel_Remarks") private WebElement remarkField;
	@FindBy (id="SalesBookingHeaderNewModel_PromotionCode") private WebElement promotionCodeField;
	@FindBy (id="SalesBookingHeaderNewModel_ExternalReservationNumber") private WebElement externalReservationNumberField;
	
	@FindBy (id="SalesBookingHeaderNewModel_BookingAction") private WebElement bookingActionFieldclear;
	@FindBy (id="SalesBookingHeaderNewModel_BookingAction") private WebElement bookingActionField;
	@FindBy (id="SalesBookingHeaderNewModel_CompanyID") private WebElement companyIDDropDown;
	@FindBy (id="SalesBookingHeaderNewModel_TravelTypeID") private WebElement TravelTypeDropDown;
	@FindBy (id="SalesBookingHeaderNewModel_NoOfPax") private WebElement NOofPaxclear;
	@FindBy (id="SalesBookingHeaderNewModel_NoOfPax") private WebElement noOfPaxField;
	@FindBy (id="SalesBookingHeaderNewModel_ReservationNo") private WebElement reservationNoField;
	
	@FindBy (id="SalesBookingHeaderNewModel_ReservationVersion") private WebElement reservationVersionField;
	@FindBy (id="SalesBookingHeaderNewModel_BookingDate") private WebElement bookingDateField;
	@FindBy (id="SalesBookingHeaderNewModel_NewVersionCreatedDate") private WebElement bookingDateVersionField;
	@FindBy (id="SalesBookingHeaderNewModel_AgencyCode") private WebElement agencyCodeField;
	@FindBy (xpath="//a[@class='btn btn-primary btn-lg']") private WebElement resetButton;
	@FindBy (id="sendbooking") private WebElement sendbookingButton;
	@FindBy (id="sendbooking") private WebElement sendbookingButtonByJSE;
	
	@FindBy (id="bookinglines_Selected_2") private WebElement bookingDataCheckBox1;
	@FindBy (id="bookinglines_Ancilaries_2") private WebElement kOS1;
	@FindBy (id="bookinglines_TBMCodeID_2") private WebElement productCode1;
	@FindBy (id="bookinglines_RoomID_2") private WebElement roomCode1;
	@FindBy (id="bookinglines_BoardTypeID_2") private WebElement board1;
	//@FindBy (id="bookinglines_Occupancy_2") private WebElement clearoccupancy1;
	@FindBy (id="bookinglines_Occupancy_2") private WebElement occupancy1;
	@FindBy (id="bookinglines_Occupancy_1") private WebElement clearoccupancyAtBookingUpdate;
	@FindBy (id="bookinglines_Occupancy_1") private WebElement occupancyAtBookingUpdate;
	@FindBy (id="bookinglines_No_2") private WebElement totalPax1;
	@FindBy (id="bookinglines_TravelFrom_2") private WebElement travelFrom1;
	@FindBy (id="bookinglines_TravelTo_2") private WebElement travelTo1;
	@FindBy (id="bookinglines_PassengerNo_2") private WebElement Passengers1;
	@FindBy (id="bookinglines_AmadeusStatus_1") private WebElement status;
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
	@FindBy (id="bookinglines_Price_2") private WebElement PriceFieldValue2;
	@FindBy (xpath="(//i[@class='pe-7s-trash btn-icon-wrapper'])[2]") private WebElement deleteButton2;
	
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
	@FindBy (id="bookinglines_Price_3") private WebElement PriceFieldValue3;
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
	@FindBy(id="Moblie_New") private WebElement mobileField;
	@FindBy(id="Email_New") private WebElement emailField;
	@FindBy(id="SalesBookingHeaderNewModel_LanguageID") private WebElement languageDropdown;
	
	@FindBy(id="SalesBookingHeaderNewModel_TotalPrice") private WebElement totalPrice;
	@FindBy(id="SalesBookingHeaderNewModel_DepositeNeedToPay") private WebElement DepositeToPay;
	@FindBy(id="SalesBookingHeaderNewModel_LocalPayable") private WebElement localPayable;
	@FindBy(id="SalesBookingHeaderNewModel_GrandTotal") private WebElement grandTotal;
	@FindBy(id="SalesBookingHeaderNewModel_Balance") private WebElement balanceOrRefund;
	@FindBy(id="SalesBookingHeaderNewModel_CancellationFees") private WebElement cancellatonFees;
	@FindBy(id="SalesBookingHeaderNewModel_AmmendmentCost") private WebElement amendmentCost;
	@FindBy(id="DocumentByEmail") private WebElement documentByPostalDispatchCheckBox;
	@FindBy(id="SalesBookingHeaderNewModel_Pay") private WebElement paymentOptionDropdown;
	@FindBy(id="SalesBookingHeaderNewModel_ResubmissionDate") private WebElement resubmissionDate;
	
	@FindBy(xpath="(//input[@id='travelerDatafirsts_Select'])[1]") private WebElement travellerDataCheckBox1;
	@FindBy(id="travelerDatafirsts_GenderList_2") private WebElement genderDropdown1;
	@FindBy(xpath="(//input[@id='travelerDatafirsts_LastName'])[1]") private WebElement lastNameFieldData1;
	@FindBy(xpath="(//input[@id='travelerDatafirsts_FirstName'])[1]") private WebElement firstNameFieldData1;
	@FindBy(xpath="(//input[@id='travelerDatafirsts_DateOfBirth'])[1]") private WebElement ageFieldData1;
	@FindBy(xpath="(//input[@id='travelerDatafirsts_Salutation'])[1]") private WebElement salutationFieldData1;
	
	@FindBy(xpath="(//input[@id='travelerDatafirsts_Select'])[2]") private WebElement travellerDataCheckBox2;
	@FindBy(id= "travelerDatafirsts_GenderList_3") private WebElement genderDropdown2;
	@FindBy(xpath="(//input[@id='travelerDatafirsts_LastName'])[2]") private WebElement lastNameFieldData2;
	@FindBy(xpath="(//input[@id='travelerDatafirsts_FirstName'])[2]") private WebElement firstNameFieldData2;
	@FindBy(xpath="(//input[@id='travelerDatafirsts_DateOfBirth'])[2]") private WebElement ageFieldData2;
	@FindBy(xpath="(//input[@id='travelerDatafirsts_Salutation'])[2]") private WebElement salutationFieldData2;
	
	@FindBy(xpath="(//input[@id='travelerDatafirsts_Select'])[3]") private WebElement travellerDataCheckBox3;
	@FindBy(id= "travelerDatafirsts_GenderList_4") private WebElement genderDropdown3;
	@FindBy(xpath="(//input[@id='travelerDatafirsts_LastName'])[3]") private WebElement lastNameFieldData3;
	@FindBy(xpath="(//input[@id='travelerDatafirsts_FirstName'])[3]") private WebElement firstNameFieldData3;
	@FindBy(xpath="(//input[@id='travelerDatafirsts_DateOfBirth'])[3]") private WebElement ageFieldData3;
	@FindBy(xpath="(//input[@id='travelerDatafirsts_Salutation'])[3]") private WebElement salutationFieldData3;
	
	@FindBy(xpath="(//input[@id='travelerDatafirsts_Select'])[4]") private WebElement travellerDataCheckBox4;
	@FindBy(id= "travelerDatafirsts_GenderList_5") private WebElement genderDropdown4;
	@FindBy(xpath="(//input[@id='travelerDatafirsts_LastName'])[4]") private WebElement lastNameFieldData4;
	@FindBy(xpath="(//input[@id='travelerDatafirsts_FirstName'])[4]") private WebElement firstNameFieldData4;
	@FindBy(xpath="(//input[@id='travelerDatafirsts_DateOfBirth'])[4]") private WebElement ageFieldData4;
	@FindBy(xpath="(//input[@id='travelerDatafirsts_Salutation'])[4]") private WebElement salutationFieldData4;
	
	@FindBy(xpath="(//input[@id='travelerDatafirsts_Select'])[5]") private WebElement travellerDataCheckBox5;
	@FindBy(id= "travelerDatafirsts_GenderList_6") private WebElement genderDropdown5;
	@FindBy(xpath="(//input[@id='travelerDatafirsts_LastName'])[5]") private WebElement lastNameFieldData5;
	@FindBy(xpath="(//input[@id='travelerDatafirsts_FirstName'])[5]") private WebElement firstNameFieldData5;
	@FindBy(xpath="(//input[@id='travelerDatafirsts_DateOfBirth'])[5]") private WebElement ageFieldData5;
	@FindBy(xpath="(//input[@id='travelerDatafirsts_Salutation'])[5]") private WebElement salutationFieldData5;
	
	@FindBy(xpath="(//input[@id='travelerDatafirsts_Select'])[6]") private WebElement travellerDataCheckBox6;
	@FindBy(id= "travelerDatafirsts_GenderList_7") private WebElement genderDropdown6;
	@FindBy(xpath="(//input[@id='travelerDatafirsts_LastName'])[6]") private WebElement lastNameFieldData6;
	@FindBy(xpath="(//input[@id='travelerDatafirsts_FirstName'])[6]") private WebElement firstNameFieldData6;
	@FindBy(xpath="(//input[@id='travelerDatafirsts_DateOfBirth'])[6]") private WebElement ageFieldData6;
	@FindBy(xpath="(//input[@id='travelerDatafirsts_Salutation'])[6]") private WebElement salutationFieldData6;
	
	@FindBy(id="swal2-content") private WebElement travelFromAndToPopUp;
	@FindBy(id="swal2-content") private WebElement travelFromDateLessThanTravelToDatePopUp;
	@FindBy(xpath="(//div[@id='div_SalesBookingLinePartial']//textarea)") private WebElement travelToDateOutOfContractDateNotification;
	@FindBy(xpath="(//div[@id='div_SalesBookingLinePartial']//textarea)") private WebElement travelbothDateOutOfContract;
	
	@FindBy(xpath="(//div[@id='div_SalesBookingLinePartial']//textarea)") private WebElement invalidTravelDurationMsg;
	@FindBy(xpath="(//div[@id='div_SalesBookingLinePartial']//textarea)") private WebElement seasonPricenotbelongToTableMsg;
	@FindBy(xpath="(//div[@id='div_SalesBookingLinePartial']//textarea)") private WebElement multisalesLinesBookingErrorMsgWithValidStay;
	@FindBy(xpath="(//div[@id='div_SalesBookingLinePartial']//textarea)") private WebElement multisalesLinesBookingErrorMsgWithExceedMaxStay;
	@FindBy(xpath="(//div[@id='div_SalesBookingLinePartial']//textarea)") private WebElement invalidTravelDurationNoPriceInfoMsg;
	@FindBy(xpath="(//div[@id='div_SalesBookingLinePartial']//textarea)") private WebElement stayExceedErrorMessage;
	@FindBy(xpath="(//div[@id='div_SalesBookingLinePartial']//textarea)") private WebElement travelTypeErrorMessage;
	@FindBy(xpath="(//div[@id='div_SalesBookingLinePartial']//textarea)") private WebElement maximumPersonCrossedErrorMessage;
	
	@FindBy (id="SalesBookingHeaderNewModel_ReservationNo") private WebElement reserNO;
	@FindBy (id="SalesBookingHeaderNewModel_ReservationVersion") private WebElement reserVER;

	
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
	
	public String getCreateBookingformpageheadingandbreadcrumbs()
	{
		String actualText = createBookingformpageheadingandbreadcrumbs.getText();
		return actualText;
	}
	
	public String getDashboardLink()
	{
		String actualText = dashboardLink.getText();
		return actualText;
	}
	
	public void clickOndashboardLink()
	{
		dashboardLink.click();
	}

	public String getsalesBookingLinkText()
	{
		String actualText = salesBookingLink.getText();
		return actualText;
	}
	
	public void clickOnsalesBookingLink()
	{
		salesBookingLink.click();
	}
	
	public String getsalesbookingCreateLinkText()
	{
		String actualText = salesbookingCreateLink.getText();
		return actualText;
	}
	
	public void clickOnsalesbookingCreateLink()
	{
		salesbookingCreateLink.click();
	}
	
	public void clickOnViewList()
	{
		viewList.click();
	}
	
	public String getBookingText()
	{
		String actualText = BookingText.getText();
		return actualText;
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
	
	public String getBookingMaskText()
	{
		String actualText = BookingMaskText.getText();
		return actualText;
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

	public void ClearbookingActionfield()
	{
		bookingActionFieldclear.clear();
	}
	
	public void sendBookingAction(String BookingAction)
	{
		bookingActionField.sendKeys(BookingAction);
	}
	
	public String getBookingActionFieldValue()
	
	{
		String actualText = bookingActionField.getText();
		return actualText;
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
	
	public String getNoOfPax(String pax)
	{
		String actualText = noOfPaxField.getAttribute(pax);
		return actualText;
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
	
	public WebElement clickOnSendbookingButtonByJSE()
	{
		return sendbookingButtonByJSE;
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
	
	public void clearRoomCode()
	{
		roomCode1.clear();
	}
	
	public void sendBoard(String Board)
	{
		board1.sendKeys(Board);
	}
	
	public void sendOccupancy(String Occupancy)
	{
		occupancy1.sendKeys(Occupancy);
	}
	
	public void clearoccupancy()
	{
		occupancy1.clear();
	}
	
	public String getOccupancy1(String OCC)
	{
		String actualText = occupancy1.getAttribute(OCC);
		return actualText;
	}
	
	public void sendoccupancyAtBookingUpdate(String OCC)
	{
		occupancyAtBookingUpdate.sendKeys(OCC);
	}
	
	public void clearoccupancyAtBookingUpdate()
	{
		clearoccupancyAtBookingUpdate.clear();
	}
	
	public void sendTotalPax(String TotalPAX)
	{
		totalPax1.sendKeys(TotalPAX);
	}
	
	public String getTotalPax1(String Tpax)
	{
		String actualText = totalPax1.getAttribute(Tpax);
		return actualText;
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
	
	public String getStatus1(String Status1)
	{
		String actualText = status.getAttribute(Status1);
		return actualText;
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
	public void clearRoomCode2()
	{
		roomCode2.clear();
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
	
	public String getPriceFieldValue2(String value2)
	{
		String actualText = PriceFieldValue2.getAttribute(value2);
		return actualText;
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
	
	public void clearRoomCode3(String RoomcodeClear)
	{
		roomCode3.clear();
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
	
	public void clearTravelFromDate3()
	{
		travelFrom3.clear();
	}
	
	public void sendTravelToDate3(String TravelTO)
	{	
		travelTo3.sendKeys(TravelTO);
	}
	
	public void clearTravelToDate3()
	{
		travelTo3.clear();
	}
	
	public void sendPassenger3(String Passenger)
	{
	passengers3.sendKeys(Passenger);
	}
	
	public String getPriceFieldValue3(String value1)
	{
		String actualText = PriceFieldValue3.getAttribute(value1);
		return actualText;
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
	
	public String getLastName()
	{
		String actualText = lastNameField.getText();
		return actualText;
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
	
	public void sendMobileNum(String Mobile)
	{
		mobileField.sendKeys(Mobile);
	}
	
	public void sendEmail(String Email)
	{
		emailField.sendKeys(Email);
	}
	
	public WebElement listBoxLanguage()
	{
		WebElement Element = languageDropdown;
		return Element;
	}
	
	public String getTotalPrice(String price)
	{
		String actualText = totalPrice.getAttribute(price);
		return actualText;
	}
	
	public String getDepositeToPay(String Pay)
	{
		String actualText = DepositeToPay.getAttribute(Pay);
		return actualText;
	}
	
	public String getLocalPayable(String LPayable)
	{
		String actualText = localPayable.getAttribute(LPayable);
		return actualText;
	}
	
	public String getGrandTotal(String GTotal)
	{
		String actualText = grandTotal.getAttribute(GTotal);
		return actualText;
	}
	
	public String getbalanceOrRefund(String balanceRefund)
	{
		String actualText = balanceOrRefund.getAttribute(balanceRefund);
		return actualText;
	}
	
	public String getCancellationFees(String CancellationFees)
	{
		String actualText = cancellatonFees.getAttribute(CancellationFees);
		return actualText;
	}
	
	public String getAmendmentCost(String amendment)
	{
		String actualText = amendmentCost.getAttribute(amendment);
		return actualText;
	}
	
	public void clickOndocumentByPostalDispatchCheckBox()
	{
		documentByPostalDispatchCheckBox.click();
	}
	
	public WebElement paymentOptionDropdown()
	{
		WebElement Element = paymentOptionDropdown;
		return Element;
	}
	
	public void clickOnTravellerDataCheckBox1()
	{
		travellerDataCheckBox1.click();
	}

	public WebElement genderSelectDropdown1()
	{
		WebElement Element = genderDropdown1;
		return Element;
	}
	
	public void sendlastNameFieldData1(String LastName)
	{
		lastNameFieldData1.sendKeys(LastName);
	}
	
	public void sendfirstNameFieldData1(String FirstName)
	{
		firstNameFieldData1.sendKeys(FirstName);
	}
	
	public void sendAgeFieldData1(String age)
	{
		ageFieldData1.sendKeys(age);
	}
	
	public void sendSalutationFieldData1(String Salutation)
	{
		salutationFieldData1.sendKeys(Salutation);
	}
	
	public void clickOnTravellerDataCheckBox2()
	{
		travellerDataCheckBox2.click();
	}

	public WebElement genderSelectDropdown2()
	{
		WebElement Element = genderDropdown2;
		return Element;
	}
	
	public void sendlastNameFieldData2(String LastName)
	{
		lastNameFieldData2.sendKeys(LastName);
	}
	
	public void sendfirstNameFieldData2(String FirstName)
	{
		firstNameFieldData2.sendKeys(FirstName);
	}
	
	public void sendAgeFieldData2(String age)
	{
		ageFieldData2.sendKeys(age);
	}
	
	public void sendSalutationFieldData2(String Salutation)
	{
		salutationFieldData2.sendKeys(Salutation);
	}
	
	public void clickOnTravellerDataCheckBox3()
	{
		travellerDataCheckBox3.click();
	}

	public WebElement genderSelectDropdown3()
	{
		WebElement Element = genderDropdown3;
		return Element;
	}
	
	public void sendlastNameFieldData3(String LastName)
	{
		lastNameFieldData3.sendKeys(LastName);
	}
	
	public void sendfirstNameFieldData3(String FirstName)
	{
		firstNameFieldData3.sendKeys(FirstName);
	}
	
	public void sendAgeFieldData3(String age)
	{
		ageFieldData3.sendKeys(age);
	}
	
	public void sendSalutationFieldData3(String Salutation)
	{
		salutationFieldData3.sendKeys(Salutation);
	}
	
	public void clickOnTravellerDataCheckBox4()
	{
		travellerDataCheckBox4.click();
	}

	public WebElement genderSelectDropdown4()
	{
		WebElement Element = genderDropdown4;
		return Element;
	}
	
	public void sendlastNameFieldData4(String LastName)
	{
		lastNameFieldData4.sendKeys(LastName);
	}
	
	public void sendfirstNameFieldData4(String FirstName)
	{
		firstNameFieldData4.sendKeys(FirstName);
	}
	
	public void sendAgeFieldData4(String age)
	{
		ageFieldData4.sendKeys(age);
	}
	
	public void sendSalutationFieldData4(String Salutation)
	{
		salutationFieldData4.sendKeys(Salutation);
	}
	
	public void clickOnTravellerDataCheckBox5()
	{
		travellerDataCheckBox5.click();
	}

	public WebElement genderSelectDropdown5()
	{
		WebElement Element = genderDropdown5;
		return Element;
	}
	
	public void sendlastNameFieldData5(String LastName)
	{
		lastNameFieldData5.sendKeys(LastName);
	}
	
	public void sendfirstNameFieldData5(String FirstName)
	{
		firstNameFieldData5.sendKeys(FirstName);
	}
	
	public void sendAgeFieldData5(String age)
	{
		ageFieldData5.sendKeys(age);
	}
	
	public void sendSalutationFieldData5(String Salutation)
	{
		salutationFieldData5.sendKeys(Salutation);
	}
	
	public void clickOnTravellerDataCheckBox6()
	{
		travellerDataCheckBox6.click();
	}

	public WebElement genderSelectDropdown6()
	{
		WebElement Element = genderDropdown6;
		return Element;
	}
	
	public void sendlastNameFieldData6(String LastName)
	{
		lastNameFieldData6.sendKeys(LastName);
	}
	
	public void sendfirstNameFieldData6(String FirstName)
	{
		firstNameFieldData6.sendKeys(FirstName);
	}
	
	public void sendAgeFieldData6(String age)
	{
		ageFieldData6.sendKeys(age);
	}
	
	public void sendSalutationFieldData6(String Salutation)
	{
		salutationFieldData6.sendKeys(Salutation);
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
	
	public String getTravelbothDateOutOfContractDateNotification()
	{
		String actual = travelbothDateOutOfContract.getText();
		return actual;
	}
	
	public String getInvalidTravelDurationMsg()
	{
		String actualText = invalidTravelDurationMsg.getText();
		return actualText;
	}
	
	public String getseasonPriceNotbelongToTableMsg()
	{
		String actualText = seasonPricenotbelongToTableMsg.getText();
		return actualText;
	}
	
	public String getmultisalesLinesBookingErrorMsgwithValidStay()
	{
		String actualText = multisalesLinesBookingErrorMsgWithValidStay.getText();
		return actualText;
	}
	
	public String getMultisalesLinesBookingErrorMsgWithExceedMaxStay()
	{
		String actualText = multisalesLinesBookingErrorMsgWithExceedMaxStay.getText();
		return actualText;
	}
	
	public String getInvalidTravelDurationNoPriceInfoMsg()
	{
		String actualText = invalidTravelDurationNoPriceInfoMsg.getText();
		return actualText;
	}
	
	public String getStayExceedErrorMessage()
	{
		String actualText = stayExceedErrorMessage.getText();
		return actualText;
	}
	
	public String getTravelTypeErrorMessage()
	{
		String actualText = travelTypeErrorMessage.getText();
		return actualText;
	}
	
	public String getMaximumPersonCrossedErrorMessage()
	{
		String actualText = maximumPersonCrossedErrorMessage.getText();
		return actualText;
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
	
	
	
	
	
		
}
