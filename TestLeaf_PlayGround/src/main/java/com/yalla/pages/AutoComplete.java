package com.yalla.pages;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

public class AutoComplete extends Annotations{
	public AutoComplete() {
		PageFactory.initElements(driver, this);
	}
}
