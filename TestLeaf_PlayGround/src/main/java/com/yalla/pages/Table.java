package com.yalla.pages;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

public class Table extends Annotations{
	public Table() {
		PageFactory.initElements(driver, this);
	}
}
