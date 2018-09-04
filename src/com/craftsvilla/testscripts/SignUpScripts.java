package com.craftsvilla.testscripts;

//This class contains test scripts pertaining to sign up module
import org.testng.annotations.Test;

import com.craftsvilla.generic.BaseTest;
import com.craftsvilla.generic.ReadExcel;
import com.craftsvilla.pompage.HomePage;
import com.craftsvilla.pompage.SignInPage;



public class SignUpScripts extends BaseTest
{
	public HomePage hp = null;
	public SignInPage sp = null;
	
	@Test
	public void TC_02_RegisterUser() throws Exception
	{
		hp = new HomePage(driver);
		sp = new SignInPage(driver);
		
		String[][] credentials = ReadExcel.getData(filepath, "User_SignUp");
		
		
		for(int i =1; i<credentials.length; i++)
		{
			String email = credentials[i][0];
			String password = credentials[i][1];
			
			hp.clickSignIn();
			sp.setEmail(email);
			sp.clickContinue();
			sp.setPassword(password);
			sp.clickOnRegister();
			hp.gotoAccount();
			hp.clickOnLogout();
			sp.waitForHomePage("Ethnic Wear - Buy Ethnic Wear in Latest Designs Online at Craftsvilla");
			
		}
		
		
	}

}
