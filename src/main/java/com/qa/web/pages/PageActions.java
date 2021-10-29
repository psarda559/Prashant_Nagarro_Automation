package com.qa.web.pages;

import com.qa.web.base.TestBase;
import com.qa.web.utils.TestUtil;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.qa.web.utils.TestUtil.clickOn;

public class PageActions extends TestBase {

	TestUtil testUtil = new TestUtil();
    @FindBy(xpath = "//a[contains(text(),'Droppable')]")
    private WebElement droppable;

    @FindBy(xpath = "//div[@id='draggable']")
    private WebElement dragElement;

    @FindBy(xpath = "//div[@id='droppable']")
    private WebElement dropElement;

    @FindBy(xpath = "//a[contains(text(),'Selectable')]")
    private WebElement selectable;

    @FindBy(xpath = "//li[contains(text(),'Item 1')]")
    private WebElement Item1;

    @FindBy(xpath = "//li[contains(text(),'Item 3')]")
    private WebElement Item3;

    @FindBy(xpath = "//li[contains(text(),'Item 7')]")
    private WebElement Item7;

    @FindBy(xpath = "//a[contains(text(),'Controlgroup')]")
    private WebElement controlGroup;


    @FindBy(xpath = "//span[@id=\"car-type-button\"]")
    private WebElement rentalCar1;

    @FindBy(xpath = "//span[@id=\"ui-id-8-button\"]")
    private WebElement rentalCar2;

    @FindBy(xpath = "//div[contains(text(),\"SUV\") and @id=\"ui-id-4\"]")
    private WebElement SUV;

    @FindBy(xpath = "//div[contains(text(),\"Truck\") and @id=\"ui-id-14\"]")
    private WebElement Truck;


    @FindBy(xpath = "//span[@class=\"ui-checkboxradio-icon ui-corner-all ui-icon ui-icon-background ui-icon-blank\"]//parent::label[@for=\"transmission-automatic\"]")
    private WebElement suvAutomatic;

    @FindBy(xpath = "//label[@for=\"insurance\"]")
    private WebElement suvInsurance;

    @FindBy(xpath = "//label[@for=\"insurance-v\"]")
    private WebElement truckInsurance;

    @FindBy(xpath = "//input[@id=\"horizontal-spinner\"]")
    private WebElement numberOfSUV;


    @FindBy(xpath = "//input[@id='vertical-spinner']")
    private WebElement numberOfTrucks;

    @FindBy(xpath = "//span[@class=\"ui-checkboxradio-icon ui-corner-all ui-icon ui-icon-background ui-icon-blank\"]//parent::label[@for=\"transmission-standard-v\"]")
    private WebElement truckStandard;

    @FindBy(xpath = "//button[@id=\"book\"]")
    private WebElement bookNow;


    public PageActions() {
        PageFactory.initElements(driver, this);
    }


    public void selectDroppable() {
        clickOn(driver,droppable);

    }

    public void selectSelectable() {
        clickOn(driver,selectable);
    }


    public void performDragAndDrop() {
    	TestUtil.switchToFrame();
        TestUtil.dragAndDrop(dragElement, dropElement);
    }

    public void selectOptions() {
    	TestUtil.switchToFrame();       
        Actions action = new Actions(driver);
        action.keyDown(Keys.CONTROL);
        clickOn(driver,Item1);
        action.build().perform();
        action.keyUp(Keys.CONTROL);
        clickOn(driver,Item3);
        clickOn(driver,Item7);
    }

    public void selectcontrolGroup() {
        clickOn(driver,controlGroup);
        TestUtil.switchToFrame(); 
    }

    public void chooseSUV() {
    	clickOn(driver, rentalCar1);
    	clickOn(driver, SUV);
    }

    public void chooseTruck() {
    	clickOn(driver, rentalCar2);
    	clickOn(driver, Truck);
    }

    public void SUVDetails() {
    	clickOn(driver, suvAutomatic);
    	clickOn(driver, suvInsurance);
        TestUtil.enterValue(numberOfSUV, "2");
    }

    public void TruckDetails() {
    	clickOn(driver, truckStandard);
    	clickOn(driver, truckInsurance);
        TestUtil.enterValue(numberOfTrucks, "1");
    }

    public void BookNow() {
    	clickOn(driver, bookNow);
    }

}
