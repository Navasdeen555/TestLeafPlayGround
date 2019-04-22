package com.yalla.pages;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

public class FileUpload extends Annotations{
	public FileUpload() {
		PageFactory.initElements(driver, this);
	}
}
