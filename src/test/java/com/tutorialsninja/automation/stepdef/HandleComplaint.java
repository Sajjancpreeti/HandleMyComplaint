package com.tutorialsninja.automation.stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.HandleComplaintPage;

import cucumber.api.java.en.*;

public class HandleComplaint {
	
	WebDriverWait wait = new WebDriverWait(Base.driver,30);
	HandleComplaintPage handle = new HandleComplaintPage();
	
	@Given("^I Launch the application$")
	public void i_Launch_the_application(){
		
		Base.driver.get(Base.reader.getUrl());
		
	}

	@Then("^I Login as the Guest User$")
	public void i_Login_as_the_Guest_User() {
		
		Elements.click(HandleComplaintPage.LoginAsGuest);
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("I Login as Guest");
		
	}

	@Then("^I select the Industry as Other$")
	public void i_select_the_Industry_as_Other() {
		
		Elements.click(HandleComplaintPage.OtherOption);
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Other");
		
	}

	@Then("^I fill the field SERVICE/PRODUCT/ITEM WITH ISSUE$")
	public void i_fill_the_field_SERVICE_PRODUCT_ITEM_WITH_ISSUE(){
		
		Elements.TypeText(HandleComplaintPage.ServiceProdItem, "Refirigerator");
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("SERVICE/PRODUCT/ITEM WITH ISSUE");
		
	}

	@Then("^I fill the field DESCRIBE THE ISSUE$")
	public void i_fill_the_field_DESCRIBE_THE_ISSUE(){
		
		Elements.TypeText(HandleComplaintPage.DescribeIssue, "Freezer is failing to stay clod enough");
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("DESCRIBE THE ISSUE");
		
	}

	@Then("^I fill the field PROVIDE ALL THE DETAILS OF YOUR COMPLAINT$")
	public void i_fill_the_field_PROVIDE_ALL_THE_DETAILS_OF_YOUR_COMPLAINT(){
		
		Elements.TypeText(HandleComplaintPage.DetailedIssue, "I purchased the Fridge in the last year and now it is not working");
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("PROVIDE ALL THE DETAILS OF YOUR COMPLAINT");
		
	}

	@Then("^I click on Next I am done choosingOne$")
	public void i_click_on_Next_I_am_done_choosingOne() throws InterruptedException{
		
		Thread.sleep(3000);
		Elements.click(HandleComplaintPage.ChoosinOne);
		Thread.sleep(6000);
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Next, I am done choosing");
		
		
	}

	@Then("^I Select the emotion as Very Frustrated$")
	public void i_Select_the_emotion_as_Very_Frustrated(){
		
		Elements.click(HandleComplaintPage.Emotion);
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Very Frustrated");
		
	}

	@Then("^I click on Next I am done choosingTwo$")
	public void i_click_on_Next_I_am_done_choosingTwo(){
		
		Elements.click(HandleComplaintPage.ChoosingTwo);
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Next, I am done choosingTwo");
		
	}

	@Then("^I fill the Address Line$")
	public void i_fill_the_Address_Line(){
		
		Elements.TypeText(HandleComplaintPage.Address, "67 View St");
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("ADDRESS LINE");
		
	}

	@Then("^I fill the Town/City$")
	public void i_fill_the_Town_City(){
		
		Elements.TypeText(HandleComplaintPage.Town, "Woollahra");
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Town");
		
	}

	@Then("^I Select the State$")
	public void i_Select_the_State(){
		
		Select drpCountry = new Select(Base.driver.findElement(By.name("state")));
		drpCountry.selectByVisibleText("NSW");
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("State");
		
	}

	@Then("^I fill the POSTCODE$")
	public void i_fill_the_POSTCODE(){
		
		Elements.TypeText(HandleComplaintPage.Postcode, "2025");
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Postcode");
		
	}

	@Then("^I Click on Next$")
	public void i_Click_on_Next() throws InterruptedException{
		
		Select drpCountry1 = new Select(Base.driver.findElement(By.name("country")));
		drpCountry1.selectByVisibleText("Australia");
		Base.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		System.out.println("Select value Australia");
				 
		wait.until(ExpectedConditions.elementToBeClickable(Base.driver.findElement(By.xpath("//div[@class='text-center mar-top-35 mar-bot-25']")))).click();
		System.out.println("Wait Explicitly");
		
		wait.until(ExpectedConditions.elementToBeClickable(Base.driver.findElement(By.xpath("//button[normalize-space()='Next']")))).click();
		
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Click on Next");
		
	}

	@Then("^I fill the filed Organisation Name$")
	public void i_fill_the_filed_Organisation_Name(){
		
		Elements.TypeText(HandleComplaintPage.OrgName, "ABC Fridge");
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Enter Organization Name");
		
	}

	@Then("^I fill the field Organisation Email$")
	public void i_fill_the_field_Organisation_Email() {
		
		Elements.TypeText(HandleComplaintPage.OrgEmail, "fridges@google.com");
		Base.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		System.out.println("Enter Organization Email");
	}

	@Then("^I click on Next I am done choosingThree$")
	public void i_click_on_Next_I_am_done_choosingThree(){
		
		Elements.click(HandleComplaintPage.ChoosinThree);
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Click on I am Done");
	}

	@Then("^I select Other option in WHATS THE EFFECT OF THE ISSUE$")
	public void i_select_Other_option_in_WHATS_THE_EFFECT_OF_THE_ISSUE(){
		
		Select drpCountry2 = new Select(Base.driver.findElement(By.id("impact-field")));
		drpCountry2.selectByVisibleText("Other");
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("WHATS THE EFFECT OF THE ISSUE");
		
	}

	@Then("^I fill the Please SpecifyOne$")
	public void i_fill_the_Please_SpecifyOne(){
		
		Elements.TypeText(HandleComplaintPage.SpecifyOne, "Lost Ice Cream");
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Plase SpecifyOne");
		
	}

	@Then("^I select Other option in RESOLUTION I MOST WANT$")
	public void i_select_Other_option_in_RESOLUTION_I_MOST_WANT(){
		
		Select drpCountry3 = new Select(Base.driver.findElement(By.name("outcome1")));
		drpCountry3.selectByVisibleText("Other");
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("RESOLUTION I MOST WANT");
		
	}

	@Then("^I fill the Please SpecifyTwo$")
	public void i_fill_the_Please_SpecifyTwo(){
		
		Elements.TypeText(HandleComplaintPage.SpecifyTwo, "Replacement Ice Cream");
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Plase SpecifyTwo");
		
	}

	@Then("^i Click on Next I am done choosingFour$")
	public void i_Click_on_Next_I_am_done_choosingFour() {
		
		Elements.click(HandleComplaintPage.ChoosingFour);
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Next I am done choosingFour");
		
	}

	@Then("^I choose the Mrs optin in Title$")
	public void i_choose_the_Mrs_optin_in_Title(){
		
		Select drpCountry4 = new Select(Base.driver.findElement(By.xpath("//select[@id='contact-title']")));
		drpCountry4.selectByVisibleText("Mrs");
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Select value Mrs");
		
	}

	@Then("^I specify First Name$")
	public void i_specify_First_Name(){
				
		Elements.TypeText(HandleComplaintPage.FirstName, "Mumma");
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Enter value xyz");
		
	}

	@Then("^I specify Last Name$")
	public void i_specify_Last_Name(){
		
		Elements.TypeText(HandleComplaintPage.LastName, "Chook");
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Enter the lastname");
		
	}

	@Then("^I specify Email$")
	public void i_specify_Email(){
		
		Elements.TypeText(HandleComplaintPage.EmailID, "cocome@google.com");
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Enter the email");
		
	}

	@Then("^I Click on  I am done Submit my complaint$")
	public void i_Click_on_I_am_done_Submit_my_complaint() throws InterruptedException{
		
		wait.until(ExpectedConditions.elementToBeClickable(Base.driver.findElement(By.xpath("//div[@class='container pagenav-container']")))).click();
		System.out.println("Wait Explicitly");
		
		Thread.sleep(5000);
		Elements.click(HandleComplaintPage.SubmitButton);
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Click on I'm done");
		
		Thread.sleep(5000);
	}
	
	
}
