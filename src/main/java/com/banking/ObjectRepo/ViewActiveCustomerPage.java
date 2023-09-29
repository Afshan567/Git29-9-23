package com.banking.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewActiveCustomerPage {

	@FindBy(xpath="//tbody/tr/td[4]")
	private WebElement accnoCheck;
	public ViewActiveCustomerPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public WebElement getAccnoCheck() {
		return accnoCheck;
	}
	
}
