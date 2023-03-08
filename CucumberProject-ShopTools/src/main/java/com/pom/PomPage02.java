package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomPage02 {

	public static WebDriver driver;

	@FindBy(xpath = "//input[@name='billing_first_name']")
	private WebElement firstName;

	@FindBy(xpath = "//input[@name='billing_last_name']")
	private WebElement lastName;

	@FindBy(xpath = "//select[@id='billing_country']")
	private WebElement country;

	@FindBy(xpath = "//input[@name='billing_address_1']")
	private WebElement address1;

	@FindBy(xpath = "//input[@name='billing_address_2']")
	private WebElement address2;

	@FindBy(xpath = "//input[@name='billing_city']")
	private WebElement city;

	@FindBy(xpath = "//select[@id='billing_state']")
	private WebElement state;

	@FindBy(xpath = "//input[@name='billing_postcode']")
	private WebElement post;

	@FindBy(xpath = "//input[@type='tel']")
	private WebElement phone;

	@FindBy(xpath = "//input[@type='email']")
	private WebElement email;

	@FindBy(xpath = "(//input[@type='checkbox'])[3]")
	private WebElement checkBox;

	@FindBy(xpath = "//button[@class='button alt wp-element-button']")
	private WebElement placeOrder;

	@FindBy(xpath = "//h2[text()='Order details']")
	private WebElement orderDetails;

	public PomPage02(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getAddress1() {
		return address1;
	}

	public WebElement getAddress2() {
		return address2;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getPost() {
		return post;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getPlaceOrder() {
		return placeOrder;
	}

	public WebElement getOrderDetails() {
		return orderDetails;
	}
}
