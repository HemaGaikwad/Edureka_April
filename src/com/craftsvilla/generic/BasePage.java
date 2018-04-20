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
	
	protected BasePage(WebDriver driver)
	{
		this.driver = driver;
	}

	public void verifyTitle(String exp_title)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try
		{
			wait.until(ExpectedConditions.titleContains(exp_title));
			String act_title = driver.getTitle();
			Assert.assertEquals(act_title, exp_title);
		}
		catch (Exception e)
		{			
			e.printStackTrace();
			Reporter.log("Fail", true);

		}
	}
	
	public void verifyElementPresent(WebElement ele)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try
		{
			wait.until(ExpectedConditions.visibilityOf(ele));
			Reporter.log("Element present", true);
		}
		catch (Exception e)
		{			
			e.printStackTrace();
			Reporter.log("Fail", true);

		}
	}
	
	public void mouseHover(WebDriver driver , WebElement ele)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try
		{
			Actions action = new Actions(driver);
			action.moveToElement(ele).perform();
		}
		catch (Exception e)
		{			
			e.printStackTrace();
			Reporter.log("Fail", true);

		}
	}
	
	public void handleDropDown(WebElement ele)
	{
		
	}
	
	
	public void handleAlerts()
	{
		
	}
}
