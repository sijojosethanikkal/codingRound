package com.codingRound.HotelBooking;
/*
@author - Sijo Jose
*/


import com.codingRound.commonhelper.CommonHelper;
import org.testng.annotations.*;

import java.io.IOException;

public class HotelBooking {

    //Identifying OS and initalizing chrome browser.
    @BeforeClass
    public void initDrvierandPath() throws IOException {
        CommonHelper commonHelper = new CommonHelper();
        commonHelper.webdriver();
    }

    //To test the Search button for hotels.
    @Test
    public void shouldBeAbleToSearchForHotels() throws IOException {
        HotelBookingHelper hotelBookingHelper = new HotelBookingHelper();
        hotelBookingHelper.shouldBeAbleToSearchForHotels();

    }

    //Class to quit the browser.
    @AfterClass
    public void quitDriver(){
        CommonHelper commonHelper = new CommonHelper();
        commonHelper.closewebdriver();
    }
}
