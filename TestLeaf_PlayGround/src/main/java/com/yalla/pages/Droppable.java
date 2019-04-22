package com.yalla.pages;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

public class Droppable extends Annotations{
	public Droppable() {
		PageFactory.initElements(driver, this);
	}
}
