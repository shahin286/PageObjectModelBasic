package com.w2a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.w2a.base.Page;

public class LoginPage extends Page {

	public ZohoAppPages doLogin(String username, String password) {
		type("email_XPATH", username);
		System.out.println("Entering the User Name");
		
		click("nextbutton_XPATH");
		System.out.println("Clicking on next button");
		
		type("password_XPATH", password);
		System.out.println("Entering the Password");
		
		click("signinbutton_XPATH");
		System.out.println("Clicking on Sign In button");
		
		return new ZohoAppPages();
	}

	public void successfulLoginVerification() {

		// driver.findElement(By.xpath("//a[normalize-space()='All apps']"));
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='All apps']")));
		System.out.println("Successfully log in");
	}
}
