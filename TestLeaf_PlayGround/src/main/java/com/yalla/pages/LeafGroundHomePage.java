package com.yalla.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class LeafGroundHomePage {
	public LeafGroundHomePage () {

	}

	@FindBy (how=How.LINK_TEXT, using="Edit") WebElement eleEdit;
	@FindBy (how=How.LINK_TEXT, using="Button") WebElement eleButton;
	@FindBy (how=How.LINK_TEXT, using="HyperLink") WebElement eleHyperLink;
	@FindBy (how=How.LINK_TEXT, using="Image") WebElement eleImage;
	@FindBy (how=How.LINK_TEXT, using="Drop down") WebElement eleDropDown;
	@FindBy (how=How.LINK_TEXT, using="Radio Button") WebElement eleRadioButton;
	@FindBy (how=How.LINK_TEXT, using="Checkbox") WebElement eleCheckBox;
	@FindBy (how=How.LINK_TEXT, using="Table") WebElement eleTable;
	@FindBy (how=How.LINK_TEXT, using="Alert") WebElement eleAlert;
	@FindBy (how=How.LINK_TEXT, using="Frame") WebElement eleFrame;
	@FindBy (how=How.LINK_TEXT, using="Window") WebElement eleWindow;
	@FindBy (how=How.LINK_TEXT, using="Calendar") WebElement eleCalendar;
	@FindBy (how=How.LINK_TEXT, using="Draggable") WebElement eleDraggable;
	@FindBy (how=How.LINK_TEXT, using="Droppable") WebElement eleDroppable;
	@FindBy (how=How.LINK_TEXT, using="Selectable") WebElement eleSelectable;
	@FindBy (how=How.LINK_TEXT, using="Sortable") WebElement eleSortable;
	@FindBy (how=How.LINK_TEXT, using="Tool Tip") WebElement eleToolTip;
	@FindBy (how=How.LINK_TEXT, using="Auto Complete") WebElement eleAutoComplete;
	@FindBy (how=How.LINK_TEXT, using="File Upload") WebElement eleFileUpload;
	@FindBy (how=How.LINK_TEXT, using="File Download") WebElement eleFileDownload;



	public EditPage clickEdit() {
		eleEdit.click();
		return new EditPage();
	}

	public ButtonPage clickButton() {
		eleButton.click();
		return new ButtonPage();
	}
	public HyperLink clickHyperLink() {
		eleHyperLink.click();
		return new HyperLink();
	}
	public Image clickImage() {
		eleImage.click();
		return new Image();
	}
	public DropDown clickDropDown() {
		eleDropDown.click();
		return new DropDown();
	}
	public RadioButton clickRadioButton() {
		eleRadioButton.click();
		return new RadioButton();
	}
	public CheckBox clickCheckBox() {
		eleCheckBox.click();
		return new CheckBox();
	}
	public Table clickTable() {
		eleTable.click();
		return new Table();
	}
	public Alert clickAlert() {
		eleAlert.click();
		return new Alert();
	}
	public Frame clickFrame() {
		eleFrame.click();
		return new Frame();
	}
	public Window clickWindow() {
		eleWindow.click();
		return new Window();
	}
	public Calendar clickCalendar() {
		eleCalendar.click();
		return new Calendar();
	}
	public Draggable clickDraggable() {
		eleDraggable.click();
		return new Draggable();
	}
	public Droppable clickDroppable() {
		eleDroppable.click();
		return new Droppable();
	}
	public Selectable Selectable() {
		eleSelectable.click();
		return new Selectable();
	}
	public Sortable clickSortable() {
		eleSortable.click();
		return new Sortable();
	}
	public ToolTip clickToolTip() {
		eleToolTip.click();
		return new ToolTip();
	}
	public AutoComplete clickAutoComplete() {
		eleAutoComplete.click();
		return new AutoComplete();
	}
	public FileUpload clickFileUpload() {
		eleFileUpload.click();
		return new FileUpload();
	}
	public FileDownload clickFileDownload() {
		eleFileDownload.click();
		return new FileDownload();
	}
}

