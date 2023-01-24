package com.resumedone.io.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.resumedone.io.pom.CreateMyCV;
import com.resumedone.io.pom.SelectYourTemplate;

public class TC_SelectYourTemplate_002 extends BaseClass{

	
	@Test
	public void test2() throws InterruptedException, IOException
	{

		CreateMyCV btn=new CreateMyCV(driver);
		
		Thread.sleep(3000);
		
		btn.clickOnCMCVButn();
		
		Thread.sleep(3000);
		
		SelectYourTemplate LbRb=new SelectYourTemplate(driver);
		
		Thread.sleep(3000);
		
		LbRb.clickOnLeftButton();
		
		Thread.sleep(1000);
		
		screenShot("Rotterdam");
		
		Thread.sleep(1000);
		
		LbRb.clickOnLeftButton();
		
		Thread.sleep(1000);
		
		screenShot("Riga");
		
		Thread.sleep(1000);
		
		LbRb.clickOnLeftButton();
		
		Thread.sleep(1000);
		
		screenShot("Prague");
		
		Thread.sleep(1000);
			
		LbRb.clickOnLeftButton();
		
		Thread.sleep(1000);
		
		screenShot("Perth");
		
		Thread.sleep(1000);
		
		LbRb.clickOnLeftButton();
		
		Thread.sleep(1000);
		
		screenShot("Sydney");
		
		Thread.sleep(1000);
		
		LbRb.clickOnLeftButton();
		
		Thread.sleep(1000);
		
		screenShot("Chicago");
		
		Thread.sleep(1000);
		
		LbRb.clickOnLeftButton();
		
		Thread.sleep(1000);
		
		screenShot("Budapest");
		
		Thread.sleep(3000);
		
		LbRb.clickOnRightButton();
		
		Thread.sleep(1000);
		
		screenShot("Chicago-R");
		
		Thread.sleep(1000);
		
		LbRb.clickOnRightButton();
		
		Thread.sleep(1000);
		
		screenShot("Sydney-R");
		
		Thread.sleep(1000);
		
		LbRb.clickOnRightButton();
		
		Thread.sleep(1000);
		
		screenShot("Perth-R");
		
		Thread.sleep(1000);
		
		LbRb.clickOnRightButton();
		
		Thread.sleep(1000);
		
		screenShot("Prague-R");
		
		Thread.sleep(1000);
		
		LbRb.clickOnRightButton();
		
		Thread.sleep(1000);
		
		screenShot("Riga-R");
		
		Thread.sleep(1000);
		
		LbRb.clickOnRightButton();
		
		Thread.sleep(1000);
		
		screenShot("Rotterdam-R");
		
		Thread.sleep(1000);
		
		LbRb.clickOnRightButton();
		
		Thread.sleep(1000);
		
		screenShot("Budapest-R");
	}
	

	
	
}
