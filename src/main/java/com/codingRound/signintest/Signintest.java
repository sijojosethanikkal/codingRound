package com.codingRound.signintest;
/*
@author - Sijo Jose
*/

import com.codingRound.commonhelper.CommonHelper;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;

public class Signintest {

    @BeforeSuite
    public void initDrvierandPath() throws IOException {
        CommonHelper commonHelper = new CommonHelper();
        commonHelper.webdriver();
    }
    @Test
    public void initDrvierandPath1() throws IOException {
        signintestHelper signintestHelper = new signintestHelper();
        signintestHelper.shouldThrowAnErrorIfSignInDetailsAreMissing();

    }
    @AfterSuite
    public void quitDriver(){
        CommonHelper commonHelper = new CommonHelper();
        commonHelper.closewebdriver();
    }
}
