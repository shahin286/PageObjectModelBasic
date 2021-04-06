package com.w2a.pages.crm.accounts;

import com.w2a.base.Page;

public class AccountsPage extends Page {

	public CreateAccountPage goToCreateAccounts() {
		click("createaccount_XPATH");
		return new CreateAccountPage();
	}

	public void goToImportAccounts() {

	}

}
