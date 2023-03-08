package com.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import com.baseclass.BaseClass;
import com.pom.PomPage01;
import com.pom.PomPage02;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {

	PomPage01 p01 = new PomPage01(driver);
    PomPage02 p02 = new PomPage02(driver);
    
	@Given("User launch the url")
	public void user_launch_the_url() {
		getUrl("https://shop.demoqa.com/");
	}

	@When("User search the product and click")
	public void user_search_the_product_and_click() {
		p01.getproduct().click();
	}

	@When("User click the color and select balck colour")
	public void user_click_the_color_and_select_balck_colour() {
		selection(p01.getColor(), "byvalue", "Black");
	}

	@When("User click the size and select M size")
	public void user_click_the_size_and_select_m_size() {
		selection(p01.getSize(), "byvalue", "L");
	}

	@When("User click the add to cart")
	public void user_click_the_add_to_cart() {
		p01.getAddToCart().click();
	}

	@When("User click the cart bag")
	public void user_click_the_cart_bag() {
		p01.getBag().click();
	}

	@When("User click the proceed to cart")
	public void user_click_the_proceed_to_cart() {
		p01.getProceedToCart().click();
	}

	@Then("See page shown")
	public void see_page_shown() {
		System.out.println("shopTools");
	}
	
	@When("User click the First Name and send {string}")
	public void user_click_the_first_name_and_send(String string) {
		 p02.getFirstName().sendKeys(string); 
	}

	@When("User click the Last Name and send {string}")
	public void user_click_the_last_name_and_send(String string) {
		 p02.getLastName().sendKeys(string);
	}

	@When("User click the country and select the country")
	public void user_click_the_country_and_select_the_country() {
	   selection(p02.getCountry(),"byvalue", "IN");
	}

	@When("User click the Street address and send address")
	public void user_click_the_street_address_and_send_address() {
	   p02.getAddress1().sendKeys("Public Office road");
	}

	@When("User click the street address second and send address")
	public void user_click_the_street_address_second_and_send_address() {
	    p02.getAddress2().sendKeys("Thanjavur");
	}

	@When("User click the town and send the name of the town")
	public void user_click_the_town_and_send_the_name_of_the_town() {
	  p02.getCity().sendKeys("Thanjavur");
	}

	@When("User click the state and select the state")
	public void user_click_the_state_and_select_the_state() {
	   selection(p02.getState(), "byvalue", "TN");
	}

	@When("User click the Pincode and send the Pincode")
	public void user_click_the_pincode_and_send_the_pincode() {
	   p02.getPost().sendKeys("600009");
	}

	@When("User click the Phone and send the phone number")
	public void user_click_the_phone_and_send_the_phone_number() {
	    p02.getPhone().sendKeys("9999999963");
	}

	@When("User click the email and send the email")
	public void user_click_the_email_and_send_the_email() throws InterruptedException {
	   p02.getEmail().sendKeys("mesuganyatamizh@gmail.com");
	   
	}

	@When("User click the check box")
	public void user_click_the_check_box() throws InterruptedException {
	    Thread.sleep(2000);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", p02.getCheckBox());
	}

	@When("User click the place order")
	public void user_click_the_place_order() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", p02.getOrderDetails());
	}

	@When("User click the order details")
	public void user_click_the_order_details() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0],scrollIntoView", p02.getOrderDetails());
		ScreenShot("shoptools");
        driver.quit();
	}

}
