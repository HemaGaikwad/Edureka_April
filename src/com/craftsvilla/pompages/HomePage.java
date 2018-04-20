package com.craftsvilla.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.generic.BasePage;

public class HomePage extends BasePage
{
	@FindBy(xpath = "//a[text()='CRAFTSVILLA BRANDS']")
	private WebElement craftsvillaBrands;
	
	@FindBy(linkText = "KURTIS & MORE ")
	private WebElement kurtisAndMore;
	
	@FindBy(xpath = "//a[@href='/accessories/?MID=megamenu_accessories_seeall']")
	private WebElement accessories;

	public HomePage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void goToAccessories()
	{
		mouseHover(driver, accessories);		
	}
}
