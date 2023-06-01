	package SalesBookingListTestCases;
	
	import java.io.File;
	import java.io.IOException;
	import org.apache.poi.EncryptedDocumentException;
	import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;
	import Base.BaseClass;
	import POM.bookingMaskPage;
	import POM.DashboardPage;
	import POM.loginPage;
	import POM.salesBookingListPage;
	import POM.selectCompanyPage;
	import utility.UtilityClass;
	
	public class VerifyInfoIconForBookingTC30 extends BaseClass
	{
		loginPage login;
		File myFile;
		selectCompanyPage selectCompany;
		DashboardPage dashboard;
		salesBookingListPage salesBookingList;
	    bookingMaskPage BookingMask;
		
		@BeforeClass
		public void launchBrowser(){
			openApplication();
			Reporter.log("Browser Launch ",true);
			UtilityClass.implicitlyWaitInMillis(1000);
			login=new loginPage(driver);
			selectCompany = new selectCompanyPage(driver);
			dashboard = new DashboardPage(driver);
			salesBookingList =new salesBookingListPage(driver);
			BookingMask =new bookingMaskPage(driver);
		}
		
		@BeforeMethod
		public void loginToApp() throws EncryptedDocumentException, IOException, InterruptedException
		{
			login.SendUserName(UtilityClass.readDataFromStringExcel(5, 1, "Sheet2"));
			Reporter.log("Valid Username Entered",true);
			login.SendPassword(UtilityClass.readDataFromStringExcel(6, 1, "Sheet2"));
			Reporter.log("Valid Password Entered",true);
			login.ClickOnLoginToDashboard();
			Reporter.log("Clicked on Dashboard button",true);
			UtilityClass.implicitlyWaitInMillis(1000);
			UtilityClass.listBoxHandlingUsingByText("Falk Tours AG", selectCompany.SelectDropDownList());
			Reporter.log("Select the Falk Tours AG from given list",true);
			UtilityClass.implicitlyWaitInMillis(1000);
			selectCompany.ClickOnProceedButton();
			Reporter.log("Clicked on proceed button",true);	
			Thread.sleep(9500); 
	    	dashboard.SalesClick();
	    	Reporter.log("Clicked on sales dropdown in Dashboard",true);
	    	UtilityClass.implicitlyWaitInMillis(1000);
	    	dashboard.salesBookingClick();
	    	Reporter.log("Clicked on sales Booking in Dashboard",true);
	    	Thread.sleep(5000);
	    	UtilityClass.scrollByAxis(100, 0);
	    	driver.findElement(By.xpath("(//i[@class='pe-7s-info'])[1]")).click();
	    	Thread.sleep(1000);
	    	
	    	}
		
		        @Test
		  	    public void ValidateInfoIcon() throws EncryptedDocumentException, IOException, InterruptedException 
		        {
		        String ActualText1 = salesBookingList.getcustomerDocumentText();
		  		String expectedText1 = UtilityClass.readDataFromStringExcel(53, 1, "Sheet4");
		  		Assert.assertEquals(ActualText1, expectedText1,"Test Case Failed as actual & expected messages are not matching");
		  		Reporter.log("Validating Actual Text is "+salesBookingList.getcustomerDocumentText()+" and Expected text is "+UtilityClass.readDataFromStringExcel(53, 1, "Sheet4"),true);
		        
		  		String ActualText2 = salesBookingList.getHotelDocumentText();
		  		String expectedText2 = UtilityClass.readDataFromStringExcel(54, 1, "Sheet4");
		  		Assert.assertEquals(ActualText2, expectedText2,"Test Case Failed as actual & expected messages are not matching");
		  		Reporter.log("Validating Actual Text is "+salesBookingList.getHotelDocumentText()+" and Expected text is "+UtilityClass.readDataFromStringExcel(54, 1, "Sheet4"),true);
		        
		  		String ActualText3 = salesBookingList.getPaymentInformationText();
		  		String expectedText3 = UtilityClass.readDataFromStringExcel(55, 1, "Sheet4");
		  		Assert.assertEquals(ActualText3, expectedText3,"Test Case Failed as actual & expected messages are not matching");
		  		Reporter.log("Validating Actual Text is "+salesBookingList.getPaymentInformationText()+" and Expected text is "+UtilityClass.readDataFromStringExcel(55, 1, "Sheet4"),true);
		        }
		        
	            @AfterMethod
	            public void Logout() throws InterruptedException
	            {
	            Thread.sleep(3000);
	            BookingMask.ClickOnLogoutButtonOFBookingMask();
	            Reporter.log("Clicking on Logout Button in Booking Mask page",true);
	            Thread.sleep(500);
	            BookingMask.logoutClickOFBookingMask();
	            Reporter.log("Logout from Booking Mask Page",true);
	            }
	 
	            @AfterClass 
	            public void closeBrowser()
	            {
	            	driver.close();
	            	Reporter.log("Closing Browser",true);
	            }
			}
	
	

