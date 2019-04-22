package com.yalla.pages;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

public class CheckBox extends Annotations{
	public CheckBox() {
		PageFactory.initElements(driver, this);
	}
}
