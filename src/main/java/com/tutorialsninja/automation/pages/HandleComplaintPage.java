package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class HandleComplaintPage {
	
public HandleComplaintPage() {
		
		PageFactory.initElements(Base.driver, this);
		
	}

	@FindBy(xpath = "//a[normalize-space()='Use as our guest']")
	public static WebElement LoginAsGuest;
	
	@FindBy(xpath = "//p[normalize-space()='Other']")
	public static WebElement OtherOption;
	
	@FindBy(xpath = "//input[@id='issue_description']")
	public static WebElement DescribeIssue;
	
	@FindBy(xpath = "//textarea[@id='more-details-field']")
	public static WebElement DetailedIssue;
	
	@FindBy(xpath = "//input[@id='item_name']")
	public static WebElement ServiceProdItem;
	
	@FindBy(xpath = "//div[@class='container pagenav-container']")
	public static WebElement ChoosinOne;
	
	@FindBy(xpath = "//label[normalize-space()='Very frustrated']")
	public static WebElement Emotion;
	
	@FindBy(xpath = "//button[normalize-space()=\"Next, I'm done choosing\"]")
	public static WebElement ChoosingTwo;
	
	@FindBy (xpath = "//input[@id='address1']")
	public static WebElement Address;
	
	@FindBy (xpath = "//input[@id='city']")
	public static WebElement Town;

	@FindBy (xpath = "//input[@id='postcode']")
	public static WebElement Postcode;
	
	@FindBy(xpath = "//input[@placeholder='Enter Organisation Name']")
	public static WebElement OrgName;
	
	@FindBy (xpath = "//input[@placeholder='Enter Organisation Email']")
	public static WebElement OrgEmail;
	
	@FindBy (xpath = "//button[normalize-space()=\"Next, I'm done choosing\"]")
	public static WebElement ChoosinThree;
	
	@FindBy(xpath = "//input[@name='other-impact']")
	public static WebElement SpecifyOne;
	
	@FindBy(xpath = "//input[@id='other-outcome1']")
	public static WebElement SpecifyTwo;
	
	@FindBy(xpath = "//button[normalize-space()=\"Next, I'm done choosing\"]")
	public static WebElement ChoosingFour;
	
	@FindBy(name = "firstname")
	public static WebElement FirstName;
	
	@FindBy(name = "lastname")
	public static WebElement LastName;
	
	@FindBy(name = "email")
	public static WebElement EmailID;
	
	@FindBy(xpath = "//button[normalize-space()=\"I'm done, submit the complaint\"]")
	public static WebElement SubmitButton;
}
