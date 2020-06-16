package Pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.Autoconstant;
import generics.ExcelLibrary;

public class ActitimeLogin implements Autoconstant
{
	public WebDriver driver;
	@FindBy(xpath="//input[@name='username']")
	private WebElement usernametextField;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement passwordTextField;
	
	@FindBy(xpath="//input[@id='keepLoggedInCheckBox']")
	private WebElement keepmeLoggedinCheckBox;
	
	@FindBy(xpath="//a[@id='loginButton']")
	private WebElement loginButton;
	
	public ActitimeLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void loginActitime() throws IOException
	{
		usernametextField.sendKeys(ExcelLibrary.getcellvalue(excelpath, sheetname, 1,0));
		passwordTextField.sendKeys(ExcelLibrary.getcellvalue(excelpath, sheetname, 1, 1));
		keepmeLoggedinCheckBox.click();
		loginButton.click();
	}

}
