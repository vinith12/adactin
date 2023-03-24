package org.adctin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registerpage extends BaseClass {

	public Registerpage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//a[@role=\"button\"])[2]")
	private WebElement Createbtn;
	
	@FindBy(name= "firstname")
	private WebElement fname;
	
	@FindBy(name= "lastname")
	private WebElement lname;
	
	@FindBy(name= "websubmit")
	private WebElement signup;

	public WebElement getCreatebtn() {
		return Createbtn;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getSignup() {
		return signup;
	}


	
}
