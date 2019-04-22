package com.yalla.pages;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

public class FileDownload extends Annotations{
	public FileDownload() {
		PageFactory.initElements(driver, this);
	}
}
