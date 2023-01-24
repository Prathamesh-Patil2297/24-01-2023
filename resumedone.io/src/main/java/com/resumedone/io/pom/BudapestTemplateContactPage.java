package com.resumedone.io.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BudapestTemplateContactPage {

	WebDriver d1;
	
	@FindBy(xpath="(//button[text()='Select'])[8]")
	private WebElement SelectBtn;

	@FindBy(xpath="//input[@label='First name']")
	private WebElement Fname;
	
	@FindBy(xpath="//input[@label='Last name']")
	private WebElement Lname;
	
	@FindBy(xpath="//input[@placeholder='Enter a Location']")
	private WebElement Address;
	
	@FindBy(xpath="//input[@label='City']")
	private WebElement City;
	
	@FindBy(xpath="//input[@name='postalCode']")
	private WebElement PostalCode;
	
	@FindBy(xpath="//input[@label='Phone']")
	private WebElement Phone;
	
	@FindBy(xpath="//input[@label='Email']")
	private WebElement Email;
	
	
	public void clickOnSelectBtn()
	{
		SelectBtn.click();
	}
	
	public void sendFname(String fname)
	{
		Fname.sendKeys(fname);
	}
	
	public void sendLname(String lname)
	{
		Lname.sendKeys(lname);
	}
	
	public void sendAddress(String address)
	{
		Address.sendKeys(address);
	}
	
	public void sendCity(String city)
	{
		City.sendKeys(city);
	}
	
	public void sendPostalCode(String postalcode)
	{
		PostalCode.sendKeys(String.valueOf(postalcode));
	}
	
	public void sendPhone(String phone)
	{
		Phone.sendKeys(String.valueOf(phone));
	}
	
	public void sendEmail(String email)
	{
		Email.sendKeys(email);
	}
	
	public BudapestTemplateContactPage(WebDriver d2)
	{
		d1=d2;
		
		PageFactory.initElements(d2, this);
	}
	
}
