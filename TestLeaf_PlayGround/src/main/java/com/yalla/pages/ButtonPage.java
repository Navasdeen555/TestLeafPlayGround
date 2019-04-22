package com.yalla.pages;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

public class ButtonPage extends Annotations {
	public ButtonPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.ID, using="home") WebElement eleGoToHome;
	@FindBy(how=How.ID, using="position") WebElement eleGetPosition;
	@FindBy(how=How.ID, using="color") WebElement eleGetColor;
	@FindBy(how=How.ID, using="size") WebElement eleGetSize;

	public LeafGroundHomePage goToHomePage() throws InterruptedException {
		Thread.sleep(1000);
		click(eleGoToHome);
		return new LeafGroundHomePage();
	}

	public ButtonPage getPosition() throws InterruptedException {
		Thread.sleep(1000);
		Point findPosition = findPosition(eleGetPosition);
		System.out.println(findPosition);
		return this;
	}
	public ButtonPage getColor() throws InterruptedException {
		Thread.sleep(1000);
		String findColor = findColor(eleGetColor);
		System.out.println(findColor);
		return this;
	}
	public ButtonPage getSize() throws InterruptedException {
		Thread.sleep(1000);
		Dimension findSize = findSize(eleGetSize);
		System.out.println(findSize);
		return this;
	}
}
