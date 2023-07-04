package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class arrivalDepartureConditionsPage {

	@FindBy (id="btn_addarrival") private WebElement addRowButton;
	
	@FindBy (xpath="(//input[@id='adModel_StartDate'])[1]") private WebElement travelFrom1;
	@FindBy (xpath="(//input[@id='adModel_EndDate'])[1]") private WebElement travelTo1;
	@FindBy (xpath="(//input[@id='adModel_IsAll'])[1]") private WebElement arrivalDaysRoom1SelectAllCheckBox1;
	@FindBy (xpath="(//input[@id='adModel_IsMonday'])[1]") private WebElement arrivalDaysRoom1MondayCheckBox2;
	@FindBy (xpath="(//input[@id='adModel_IsTuesday'])[1]") private WebElement arrivalDaysRoom1TuesdayCheckBox3;
	@FindBy (xpath="(//input[@id='adModel_IsWednesday'])[1]") private WebElement arrivalDaysRoom1WednesdayCheckBox4;
	@FindBy (xpath="(//input[@id='adModel_IsThursday'])[1]") private WebElement arrivalDaysRoom1ThursdayCheckBox5;
	@FindBy (xpath="(//input[@id='adModel_IsFriday'])[1]") private WebElement arrivalDaysRoom1FridayCheckBox6;
	@FindBy (xpath="(//input[@id='adModel_IsSaturday'])[1]") private WebElement arrivalDaysRoom1SaturdayCheckBox7;
	@FindBy (xpath="(//input[@id='adModel_IsSunday'])[1]") private WebElement arrivalDaysRoom1SundayCheckBox8;
	@FindBy (xpath="(//input[@id='adModel_IsAll_Dep'])[1]") private WebElement departureDaysRoom1SelectAllCheckBox1;
	@FindBy (xpath="(//input[@id='adModel_IsMonday_Dep'])[1]") private WebElement departureDaysRoom1MondayCheckBox2;
	@FindBy (xpath="(//input[@id='adModel_IsTuesday_Dep'])[1]") private WebElement departureDaysRoom1TuesdayCheckBox3;
	@FindBy (xpath="(//input[@id='adModel_IsWednesday_Dep'])[1]") private WebElement departureDaysRoom1WednesdayCheckBox4;
	@FindBy (xpath="(//input[@id='adModel_IsThursday_Dep'])[1]") private WebElement departureDaysRoom1ThursdayCheckBox5;
	@FindBy (xpath="(//input[@id='adModel_IsFriday_Dep'])[1]") private WebElement departureDaysRoom1FridayCheckBox6;
	@FindBy (xpath="(//input[@id='adModel_IsSaturday_Dep'])[1]") private WebElement departureDaysRoom1SaturdayCheckBox7;
	@FindBy (xpath="(//input[@id='adModel_IsSunday_Dep'])[1]") private WebElement departureDaysRoom1SundayCheckBox8;
	@FindBy (xpath="(//input[@id='adModel_MinStay'])[1]") private WebElement minStayForRoom1;
	@FindBy (xpath="(//input[@id='adModel_MaxStay'])[1]") private WebElement maxStayForRoom1;
	@FindBy (xpath="(//i[@class='pe-7s-trash btn-icon-wrapper'])[19]") private WebElement deleteOptionForRoom1;
	
	@FindBy (xpath="(//input[@id='adModel_StartDate'])[2]") private WebElement travelFrom2;
	@FindBy (xpath="(//input[@id='adModel_EndDate'])[2]") private WebElement travelTo2;
	@FindBy (xpath="(//input[@id='adModel_IsAll'])[2]") private WebElement arrivalDaysRoom2SelectAllCheckBox1;
	@FindBy (xpath="(//input[@id='adModel_IsMonday'])[2]") private WebElement arrivalDaysRoom2MondayCheckBox2;
	@FindBy (xpath="(//input[@id='adModel_IsTuesday'])[2]") private WebElement arrivalDaysRoom2TuesdayCheckBox3;
	@FindBy (xpath="(//input[@id='adModel_IsWednesday'])[2]") private WebElement arrivalDaysRoom2WednesdayCheckBox4;
	@FindBy (xpath="(//input[@id='adModel_IsThursday'])[2]") private WebElement arrivalDaysRoom2ThursdayCheckBox5;
	@FindBy (xpath="(//input[@id='adModel_IsFriday'])[2]") private WebElement arrivalDaysRoom2FridayCheckBox6;
	@FindBy (xpath="(//input[@id='adModel_IsSaturday'])[2]") private WebElement arrivalDaysRoom2SaturdayCheckBox7;
	@FindBy (xpath="(//input[@id='adModel_IsSunday'])[2]") private WebElement arrivalDaysRoom2SundayCheckBox8;
	@FindBy (xpath="(//input[@id='adModel_IsAll_Dep'])[2]") private WebElement departureDaysRoom2SelectAllCheckBox1;
	@FindBy (xpath="(//input[@id='adModel_IsMonday_Dep'])[2]") private WebElement departureDaysRoom2MondayCheckBox2;
	@FindBy (xpath="(//input[@id='adModel_IsTuesday_Dep'])[2]") private WebElement departureDaysRoom2TuesdayCheckBox3;
	@FindBy (xpath="(//input[@id='adModel_IsWednesday_Dep'])[2]") private WebElement departureDaysRoom2WednesdayCheckBox4;
	@FindBy (xpath="(//input[@id='adModel_IsThursday_Dep'])[2]") private WebElement departureDaysRoom2ThursdayCheckBox5;
	@FindBy (xpath="(//input[@id='adModel_IsFriday_Dep'])[2]") private WebElement departureDaysRoom2FridayCheckBox6;
	@FindBy (xpath="(//input[@id='adModel_IsSaturday_Dep'])[2]") private WebElement departureDaysRoom2SaturdayCheckBox7;
	@FindBy (xpath="(//input[@id='adModel_IsSunday_Dep'])[2]") private WebElement departureDaysRoom2SundayCheckBox8;
	@FindBy (xpath="(//input[@id='adModel_MinStay'])[2]") private WebElement minStayForRoom2;
	@FindBy (xpath="(//input[@id='adModel_MaxStay'])[2]") private WebElement maxStayForRoom2;
	@FindBy (xpath="(//i[@class='pe-7s-trash btn-icon-wrapper'])[20]") private WebElement deleteOptionForRoom2;
	
	@FindBy (xpath="(//input[@id='adModel_StartDate'])[3]") private WebElement travelFrom3;
	@FindBy (xpath="(//input[@id='adModel_EndDate'])[3]") private WebElement travelTo3;
	@FindBy (xpath="(//input[@id='adModel_IsAll'])[3]") private WebElement arrivalDaysRoom3SelectAllCheckBox1;
	@FindBy (xpath="(//input[@id='adModel_IsMonday'])[3]") private WebElement arrivalDaysRoom3MondayCheckBox2;
	@FindBy (xpath="(//input[@id='adModel_IsTuesday'])[3]") private WebElement arrivalDaysRoom3TuesdayCheckBox3;
	@FindBy (xpath="(//input[@id='adModel_IsWednesday'])[3]") private WebElement arrivalDaysRoom3WednesdayCheckBox4;
	@FindBy (xpath="(//input[@id='adModel_IsThursday'])[3]") private WebElement arrivalDaysRoom3ThursdayCheckBox5;
	@FindBy (xpath="(//input[@id='adModel_IsFriday'])[3]") private WebElement arrivalDaysRoom3FridayCheckBox6;
	@FindBy (xpath="(//input[@id='adModel_IsSaturday'])[3]") private WebElement arrivalDaysRoom3SaturdayCheckBox7;
	@FindBy (xpath="(//input[@id='adModel_IsSunday'])[3]") private WebElement arrivalDaysRoom3SundayCheckBox8;
	@FindBy (xpath="(//input[@id='adModel_IsAll_Dep'])[3]") private WebElement departureDaysRoom3SelectAllCheckBox1;
	@FindBy (xpath="(//input[@id='adModel_IsMonday_Dep'])[3]") private WebElement departureDaysRoom3MondayCheckBox2;
	@FindBy (xpath="(//input[@id='adModel_IsTuesday_Dep'])[3]") private WebElement departureDaysRoom3TuesdayCheckBox3;
	@FindBy (xpath="(//input[@id='adModel_IsWednesday_Dep'])[3]") private WebElement departureDaysRoom3WednesdayCheckBox4;
	@FindBy (xpath="(//input[@id='adModel_IsThursday_Dep'])[3]") private WebElement departureDaysRoom3ThursdayCheckBox5;
	@FindBy (xpath="(//input[@id='adModel_IsFriday_Dep'])[3]") private WebElement departureDaysRoom3FridayCheckBox6;
	@FindBy (xpath="(//input[@id='adModel_IsSaturday_Dep'])[3]") private WebElement departureDaysRoom3SaturdayCheckBox7;
	@FindBy (xpath="(//input[@id='adModel_IsSunday_Dep'])[3]") private WebElement departureDaysRoom3SundayCheckBox8;
	@FindBy (xpath="(//input[@id='adModel_MinStay'])[3]") private WebElement minStayForRoom3;
	@FindBy (xpath="(//input[@id='adModel_MaxStay'])[3]") private WebElement maxStayForRoom3;
	@FindBy (xpath="(//i[@class='pe-7s-trash btn-icon-wrapper'])[21]") private WebElement deleteOptionForRoom3;
	
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
	
	public void clickOnarrivalDaysRoom1SelectAllCheckBox1()
	{
		arrivalDaysRoom1SelectAllCheckBox1.click();
	}
	
	public void clickOnarrivalDaysRoom1MondayCheckBox2()
	{
		arrivalDaysRoom1MondayCheckBox2.click();
	}
	
	public void clickOnarrivalDaysRoom1TuesdayCheckBox3()
	{
		arrivalDaysRoom1TuesdayCheckBox3.click();
	}
	
	public void clickOnarrivalDaysRoom1WednesdayCheckBox4()
	{
		arrivalDaysRoom1WednesdayCheckBox4.click();
	}
	
	public void clickOnarrivalDaysRoom1ThursdayCheckBox5()
	{
		arrivalDaysRoom1ThursdayCheckBox5.click();
	}
	
	public void clickOnarrivalDaysRoom1FridayCheckBox6()
	{
		arrivalDaysRoom1FridayCheckBox6.click();
	}
	
	public void clickOnarrivalDaysRoom1SaturdayCheckBox7()
	{
		arrivalDaysRoom1SaturdayCheckBox7.click();
	}
	
	public void clickOnarrivalDaysRoom1SundayCheckBox8()
	{
		arrivalDaysRoom1SundayCheckBox8.click();
	}
	
	public void clickOnDepartureDaysRoom1SelectAllCheckBox1()
	{
		departureDaysRoom1SelectAllCheckBox1.click();
	}
	
	public void clickOnDepartureDaysRoom1MondayCheckBox2()
	{
		departureDaysRoom1MondayCheckBox2.click();
	}
	
	public void clickOnDepartureDaysRoom1TuesdayCheckBox3()
	{
		departureDaysRoom1TuesdayCheckBox3.click();
	}
	
	public void clickOnDepartureDaysRoom1WednesdayCheckBox4()
	{
		departureDaysRoom1WednesdayCheckBox4.click();
	}
	
	public void clickOnDepartureDaysRoom1ThursdayCheckBox5()
	{
		departureDaysRoom1ThursdayCheckBox5.click();
	}
	
	public void clickOnDepartureDaysRoom1FridayCheckBox6()
	{
		departureDaysRoom1FridayCheckBox6.click();
	}
	
	public void clickOnDepartureDaysRoom1SaturdayCheckBox7()
	{
		departureDaysRoom1SaturdayCheckBox7.click();
	}
	
	public void clickOnDepartureDayRoom1SundayCheckBox8()
	{
		departureDaysRoom1SundayCheckBox8.click();
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
	
	public void clickOnarrivalDaysRoom2SelectAllCheckBox1()
	{
		arrivalDaysRoom2SelectAllCheckBox1.click();
	}
	
	public void clickOnarrivalDaysRoom2MondayCheckBox2()
	{
		arrivalDaysRoom2MondayCheckBox2.click();
	}
	
	public void clickOnarrivalDaysRoom2TuesdayCheckBox3()
	{
		arrivalDaysRoom2TuesdayCheckBox3.click();
	}
	
	public void clickOnarrivalDaysRoom2WednesdayCheckBox4()
	{
		arrivalDaysRoom2WednesdayCheckBox4.click();
	}
	
	public void clickOnarrivalDaysRoom2ThursdayCheckBox5()
	{
		arrivalDaysRoom2ThursdayCheckBox5.click();
	}
	
	public void clickOnarrivalDaysRoom2FridayCheckBox6()
	{
		arrivalDaysRoom2FridayCheckBox6.click();
	}
	
	public void clickOnarrivalDaysRoom2SaturdayCheckBox7()
	{
		arrivalDaysRoom2SaturdayCheckBox7.click();
	}
	
	public void clickOnarrivalDaysRoom2SundayCheckBox8()
	{
		arrivalDaysRoom2SundayCheckBox8.click();
	}
	
	public void clickOnDepartureDaysRoom2SelectAllCheckBox1()
	{
		departureDaysRoom2SelectAllCheckBox1.click();
	}
	
	public void clickOnDepartureDaysRoom2MondayCheckBox2()
	{
		departureDaysRoom2MondayCheckBox2.click();
	}
	
	public void clickOnDepartureDaysRoom2TuesdayCheckBox3()
	{
		departureDaysRoom2TuesdayCheckBox3.click();
	}
	
	public void clickOnDepartureDaysRoom2WednesdayCheckBox4()
	{
		departureDaysRoom2WednesdayCheckBox4.click();
	}
	
	public void clickOnDepartureDaysRoom2ThursdayCheckBox5()
	{
		departureDaysRoom2ThursdayCheckBox5.click();
	}
	
	public void clickOnDepartureDaysRoom2FridayCheckBox6()
	{
		departureDaysRoom2FridayCheckBox6.click();
	}
	
	public void clickOnDepartureDaysRoom2SaturdayCheckBox7()
	{
		departureDaysRoom2SaturdayCheckBox7.click();
	}
	
	public void clickOnDepartureDaysRoom2SundayCheckBox8()
	{
		departureDaysRoom2SundayCheckBox8.click();
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
	
	public void clickOnarrivalDaysRoom3SelectAllCheckBox1()
	{
		arrivalDaysRoom3SelectAllCheckBox1.click();
	}
	
	public void clickOnarrivalDaysRoom3MondayCheckBox2()
	{
		arrivalDaysRoom3MondayCheckBox2.click();
	}
	
	public void clickOnarrivalDaysRoom3TuesdayCheckBox3()
	{
		arrivalDaysRoom3TuesdayCheckBox3.click();
	}
	
	public void clickOnarrivalDaysRoom3WednesdayCheckBox4()
	{
		arrivalDaysRoom3WednesdayCheckBox4.click();
	}
	
	public void clickOnarrivalDaysRoom3ThursdayCheckBox5()
	{
		arrivalDaysRoom3ThursdayCheckBox5.click();
	}
	
	public void clickOnarrivalDaysRoom3FridayCheckBox6()
	{
		arrivalDaysRoom3FridayCheckBox6.click();
	}
	
	public void clickOnarrivalDaysRoom3SaturdayCheckBox7()
	{
		arrivalDaysRoom3SaturdayCheckBox7.click();
	}
	
	public void clickOnarrivalDaysRoom3SundayCheckBox8()
	{
		arrivalDaysRoom3SundayCheckBox8.click();
	}
	
	public void clickOnDepartureDaysRoom3SelectAllCheckBox1()
	{
		departureDaysRoom3SelectAllCheckBox1.click();
	}
	
	public void clickOnDepartureDaysRoom3MondayCheckBox2()
	{
		departureDaysRoom3MondayCheckBox2.click();
	}
	
	public void clickOnDepartureDaysRoom3TuesdayCheckBox3()
	{
		departureDaysRoom3TuesdayCheckBox3.click();
	}
	
	public void clickOnDepartureDaysRoom3WednesdayCheckBox4()
	{
		departureDaysRoom3WednesdayCheckBox4.click();
	}
	
	public void clickOnDepartureDaysRoom3ThursdayCheckBox5()
	{
		departureDaysRoom3ThursdayCheckBox5.click();
	}
	
	public void clickOnDepartureDaysRoom3FridayCheckBox6()
	{
		departureDaysRoom3FridayCheckBox6.click();
	}
	
	public void clickOnDepartureDaysRoom3SaturdayCheckBox7()
	{
		departureDaysRoom3SaturdayCheckBox7.click();
	}
	
	public void clickOnDepartureDaysRoom3SundayCheckBox8()
	{
		departureDaysRoom3SundayCheckBox8.click();
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
	
	public void clickOnUpdateArriDeptButton()
	{
		updateArriDeptButton.click();
	}
	
}
