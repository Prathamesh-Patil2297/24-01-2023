package com.resumedone.io.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectYourTemplate {
	
	WebDriver d1;
	
	@FindBy(xpath="(//button[@class='Button-e62odf-0 eNmQca SliderControlButton-sc-1l8k7uf-4 djfVJM'])[1]")
	private WebElement LeftButton;

	@FindBy(xpath="(//button[@class='Button-e62odf-0 eNmQca SliderControlButton-sc-1l8k7uf-4 djfVJM'])[2]")
	private WebElement RightButton;
	
	public void clickOnLeftButton()
	{
		LeftButton.click();
	}
	
	public void clickOnRightButton()
	{
		RightButton.click();
	}
	
	
	public SelectYourTemplate(WebDriver d2)
	{
		d1=d2;
		
		PageFactory.initElements(d2, this);
	}
	
	
	

}
