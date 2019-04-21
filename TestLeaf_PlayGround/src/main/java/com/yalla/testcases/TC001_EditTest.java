package com.yalla.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.yalla.pages.LeafGroundHomePage;
import com.yalla.testng.api.base.Annotations;

public class TC001_EditTest extends Annotations{

	@BeforeTest
	public void setData() {
		testcaseName = "TC001_EditTest";
		testcaseDec = "Test EditTest";
		author = "Navas";
		category = "smoke";
		excelFileName = "Edit";
	} 

	@Test(dataProvider="fetchData") 

	public void testEditFunction(String eMail) {
		new LeafGroundHomePage().clickEdit().EnterMailID(eMail).AppendText(eMail).
		clearTheText().confirmFieldIsDisabled().goBackToHomePage();
	}

}






