package com.craftsvilla.pompage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.generic.BasePage;

public class HomePage extends BasePage
{
	
	//Declaration 
	@FindBy(xpath= "//span[text()='Sign In']")
	private WebElement SignIn;

	@FindBy(xpath = "//a[@href='/womens-clothing/sarees/?MID=megamenu_sarees_seeall")
	private WebElement sarees;
	
	@FindBy(xpath = "//a[@href='/jewellery/necklaces/?MID=megamenu_jewellery_seeall")
	private WebElement jewellery;
	
	@FindBy(xpath ="//a[@href='/mens-fashion/?MID=megamenu_menswear_seeall']")
	private WebElement mensFashion;
	
	@FindBy(xpath ="//i[@class='icon first_arrow hidden-xs']")
	private WebElement account;
	
	@FindBy(xpath = "//a[@href='https://cvaccount.craftsvilla.com/customer/account/logout']")
	private WebElement logotBtn;
	
	//initialization
	public HomePage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public void clickSignIn()
	{
		verifyElementPresent(SignIn);
		SignIn.click();
	}
	
	public void gotoSarees()
	{
		verifyElementPresent(sarees);
		mouseHover(driver,sarees);
	}
	
	public void gotoMensFashion()
	{
		verifyElementPresent(mensFashion);
		mouseHover(driver, mensFashion);
	}
	
	
	public void gotoJewellery()
	{
		verifyElementPresent(jewellery);
		mouseHover(driver, jewellery);
	}
	
	public void gotoAccount()
	{
		verifyElementPresent(account);
		mouseHover(driver, account);
	}
	
	public void clickOnLogout()
	{
		verifyElementPresent(logotBtn);
		logotBtn.click();
	}
	
	
	
	
}
