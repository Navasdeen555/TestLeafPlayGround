package com.yalla.pages;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

public class Sortable extends Annotations{
	public Sortable() {
		PageFactory.initElements(driver, this);
	}
}
