package com.w2a.pages.crm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.w2a.base.Page;
import com.w2a.base.TopMenu;

public class CRMHomePage extends Page {
	
	public TopMenu verifyTextCRMHome() {
		
		WebElement crmHomeText = driver.findElement(By.xpath("//span[@id='show-uName']"));
		System.out.println("the text is: "+ crmHomeText.getText());
		return new TopMenu(driver);
		
	}

}
