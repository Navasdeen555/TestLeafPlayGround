package com.yalla.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.yalla.pages.LeafGroundHomePage;
import com.yalla.testng.api.base.Annotations;

public class TC002_ButtonTest extends Annotations{
	
	@BeforeTest
	public void setData() {
		testcaseName = "TC002_ButtonTest";
		testcaseDec = "Test Button";
		author = "Navas";
		category = "smoke";
//		excelFileName = "Edit";
	}
	@Test
	public void testButton() throws InterruptedException {
	new LeafGroundHomePage().clickButton().getPosition().getColor().getSize().goToHomePage();
	}

}
