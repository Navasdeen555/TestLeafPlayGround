package com.yalla.pages;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

public class Image extends Annotations{
	public Image() {
		PageFactory.initElements(driver, this);
	}
}
