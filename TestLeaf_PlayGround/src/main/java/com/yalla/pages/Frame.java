package com.yalla.pages;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

public class Frame extends Annotations{
	public Frame() {
		PageFactory.initElements(driver, this);
	}
}
