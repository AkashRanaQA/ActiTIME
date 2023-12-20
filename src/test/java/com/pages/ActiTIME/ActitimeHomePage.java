package com.pages.ActiTIME;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.generics.ActiTIME.BasePage;

public class ActitimeHomePage extends BasePage
{
	public WebDriver driver;
	 
	@FindBy(id = "logoutLink")
	private WebElement logountLink;
	
	public ActitimeHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void logoutMethod() throws InterruptedException
	{
		javascriptHighlightElement(driver, logountLink);
		javascriptClick(driver, logountLink);
	}
}