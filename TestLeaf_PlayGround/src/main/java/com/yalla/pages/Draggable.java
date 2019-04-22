package com.yalla.pages;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

public class Draggable extends Annotations{
	public Draggable() {
		PageFactory.initElements(driver, this);
	}
}
