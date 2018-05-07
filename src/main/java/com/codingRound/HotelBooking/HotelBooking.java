package com.codingRound.HotelBooking;

import com.codingRound.FlightBookingTest.FlightBookingTestHelper;
import com.codingRound.commonhelper.CommonHelper;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;

public class HotelBooking {

    @BeforeSuite
    public void initDrvierandPath() throws IOException {
        CommonHelper commonHelper = new CommonHelper();
        commonHelper.webdriver();
    }
    @Test
    public void testThatResultsAppearForAOneWayJourney() throws IOException {
        HotelBookingHelper hotelBookingHelper = new HotelBookingHelper();
        hotelBookingHelper.shouldBeAbleToSearchForHotels();

    }
    @AfterSuite
    public void quitDriver(){
        CommonHelper commonHelper = new CommonHelper();
        commonHelper.closewebdriver();
    }
}
