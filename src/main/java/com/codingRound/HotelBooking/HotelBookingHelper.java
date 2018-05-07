package com.codingRound.HotelBooking;
/*
@author - Sijo Jose
*/

import com.codingRound.commonhelper.CommonHelper;
import com.codingRound.commonhelper.PropertyHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class HotelBookingHelper extends CommonHelper {

    //Creating instance of property file.
    PropertyHandler prop= PropertyHandler.getInstance();

    public void shouldBeAbleToSearchForHotels()  {


        driver.get(prop.getValue("HOST"));
        waitFor(2000);

        //To click on Hotel button
        driver.findElement(By.linkText("Hotels")).click();

        //Enter search word.
       driver.findElement(By.id("Tags")).sendKeys("Indiranagar, Bangalore, karnataka, india");


        waitFor(3000);
        //Selecting the drop down.
        WebElement dropdown = driver.findElement(By.id("ui-id-1"));
        List<WebElement> options = dropdown.findElements(By.tagName("li"));
        for (WebElement option : options)
        {
            //Check for the keyword and click on the keyword.
            if (option.getText().equals("Indiranagar, Bangalore, Karnataka, India")) {
                option.click();
                break;
            }
        }


        //To select the persons in room.
        Select select = new Select(driver.findElement(By.id("travellersOnhome")));
        select.selectByVisibleText("1 room, 2 adults");
        waitFor(1000);

        driver.findElement(By.id("SearchHotelsButton")).submit();
        waitFor(2000);

        //Asserting the serach result is been displayed.
        driver.findElement(By.linkText("Show all hotels in Bangalore")).isDisplayed();




    }
}
