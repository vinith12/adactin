package org.adctin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="email")
	private WebElement username;
	  
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement button;

	
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getButton() {
		return button;
		
	}
	
	

}
