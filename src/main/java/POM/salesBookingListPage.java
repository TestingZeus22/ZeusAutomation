package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class salesBookingListPage {

	@FindBy (id="ddlCompany") private WebElement selectDropdownListInSales;
	
	@FindBy (id="ReservationNo") private WebElement reservationNoInput;
	@FindBy (xpath="(//li[@class='breadcrumb-item'])[1]") private WebElement textDashboard;
	@FindBy (xpath="(//li[@class='breadcrumb-item'])[2]") private WebElement textSalesBooking;
	@FindBy (xpath="(//a[@class='btn-shadow btn btn-primary'])[1]") private WebElement submitButton;
	@FindBy (xpath="(//a[@class='btn-shadow btn btn-primary'])[2]") private WebElement bookingListButton;
	@FindBy (xpath="(//a[@class='btn-shadow btn btn-primary'])[3]") private WebElement createButton;
	
	@FindBy (xpath="//select[@class='custom-select custom-select-sm form-control form-control-sm']") private WebElement showEntries;
	
	@FindBy (xpath="(//input[@class='form-control text-box single-line valid'])[1]") private WebElement reservationNoRef;
	@FindBy (xpath="(//input[@class='form-control text-box single-line valid'])[2]") private WebElement lastChange;
	@FindBy (xpath="(//input[@class='form-control text-box single-line valid'])[3]") private WebElement customer;
	@FindBy (xpath="(//input[@class='form-control text-box single-line valid'])[4]") private WebElement companyAndType;
	@FindBy (xpath="(//input[@class='form-control text-box single-line valid'])[5]") private WebElement tbmCodes;
	@FindBy (xpath="(//input[@class='form-control text-box single-line valid'])[6]") private WebElement hotel;
	@FindBy (xpath="(//input[@class='form-control text-box single-line valid'])[7]") private WebElement arrival;
	@FindBy (xpath="(//input[@class='form-control text-box single-line valid'])[8]") private WebElement departure;
	@FindBy (xpath="(//input[@class='form-control text-box single-line valid'])[9]") private WebElement booked;
	@FindBy (xpath="(//input[@class='form-control text-box single-line valid'])[10]") private WebElement agency;
	@FindBy (xpath="(//input[@class='form-control text-box single-line valid'])11]") private WebElement externalReservationNo;
	@FindBy (xpath="(//input[@class='form-control text-box single-line valid'])[12]") private WebElement tbmcodeBToB;
	@FindBy (id="Confirmationflag") private WebElement crs;
	
	@FindBy (xpath ="(//i[@class='lnr-pencil'])[1]") private WebElement editBooking1;
	@FindBy (xpath ="(//i[@class='lnr-pencil'])[2]") private WebElement editBooking2;
	@FindBy (xpath ="(//i[@class='lnr-pencil'])[3]") private WebElement editBooking3;
	
	
	@FindBy (xpath ="//table[@id='SalesBookingTable']/tbody/tr/td[1]") private WebElement SBList;
	
	
	public salesBookingListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement selectDropDownListInSalesBooking()
	{
		WebElement Element = selectDropdownListInSales;
		return Element;
	}
	
	public String getTextDashboard()
	{
		String actualText = textDashboard.getText();
		return actualText;
	}
	
	public String getTextSalesBooking()
	{
		String actualText = textSalesBooking.getText();
		return actualText;
	}
	public void sendReservationNoInputField(String Reservation)
	{
		reservationNoInput.sendKeys(Reservation);
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
	
	public void clickOneditBooking1()
	{
		editBooking1.click();
	}
	
	public void clickOneditBooking2()
	{
		editBooking2.click();
	}
	
	public void clickOneditBooking3()
	{
		editBooking3.click();
	}
	
	public String getSalesBookingColumn1()
	{
		String actualText = SBList.getText();
		return actualText;
	}
}
