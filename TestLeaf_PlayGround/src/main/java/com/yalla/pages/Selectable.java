package com.yalla.pages;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

public class Selectable extends Annotations{
	public Selectable() {
		PageFactory.initElements(driver, this);
	}
}
