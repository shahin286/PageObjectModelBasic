package com.w2a.testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import com.w2a.base.TopMenu;
import com.w2a.pages.ZohoAppPages;
import com.w2a.pages.crm.CRMHomePage;
import com.w2a.pages.crm.accounts.AccountsPage;
import com.w2a.pages.crm.accounts.CreateAccountPage;
import com.w2a.utilities.Utilities;

public class CreateAccountTest {

	@Test(dataProviderClass = Utilities.class, dataProvider = "dp")
	public void createAccountTest(Hashtable<String, String> data) {

		ZohoAppPages zP = new ZohoAppPages();
		
		// GOING TO CRM PAGE
		CRMHomePage cP = zP.goToCRM();
		// VERIFYING THE CRM HOME TEXT
		TopMenu tM = cP.verifyTextCRMHome();
		// FROM TOPMENU CLICKING ON ACCOUNTS
		AccountsPage accPage = tM.goToAccounts();
		// FROM ACCOUNT PAGE CLICKING ON CREATE NEW ACCOUNT
		CreateAccountPage createAccPage = accPage.goToCreateAccounts();
		// CREATING A NEW ACCOUNT
		createAccPage.createAccount(data.get("accountname"));

	}
}
