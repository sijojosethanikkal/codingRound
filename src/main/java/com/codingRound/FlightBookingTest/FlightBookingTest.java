package com.codingRound.FlightBookingTest;

import com.codingRound.commonhelper.CommonHelper;
import com.codingRound.signintest.signintestHelper;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;

public class FlightBookingTest {

    @BeforeSuite
    public void initDrvierandPath() throws IOException {
        CommonHelper commonHelper = new CommonHelper();
        commonHelper.webdriver();
    }
    @Test
    public void testThatResultsAppearForAOneWayJourney() throws IOException {
        FlightBookingTestHelper flightBookingTestHelper = new FlightBookingTestHelper();
        flightBookingTestHelper.testThatResultsAppearForAOneWayJourney();

    }
    @AfterSuite
    public void quitDriver(){
        CommonHelper commonHelper = new CommonHelper();
        commonHelper.closewebdriver();
    }
}
