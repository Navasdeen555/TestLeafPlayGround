package com.yalla.pages;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

public class RadioButton extends Annotations{
	public RadioButton() {
		PageFactory.initElements(driver, this);
	}
}
