package com.yalla.pages;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

public class Calendar extends Annotations{
	public Calendar() {
		PageFactory.initElements(driver, this);
	}
}
