package com.yalla.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

public class EditPage extends Annotations{
	public EditPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.ID, using="email") WebElement editMailId;
	@FindBy(how=How.XPATH, using="//input[@value=\"Append \"]") WebElement appendText;
	@FindBy(how=How.XPATH, using="//input[contains(@value,\"Clear\")]") WebElement clearText;
	@FindBy(how=How.XPATH, using="//label[contains(text(),\"Confirm that edit field is disabled\")]//following::input") WebElement disabledTextBox;

	public EditPage EnterMailID(String data) {
		clearAndType(editMailId, data);

		return this;

	}

	public EditPage AppendText(String data) {
		justType(appendText, data);
		return this;
	}
	public EditPage clearTheText() {
		clear(clearText);
		return this;
	}
	public EditPage confirmFieldIsDisabled() {
		verifyEnabled(disabledTextBox);
		return this;

	}
	public LeafGroundHomePage goBackToHomePage() {
		goToPrevPage();
		return new LeafGroundHomePage();
	}


}
