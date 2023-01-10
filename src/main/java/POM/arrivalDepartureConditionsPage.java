package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class arrivalDepartureConditionsPage {

	@FindBy (id="btn_addarrival") private WebElement addRowButton;
	
	//Room1 pending dropdown locators
	
	@FindBy (xpath="(//input[@id='adModel_StartDate'])[1]") private WebElement travelFrom1;
	@FindBy (xpath="(//input[@id='adModel_EndDate'])[1]") private WebElement travelTo1;
	@FindBy (xpath="(//input[@id='adModel_IsAll'])[1]") private WebElement arrivalDaysSelectAllCheckBox1;
	@FindBy (xpath="(//input[@id='adModel_IsMonday'])[1]") private WebElement arrivalDaysMondayCheckBox1;
	@FindBy (xpath="(//input[@id='adModel_IsTuesday'])[1]") private WebElement arrivalDaysTuesdayCheckBox1;
	@FindBy (xpath="(//input[@id='adModel_IsWednesday'])[1]") private WebElement arrivalDaysWednesdayCheckBox1;
	@FindBy (xpath="(//input[@id='adModel_IsThursday'])[1]") private WebElement arrivalDaysThursdayCheckBox1;
	@FindBy (xpath="(//input[@id='adModel_IsFriday'])[1]") private WebElement arrivalDaysFridayCheckBox1;
	@FindBy (xpath="(//input[@id='adModel_IsSaturday'])[1]") private WebElement arrivalDaysSaturdayCheckBox1;
	@FindBy (xpath="(//input[@id='adModel_IsSunday'])[1]") private WebElement arrivalDaysSundayCheckBox1;
	@FindBy (xpath="(//input[@id='adModel_IsAll_Dep'])[1]") private WebElement departureDaysSelectAllCheckBox1;
	@FindBy (xpath="(//input[@id='adModel_IsMonday_Dep'])[1]") private WebElement departureDaysMondayCheckBox1;
	@FindBy (xpath="(//input[@id='adModel_IsTuesday_Dep'])[1]") private WebElement departureDaysTuesdayCheckBox1;
	@FindBy (xpath="(//input[@id='adModel_IsWednesday_Dep'])[1]") private WebElement departureDaysWednesdayCheckBox1;
	@FindBy (xpath="(//input[@id='adModel_IsThursday_Dep'])[1]") private WebElement departureDayThursdayCheckBox1;
	@FindBy (xpath="(//input[@id='adModel_IsFriday_Dep'])[1]") private WebElement departureDayFridayCheckBox1;
	@FindBy (xpath="(//input[@id='adModel_IsSaturday_Dep'])[1]") private WebElement departureDaySaturdayCheckBox1;
	@FindBy (xpath="(//input[@id='adModel_IsSunday_Dep'])[1]") private WebElement departureDaySundayCheckBox1;
	@FindBy (xpath="(//input[@id='adModel_MinStay'])[1]") private WebElement minStayForRoom1;
	@FindBy (xpath="(//input[@id='adModel_MaxStay'])[1]") private WebElement maxStayForRoom1;
	@FindBy (xpath="(//i[@class='pe-7s-trash btn-icon-wrapper'])[19]") private WebElement deleteOptionForRoom1;
	
	
	//Room2 pending dropdown locators
	@FindBy (xpath="(//input[@id='adModel_StartDate'])[2]") private WebElement travelFrom2;
	@FindBy (xpath="(//input[@id='adModel_EndDate'])[2]") private WebElement travelTo2;
	@FindBy (xpath="(//input[@id='adModel_IsAll'])[2]") private WebElement arrivalDaysSelectAllCheckBox2;
	@FindBy (xpath="(//input[@id='adModel_IsMonday'])[2]") private WebElement arrivalDaysMondayCheckBox2;
	@FindBy (xpath="(//input[@id='adModel_IsTuesday'])[2]") private WebElement arrivalDaysTuesdayCheckBox2;
	@FindBy (xpath="(//input[@id='adModel_IsWednesday'])[2]") private WebElement arrivalDaysWednesdayCheckBox2;
	@FindBy (xpath="(//input[@id='adModel_IsThursday'])[2]") private WebElement arrivalDaysThursdayCheckBox2;
	@FindBy (xpath="(//input[@id='adModel_IsFriday'])[2]") private WebElement arrivalDaysFridayCheckBox2;
	@FindBy (xpath="(//input[@id='adModel_IsSaturday'])[2]") private WebElement arrivalDaysSaturdayCheckBox2;
	@FindBy (xpath="(//input[@id='adModel_IsSunday'])[2]") private WebElement arrivalDaysSundayCheckBox2;
	@FindBy (xpath="(//input[@id='adModel_IsAll_Dep'])[2]") private WebElement departureDaysSelectAllCheckBox2;
	@FindBy (xpath="(//input[@id='adModel_IsMonday_Dep'])[2]") private WebElement departureDaysMondayCheckBox2;
	@FindBy (xpath="(//input[@id='adModel_IsTuesday_Dep'])[2]") private WebElement departureDaysTuesdayCheckBox2;
	@FindBy (xpath="(//input[@id='adModel_IsWednesday_Dep'])[2]") private WebElement departureDaysWednesdayCheckBox2;
	@FindBy (xpath="(//input[@id='adModel_IsThursday_Dep'])[2]") private WebElement departureDayThursdayCheckBox2;
	@FindBy (xpath="(//input[@id='adModel_IsFriday_Dep'])[2]") private WebElement departureDayFridayCheckBox2;
	@FindBy (xpath="(//input[@id='adModel_IsSaturday_Dep'])[2]") private WebElement departureDaySaturdayCheckBox2;
	@FindBy (xpath="(//input[@id='adModel_IsSunday_Dep'])[2]") private WebElement departureDaySundayCheckBox2;
	@FindBy (xpath="(//input[@id='adModel_MinStay'])[2]") private WebElement minStayForRoom2;
	@FindBy (xpath="(//input[@id='adModel_MaxStay'])[2]") private WebElement maxStayForRoom2;
	@FindBy (xpath="(//i[@class='pe-7s-trash btn-icon-wrapper'])[20]") private WebElement deleteOptionForRoom2;
	
	
	//Room3 pending dropdown locators
	@FindBy (xpath="(//input[@id='adModel_StartDate'])[3]") private WebElement travelFrom3;
	@FindBy (xpath="(//input[@id='adModel_EndDate'])[3]") private WebElement travelTo3;
	@FindBy (xpath="(//input[@id='adModel_IsAll'])[3]") private WebElement arrivalDaysSelectAllCheckBox3;
	@FindBy (xpath="(//input[@id='adModel_IsMonday'])[3]") private WebElement arrivalDaysMondayCheckBox3;
	@FindBy (xpath="(//input[@id='adModel_IsTuesday'])[3]") private WebElement arrivalDaysTuesdayCheckBox3;
	@FindBy (xpath="(//input[@id='adModel_IsWednesday'])[3]") private WebElement arrivalDaysWednesdayCheckBox3;
	@FindBy (xpath="(//input[@id='adModel_IsThursday'])[3]") private WebElement arrivalDaysThursdayCheckBox3;
	@FindBy (xpath="(//input[@id='adModel_IsFriday'])[3]") private WebElement arrivalDaysFridayCheckBox3;
	@FindBy (xpath="(//input[@id='adModel_IsSaturday'])[3]") private WebElement arrivalDaysSaturdayCheckBox3;
	@FindBy (xpath="(//input[@id='adModel_IsSunday'])[3]") private WebElement arrivalDaysSundayCheckBox3;
	@FindBy (xpath="(//input[@id='adModel_IsAll_Dep'])[3]") private WebElement departureDaysSelectAllCheckBox3;
	@FindBy (xpath="(//input[@id='adModel_IsMonday_Dep'])[3]") private WebElement departureDaysMondayCheckBox3;
	@FindBy (xpath="(//input[@id='adModel_IsTuesday_Dep'])[3]") private WebElement departureDaysTuesdayCheckBox3;
	@FindBy (xpath="(//input[@id='adModel_IsWednesday_Dep'])[3]") private WebElement departureDaysWednesdayCheckBox3;
	@FindBy (xpath="(//input[@id='adModel_IsThursday_Dep'])[3]") private WebElement departureDayThursdayCheckBox3;
	@FindBy (xpath="(//input[@id='adModel_IsFriday_Dep'])[3]") private WebElement departureDayFridayCheckBox3;
	@FindBy (xpath="(//input[@id='adModel_IsSaturday_Dep'])[3]") private WebElement departureDaySaturdayCheckBox3;
	@FindBy (xpath="(//input[@id='adModel_IsSunday_Dep'])[3]") private WebElement departureDaySundayCheckBox3;
	@FindBy (xpath="(//input[@id='adModel_MinStay'])[3]") private WebElement minStayForRoom3;
	@FindBy (xpath="(//input[@id='adModel_MaxStay'])[3]") private WebElement maxStayForRoom3;
	@FindBy (xpath="(//i[@class='pe-7s-trash btn-icon-wrapper'])[21]") private WebElement deleteOptionForRoom3;
	

	
	//Room4 pending dropdown locators
	@FindBy (xpath="(//input[@id='adModel_StartDate'])[4]") private WebElement travelFrom4;
	@FindBy (xpath="(//input[@id='adModel_EndDate'])[4]") private WebElement travelTo4;
	@FindBy (xpath="(//input[@id='adModel_IsAll'])[4]") private WebElement arrivalDaysSelectAllCheckBox4;
	@FindBy (xpath="(//input[@id='adModel_IsMonday'])[4]") private WebElement arrivalDaysMondayCheckBox4;
	@FindBy (xpath="(//input[@id='adModel_IsTuesday'])[4]") private WebElement arrivalDaysTuesdayCheckBox4;
	@FindBy (xpath="(//input[@id='adModel_IsWednesday'])[4]") private WebElement arrivalDaysWednesdayCheckBox4;
	@FindBy (xpath="(//input[@id='adModel_IsThursday'])[4]") private WebElement arrivalDaysThursdayCheckBox4;
	@FindBy (xpath="(//input[@id='adModel_IsFriday'])[4]") private WebElement arrivalDaysFridayCheckBox4;
	@FindBy (xpath="(//input[@id='adModel_IsSaturday'])[4]") private WebElement arrivalDaysSaturdayCheckBox4;
	@FindBy (xpath="(//input[@id='adModel_IsSunday'])[4]") private WebElement arrivalDaysSundayCheckBox4;
	@FindBy (xpath="(//input[@id='adModel_IsAll_Dep'])[4]") private WebElement departureDaysSelectAllCheckBox4;
	@FindBy (xpath="(//input[@id='adModel_IsMonday_Dep'])[4]") private WebElement departureDaysMondayCheckBox4;
	@FindBy (xpath="(//input[@id='adModel_IsTuesday_Dep'])[4]") private WebElement departureDaysTuesdayCheckBox4;
	@FindBy (xpath="(//input[@id='adModel_IsWednesday_Dep'])[4]") private WebElement departureDaysWednesdayCheckBox4;
	@FindBy (xpath="(//input[@id='adModel_IsThursday_Dep'])[4]") private WebElement departureDayThursdayCheckBox4;
	@FindBy (xpath="(//input[@id='adModel_IsFriday_Dep'])[4]") private WebElement departureDayFridayCheckBox4;
	@FindBy (xpath="(//input[@id='adModel_IsSaturday_Dep'])[4]") private WebElement departureDaySaturdayCheckBox4;
	@FindBy (xpath="(//input[@id='adModel_IsSunday_Dep'])[4]") private WebElement departureDaySundayCheckBox4;
	@FindBy (xpath="(//input[@id='adModel_MinStay'])[4]") private WebElement minStayForRoom4;
	@FindBy (xpath="(//input[@id='adModel_MaxStay'])[4]") private WebElement maxStayForRoom4;
	@FindBy (xpath="(//i[@class='pe-7s-trash btn-icon-wrapper'])[22]") private WebElement deleteOptionForRoom4;
	
	//Room5 pending dropdown locators
	@FindBy (xpath="(//input[@id='adModel_StartDate'])[5]") private WebElement travelFrom5;
	@FindBy (xpath="(//input[@id='adModel_EndDate'])[5]") private WebElement travelTo5;
	@FindBy (xpath="(//input[@id='adModel_IsAll'])[5]") private WebElement arrivalDaysSelectAllCheckBox5;
	@FindBy (xpath="(//input[@id='adModel_IsMonday'])[5]") private WebElement arrivalDaysMondayCheckBox5;
	@FindBy (xpath="(//input[@id='adModel_IsTuesday'])[5]") private WebElement arrivalDaysTuesdayCheckBox5;
	@FindBy (xpath="(//input[@id='adModel_IsWednesday'])[5]") private WebElement arrivalDaysWednesdayCheckBox5;
	@FindBy (xpath="(//input[@id='adModel_IsThursday'])[5]") private WebElement arrivalDaysThursdayCheckBox5;
	@FindBy (xpath="(//input[@id='adModel_IsFriday'])[5]") private WebElement arrivalDaysFridayCheckBox5;
	@FindBy (xpath="(//input[@id='adModel_IsSaturday'])[5]") private WebElement arrivalDaysSaturdayCheckBox5;
	@FindBy (xpath="(//input[@id='adModel_IsSunday'])[5]") private WebElement arrivalDaysSundayCheckBox5;
	@FindBy (xpath="(//input[@id='adModel_IsAll_Dep'])[5]") private WebElement departureDaysSelectAllCheckBox5;
	@FindBy (xpath="(//input[@id='adModel_IsMonday_Dep'])[5]") private WebElement departureDaysMondayCheckBox5;
	@FindBy (xpath="(//input[@id='adModel_IsTuesday_Dep'])[5]") private WebElement departureDaysTuesdayCheckBox5;
	@FindBy (xpath="(//input[@id='adModel_IsWednesday_Dep'])[5]") private WebElement departureDaysWednesdayCheckBox5;
	@FindBy (xpath="(//input[@id='adModel_IsThursday_Dep'])[5]") private WebElement departureDayThursdayCheckBox5;
	@FindBy (xpath="(//input[@id='adModel_IsFriday_Dep'])[5]") private WebElement departureDayFridayCheckBox5;
	@FindBy (xpath="(//input[@id='adModel_IsSaturday_Dep'])[5]") private WebElement departureDaySaturdayCheckBox5;
	@FindBy (xpath="(//input[@id='adModel_IsSunday_Dep'])[5]") private WebElement departureDaySundayCheckBox5;
	@FindBy (xpath="(//input[@id='adModel_MinStay'])[5]") private WebElement minStayForRoom5;
	@FindBy (xpath="(//input[@id='adModel_MaxStay'])[5]") private WebElement maxStayForRoom5;
	@FindBy (xpath="(//i[@class='pe-7s-trash btn-icon-wrapper'])[23]") private WebElement deleteOptionForRoom5;
	
	@FindBy (id="btn_UpdateArriDepaTab") private WebElement updateArriDeptButton;
	
	
	public arrivalDepartureConditionsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnaddRowButton()
	{
		addRowButton.click();
	}
	
	//Room1 pending dropdown
	
	
	public void sendtravelFrom1(String travelF1)
	{
		travelFrom1.sendKeys(travelF1);
	}
	
	public void sendtravelTo1(String travelT1)
	{
		travelTo1.sendKeys(travelT1);
	}
	
	public void clickOnarrivalDaysSelectAllCheckBox1()
	{
		arrivalDaysSelectAllCheckBox1.click();
	}
	
	public void clickOnarrivalDaysMondayCheckBox1()
	{
		arrivalDaysMondayCheckBox1.click();
	}
	
	public void clickOnarrivalDaysTuesdayCheckBox1()
	{
		arrivalDaysTuesdayCheckBox1.click();
	}
	
	public void clickOnarrivalDaysWednesdayCheckBox1()
	{
		arrivalDaysWednesdayCheckBox1.click();
	}
	
	public void clickOnarrivalDaysThursdayCheckBox1()
	{
		arrivalDaysThursdayCheckBox1.click();
	}
	
	public void clickOnarrivalDaysFridayCheckBox1()
	{
		arrivalDaysFridayCheckBox1.click();
	}
	
	public void clickOnarrivalDaysSaturdayCheckBox1()
	{
		arrivalDaysSaturdayCheckBox1.click();
	}
	
	public void clickOnarrivalDaysSundayCheckBox1()
	{
		arrivalDaysSundayCheckBox1.click();
	}
	
	public void clickOnDepartureDaysSelectAllCheckBox1()
	{
		departureDaysSelectAllCheckBox1.click();
	}
	
	public void clickOnDepartureDaysMondayCheckBox1()
	{
		departureDaysMondayCheckBox1.click();
	}
	
	public void clickOnDepartureDaysTuesdayCheckBox1()
	{
		departureDaysTuesdayCheckBox1.click();
	}
	
	public void clickOnDepartureDaysWednesdayCheckBox1()
	{
		departureDaysWednesdayCheckBox1.click();
	}
	
	public void clickOnDepartureDayThursdayCheckBox1()
	{
		departureDayThursdayCheckBox1.click();
	}
	
	public void clickOnDepartureDayFridayCheckBox1()
	{
		departureDayFridayCheckBox1.click();
	}
	
	public void clickOnDepartureDaySaturdayCheckBox1()
	{
		departureDaySaturdayCheckBox1.click();
	}
	
	public void clickOnDepartureDaySundayCheckBox1()
	{
		departureDaySundayCheckBox1.click();
	}
	
	public void sendMinStayForRoom1(String min)
	{
		minStayForRoom1.sendKeys(min);
	}
	
	public void sendMaxStayForRoom1(String max)
	{
		maxStayForRoom1.sendKeys(max);
	}
	
	public void clickOndeleteOptionForRoom1()
	{
		deleteOptionForRoom1.click();
	}
	
	
	//Room2 pending dropdown method
	
	
	
	public void sendtravelFrom2(String travelF2)
	{
		travelFrom2.sendKeys(travelF2);
	}
	
	public void sendtravelTo2(String travelT2)
	{
		travelTo2.sendKeys(travelT2);
	}
	
	public void clickOnarrivalDaysSelectAllCheckBox2()
	{
		arrivalDaysSelectAllCheckBox2.click();
	}
	
	public void clickOnarrivalDaysMondayCheckBox2()
	{
		arrivalDaysMondayCheckBox2.click();
	}
	
	public void clickOnarrivalDaysTuesdayCheckBox2()
	{
		arrivalDaysTuesdayCheckBox2.click();
	}
	
	public void clickOnarrivalDaysWednesdayCheckBox2()
	{
		arrivalDaysWednesdayCheckBox2.click();
	}
	
	public void clickOnarrivalDaysThursdayCheckBox2()
	{
		arrivalDaysThursdayCheckBox2.click();
	}
	
	public void clickOnarrivalDaysFridayCheckBox2()
	{
		arrivalDaysFridayCheckBox2.click();
	}
	
	public void clickOnarrivalDaysSaturdayCheckBox2()
	{
		arrivalDaysSaturdayCheckBox2.click();
	}
	
	public void clickOnarrivalDaysSundayCheckBox2()
	{
		arrivalDaysSundayCheckBox2.click();
	}
	
	public void clickOnDepartureDaysSelectAllCheckBox2()
	{
		departureDaysSelectAllCheckBox2.click();
	}
	
	public void clickOnDepartureDaysMondayCheckBox2()
	{
		departureDaysMondayCheckBox2.click();
	}
	
	public void clickOnDepartureDaysTuesdayCheckBox2()
	{
		departureDaysTuesdayCheckBox2.click();
	}
	
	public void clickOnDepartureDaysWednesdayCheckBox2()
	{
		departureDaysWednesdayCheckBox2.click();
	}
	
	public void clickOnDepartureDayThursdayCheckBox2()
	{
		departureDayThursdayCheckBox2.click();
	}
	
	public void clickOnDepartureDayFridayCheckBox2()
	{
		departureDayFridayCheckBox2.click();
	}
	
	public void clickOnDepartureDaySaturdayCheckBox2()
	{
		departureDaySaturdayCheckBox2.click();
	}
	
	public void clickOnDepartureDaySundayCheckBox2()
	{
		departureDaySundayCheckBox2.click();
	}
	
	public void sendMinStayForRoom2(String min)
	{
		minStayForRoom2.sendKeys(min);
	}
	
	public void sendMaxStayForRoom2(String max)
	{
		maxStayForRoom2.sendKeys(max);
	}
	
	public void clickOndeleteOptionForRoom2()
	{
		deleteOptionForRoom2.click();
	}
	
	
	
	//Room3 Method pending
	
	
	public void sendtravelFrom3(String travelF3)
	{
		travelFrom2.sendKeys(travelF3);
	}
	
	public void sendtravelTo3(String travelT3)
	{
		travelTo2.sendKeys(travelT3);
	}
	
	public void clickOnarrivalDaysSelectAllCheckBox3()
	{
		arrivalDaysSelectAllCheckBox3.click();
	}
	
	public void clickOnarrivalDaysMondayCheckBox3()
	{
		arrivalDaysMondayCheckBox3.click();
	}
	
	public void clickOnarrivalDaysTuesdayCheckBox3()
	{
		arrivalDaysTuesdayCheckBox3.click();
	}
	
	public void clickOnarrivalDaysWednesdayCheckBox3()
	{
		arrivalDaysWednesdayCheckBox3.click();
	}
	
	public void clickOnarrivalDaysThursdayCheckBox3()
	{
		arrivalDaysThursdayCheckBox3.click();
	}
	
	public void clickOnarrivalDaysFridayCheckBox3()
	{
		arrivalDaysFridayCheckBox3.click();
	}
	
	public void clickOnarrivalDaysSaturdayCheckBox3()
	{
		arrivalDaysSaturdayCheckBox3.click();
	}
	
	public void clickOnarrivalDaysSundayCheckBox3()
	{
		arrivalDaysSundayCheckBox3.click();
	}
	
	public void clickOnDepartureDaysSelectAllCheckBox3()
	{
		departureDaysSelectAllCheckBox3.click();
	}
	
	public void clickOnDepartureDaysMondayCheckBox3()
	{
		departureDaysMondayCheckBox3.click();
	}
	
	public void clickOnDepartureDaysTuesdayCheckBox3()
	{
		departureDaysTuesdayCheckBox3.click();
	}
	
	public void clickOnDepartureDaysWednesdayCheckBox3()
	{
		departureDaysWednesdayCheckBox3.click();
	}
	
	public void clickOnDepartureDayThursdayCheckBox3()
	{
		departureDayThursdayCheckBox3.click();
	}
	
	public void clickOnDepartureDayFridayCheckBox3()
	{
		departureDayFridayCheckBox3.click();
	}
	
	public void clickOnDepartureDaySaturdayCheckBox3()
	{
		departureDaySaturdayCheckBox3.click();
	}
	
	public void clickOnDepartureDaySundayCheckBox3()
	{
		departureDaySundayCheckBox3.click();
	}
	
	public void sendMinStayForRoom3(String min)
	{
		minStayForRoom3.sendKeys(min);
	}
	
	public void sendMaxStayForRoom3(String max)
	{
		maxStayForRoom3.sendKeys(max);
	}
	
	public void clickOndeleteOptionForRoom3()
	{
		deleteOptionForRoom3.click();
	}
	
	
	//Room4 method pending 
	
	public void sendtravelFrom4(String travelF4)
	{
		travelFrom4.sendKeys(travelF4);
	}
	
	public void sendtravelTo4(String travelT4)
	{
		travelTo4.sendKeys(travelT4);
	}
	
	public void clickOnarrivalDaysSelectAllCheckBox4()
	{
		arrivalDaysSelectAllCheckBox4.click();
	}
	
	public void clickOnarrivalDaysMondayCheckBox4()
	{
		arrivalDaysMondayCheckBox4.click();
	}
	
	public void clickOnarrivalDaysTuesdayCheckBox4()
	{
		arrivalDaysTuesdayCheckBox4.click();
	}
	
	public void clickOnarrivalDaysWednesdayCheckBox4()
	{
		arrivalDaysWednesdayCheckBox4.click();
	}
	
	public void clickOnarrivalDaysThursdayCheckBox4()
	{
		arrivalDaysThursdayCheckBox4.click();
	}
	
	public void clickOnarrivalDaysFridayCheckBox4()
	{
		arrivalDaysFridayCheckBox4.click();
	}
	
	public void clickOnarrivalDaysSaturdayCheckBox4()
	{
		arrivalDaysSaturdayCheckBox4.click();
	}
	
	public void clickOnarrivalDaysSundayCheckBox4()
	{
		arrivalDaysSundayCheckBox4.click();
	}
	
	public void clickOnDepartureDaysSelectAllCheckBox4()
	{
		departureDaysSelectAllCheckBox4.click();
	}
	
	public void clickOnDepartureDaysMondayCheckBox4()
	{
		departureDaysMondayCheckBox4.click();
	}
	
	public void clickOnDepartureDaysTuesdayCheckBox4()
	{
		departureDaysTuesdayCheckBox4.click();
	}
	
	public void clickOnDepartureDaysWednesdayCheckBox4()
	{
		departureDaysWednesdayCheckBox4.click();
	}
	
	public void clickOnDepartureDayThursdayCheckBox4()
	{
		departureDayThursdayCheckBox4.click();
	}
	
	public void clickOnDepartureDayFridayCheckBox4()
	{
		departureDayFridayCheckBox4.click();
	}
	
	public void clickOnDepartureDaySaturdayCheckBox4()
	{
		departureDaySaturdayCheckBox4.click();
	}
	
	public void clickOnDepartureDaySundayCheckBox4()
	{
		departureDaySundayCheckBox4.click();
	}
	
	public void sendMinStayForRoom4(String min)
	{
		minStayForRoom4.sendKeys(min);
	}
	
	public void sendMaxStayForRoom4(String max)
	{
		maxStayForRoom4.sendKeys(max);
	}
	
	public void clickOndeleteOptionForRoom4()
	{
		deleteOptionForRoom4.click();
	}
	
	
	//Room5 method pending
	
	public void sendtravelFrom5(String travelF5)
	{
		travelFrom4.sendKeys(travelF5);
	}
	
	public void sendtravelTo5(String travelT5)
	{
		travelTo4.sendKeys(travelT5);
	}
	
	public void clickOnarrivalDaysSelectAllCheckBox5()
	{
		arrivalDaysSelectAllCheckBox4.click();
	}
	
	public void clickOnarrivalDaysMondayCheckBox5()
	{
		arrivalDaysMondayCheckBox5.click();
	}
	
	public void clickOnarrivalDaysTuesdayCheckBox5()
	{
		arrivalDaysTuesdayCheckBox5.click();
	}
	
	public void clickOnarrivalDaysWednesdayCheckBox5()
	{
		arrivalDaysWednesdayCheckBox5.click();
	}
	
	public void clickOnarrivalDaysThursdayCheckBox5()
	{
		arrivalDaysThursdayCheckBox5.click();
	}
	
	public void clickOnarrivalDaysFridayCheckBox5()
	{
		arrivalDaysFridayCheckBox5.click();
	}
	
	public void clickOnarrivalDaysSaturdayCheckBox5()
	{
		arrivalDaysSaturdayCheckBox5.click();
	}
	
	public void clickOnarrivalDaysSundayCheckBox5()
	{
		arrivalDaysSundayCheckBox5.click();
	}
	
	public void clickOnDepartureDaysSelectAllCheckBox5()
	{
		departureDaysSelectAllCheckBox5.click();
	}
	
	public void clickOnDepartureDaysMondayCheckBox5()
	{
		departureDaysMondayCheckBox5.click();
	}
	
	public void clickOnDepartureDaysTuesdayCheckBox5()
	{
		departureDaysTuesdayCheckBox5.click();
	}
	
	public void clickOnDepartureDaysWednesdayCheckBox5()
	{
		departureDaysWednesdayCheckBox5.click();
	}
	
	public void clickOnDepartureDayThursdayCheckBox5()
	{
		departureDayThursdayCheckBox5.click();
	}
	
	public void clickOnDepartureDayFridayCheckBox5()
	{
		departureDayFridayCheckBox5.click();
	}
	
	public void clickOnDepartureDaySaturdayCheckBox5()
	{
		departureDaySaturdayCheckBox5.click();
	}
	
	public void clickOnDepartureDaySundayCheckBox5()
	{
		departureDaySundayCheckBox5.click();
	}
	
	public void sendMinStayForRoom5(String min)
	{
		minStayForRoom5.sendKeys(min);
	}
	
	public void sendMaxStayForRoom5(String max)
	{
		maxStayForRoom5.sendKeys(max);
	}
	
	public void clickOndeleteOptionForRoom5()
	{
		deleteOptionForRoom5.click();
	}
	
	public void clickOnUpdateArriDeptButton()
	{
		updateArriDeptButton.click();
	}
	
	
}
