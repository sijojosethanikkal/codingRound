package com.codingRound.signintest;
/*
@author - Sijo Jose
*/

import com.codingRound.commonhelper.CommonHelper;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.io.IOException;

public class Signintest {

    //Identifying OS and initalizing chrome browser.
    @BeforeClass
    public void initDrvierandPath() throws IOException {
        CommonHelper commonHelper = new CommonHelper();
        commonHelper.webdriver();
    }
    //Test to click on sign button.
    @Test
    public void shouldThrowAnErrorIfSignInDetailsAreMissing() throws IOException {
        signintestHelper signintestHelper = new signintestHelper();
        signintestHelper.shouldThrowAnErrorIfSignInDetailsAreMissing();

    }
    //Class to quit the browser.
    @AfterClass
    public void quitDriver(){
        CommonHelper commonHelper = new CommonHelper();
        commonHelper.closewebdriver();
    }
}
