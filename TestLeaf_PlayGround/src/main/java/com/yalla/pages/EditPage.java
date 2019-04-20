package com.yalla.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EditPage extends Annotations{
	public EditPage() {

	}
	@FindBy(how=How.ID, using="email") WebElement editMailId;
	@FindBy(how=How.XPATH, using="//input[@value=\"Append \"]") WebElement appendText;
	@FindBy(how=How.XPATH, using="//input[contains(@value,\"Clear\")]") WebElement clearText;
	@FindBy(how=How.XPATH, using="//label[contains(text(),\"Confirm that edit field is disabled\")]//following::input") WebElement disabledTextBox;
	
	public EditPage EnterMailID() {
		
		return this;
		
	}
	
	
	

}
