package com.yalla.pages;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

public class HyperLink extends Annotations{
	public HyperLink() {
		PageFactory.initElements(driver, this);
	}
}
