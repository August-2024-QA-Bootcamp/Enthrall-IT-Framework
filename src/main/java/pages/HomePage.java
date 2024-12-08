package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import constants.Attribute;
import static common.CommonActions.*;
import static common.CommonWaits.*;

import java.time.Duration;

public class HomePage {	
	/*
	 Create Constructor
	 Create Web Element	 
	 Create method to test
	 */
	WebDriver driver;
	WebDriverWait wait;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}

	@FindBy()
	WebElement logo;
	
	@FindBy()
	WebElement loginButton;

	@FindBy()
	WebElement email;
		
	@FindBy()
	WebElement password;
	
	/*
	 1) is the logo displayed?
	 2) What is the title?
	 3) Header validation for rest: All the button like Home, courses, Mentors, Alumni, About Us, Login
	 enroll Now button, phone number, Id. You have to find out the web element and click them to see
	 if they are redirecting to the page. 
	 4) When they redirect, please validate title, current url and header if present.
	 5) Validate Footer for Home, courses, Mentors, Alumni, About Us, Login, enroll Now button
	 6) Scroll down and go to Contact Us. Create method for "fill out the form and submit, validate the success or error message" and test
	 */
	
	

}