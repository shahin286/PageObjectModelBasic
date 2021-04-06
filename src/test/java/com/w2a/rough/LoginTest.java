package com.w2a.rough;

import com.w2a.base.TopMenu;
import com.w2a.pages.HomePage;
import com.w2a.pages.LoginPage;
import com.w2a.pages.ZohoAppPages;
import com.w2a.pages.crm.CRMHomePage;
import com.w2a.pages.crm.accounts.AccountsPage;
import com.w2a.pages.crm.accounts.CreateAccountPage;

public class LoginTest {

	public static void main(String[] args) {
		
		HomePage home = new HomePage();
		//DOING LOGIN
		LoginPage lP = home.goToLogin();
		ZohoAppPages zP = lP.doLogin("mshahinqa@gmail.com", "Shahin@10!");
		lP.successfulLoginVerification();
		//GOING TO CRM PAGE
		CRMHomePage cP = zP.goToCRM();
		//VERIFYING THE CRM HOME TEXT
		TopMenu tM = cP.verifyTextCRMHome();
		//FROM TOPMENU CLICKING ON ACCOUNTS
		AccountsPage accPage = tM.goToAccounts();
		//FROM ACCOUNT PAGE CLICKING ON CREATE NEW ACCOUNT
		CreateAccountPage createAccPage = accPage.goToCreateAccounts();
		//CREATING A NEW ACCOUNT
		createAccPage.createAccount("Mohammed Shahin Ahmed");
		
		
		//Page page = new Page();
		//page.tearDown();

	}

}
