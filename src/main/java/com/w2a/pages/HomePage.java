package com.w2a.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.w2a.base.Page;

public class HomePage extends Page {

	public void goToSupport() {
		click("supportlink_XPATH");
		System.out.println("Clicking on Support");
	}

	public void goToSignUp() {
		click("signuplink_CSS");
		System.out.println("Clicking on Sign Up");

	}

	public LoginPage goToLogin() {
		click("loginlink_XPATH");
		System.out.println("Clicking on Login");
		return new LoginPage();
	}

	public void goToLearnMore() {
		click("learnmorelink_XPATH");
		System.out.println("Clicking on Learn More Link");

	}

	public void validateFooterLinks() {
		WebElement block = driver.findElement(By.xpath("//div[@class='footer-sec-wrap']"));
		List<WebElement> links = block.findElements(By.tagName("a"));
		System.out.println("Total Link counts are: " + links.size());

		for (WebElement link : links) {
			System.out.println("Link Test: " + link.getText() + "Link URL: " + link.getAttribute("href"));

		}

	}
	
	public void navigateBack() {
		
		driver.navigate().back();
		System.out.println("Navigating to privious page");
	}
	

}
