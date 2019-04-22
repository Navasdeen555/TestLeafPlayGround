package com.yalla.pages;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

public class Window extends Annotations{
	public Window() {
		PageFactory.initElements(driver, this);
	}
}
