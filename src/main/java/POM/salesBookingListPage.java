package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class salesBookingListPage {

	@FindBy (xpath ="//a[@data-toggle='dropdown']") private WebElement logoutDropDown;
	@FindBy (xpath ="//a[@class='btn-pill btn-shadow btn-shine btn btn-focus']") private WebElement logoutOnSalesBookingList;
	
	@FindBy (id="ddlCompany") private WebElement selectDropdownListInSales;
	
	@FindBy (id ="ReservationNo") private WebElement reservationNoInput;
	@FindBy (xpath ="(//div[@class='page-title-heading']//div)[2]") private WebElement salesbookinglistpageheadingAndbreadcrumbs;
	@FindBy (xpath ="(//div[@class='page-title-heading']//div)[2]//li[1]") private WebElement dashboard;
	@FindBy (xpath ="(//div[@class='page-title-heading']//div)[2]//li[2]") private WebElement salesBooking;
	
	@FindBy (xpath ="(//a[@class='btn-shadow btn btn-primary'])[1]") private WebElement submitButton;
	@FindBy (xpath ="(//a[@class='btn-shadow btn btn-primary'])[2]") private WebElement bookingListButton;
	@FindBy (xpath ="(//a[@class='btn-shadow btn btn-primary'])[3]") private WebElement createButton;
	
	@FindBy (xpath ="//select[@class='custom-select custom-select-sm form-control form-control-sm']") private WebElement showEntries;
	
	@FindBy (xpath ="(//input[@class='form-control text-box single-line valid'])[1]") private WebElement reservationNoRef;
	@FindBy (xpath ="(//input[@class='form-control text-box single-line valid'])[2]") private WebElement lastChange;
	@FindBy (xpath ="(//input[@class='form-control text-box single-line valid'])[3]") private WebElement customer;
	@FindBy (xpath ="(//input[@class='form-control text-box single-line valid'])[4]") private WebElement companyAndType;
	@FindBy (xpath ="(//input[@class='form-control text-box single-line valid'])[5]") private WebElement tbmCodes;
	@FindBy (xpath ="(//input[@class='form-control text-box single-line valid'])[6]") private WebElement hotel;
	@FindBy (xpath ="(//input[@class='form-control text-box single-line valid'])[7]") private WebElement arrival;
	@FindBy (xpath ="(//input[@class='form-control text-box single-line valid'])[8]") private WebElement departure;
	@FindBy (xpath ="(//input[@class='form-control text-box single-line valid'])[9]") private WebElement booked;
	@FindBy (xpath ="(//input[@class='form-control text-box single-line valid'])[10]") private WebElement agency;
	@FindBy (xpath ="(//input[@class='form-control text-box single-line valid'])11]") private WebElement externalReservationNo;
	@FindBy (xpath ="(//input[@class='form-control text-box single-line valid'])[12]") private WebElement tbmcodeBToB;
	@FindBy (id ="Confirmationflag") private WebElement crs;
	
	@FindBy (xpath ="//td[text()='No data available in table']") private WebElement MessageOnSendingArrivalDate;
	
	@FindBy (xpath ="//table[@id='SalesBookingTable']/tbody/tr/td[1]") private WebElement SBList;
	
	// CoL1
	@FindBy (xpath ="//table[@id='SalesBookingTable']/tbody/tr[1]/td[1]") private WebElement reserNoRefRow1Col1;
	@FindBy (xpath ="//table[@id='SalesBookingTable']/tbody/tr[1]/td[2]") private WebElement lastChangeRow2Col1;
	@FindBy (xpath ="//table[@id='SalesBookingTable']/tbody/tr[1]/td[3]") private WebElement customerRow3Col1;
	@FindBy (xpath ="//table[@id='SalesBookingTable']/tbody/tr[1]/td[4]") private WebElement companyAndTypeRow4Col1;
	@FindBy (xpath ="//table[@id='SalesBookingTable']/tbody/tr[1]/td[5]") private WebElement tbmcodesRow5Col1;
	@FindBy (xpath ="//table[@id='SalesBookingTable']/tbody/tr[1]/td[6]") private WebElement hotelsRow6Col1;
	@FindBy (xpath ="//table[@id='SalesBookingTable']/tbody/tr[1]/td[7]") private WebElement arrivalRow7Col1;
	@FindBy (xpath ="//table[@id='SalesBookingTable']/tbody/tr[1]/td[8]") private WebElement departureRow8Col1;
	@FindBy (xpath ="//table[@id='SalesBookingTable']/tbody/tr[1]/td[9]") private WebElement statusRow9Col1;
	@FindBy (xpath ="//table[@id='SalesBookingTable']/tbody/tr[1]/td[10]") private WebElement bookedDateRow10Col1;
	@FindBy (xpath ="//table[@id='SalesBookingTable']/tbody/tr[1]/td[11]") private WebElement agencyRow11Col1;
	@FindBy (xpath ="//table[@id='SalesBookingTable']/tbody/tr[1]/td[12]") private WebElement externalReserNoRefRow12Col1;
	@FindBy (xpath ="//table[@id='SalesBookingTable']/tbody/tr[1]/td[13]") private WebElement tbmB2BRow13Col1;
	@FindBy (xpath ="(//i[@class='lnr-pencil'])[1]") private WebElement editBooking1;
	
	// CoL2
	@FindBy (xpath ="//table[@id='SalesBookingTable']/tbody/tr[2]/td[1]") private WebElement reserNoRefRow1Col2;
	@FindBy (xpath ="//table[@id='SalesBookingTable']/tbody/tr[2]/td[2]") private WebElement lastChangeRow2Col2;
	@FindBy (xpath ="//table[@id='SalesBookingTable']/tbody/tr[2]/td[3]") private WebElement customerRow3Col2;
	@FindBy (xpath ="//table[@id='SalesBookingTable']/tbody/tr[2]/td[4]") private WebElement companyAndTypeRow4Col2;
	@FindBy (xpath ="//table[@id='SalesBookingTable']/tbody/tr[2]/td[5]") private WebElement tbmcodesRow5Col2;
	@FindBy (xpath ="//table[@id='SalesBookingTable']/tbody/tr[2]/td[6]") private WebElement hotelsRow6Col2;
	@FindBy (xpath ="//table[@id='SalesBookingTable']/tbody/tr[2]/td[7]") private WebElement arrivalRow7Col2;
	@FindBy (xpath ="//table[@id='SalesBookingTable']/tbody/tr[2]/td[8]") private WebElement departureRow8Col2;
	@FindBy (xpath ="//table[@id='SalesBookingTable']/tbody/tr[2]/td[9]") private WebElement statusRow9Col2;
	@FindBy (xpath ="//table[@id='SalesBookingTable']/tbody/tr[2]/td[10]") private WebElement bookedDateRow10Col2;
	@FindBy (xpath ="//table[@id='SalesBookingTable']/tbody/tr[2]/td[11]") private WebElement agencyRow11Col2;
	@FindBy (xpath ="//table[@id='SalesBookingTable']/tbody/tr[2]/td[12]") private WebElement externalReserNoRefRow12Col2;
	@FindBy (xpath ="//table[@id='SalesBookingTable']/tbody/tr[2]/td[13]") private WebElement tbmB2BRow13Col2;
	@FindBy (xpath ="(//i[@class='lnr-pencil'])[2]") private WebElement editBooking2;
	
	// CoL3
	@FindBy (xpath ="//table[@id='SalesBookingTable']/tbody/tr[3]/td[1]") private WebElement reserNoRefRow1Col3;
	@FindBy (xpath ="//table[@id='SalesBookingTable']/tbody/tr[3]/td[2]") private WebElement lastChangeRow2Col3;
	@FindBy (xpath ="//table[@id='SalesBookingTable']/tbody/tr[3]/td[3]") private WebElement customerRow3Col3;
	@FindBy (xpath ="//table[@id='SalesBookingTable']/tbody/tr[3]/td[4]") private WebElement companyAndTypeRow4Col3;
	@FindBy (xpath ="//table[@id='SalesBookingTable']/tbody/tr[3]/td[5]") private WebElement tbmcodesRow5Col3;
	@FindBy (xpath ="//table[@id='SalesBookingTable']/tbody/tr[3]/td[6]") private WebElement hotelsRow6Col3;
	@FindBy (xpath ="//table[@id='SalesBookingTable']/tbody/tr[3]/td[7]") private WebElement arrivalRow7Col3;
	@FindBy (xpath ="//table[@id='SalesBookingTable']/tbody/tr[3]/td[8]") private WebElement departureRow8Col3;
	@FindBy (xpath ="//table[@id='SalesBookingTable']/tbody/tr[3]/td[9]") private WebElement statusRow9Col3;
	@FindBy (xpath ="//table[@id='SalesBookingTable']/tbody/tr[3]/td[10]") private WebElement bookedDateRow10Col3;
	@FindBy (xpath ="//table[@id='SalesBookingTable']/tbody/tr[3]/td[11]") private WebElement agencyRow11Col3;
	@FindBy (xpath ="//table[@id='SalesBookingTable']/tbody/tr[3]/td[12]") private WebElement externalReserNoRefRow12Col3;
	@FindBy (xpath ="//table[@id='SalesBookingTable']/tbody/tr[3]/td[13]") private WebElement tbmB2BRow13Col3;
	@FindBy (xpath ="(//i[@class='lnr-pencil'])[3]") private WebElement editBooking3;
	
	//info icon
	@FindBy (xpath="//h2[@id='exampleModalLabel']") private WebElement customerDocument;
	@FindBy (xpath="//h2[text()='Hotel Document']") private WebElement HotelDocument;
	@FindBy (xpath="//h2[text()='Payment Information']") private WebElement paymentInformation;
	
	public salesBookingListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnLogoutButtonOfSalesBookingList()
	{
		logoutDropDown.click();
	}
	
	public void logoutClickOfSalesBookingList()
	{
		logoutOnSalesBookingList.click();
	}

	public WebElement selectDropDownListInSalesBooking()
	{
		WebElement Element = selectDropdownListInSales;
		return Element;
	}
	
	public void sendReservationNoInputField(String Reservation)
	{
		reservationNoInput.sendKeys(Reservation);
	}
	
	public String getTextSalesbookinglistpageheadingAndbreadcrumbs()
	{
		String actualText = salesbookinglistpageheadingAndbreadcrumbs.getText();
		return actualText;
	}
	
	public String getTextDashboard()
	{
		String actualText = dashboard.getText();
		return actualText;
	}
	
	public void clickOndashboard()
	{
		dashboard.click();
	}
	
	public String getTextSalesBooking()
	{
		String actualText = salesBooking.getText();
		return actualText;
	}
	
	public void clickOnSalesBooking()
	{
		salesBooking.click();
	}
	
	public void clickOnsubmitButton()
	{
		submitButton.click();
	}
	
	public void clickOnbookingListButton()
	{
		bookingListButton.click();
	}
	
	public void clickOncreateButton()
	{
		createButton.click();
	}
	
	public WebElement selectDropDownListShowEnteries()
	{
		WebElement Element = showEntries;
		return Element;
	}
	
	public void sendreservationNoRef(String res)
	{
		reservationNoRef.sendKeys(res);
	}
	
	public void sendLastChange(String Change)
	{
		lastChange.sendKeys(Change);
	}
	
	public void sendCustomer(String Cust)
	{
		customer.sendKeys(Cust);
	}
	
	public void sendcompanyAndType(String Type)
	{
		companyAndType.sendKeys(Type);
	}
	
	public void sendtbmCodes(String code)
	{
		tbmCodes.sendKeys(code);
	}
	
	public void sendhotel(String Hotel)
	{
		hotel.sendKeys(Hotel);
	}
	
	public void sendarrival(String Arrival)
	{
		arrival.sendKeys(Arrival);
	}
	
	public void sendDeparture(String Dep)
	{
		departure.sendKeys(Dep);
	}
	
	public void sendbooked(String Booked)
	{
		booked.sendKeys(Booked);
	}
	
	public void sendAgency(String Agency)
	{
		agency.sendKeys(Agency);
	}
	
	public void sendExternalReservationNo(String External)
	{
		externalReservationNo.sendKeys(External);
	}
	
	public void sendtbmcodeBToB(String tbmBToB)
	{
		tbmcodeBToB.sendKeys(tbmBToB);
	}
	
	public WebElement selectDropDownListCRS()
	{
		WebElement Element = crs;
		return Element;
	}
	
	public String getMessageOnSendingArrivalDate()
	{
		String actualText = MessageOnSendingArrivalDate.getText();
		return actualText;
	}
	
	public String getSalesBookingColumn1()
	{
		String actualText = SBList.getText();
		return actualText;
	}
	
	public String getReserNoRefRow1Col1()
	{
		String actualText = reserNoRefRow1Col1.getText();
		return actualText;
	}
	
	public String getlastChangeRow2Col1()
	{
		String actualText = lastChangeRow2Col1.getText();
		return actualText;
	}
	
	public String getCustomerRow3Col1()
	{
		String actualText = customerRow3Col1.getText();
		return actualText;
	}
	
	public String getCompanyAndTypeRow4Col1()
	{
		String actualText = companyAndTypeRow4Col1.getText();
		return actualText;
	}
	
	public String getTbmcodesRow5Col1()
	{
		String actualText = tbmcodesRow5Col1.getText();
		return actualText;
	}
	
	public String gethotelsRow6Col1()
	{
		String actualText = hotelsRow6Col1.getText();
		return actualText;
	}
	
	public String getarrivalRow7Col1()
	{
		String actualText = arrivalRow7Col1.getText();
		return actualText;
	}
	
	public String getDepartureRow8Col1()
	{
		String actualText = departureRow8Col1.getText();
		return actualText;
	}
	
	public String getStatusRow9Col1()
	{
		String actualText = statusRow9Col1.getText();
		return actualText;
	}
	
	public String getBookedDateRow10Col1()
	{
		String actualText = bookedDateRow10Col1.getText();
		return actualText;
	}
	
	public String getAgencyRow11Col1()
	{
		String actualText = agencyRow11Col1.getText();
		return actualText;
	}
	
	public String getExternalReserNoRefRow12Col1()
	{
		String actualText = externalReserNoRefRow12Col1.getText();
		return actualText;
	}
	
	public String getTbmB2BRow13Col1()
	{
		String actualText = tbmB2BRow13Col1.getText();
		return actualText;
	}
	
	public void clickOneditBooking1()
	{
		editBooking1.click();
	}
	
	public String getReserNoRefRow1Col2()
	{
		String actualText = reserNoRefRow1Col2.getText();
		return actualText;
	}
	
	public String getlastChangeRow2Col2()
	{
		String actualText = lastChangeRow2Col2.getText();
		return actualText;
	}
	
	public String getCustomerRow3Col2()
	{
		String actualText = customerRow3Col2.getText();
		return actualText;
	}
	
	public String getCompanyAndTypeRow4Col2()
	{
		String actualText = companyAndTypeRow4Col2.getText();
		return actualText;
	}
	
	public String getTbmcodesRow5Col2()
	{
		String actualText = tbmcodesRow5Col2.getText();
		return actualText;
	}
	
	public String gethotelsRow6Col2()
	{
		String actualText = hotelsRow6Col2.getText();
		return actualText;
	}
	
	public String getArrivalRow7Col2()
	{
		String actualText = arrivalRow7Col2.getText();
		return actualText;
	}
	
	public String getDepartureRow8Col2()
	{
		String actualText = departureRow8Col2.getText();
		return actualText;
	}
	
	public String getStatusRow9Col2()
	{
		String actualText = statusRow9Col2.getText();
		return actualText;
	}
	
	public String getBookedDateRow10Col2()
	{
		String actualText = bookedDateRow10Col2.getText();
		return actualText;
	}
	
	public String getAgencyRow11Col2()
	{
		String actualText = agencyRow11Col2.getText();
		return actualText;
	}
	
	public String getExternalReserNoRefRow12Col2()
	{
		String actualText = externalReserNoRefRow12Col2.getText();
		return actualText;
	}
	
	public String getTbmB2BRow13Col2()
	{
		String actualText = tbmB2BRow13Col2.getText();
		return actualText;
	}
	
	public void clickOneditBooking2()
	{
		editBooking2.click();
	}
	
	public String getReserNoRefRow1Col3()
	{
		String actualText = reserNoRefRow1Col3.getText();
		return actualText;
	}
	
	public String getlastChangeRow2Col3()
	{
		String actualText = lastChangeRow2Col3.getText();
		return actualText;
	}
	
	public String getCustomerRow3Col3()
	{
		String actualText = customerRow3Col3.getText();
		return actualText;
	}
	
	public String getCompanyAndTypeRow4Col3()
	{
		String actualText = companyAndTypeRow4Col3.getText();
		return actualText;
	}
	
	public String getTbmcodesRow5Col3()
	{
		String actualText = tbmcodesRow5Col3.getText();
		return actualText;
	}
	
	public String gethotelsRow6Col3()
	{
		String actualText = hotelsRow6Col3.getText();
		return actualText;
	}
	
	public String getArrivalRow7Col3()
	{
		String actualText = arrivalRow7Col3.getText();
		return actualText;
	}
	
	public String getDepartureRow8Col3()
	{
		String actualText = departureRow8Col3.getText();
		return actualText;
	}
	
	public String getStatusRow9Col3()
	{
		String actualText = statusRow9Col3.getText();
		return actualText;
	}
	
	public String getBookedDateRow10Col3()
	{
		String actualText = bookedDateRow10Col3.getText();
		return actualText;
	}
	
	public String getAgencyRow11Col3()
	{
		String actualText = agencyRow11Col3.getText();
		return actualText;
	}
	
	public String getExternalReserNoRefRow12Col3()
	{
		String actualText = externalReserNoRefRow12Col3.getText();
		return actualText;
	}
	
	public String getTbmB2BRow13Col3()
	{
		String actualText = tbmB2BRow13Col3.getText();
		return actualText;
	}
	
	public void clickOneditBooking3()
	{
		editBooking3.click();
	}
	public String getcustomerDocumentText()
	{
		String actualText = customerDocument.getText();
		return actualText;
	}
	
	public String getHotelDocumentText()
	{
		String actualText = HotelDocument.getText();
		return actualText;
	}
	
	public String getPaymentInformationText()
	{
		String actualText = paymentInformation.getText();
		return actualText;
	}
	

}
