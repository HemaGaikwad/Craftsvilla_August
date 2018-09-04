package com.craftsvilla.pompage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.generic.BasePage;

public class SareesPage extends BasePage
{
	
	public SareesPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(linkText = "Embroidered Sarees")
	private WebElement embroideredSarees;
	
	@FindBy(linkText="Georgette Sarees")
	private WebElement georgetteSarees;
	
	@FindBy(xpath = "//a[text()='Party Wear']")
	private WebElement partyWearSarees;
	
	
	public void clickOnEmbroideredSarees()
	{
		verifyElementPresent(embroideredSarees);
		embroideredSarees.click();
	}
	
	public void clickOnGeorgetteSarees()
	{
		verifyElementPresent(georgetteSarees);
		georgetteSarees.click();
	}
	
	public void clickOnPartySarees()
	{
		verifyElementPresent(partyWearSarees);
		partyWearSarees.click();
		
	}

}
