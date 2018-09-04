package com.craftsvilla.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage 
{
	public WebDriver driver = null;
	
	public BasePage(WebDriver driver)
	{
		this.driver = driver;
	}

	public void verifyTitle(String exp_title)
	{
		WebDriverWait w = new WebDriverWait(driver, 10);
		try
		{
			w.until(ExpectedConditions.titleContains(exp_title));
			String act_title = driver.getTitle();
			Assert.assertEquals(act_title,exp_title);
			
		}
		catch(Exception e)
		{
			Reporter.log("Title mismatch");
		}
		
	}
	
	public void verifyElementPresent(WebElement ele)
	{
		WebDriverWait w = new WebDriverWait(driver, 10);
		try
		{
			w.until(ExpectedConditions.visibilityOf(ele));
			Reporter.log("Element present "+ele);
			
			
		}
		catch(Exception e)
		{
			Reporter.log("Unable to locate "+ele);
		}
	}
	
	public  void mouseHover(WebDriver driver,WebElement ele)
	{
		try
		{
			Actions a = new Actions(driver);
			a.moveToElement(ele).perform();
			Reporter.log("");
			
		}
		catch(Exception e)
		{
			Reporter.log("Unable to mousehover on the element "+ele);
		}
	}
	
	
	public void handleDropDown(WebElement ele)
	{
		
		
	}
	
	public void handleAlerts()
	{
		
		
	}
	
	
}
