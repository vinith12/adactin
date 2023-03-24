package org.adctin;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Adactin extends BaseClass {
	
	LoginPage lo;
	Registerpage re;
	 
	 
	 
	 @Given("The user should be in fb page")
	 public void the_user_should_be_in_fb_page() {
	   	     
	}
	
	@When("The user should enter the {string} and {string}")
	public void the_user_should_enter_the_and(String usr, String pse) {
		 lo = new LoginPage();		
		sendkeys(lo.getUsername(), usr);
		sendkeys(lo.getPassword(), pse);
//		WebElement unm = driver.findElement(By.id("email"));
//		unm.sendKeys(usr);
//		WebElement pss = driver.findElement(By.id("pass"));
//	    pss.sendKeys(pse);	
      
	}

	@When("The user should click the login button")
	public void the_user_should_click_the_login_button() throws InterruptedException {
	    clik(lo.getButton());
//		driver.findElement(By.name("login")).click();
	    System.out.println("Am coming");
	    waitt();
	}
	@Then("The user in invalid page")
	public void the_user_in_invalid_page() {
		
	}
	

	@Given("The user should click the register button")
	public void the_user_should_click_the_register_button() {
		 re = new Registerpage();
		clik(re.getCreatebtn());
	}

	@When("The user should enter the frstnam and lstnam")
	public void the_user_should_enter_the_frstnam_and_lstnam() {
		System.out.println("Am gocoming");
		sendkeys(re.getFname(), "dfghj");
		sendkeys(re.getLname(), "iiskhskl");
	}

	@When("The user should click the signup button")
	public void the_user_should_click_the_signup_button() {
	    clik(re.getSignup());
	}

	@Then("The user in valid page")
	public void the_user_in_valid_page() {
		
	}
	

}
