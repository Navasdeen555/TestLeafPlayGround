package com.yalla.pages;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

public class DropDown extends Annotations{
	public DropDown() {
		PageFactory.initElements(driver, this);
	}
}
