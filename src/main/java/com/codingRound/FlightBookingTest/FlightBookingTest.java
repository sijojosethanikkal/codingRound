package com.codingRound.FlightBookingTest;
/*
@author - Sijo Jose
*/

import com.codingRound.commonhelper.CommonHelper;
import org.testng.annotations.*;
import java.io.IOException;

public class FlightBookingTest {

    //Identifying OS and initalizing chrome browser.
    @BeforeClass
    public void initDrvierandPath() throws IOException {
        CommonHelper commonHelper = new CommonHelper();
        commonHelper.webdriver();
    }
    //To test the result appear for one way journey.
    @Test
    public void testThatResultsAppearForAOneWayJourney() throws IOException {
        FlightBookingTestHelper flightBookingTestHelper = new FlightBookingTestHelper();
        flightBookingTestHelper.testThatResultsAppearForAOneWayJourney();

    }
    //Class to quit the browser.
    @AfterClass
    public void quitDriver(){
        CommonHelper commonHelper = new CommonHelper();
        commonHelper.closewebdriver();
    }
}
