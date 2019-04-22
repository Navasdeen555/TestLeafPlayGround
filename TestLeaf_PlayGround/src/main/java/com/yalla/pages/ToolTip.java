package com.yalla.pages;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

public class ToolTip extends Annotations{
	public ToolTip() {
		PageFactory.initElements(driver, this);
	}
}
