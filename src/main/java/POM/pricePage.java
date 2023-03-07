package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pricePage {
	
	
@FindBy (xpath ="//a[text()='Dashboard']") private WebElement dashboard;

//Season_A
@FindBy (id ="seasonModel_SeasonAFrom") private WebElement seasonFrom_A;
@FindBy (id ="seasonModel_SeasonAUntil") private WebElement seasonUntil_A;

@FindBy (id ="seasonModel_SeasonAReleaseDays") private WebElement releaseDays_A;
@FindBy (id ="seasonModel_SeasonAReleaseDate") private WebElement releaseDate_A;

@FindBy (xpath ="(//input[@id='roomModel_SeasonAAllotment'])[1]") private WebElement seasonAallotRoom1_A;
@FindBy (xpath ="(//input[@id='roomModel_SeasonAEB'])[1]") private WebElement seasonEBRoom1_A;
@FindBy (xpath ="(//input[@id='roomModel_SeasonAPrice'])[1]") private WebElement seasonApriceRoom1_A;

@FindBy (xpath ="(//input[@id='roomModel_SeasonAAllotment'])[2]") private WebElement seasonAallotRoom2_A;
@FindBy (xpath ="(//input[@id='roomModel_SeasonAEB'])[2]") private WebElement seasonEBRoom2_A;
@FindBy (xpath ="(//input[@id='roomModel_SeasonAPrice'])[2]") private WebElement seasonApriceRoom2_A;

@FindBy (xpath ="(//input[@id='roomModel_SeasonAAllotment'])[3]") private WebElement seasonAallotRoom3_A;
@FindBy (xpath ="(//input[@id='roomModel_SeasonAEB'])[3]") private WebElement seasonEBRoom3_A;
@FindBy (xpath ="(//input[@id='roomModel_SeasonAPrice'])[3]") private WebElement seasonApriceRoom3_A;

@FindBy (xpath ="(//input[@id='roomModel_SeasonAAllotment'])[4]") private WebElement seasonAallotRoom4_A;
@FindBy (xpath ="(//input[@id='roomModel_SeasonAEB'])[4]") private WebElement seasonEBRoom4_A;
@FindBy (xpath ="(//input[@id='roomModel_SeasonAPrice'])[4]") private WebElement seasonApriceRoom4_A;

//Season_B
@FindBy (id ="seasonModel_SeasonBFrom") private WebElement seasonFrom_B;
@FindBy (id ="seasonModel_SeasonBUntil") private WebElement seasonUntil_B;

@FindBy (id ="seasonModel_SeasonBReleaseDays") private WebElement releaseDays_B;
@FindBy (id ="seasonModel_SeasonBReleaseDate") private WebElement releaseDate_B;

@FindBy (xpath ="(//input[@id='roomModel_SeasonBAllotment'])[1]") private WebElement seasonBallotRoom1_B;
@FindBy (xpath ="(//input[@id='roomModel_SeasonBEB'])[1]") private WebElement seasonEBRoom1_B;
@FindBy (xpath ="(//input[@id='roomModel_SeasonBPrice'])[1]") private WebElement seasonBpriceRoom1_B;

@FindBy (xpath ="(//input[@id='roomModel_SeasonBAllotment'])[2]") private WebElement seasonBallotRoom2_B;
@FindBy (xpath ="(//input[@id='roomModel_SeasonBEB'])[2]") private WebElement seasonEBRoom2_B;
@FindBy (xpath ="(//input[@id='roomModel_SeasonBPrice'])[2]") private WebElement seasonBpriceRoom2_B;

@FindBy (xpath ="(//input[@id='roomModel_SeasonBAllotment'])[3]") private WebElement seasonBallotRoom3_B;
@FindBy (xpath ="(//input[@id='roomModel_SeasonBEB'])[3]") private WebElement seasonEBRoom3_B;
@FindBy (xpath ="(//input[@id='roomModel_SeasonBPrice'])[3]") private WebElement seasonBpriceRoom3_B;

@FindBy (xpath ="(//input[@id='roomModel_SeasonBAllotment'])[4]") private WebElement seasonBallotRoom4_B;
@FindBy (xpath ="(//input[@id='roomModel_SeasonBEB'])[4]") private WebElement seasonEBRoom4_B;
@FindBy (xpath ="(//input[@id='roomModel_SeasonBPrice'])[4]") private WebElement seasonBpriceRoom4_B;


//Season_C
@FindBy (id ="seasonModel_SeasonCFrom") private WebElement seasonFrom_C;
@FindBy (id ="seasonModel_SeasonCUntil") private WebElement seasonUntil_C;

@FindBy (id ="seasonModel_SeasonCReleaseDays") private WebElement releaseDays_C;
@FindBy (id ="seasonModel_SeasonCReleaseDate") private WebElement releaseDate_C;

@FindBy (xpath ="(//input[@id='roomModel_SeasonCAllotment'])[1]") private WebElement seasonCallotRoom1_C;
@FindBy (xpath ="(//input[@id='roomModel_SeasonCEB'])[1]") private WebElement seasonEBRoom1_C;
@FindBy (xpath ="(//input[@id='roomModel_SeasonCPrice'])[1]") private WebElement seasonCpriceRoom1_C;

@FindBy (xpath ="(//input[@id='roomModel_SeasonCAllotment'])[2]") private WebElement seasonCallotRoom2_C;
@FindBy (xpath ="(//input[@id='roomModel_SeasonCEB'])[2]") private WebElement seasonEBRoom2_C;
@FindBy (xpath ="(//input[@id='roomModel_SeasonCPrice'])[2]") private WebElement seasonCpriceRoom2_C;

@FindBy (xpath ="(//input[@id='roomModel_SeasonCAllotment'])[3]") private WebElement seasonCallotRoom3_C;
@FindBy (xpath ="(//input[@id='roomModel_SeasonCEB'])[3]") private WebElement seasonEBRoom3_C;
@FindBy (xpath ="(//input[@id='roomModel_SeasonCPrice'])[3]") private WebElement seasonCpriceRoom3_C;

@FindBy (xpath ="(//input[@id='roomModel_SeasonCAllotment'])[4]") private WebElement seasonCallotRoom4_C;
@FindBy (xpath ="(//input[@id='roomModel_SeasonCEB'])[4]") private WebElement seasonEBRoom4_C;
@FindBy (xpath ="(//input[@id='roomModel_SeasonCPrice'])[4]") private WebElement seasonCpriceRoom4_C;


//Season_D
@FindBy (id ="seasonModel_SeasonDFrom") private WebElement seasonFrom_D;
@FindBy (id ="seasonModel_SeasonDUntil") private WebElement seasonUntil_D;

@FindBy (id ="seasonModel_SeasonDReleaseDays") private WebElement releaseDays_D;
@FindBy (id ="seasonModel_SeasonDReleaseDate") private WebElement releaseDate_D;

@FindBy (xpath ="(//input[@id='roomModel_SeasonDAllotment'])[1]") private WebElement seasonDallotRoom1_D;
@FindBy (xpath ="(//input[@id='roomModel_SeasonDEB'])[1]") private WebElement seasonEBRoom1_D;
@FindBy (xpath ="(//input[@id='roomModel_SeasonDPrice'])[1]") private WebElement seasonDpriceRoom1_D;

@FindBy (xpath ="(//input[@id='roomModel_SeasonDAllotment'])[2]") private WebElement seasonDallotRoom2_D;
@FindBy (xpath ="(//input[@id='roomModel_SeasonDEB'])[2]") private WebElement seasonEBRoom2_D;
@FindBy (xpath ="(//input[@id='roomModel_SeasonDPrice'])[2]") private WebElement seasonDpriceRoom2_D;

@FindBy (xpath ="(//input[@id='roomModel_SeasonDAllotment'])[3]") private WebElement seasonDallotRoom3_D;
@FindBy (xpath ="(//input[@id='roomModel_SeasonDEB'])[3]") private WebElement seasonEBRoom3_D;
@FindBy (xpath ="(//input[@id='roomModel_SeasonDPrice'])[3]") private WebElement seasonDpriceRoom3_D;

@FindBy (xpath ="(//input[@id='roomModel_SeasonDAllotment'])[4]") private WebElement seasonDallotRoom4_D;
@FindBy (xpath ="(//input[@id='roomModel_SeasonDEB'])[4]") private WebElement seasonEBRoom4_D;
@FindBy (xpath ="(//input[@id='roomModel_SeasonDPrice'])[4]") private WebElement seasonDpriceRoom4_D;


//Season_E
@FindBy (id ="seasonModel_SeasonEFrom") private WebElement seasonFrom_E;
@FindBy (id ="seasonModel_SeasonEUntil") private WebElement seasonUntil_E;

@FindBy (id ="seasonModel_SeasonEReleaseDays") private WebElement releaseDays_E;
@FindBy (id ="seasonModel_SeasonEReleaseDate") private WebElement releaseDate_E;

@FindBy (xpath ="(//input[@id='roomModel_SeasonEAllotment'])[1]") private WebElement seasonEallotRoom1_E;
@FindBy (xpath ="(//input[@id='roomModel_SeasonEEB'])[1]") private WebElement seasonEBRoom1_E;
@FindBy (xpath ="(//input[@id='roomModel_SeasonEPrice'])[1]") private WebElement seasonEpriceRoom1_E;

@FindBy (xpath ="(//input[@id='roomModel_SeasonEAllotment'])[2]") private WebElement seasonEallotRoom2_E;
@FindBy (xpath ="(//input[@id='roomModel_SeasonEEB'])[2]") private WebElement seasonEBRoom2_E;
@FindBy (xpath ="(//input[@id='roomModel_SeasonEPrice'])[2]") private WebElement seasonEpriceRoom2_E;

@FindBy (xpath ="(//input[@id='roomModel_SeasonEAllotment'])[3]") private WebElement seasonEallotRoom3_E;
@FindBy (xpath ="(//input[@id='roomModel_SeasonEEB'])[3]") private WebElement seasonEBRoom3_E;
@FindBy (xpath ="(//input[@id='roomModel_SeasonEPrice'])[3]") private WebElement seasonEpriceRoom3_E;

@FindBy (xpath ="(//input[@id='roomModel_SeasonEAllotment'])[4]") private WebElement seasonEallotRoom4_E;
@FindBy (xpath ="(//input[@id='roomModel_SeasonEEB'])[4]") private WebElement seasonEBRoom4_E;
@FindBy (xpath ="(//input[@id='roomModel_SeasonEPrice'])[4]") private WebElement seasonEpriceRoom4_E;


//Season_F
@FindBy (id ="seasonModel_SeasonFFrom") private WebElement seasonFrom_F;
@FindBy (id ="seasonModel_SeasonFUntil") private WebElement seasonUntil_F;

@FindBy (id ="seasonModel_SeasonFReleaseDays") private WebElement releaseDays_F;
@FindBy (id ="seasonModel_SeasonFReleaseDate") private WebElement releaseDate_F;

@FindBy (xpath ="(//input[@id='roomModel_SeasonFAllotment'])[1]") private WebElement seasonFallotRoom1_F;
@FindBy (xpath ="(//input[@id='roomModel_SeasonFEB'])[1]") private WebElement seasonEBRoom1_F;
@FindBy (xpath ="(//input[@id='roomModel_SeasonFPrice'])[1]") private WebElement seasonFpriceRoom1_F;

@FindBy (xpath ="(//input[@id='roomModel_SeasonFAllotment'])[2]") private WebElement seasonFallotRoom2_F;
@FindBy (xpath ="(//input[@id='roomModel_SeasonFEB'])[2]") private WebElement seasonEBRoom2_F;
@FindBy (xpath ="(//input[@id='roomModel_SeasonFPrice'])[2]") private WebElement seasonFpriceRoom2_F;

@FindBy (xpath ="(//input[@id='roomModel_SeasonFAllotment'])[3]") private WebElement seasonFallotRoom3_F;
@FindBy (xpath ="(//input[@id='roomModel_SeasonFEB'])[3]") private WebElement seasonEBRoom3_F;
@FindBy (xpath ="(//input[@id='roomModel_SeasonFPrice'])[3]") private WebElement seasonFpriceRoom3_F;

@FindBy (xpath ="(//input[@id='roomModel_SeasonFAllotment'])[4]") private WebElement seasonFallotRoom4_F;
@FindBy (xpath ="(//input[@id='roomModel_SeasonFEB'])[4]") private WebElement seasonEBRoom4_F;
@FindBy (xpath ="(//input[@id='roomModel_SeasonFPrice'])[4]") private WebElement seasonFpriceRoom4_F;


//Season_G
@FindBy (id ="seasonModel_SeasonGFrom") private WebElement seasonFrom_G;
@FindBy (id ="seasonModel_SeasonGUntil") private WebElement seasonUntil_G;

@FindBy (id ="seasonModel_SeasonGReleaseDays") private WebElement releaseDays_G;
@FindBy (id ="seasonModel_SeasonGReleaseDate") private WebElement releaseDate_G;

@FindBy (xpath ="(//input[@id='roomModel_SeasonGAllotment'])[1]") private WebElement seasonGallotRoom1_G;
@FindBy (xpath ="(//input[@id='roomModel_SeasonGEB'])[1]") private WebElement seasonEBRoom1_G;
@FindBy (xpath ="(//input[@id='roomModel_SeasonGPrice'])[1]") private WebElement seasonGpriceRoom1_G;

@FindBy (xpath ="(//input[@id='roomModel_SeasonGAllotment'])[2]") private WebElement seasonGallotRoom2_G;
@FindBy (xpath ="(//input[@id='roomModel_SeasonGEB'])[2]") private WebElement seasonEBRoom2_G;
@FindBy (xpath ="(//input[@id='roomModel_SeasonGPrice'])[2]") private WebElement seasonGpriceRoom2_G;

@FindBy (xpath ="(//input[@id='roomModel_SeasonGAllotment'])[3]") private WebElement seasonGallotRoom3_G;
@FindBy (xpath ="(//input[@id='roomModel_SeasonGEB'])[3]") private WebElement seasonEBRoom3_G;
@FindBy (xpath ="(//input[@id='roomModel_SeasonGPrice'])[3]") private WebElement seasonGpriceRoom3_G;

@FindBy (xpath ="(//input[@id='roomModel_SeasonGAllotment'])[4]") private WebElement seasonGallotRoom4_G;
@FindBy (xpath ="(//input[@id='roomModel_SeasonGEB'])[4]") private WebElement seasonEBRoom4_G;
@FindBy (xpath ="(//input[@id='roomModel_SeasonGPrice'])[4]") private WebElement seasonGpriceRoom4_G;


//Season_H
@FindBy (id ="seasonModel_SeasonHFrom") private WebElement seasonFrom_H;
@FindBy (id ="seasonModel_SeasonHUntil") private WebElement seasonUntil_H;

@FindBy (id ="seasonModel_SeasonHReleaseDays") private WebElement releaseDays_H;
@FindBy (id ="seasonModel_SeasonHReleaseDate") private WebElement releaseDate_H;

@FindBy (xpath ="(//input[@id='roomModel_SeasonHAllotment'])[1]") private WebElement seasonHallotRoom1_H;
@FindBy (xpath ="(//input[@id='roomModel_SeasonHEB'])[1]") private WebElement seasonEBRoom1_H;
@FindBy (xpath ="(//input[@id='roomModel_SeasonHPrice'])[1]") private WebElement seasonHpriceRoom1_H;

@FindBy (xpath ="(//input[@id='roomModel_SeasonHAllotment'])[2]") private WebElement seasonHallotRoom2_H;
@FindBy (xpath ="(//input[@id='roomModel_SeasonHEB'])[2]") private WebElement seasonEBRoom2_H;
@FindBy (xpath ="(//input[@id='roomModel_SeasonHPrice'])[2]") private WebElement seasonHpriceRoom2_H;

@FindBy (xpath ="(//input[@id='roomModel_SeasonHAllotment'])[3]") private WebElement seasonHallotRoom3_H;
@FindBy (xpath ="(//input[@id='roomModel_SeasonHEB'])[3]") private WebElement seasonEBRoom3_H;
@FindBy (xpath ="(//input[@id='roomModel_SeasonHPrice'])[3]") private WebElement seasonHpriceRoom3_H;

@FindBy (xpath ="(//input[@id='roomModel_SeasonHAllotment'])[4]") private WebElement seasonHallotRoom4_H;
@FindBy (xpath ="(//input[@id='roomModel_SeasonHEB'])[4]") private WebElement seasonEBRoom4_H;
@FindBy (xpath ="(//input[@id='roomModel_SeasonHPrice'])[4]") private WebElement seasonHpriceRoom4_H;

// Weekdays CheckBoxs selection for room1 

@FindBy (xpath ="(//input[@id='roomModel_IsAll'])[1]") private WebElement Room1CheckBox1AllDay;
@FindBy (xpath ="(//input[@id='roomModel_IsMonday'])[1]") private WebElement Room1CheckBox2Monday;
@FindBy (xpath ="(//input[@id='roomModel_IsTuesday'])[1]") private WebElement Room1CheckBox3Tuesday;
@FindBy (xpath ="(//input[@id='roomModel_IsWednesday'])[1]") private WebElement Room1CheckBox4Wednesday;
@FindBy (xpath ="(//input[@id='roomModel_IsThursday'])[1]") private WebElement Room1CheckBox5Thursday;
@FindBy (xpath ="(//input[@id='roomModel_IsFriday'])[1]") private WebElement Room1CheckBox6Friday;
@FindBy (xpath ="(//input[@id='roomModel_IsSaturday'])[1]") private WebElement Room1CheckBox7Saturday;
@FindBy (xpath ="(//input[@id='roomModel_IsSunday'])[1]") private WebElement Room1CheckBox8Sunday;

//Weekdays CheckBox selection for room2

@FindBy (xpath ="(//input[@id='roomModel_IsAll'])[2]") private WebElement Room2CheckBox1AllDay;
@FindBy (xpath ="(//input[@id='roomModel_IsMonday'])[2]") private WebElement Room2CheckBox2Monday;
@FindBy (xpath ="(//input[@id='roomModel_IsTuesday'])[2]") private WebElement Room2CheckBox3Tuesday;
@FindBy (xpath ="(//input[@id='roomModel_IsWednesday'])[2]") private WebElement Room2CheckBox4Wednesday;
@FindBy (xpath ="(//input[@id='roomModel_IsThursday'])[2]") private WebElement Room2CheckBox5Thursday;
@FindBy (xpath ="(//input[@id='roomModel_IsFriday'])[2]") private WebElement Room2CheckBox6Friday;
@FindBy (xpath ="(//input[@id='roomModel_IsSaturday'])[2]") private WebElement Room2CheckBox7Saturday;
@FindBy (xpath ="(//input[@id='roomModel_IsSunday'])21]") private WebElement Room2CheckBox8Sunday;

//Weeekdays CheckBox selection for room3

@FindBy (xpath ="(//input[@id='roomModel_IsAll'])[3]") private WebElement Room3CheckBox1AllDay;
@FindBy (xpath ="(//input[@id='roomModel_IsMonday'])[3]") private WebElement Room3CheckBox2Monday;
@FindBy (xpath ="(//input[@id='roomModel_IsTuesday'])[3]") private WebElement Room3CheckBox3Tuesday;
@FindBy (xpath ="(//input[@id='roomModel_IsWednesday'])[3]") private WebElement Room3CheckBox4Wednesday;
@FindBy (xpath ="(//input[@id='roomModel_IsThursday'])[3]") private WebElement Room3CheckBox5Thursday;
@FindBy (xpath ="(//input[@id='roomModel_IsFriday'])[3]") private WebElement Room3CheckBox6Friday;
@FindBy (xpath ="(//input[@id='roomModel_IsSaturday'])[3]") private WebElement Room3CheckBox7Saturday;
@FindBy (xpath ="(//input[@id='roomModel_IsSunday'])[3]") private WebElement Room3CheckBox8Sunday;

//Weekdays CheckBox selection for room4

@FindBy (xpath ="(//input[@id='roomModel_IsAll'])[4]") private WebElement Room4CheckBox1AllDay;
@FindBy (xpath ="(//input[@id='roomModel_IsMonday'])[4]") private WebElement Room4CheckBox2Monday;
@FindBy (xpath ="(//input[@id='roomModel_IsTuesday'])[4]") private WebElement Room4CheckBox3Tuesday;
@FindBy (xpath ="(//input[@id='roomModel_IsWednesday'])[4]") private WebElement Room4CheckBox4Wednesday;
@FindBy (xpath ="(//input[@id='roomModel_IsThursday'])[4]") private WebElement Room4CheckBox5Thursday;
@FindBy (xpath ="(//input[@id='roomModel_IsFriday'])[4]") private WebElement Room4CheckBox6Friday;
@FindBy (xpath ="(//input[@id='roomModel_IsSaturday'])[4]") private WebElement Room4CheckBox7Saturday;
@FindBy (xpath ="(//input[@id='roomModel_IsSunday'])[4]") private WebElement Room4CheckBox8Sunday;

@FindBy (id ="btn_newRoom") private WebElement newRowForRooms;

@FindBy (xpath ="(//select[@id='roomModel_RoomID'])[1]") private WebElement room1Selection1;
@FindBy (xpath ="//select[@id='roomRowHidden_5']") private WebElement room2Selection2;
@FindBy (id ="roomRowHidden_6") private WebElement room3Selection3;
@FindBy (id ="roomRowHidden_7") private WebElement room4Selection4;

@FindBy (id ="UpdatePriceTab") private WebElement updatePriceButton;

@FindBy (id ="Generateallotment") private WebElement generateAllotmentButton;

// Methods Pending
//Board Up/Downgrades
@FindBy (xpath ="//a[@id='boardupdown']") private WebElement addRowButtonBoardUpDowngrades;

@FindBy (xpath ="(//span[@class='multiselect-selected-text'])[2]") private WebElement seasonBoardUpDowngradesDropdown1;
@FindBy (xpath ="(//span[@class='multiselect-selected-text'])[3]") private WebElement roomBoardUpDowngradesDropdown1;
@FindBy (xpath ="//select[@id='priceboardupdown_UpDownType_2']") private WebElement UpDownTypeDropdown1;
@FindBy (xpath ="(//input[@id='priceboardupdown_ChildMinAge'])[1]") private WebElement minAgeField1;
@FindBy (xpath ="(//input[@id='priceboardupdown_ChildMaxAge'])[1]") private WebElement maxAgeField1;
@FindBy (xpath ="(//input[@id='priceboardupdown_PricePerNight'])[1]") private WebElement priceNightperPerson1;
@FindBy (xpath ="(//input[@id='priceboardupdown_AdditionalInfomation'])[1]") private WebElement additionalInfoField1;
@FindBy (xpath ="(//i[@class='pe-7s-trash btn-icon-wrapper'])[7]") private WebElement deleteActionButton1;
@FindBy (xpath ="(//i[@class='pe-7s-copy-file btn-icon-wrapper'])[3]") private WebElement copyActionButton1;

@FindBy (xpath ="(//span[@class='multiselect-selected-text'])[4]") private WebElement seasonBoardUpDowngradesDropdown2;
@FindBy (xpath ="(//span[@class='multiselect-selected-text'])[5]") private WebElement roomBoardUpDowngradesDropdown2;
@FindBy (xpath ="//select[@id='priceboardupdown_UpDownType_3']") private WebElement UpDownTypeDropdown2;
@FindBy (xpath ="(//input[@id='priceboardupdown_ChildMinAge'])[2]") private WebElement minAgeField2;
@FindBy (xpath ="(//input[@id='priceboardupdown_ChildMaxAge'])[2]") private WebElement maxAgeField2;
@FindBy (xpath ="(//input[@id='priceboardupdown_PricePerNight'])[2]") private WebElement priceNightperPerson2;
@FindBy (xpath ="(//input[@id='priceboardupdown_AdditionalInfomation'])[2]") private WebElement additionalInfoField2;
@FindBy (xpath ="(//i[@class='pe-7s-trash btn-icon-wrapper'])[8]") private WebElement deleteActionButton2;
@FindBy (xpath ="(//i[@class='pe-7s-copy-file btn-icon-wrapper'])[4]") private WebElement copyActionButton2;

@FindBy (id ="submitboard") private WebElement updateBoardUpDownButton;

//Children/Additional Occupancy Discount

@FindBy (id ="btn_addchildren") private WebElement addRowChildrenAdditionalOccupancyDiscount;

@FindBy (xpath ="(//span[@class='multiselect-selected-text'])[6]") private WebElement seasonDropdown1;



	public pricePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnDashboard()
	
	{
		dashboard.click();
	}
	
	public void sendSeasonFrom_A(String Season_A)
	
	{
		seasonFrom_A.sendKeys(Season_A);
	}
	
	public void seasonUntil_A(String SeasonUntil_A)
	
	{
		seasonUntil_A.sendKeys(SeasonUntil_A);
	}
	
	public void sendseasonAallotRoom1_A(String AllotRoom1_A)
	{
		seasonAallotRoom1_A.sendKeys(AllotRoom1_A);
	}
	
	public void sendseasonApriceRoom1_A(String PriceRoom1_A)
	{
		seasonApriceRoom1_A.sendKeys(PriceRoom1_A);
	}
	
	public void sendseasonAallotRoom2_A(String AllotRoom2_A)
	{
		seasonAallotRoom2_A.sendKeys(AllotRoom2_A);
	}
	
	public void sendseasonApriceRoom2_A(String PriceRoom2_A)
	{
		seasonApriceRoom2_A.sendKeys(PriceRoom2_A);
	}
	
	public void sendseasonAallotRoom3_A(String AllotRoom3_A)
	{
		seasonAallotRoom3_A.sendKeys(AllotRoom3_A);
	}
	
	public void sendseasonApriceRoom3_A(String PriceRoom3_A)
	{
		seasonApriceRoom3_A.sendKeys(PriceRoom3_A);
	}
	
	public void sendseasonAallotRoom4_A(String AllotRoom4_A)
	{
		seasonAallotRoom4_A.sendKeys(AllotRoom4_A);
	}
	
	public void sendseasonApriceRoom4_A(String PriceRoom4_A)
	{
		seasonApriceRoom4_A.sendKeys(PriceRoom4_A);
	}
	
	public void sendSeasonFrom_B(String Season_B)
	{
		seasonFrom_B.sendKeys(Season_B);
	}
	
	public void seasonUntil_B(String SeasonUntil_B)
	{
		seasonUntil_B.sendKeys(SeasonUntil_B);
	}
	
	public void sendseasonBallotRoom1_B(String AllotRoom1_B)
	{
		seasonBallotRoom1_B.sendKeys(AllotRoom1_B);
	}
	
	public void sendseasonBpriceRoom1_B(String PriceRoom1_B)
	{
		seasonBpriceRoom1_B.sendKeys(PriceRoom1_B);
	}
	
	public void sendseasonBallotRoom2_B(String AllotRoom2_B)
	{
		seasonBallotRoom2_B.sendKeys(AllotRoom2_B);
	}
	
	public void sendseasonBpriceRoom2_B(String PriceRoom2_B)
	{
		seasonBpriceRoom2_B.sendKeys(PriceRoom2_B);
	}
	
	public void sendseasonBallotRoom3_B(String AllotRoom3_B)
	{
		seasonBallotRoom3_B.sendKeys(AllotRoom3_B);
	}
	
	public void sendseasonBpriceRoom3_B(String PriceRoom3_B)
	{
		seasonBpriceRoom3_B.sendKeys(PriceRoom3_B);
	}
	
	public void sendseasonBallotRoom4_B(String AllotRoom4_B)
	{
		seasonBallotRoom4_B.sendKeys(AllotRoom4_B);
	}
	
	public void sendseasonBpriceRoom4_B(String PriceRoom4_B)
	{
		seasonBpriceRoom4_B.sendKeys(PriceRoom4_B);
	}

	public void sendSeasonFrom_C(String Season_C)
	
	{
		seasonFrom_C.sendKeys(Season_C);
	}
	
	public void seasonUntil_C(String SeasonUntil_C)
	
	{
		seasonUntil_C.sendKeys(SeasonUntil_C);
	}
	
	public void sendseasonCallotRoom1_C(String AllotRoom1_C)
	{
		seasonCallotRoom1_C.sendKeys(AllotRoom1_C);
	}
	
	public void sendseasonCpriceRoom1_C(String PriceRoom1_C)
	{
		seasonCpriceRoom1_C.sendKeys(PriceRoom1_C);
	}
	
	public void sendseasonCallotRoom2_C(String AllotRoom2_C)
	{
		seasonCallotRoom2_C.sendKeys(AllotRoom2_C);
	}
	
	public void sendseasonCpriceRoom2_C(String PriceRoom2_C)
	{
		seasonCpriceRoom2_C.sendKeys(PriceRoom2_C);
	}
	
	public void sendseasonCallotRoom3_C(String AllotRoom3_C)
	{
		seasonCallotRoom3_C.sendKeys(AllotRoom3_C);
	}
	
	public void sendseasonCpriceRoom3_C(String PriceRoom3_C)
	{
		seasonCpriceRoom3_C.sendKeys(PriceRoom3_C);
	}
	
	public void sendseasonBallotRoom4_C(String AllotRoom4_C)
	{
		seasonCallotRoom4_C.sendKeys(AllotRoom4_C);
	}
	
	public void sendseasonBpriceRoom4_C(String PriceRoom4_C)
	{
		seasonCpriceRoom4_C.sendKeys(PriceRoom4_C);
	}
	
	public void sendSeasonFrom_D(String Season_D)
	
	{
		seasonFrom_D.sendKeys(Season_D);
	}
	
	public void seasonUntil_D(String SeasonUntil_D)
	
	{
		seasonUntil_D.sendKeys(SeasonUntil_D);
	}
	
	public void sendseasonDallotRoom1_D(String AllotRoom1_D)
	{
		seasonDallotRoom1_D.sendKeys(AllotRoom1_D);
	}
	
	public void sendseasonDpriceRoom1_D(String PriceRoom1_D)
	{
		seasonDpriceRoom1_D.sendKeys(PriceRoom1_D);
	}
	
	public void sendseasonDallotRoom2_D(String AllotRoom2_D)
	{
		seasonDallotRoom2_D.sendKeys(AllotRoom2_D);
	}
	
	public void sendseasonDpriceRoom2_D(String PriceRoom2_D)
	{
		seasonDpriceRoom2_D.sendKeys(PriceRoom2_D);
	}
	
	public void sendseasonDallotRoom3_D(String AllotRoom3_D)
	{
		seasonDallotRoom3_D.sendKeys(AllotRoom3_D);
	}
	
	public void sendseasonDpriceRoom3_D(String PriceRoom3_D)
	{
		seasonDpriceRoom3_D.sendKeys(PriceRoom3_D);
	}
	
	public void sendseasonDallotRoom4_C(String AllotRoom4_D)
	{
		seasonDallotRoom4_D.sendKeys(AllotRoom4_D);
	}
	
	public void sendseasonDpriceRoom4_C(String PriceRoom4_D)
	{
		seasonDpriceRoom4_D.sendKeys(PriceRoom4_D);
	}
	
	public void sendSeasonFrom_E(String Season_E)
	
	{
		seasonFrom_E.sendKeys(Season_E);
	}
	
	public void seasonUntil_E(String SeasonUntil_E)
	
	{
		seasonUntil_E.sendKeys(SeasonUntil_E);
	}
	
	public void sendseasonEallotRoom1_E(String AllotRoom1_E)
	{
		seasonEallotRoom1_E.sendKeys(AllotRoom1_E);
	}
	
	public void sendseasonEpriceRoom1_E(String PriceRoom1_E)
	{
		seasonEpriceRoom1_E.sendKeys(PriceRoom1_E);
	}
	
	public void sendseasonEallotRoom2_E(String AllotRoom2_E)
	{
		seasonEallotRoom2_E.sendKeys(AllotRoom2_E);
	}
	
	public void sendseasonEpriceRoom2_E(String PriceRoom2_E)
	{
		seasonEpriceRoom2_E.sendKeys(PriceRoom2_E);
	}
	
	public void sendseasonEallotRoom3_E(String AllotRoom3_E)
	{
		seasonEallotRoom3_E.sendKeys(AllotRoom3_E);
	}
	
	public void sendseasonEpriceRoom3_E(String PriceRoom3_E)
	{
		seasonEpriceRoom3_E.sendKeys(PriceRoom3_E);
	}
	
	public void sendseasonEallotRoom4_E(String AllotRoom4_E)
	{
		seasonEallotRoom4_E.sendKeys(AllotRoom4_E);
	}
	
	public void sendseasonEpriceRoom4_E(String PriceRoom4_E)
	{
		seasonEpriceRoom4_E.sendKeys(PriceRoom4_E);
	}
	
	public void sendSeasonFrom_F(String Season_F)
	
	{
		seasonFrom_F.sendKeys(Season_F);
	}
	
	public void seasonUntil_F(String SeasonUntil_F)
	
	{
		seasonUntil_F.sendKeys(SeasonUntil_F);
	}
	
	public void sendseasonFallotRoom1_F(String AllotRoom1_F)
	{
		seasonFallotRoom1_F.sendKeys(AllotRoom1_F);
	}
	
	public void sendseasonFpriceRoom1_F(String PriceRoom1_F)
	{
		seasonFpriceRoom1_F.sendKeys(PriceRoom1_F);
	}
	
	public void sendseasonFallotRoom2_F(String AllotRoom2_F)
	{
		seasonFallotRoom2_F.sendKeys(AllotRoom2_F);
	}
	
	public void sendseasonFpriceRoom2_F(String PriceRoom2_F)
	{
		seasonFpriceRoom2_F.sendKeys(PriceRoom2_F);
	}
	
	public void sendseasonFallotRoom3_F(String AllotRoom3_F)
	{
		seasonFallotRoom3_F.sendKeys(AllotRoom3_F);
	}
	
	public void sendseasonFpriceRoom3_F(String PriceRoom3_F)
	{
		seasonFpriceRoom3_F.sendKeys(PriceRoom3_F);
	}
	
	public void sendseasonFallotRoom4_E(String AllotRoom4_F)
	{
		seasonFallotRoom4_F.sendKeys(AllotRoom4_F);
	}
	
	public void sendseasonFpriceRoom4_E(String PriceRoom4_F)
	{
		seasonFpriceRoom4_F.sendKeys(PriceRoom4_F);
	}
	
	public void sendSeasonFrom_G(String Season_G)
	
	{
		seasonFrom_G.sendKeys(Season_G);
	}
	
	public void sendseasonGallotRoom1_G(String AllotRoom1_G)
	{
		seasonGallotRoom1_G.sendKeys(AllotRoom1_G);
	}
	
	public void sendseasonGpriceRoom1_G(String PriceRoom1_G)
	{
		seasonGpriceRoom1_G.sendKeys(PriceRoom1_G);
	}
	
	public void sendseasonGallotRoom2_G(String AllotRoom2_G)
	{
		seasonGallotRoom2_G.sendKeys(AllotRoom2_G);
	}
	
	public void sendseasonGpriceRoom2_G(String PriceRoom2_G)
	{
		seasonGpriceRoom2_G.sendKeys(PriceRoom2_G);
	}
	
	public void sendseasonGallotRoom3_G(String AllotRoom3_G)
	{
		seasonFallotRoom3_F.sendKeys(AllotRoom3_G);
	}
	
	public void sendseasonGpriceRoom3_G(String PriceRoom3_G)
	{
		seasonGpriceRoom3_G.sendKeys(PriceRoom3_G);
	}
	
	public void sendseasonGallotRoom4_G(String AllotRoom4_G)
	{
		seasonGallotRoom4_G.sendKeys(AllotRoom4_G);
	}
	
	public void sendseasonGpriceRoom4_G(String PriceRoom4_G)
	{
		seasonGpriceRoom4_G.sendKeys(PriceRoom4_G);
	}
	
	
	public void seasonUntil_G(String SeasonUntil_G)
	
	{
		seasonUntil_G.sendKeys(SeasonUntil_G);
	}
    
	public void sendSeasonFrom_H(String Season_H)
	
	{
		seasonFrom_H.sendKeys(Season_H);
	}
	
	public void seasonUntil_H(String SeasonUntil_H)
	
	{
		seasonUntil_H.sendKeys(SeasonUntil_H);
	}
	
	public void sendseasonHallotRoom1_H(String AllotRoom1_H)
	{
		seasonHallotRoom1_H.sendKeys(AllotRoom1_H);
	}
	
	public void sendseasonHpriceRoom1_H(String PriceRoom1_H)
	{
		seasonHpriceRoom1_H.sendKeys(PriceRoom1_H);
	}
	
	public void sendseasonHallotRoom2_H(String AllotRoom2_H)
	{
		seasonHallotRoom2_H.sendKeys(AllotRoom2_H);
	}
	
	public void sendseasonHpriceRoom2_H(String PriceRoom2_H)
	{
		seasonHpriceRoom2_H.sendKeys(PriceRoom2_H);
	}
	
	public void sendseasonHallotRoom3_H(String AllotRoom3_H)
	{
		seasonHallotRoom3_H.sendKeys(AllotRoom3_H);
	}
	
	public void sendseasonHpriceRoom3_H(String PriceRoom3_H)
	{
		seasonHpriceRoom3_H.sendKeys(PriceRoom3_H);
	}
	
	public void sendseasonHallotRoom4_H(String AllotRoom4_H)
	{
		seasonHallotRoom4_H.sendKeys(AllotRoom4_H);
	}
	
	public void sendseasonHpriceRoom4_H(String PriceRoom4_H)
	{
		seasonHpriceRoom4_H.sendKeys(PriceRoom4_H);
	}
	
	
	// room1
	
	public void clickOnRoom1CheckBox1AllDay()
	{
		Room1CheckBox1AllDay.click();
	}
	
	public void clickOnRoom1CheckBox2Monday()
	{
		Room1CheckBox2Monday.click();
	}
	
	public void clickOnRoom1CheckBox3Tuesday()
	{
		Room1CheckBox3Tuesday.click();
	}
	
	public void clickOnRoom1CheckBox4Wednesday()
	{
		Room1CheckBox4Wednesday.click();
	}
	
	public void clickOnRoom1CheckBox5Thursday()
	{
		Room1CheckBox5Thursday.click();
	}
	
	public void clickOnRoom1CheckBox6Friday()
	{
		Room1CheckBox6Friday.click();
	}
	
	public void clickOnRoom1CheckBox7Saturday()
	{
		Room1CheckBox7Saturday.click();
	}
	
	public void clickOnRoom1CheckBox8Sunday()
	{
		Room1CheckBox8Sunday.click();
	}
	
	// room2
	
	public void clickOnRoom2CheckBox1AllDay()
	{
		Room2CheckBox1AllDay.click();
	}
	
	public void clickOnRoom2CheckBox2Monday()
	{
		Room2CheckBox2Monday.click();
	}
	
	public void clickOnRoom2CheckBox3Tuesday()
	{
		Room2CheckBox3Tuesday.click();
	}
	
	public void clickOnRoom2CheckBox4Wednesday()
	{
		Room2CheckBox4Wednesday.click();
	}
	
	public void clickOnRoom2CheckBox5Thursday()
	{
		Room2CheckBox5Thursday.click();
	}
	
	public void clickOnRoom2CheckBox6Friday()
	{
		Room2CheckBox6Friday.click();
	}
	
	public void clickOnRoom2CheckBox7Saturday()
	{
		Room2CheckBox7Saturday.click();
	}
	
	public void clickOnRoom2CheckBox8Sunday()
	{
		Room2CheckBox8Sunday.click();
	}
	
	//room3
	
	public void clickOnRoom3CheckBox1AllDay()
	{
		Room3CheckBox1AllDay.click();
	}
	
	public void clickOnRoom3CheckBox2Monday()
	{
		Room3CheckBox2Monday.click();
	}
	
	public void clickOnRoom3CheckBox3Tuesday()
	{
		Room3CheckBox3Tuesday.click();
	}
	
	public void clickOnRoom3CheckBox4Wednesday()
	{
		Room3CheckBox4Wednesday.click();
	}
	
	public void clickOnRoom3CheckBox5Thursday()
	{
		Room3CheckBox5Thursday.click();
	}
	
	public void clickOnRoom3CheckBox6Friday()
	{
		Room3CheckBox6Friday.click();
	}
	
	public void clickOnRoom3CheckBox7Saturday()
	{
		Room3CheckBox7Saturday.click();
	}
	
	public void clickOnRoom3CheckBox8Sunday()
	{
		Room3CheckBox8Sunday.click();
	}

	//Room4
	
	public void clickOnRoom4CheckBox1AllDay()
	{
		Room4CheckBox1AllDay.click();
	}
	
	public void clickOnRoom4CheckBox2Monday()
	{
		Room4CheckBox2Monday.click();
	}
	
	public void clickOnRoom4CheckBox3Tuesday()
	{
		Room4CheckBox3Tuesday.click();
	}
	
	public void clickOnRoom4CheckBox4Wednesday()
	{
		Room4CheckBox4Wednesday.click();
	}
	
	public void clickOnRoom4CheckBox5Thursday()
	{
		Room4CheckBox5Thursday.click();
	}
	
	public void clickOnRoom4CheckBox6Friday()
	{
		Room4CheckBox6Friday.click();
	}
	
	public void clickOnRoom4CheckBox7Saturday()
	{
		Room4CheckBox7Saturday.click();
	}
	
	public void clickOnRoom4CheckBox8Sunday()
	{
		Room4CheckBox8Sunday.click();
	}
	
	public void clickOnNewRowForRooms()
	{
		newRowForRooms.click();
	}
	
	public WebElement room1Dropdown1()
	{
		WebElement Element = room1Selection1;
		return Element;
	}
	
	public WebElement room2Dropdown2()
	{
		WebElement Element = room2Selection2;
		return Element;
	}
	
	public WebElement room3Dropdown3()
	{
		WebElement Element = room3Selection3;
		return Element;
	}
	
	public WebElement room4Dropdown4()
	{
		WebElement Element = room4Selection4;
		return Element;
	}
	
	public void clickOnUpdatePriceButton()
	{
		updatePriceButton.click();
	}
	
	public void clickOnGenerateAllotmentButton()
	{
		generateAllotmentButton.click();
	}

}
