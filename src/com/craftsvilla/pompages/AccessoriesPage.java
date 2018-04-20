package com.craftsvilla.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.generic.BasePage;

public class AccessoriesPage extends BasePage
{
	@FindBy(linkText ="Kundan Jewellery")
	private WebElement kundan;
	
	@FindBy(linkText = "Watches")
	private WebElement watches;

	public AccessoriesPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void gotoKundanJewellery()
	{
		verifyElementPresent(kundan);
		kundan.click();
	}
}
