package com.w2a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.w2a.base.Page;
import com.w2a.pages.crm.CRMHomePage;

public class ZohoAppPages extends Page {


	public void goToCliq() {

		WebElement cliqLink = driver.findElement(By.xpath("//div[contains(text(),'Cliq')]"));
		Actions action = new Actions(driver);
		action.moveToElement(cliqLink).perform();
		System.out.println("Curser moved to cliq element");
		click("cliqlink_XPATH");
		System.out.println("Clicking on Cliq Link");

	}

	public CRMHomePage goToCRM() {
		WebElement crmLink = driver.findElement(By.xpath("//div[contains(text(),'CRM')]"));
		Actions action = new Actions(driver);
		action.moveToElement(crmLink).perform();
		System.out.println("Curser moved to CRM Element");
		click("crmlink_XPATH");
		System.out.println("Clicking on CRM Link");
		return new CRMHomePage();
	}

	public void goToInvoice() {
		click("invoicelink_XPATH");
		System.out.println("Clicking on Invice Element");

	}

}
