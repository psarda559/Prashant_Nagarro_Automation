package com.qa.web.test;

import com.qa.web.base.TestBase;
import com.qa.web.pages.PageActions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ControlgroupTest extends TestBase {


    PageActions pageActions;

    public ControlgroupTest() {
        super();
    }


    @BeforeTest
    public void setup() {
        Initialization();
        pageActions = new PageActions();
    }


    @Test
    public void selectRadioButtonAndCheckBox() {
        pageActions.selectcontrolGroup();
        pageActions.chooseSUV();
        pageActions.SUVDetails();
        pageActions.chooseTruck();
        pageActions.TruckDetails();
        pageActions.BookNow();
    }


    @AfterTest
    public void teardown() {
        driver.close();
    }

}
