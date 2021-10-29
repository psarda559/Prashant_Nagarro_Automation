package com.qa.web.utils;

import com.qa.web.base.TestBase;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestUtil extends TestBase {

    public static long Page_Load_Timeout=500;
    public static long IMPLICITLY_WAIT=500;
    public static long EXPLICITILY_WAIT =30;


    public static void clickOn(WebDriver driver, WebElement webElement) {
        TestUtil.explicitWait(driver, webElement);
        webElement.click();
    }

    public static void dragAndDrop(WebElement source, WebElement destination) {
       Actions act = new Actions(driver);
	   act.dragAndDrop(source, destination).build().perform();
    }
    
    public static void explicitWait(WebDriver driver, WebElement webElement) {
        new WebDriverWait(driver, EXPLICITILY_WAIT).until(ExpectedConditions.elementToBeClickable(webElement));    
    }
    
    public static void switchToFrame() {
        driver.switchTo().frame(0);
    }
    
    public static void enterValue(WebElement element, String value) {
        element.sendKeys(value);
    }
    
}
