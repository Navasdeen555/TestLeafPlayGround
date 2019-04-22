package com.yalla.pages;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

public class Alert extends Annotations{
	public Alert() {
		PageFactory.initElements(driver, this);
	}

}
