package com.pages.ActiTIME;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.generics.ActiTIME.AutoConstant;
import com.generics.ActiTIME.BasePage;
import com.generics.ActiTIME.ExcelLibrary;
import com.generics.ActiTIME.AutoConstant;
import com.generics.ActiTIME.BasePage;
import com.generics.ActiTIME.ExcelLibrary;

public class ActitimeLoginPage extends BasePage implements AutoConstant
{
	public WebDriver driver;
	
	@FindBy(id = "username")
	private WebElement usernameTextfield;
	
	@FindBy(name = "pwd")
	private WebElement passwordTextfield;
	
	@FindBy(id = "keepLoggedInCheckBox")
	private WebElement keepmeloggedinCheckbox;
	
	@FindBy(id = "loginButton")
	private WebElement loginButton;
	
	public ActitimeLoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void loginMethod() throws InterruptedException, IOException
	{
		javascriptHighlightElement(driver, usernameTextfield);
		usernameTextfield.sendKeys(ExcelLibrary.getStringTypeCellData(sheet_login, 1, 0));
		ExcelLibrary.getCellAddress(sheet_login, 1, 0);
		
		javascriptHighlightElement(driver, passwordTextfield);
		passwordTextfield.sendKeys(ExcelLibrary.getStringTypeCellData(sheet_login, 1, 1));
		ExcelLibrary.getCellAddress(sheet_login, 1, 1);
		
		javascriptHighlightElement(driver, keepmeloggedinCheckbox);
		javascriptClick(driver, keepmeloggedinCheckbox);
		
		javascriptHighlightElement(driver, loginButton);
		javascriptClick(driver, loginButton);
	}
}