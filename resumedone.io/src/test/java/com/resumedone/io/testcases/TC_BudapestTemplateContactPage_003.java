package com.resumedone.io.testcases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.resumedone.io.pom.BudapestTemplateContactPage;
import com.resumedone.io.pom.CreateMyCV;
import com.resumedone.io.utilities.DataDrivenClass;

public class TC_BudapestTemplateContactPage_003 extends BaseClass{

	
	@Test
	public void test3() throws InterruptedException, IOException
	{
		CreateMyCV btn=new CreateMyCV(driver);
		
		Thread.sleep(3000);
		
		btn.clickOnCMCVButn();
		
		Thread.sleep(3000);
		
		String SURL=driver.getCurrentUrl();
		
		System.out.println(SURL);
		
		BudapestTemplateContactPage contact=new BudapestTemplateContactPage(driver);
		
		Thread.sleep(1000);
		
		contact.clickOnSelectBtn();
		
		Thread.sleep(10000);
		
		screenShot("BudapestTemplateContactPage");
		
		Thread.sleep(3000);
		
		String CURL=driver.getCurrentUrl();
		
		System.out.println(CURL);
		
		Thread.sleep(1000);
		
		SoftAssert s=new SoftAssert();
		
		s.assertNotEquals(CURL, SURL);
		
		s.assertAll();
		
		Thread.sleep(3000);
		
	    DataDrivenClass data=new DataDrivenClass();
	     
	    contact.sendFname(data.excel(1, 0));
	    
	    Thread.sleep(3000);
		
		contact.sendLname(data.excel(1, 1));
		
		Thread.sleep(3000);
		
        contact.sendAddress(data.excel(1, 2));
		
        Thread.sleep(3000);
        
        contact.sendCity(data.excel(1, 3));
        
        Thread.sleep(3000);
		
		contact.sendPostalCode(data.excel(1, 4));
		
		Thread.sleep(3000);
		
		contact.sendPhone(data.excel(1, 5));
		
		Thread.sleep(3000);
		
		contact.sendEmail(data.excel(1, 6));
		
		Thread.sleep(3000);
		
		screenShot("ContactInformationset-1");
		
		Thread.sleep(3000);
		
		
	}
}
