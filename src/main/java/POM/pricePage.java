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

//Season_B
@FindBy (id ="seasonModel_SeasonBFrom") private WebElement seasonFrom_B;
@FindBy (id ="seasonModel_SeasonBUntil") private WebElement seasonUntil_B;

@FindBy (id ="seasonModel_SeasonBReleaseDays") private WebElement releaseDays_B;
@FindBy (id ="seasonModel_SeasonBReleaseDate") private WebElement releaseDate_B;

@FindBy (xpath ="(//input[@id='roomModel_SeasonBAllotment'])[1]") private WebElement seasonAallotRoom1_B;
@FindBy (xpath ="(//input[@id='roomModel_SeasonBEB'])[1]") private WebElement seasonEBRoom1_B;
@FindBy (xpath ="(//input[@id='roomModel_SeasonBPrice'])[1]") private WebElement seasonApriceRoom1_B;

@FindBy (xpath ="(//input[@id='roomModel_SeasonBAllotment'])[2]") private WebElement seasonAallotRoom2_B;
@FindBy (xpath ="(//input[@id='roomModel_SeasonBEB'])[2]") private WebElement seasonEBRoom2_B;
@FindBy (xpath ="(//input[@id='roomModel_SeasonBPrice'])[2]") private WebElement seasonApriceRoom2_B;

//Season_C
@FindBy (id ="seasonModel_SeasonCFrom") private WebElement seasonFrom_C;
@FindBy (id ="seasonModel_SeasonCUntil") private WebElement seasonUntil_C;

@FindBy (id ="seasonModel_SeasonCReleaseDays") private WebElement releaseDays_C;
@FindBy (id ="seasonModel_SeasonCReleaseDate") private WebElement releaseDate_C;

@FindBy (xpath ="(//input[@id='roomModel_SeasonCAllotment'])[1]") private WebElement seasonAallotRoom1_C;
@FindBy (xpath ="(//input[@id='roomModel_SeasonCEB'])[1]") private WebElement seasonEBRoom1_C;
@FindBy (xpath ="(//input[@id='roomModel_SeasonCPrice'])[1]") private WebElement seasonApriceRoom1_C;

@FindBy (xpath ="(//input[@id='roomModel_SeasonCAllotment'])[2]") private WebElement seasonAallotRoom2_C;
@FindBy (xpath ="(//input[@id='roomModel_SeasonCEB'])[2]") private WebElement seasonEBRoom2_C;
@FindBy (xpath ="(//input[@id='roomModel_SeasonCPrice'])[2]") private WebElement seasonApriceRoom2_C;

//Season_D
@FindBy (id ="seasonModel_SeasonDFrom") private WebElement seasonFrom_D;
@FindBy (id ="seasonModel_SeasonDUntil") private WebElement seasonUntil_D;

@FindBy (id ="seasonModel_SeasonDReleaseDays") private WebElement releaseDays_D;
@FindBy (id ="seasonModel_SeasonDReleaseDate") private WebElement releaseDate_D;

@FindBy (xpath ="(//input[@id='roomModel_SeasonDAllotment'])[1]") private WebElement seasonAallotRoom1_D;
@FindBy (xpath ="(//input[@id='roomModel_SeasonDEB'])[1]") private WebElement seasonEBRoom1_D;
@FindBy (xpath ="(//input[@id='roomModel_SeasonDPrice'])[1]") private WebElement seasonApriceRoom1_D;

@FindBy (xpath ="(//input[@id='roomModel_SeasonDAllotment'])[2]") private WebElement seasonAallotRoom2_D;
@FindBy (xpath ="(//input[@id='roomModel_SeasonDEB'])[2]") private WebElement seasonEBRoom2_D;
@FindBy (xpath ="(//input[@id='roomModel_SeasonDPrice'])[2]") private WebElement seasonApriceRoom2_D;

//Season_E
@FindBy (id ="seasonModel_SeasonEFrom") private WebElement seasonFrom_E;
@FindBy (id ="seasonModel_SeasonEUntil") private WebElement seasonUntil_E;

@FindBy (id ="seasonModel_SeasonEReleaseDays") private WebElement releaseDays_E;
@FindBy (id ="seasonModel_SeasonEReleaseDate") private WebElement releaseDate_E;

@FindBy (xpath ="(//input[@id='roomModel_SeasonEAllotment'])[1]") private WebElement seasonAallotRoom1_E;
@FindBy (xpath ="(//input[@id='roomModel_SeasonEEB'])[1]") private WebElement seasonEBRoom1_E;
@FindBy (xpath ="(//input[@id='roomModel_SeasonEPrice'])[1]") private WebElement seasonApriceRoom1_E;

@FindBy (xpath ="(//input[@id='roomModel_SeasonEAllotment'])[2]") private WebElement seasonAallotRoom2_E;
@FindBy (xpath ="(//input[@id='roomModel_SeasonEEB'])[2]") private WebElement seasonEBRoom2_E;
@FindBy (xpath ="(//input[@id='roomModel_SeasonEPrice'])[2]") private WebElement seasonApriceRoom2_E;

//Season_F
@FindBy (id ="seasonModel_SeasonFFrom") private WebElement seasonFrom_F;
@FindBy (id ="seasonModel_SeasonFUntil") private WebElement seasonUntil_F;

@FindBy (id ="seasonModel_SeasonFReleaseDays") private WebElement releaseDays_F;
@FindBy (id ="seasonModel_SeasonFReleaseDate") private WebElement releaseDate_F;

@FindBy (xpath ="(//input[@id='roomModel_SeasonFAllotment'])[1]") private WebElement seasonAallotRoom1_F;
@FindBy (xpath ="(//input[@id='roomModel_SeasonFEB'])[1]") private WebElement seasonEBRoom1_F;
@FindBy (xpath ="(//input[@id='roomModel_SeasonFPrice'])[1]") private WebElement seasonApriceRoom1_F;

@FindBy (xpath ="(//input[@id='roomModel_SeasonFAllotment'])[2]") private WebElement seasonAallotRoom2_F;
@FindBy (xpath ="(//input[@id='roomModel_SeasonFEB'])[2]") private WebElement seasonEBRoom2_F;
@FindBy (xpath ="(//input[@id='roomModel_SeasonFPrice'])[2]") private WebElement seasonApriceRoom2_F;

//Season_G
@FindBy (id ="seasonModel_SeasonGFrom") private WebElement seasonFrom_G;
@FindBy (id ="seasonModel_SeasonGUntil") private WebElement seasonUntil_G;

@FindBy (id ="seasonModel_SeasonGReleaseDays") private WebElement releaseDays_G;
@FindBy (id ="seasonModel_SeasonGReleaseDate") private WebElement releaseDate_G;

@FindBy (xpath ="(//input[@id='roomModel_SeasonGAllotment'])[1]") private WebElement seasonAallotRoom1_G;
@FindBy (xpath ="(//input[@id='roomModel_SeasonGEB'])[1]") private WebElement seasonEBRoom1_G;
@FindBy (xpath ="(//input[@id='roomModel_SeasonGPrice'])[1]") private WebElement seasonApriceRoom1_G;

@FindBy (xpath ="(//input[@id='roomModel_SeasonGAllotment'])[2]") private WebElement seasonAallotRoom2_G;
@FindBy (xpath ="(//input[@id='roomModel_SeasonGEB'])[2]") private WebElement seasonEBRoom2_G;
@FindBy (xpath ="(//input[@id='roomModel_SeasonGPrice'])[2]") private WebElement seasonApriceRoom2_G;

//Season_H
@FindBy (id ="seasonModel_SeasonHFrom") private WebElement seasonFrom_H;
@FindBy (id ="seasonModel_SeasonHUntil") private WebElement seasonUntil_H;

@FindBy (id ="seasonModel_SeasonHReleaseDays") private WebElement releaseDays_H;
@FindBy (id ="seasonModel_SeasonHReleaseDate") private WebElement releaseDate_H;

@FindBy (xpath ="(//input[@id='roomModel_SeasonHAllotment'])[1]") private WebElement seasonAallotRoom1_H;
@FindBy (xpath ="(//input[@id='roomModel_SeasonHEB'])[1]") private WebElement seasonEBRoom1_H;
@FindBy (xpath ="(//input[@id='roomModel_SeasonHPrice'])[1]") private WebElement seasonApriceRoom1_H;

@FindBy (xpath ="(//input[@id='roomModel_SeasonHAllotment'])[2]") private WebElement seasonAallotRoom2_H;
@FindBy (xpath ="(//input[@id='roomModel_SeasonHEB'])[2]") private WebElement seasonEBRoom2_H;
@FindBy (xpath ="(//input[@id='roomModel_SeasonHPrice'])[2]") private WebElement seasonApriceRoom_H;


@FindBy (id ="btn_newRoom") private WebElement newRowForRooms;

@FindBy (id ="UpdatePriceTab") private WebElement updatePriceButton;

@FindBy (id ="Generateallotment") private WebElement generateAllotmentButton;


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
		seasonAallotRoom1_B.sendKeys(AllotRoom1_B);
	}
	
	public void sendseasonBpriceRoom1_B(String PriceRoom1_B)
	{
		seasonApriceRoom1_B.sendKeys(PriceRoom1_B);
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
		seasonAallotRoom1_C.sendKeys(AllotRoom1_C);
	}
	
	public void sendseasonCpriceRoom1_C(String PriceRoom1_C)
	{
		seasonApriceRoom1_C.sendKeys(PriceRoom1_C);
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
		seasonAallotRoom1_D.sendKeys(AllotRoom1_D);
	}
	
	public void sendseasonDpriceRoom1_D(String PriceRoom1_D)
	{
		seasonApriceRoom1_D.sendKeys(PriceRoom1_D);
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
		seasonAallotRoom1_E.sendKeys(AllotRoom1_E);
	}
	
	public void sendseasonEpriceRoom1_E(String PriceRoom1_E)
	{
		seasonApriceRoom1_E.sendKeys(PriceRoom1_E);
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
		seasonAallotRoom1_F.sendKeys(AllotRoom1_F);
	}
	
	public void sendseasonFpriceRoom1_F(String PriceRoom1_F)
	{
		seasonApriceRoom1_F.sendKeys(PriceRoom1_F);
	}
	
	public void sendSeasonFrom_G(String Season_G)
	
	{
		seasonFrom_G.sendKeys(Season_G);
	}
	
	public void sendseasonGallotRoom1_G(String AllotRoom1_G)
	{
		seasonAallotRoom1_G.sendKeys(AllotRoom1_G);
	}
	
	public void sendseasonGpriceRoom1_G(String PriceRoom1_G)
	{
		seasonApriceRoom1_G.sendKeys(PriceRoom1_G);
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
		seasonAallotRoom1_H.sendKeys(AllotRoom1_H);
	}
	
	public void sendseasonHpriceRoom1_H(String PriceRoom1_H)
	{
		seasonApriceRoom1_H.sendKeys(PriceRoom1_H);
	}
	
	public void clickOnNewRowForRooms()
	{
		newRowForRooms.click();
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
