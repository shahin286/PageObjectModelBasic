package com.w2a.base;



import org.openqa.selenium.WebDriver;

import com.w2a.pages.crm.accounts.AccountsPage;

public class TopMenu extends Page {
	
	
	WebDriver driver;
	
	public TopMenu(WebDriver driver) {
		
		this.driver=driver;
	}

	public void goToHome() {

	}

	public void goToLeads() {

	}

	public void goToContacts() {

	}

	public AccountsPage goToAccounts() {
		click("accountslink_XPATH");
		return new AccountsPage();

	}

	public void goToDeals() {

	}

	public void goToActivities() {

	}

	public void goToSignOut() {

	}

}
