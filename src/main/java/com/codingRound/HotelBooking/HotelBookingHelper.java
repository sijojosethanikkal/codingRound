package com.codingRound.HotelBooking;

import com.codingRound.commonhelper.CommonHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HotelBookingHelper extends CommonHelper {



    public void shouldBeAbleToSearchForHotels()  {


        driver.get("https://www.cleartrip.com/");
        waitFor(2000);
        driver.findElement(By.linkText("Hotels")).click();

       driver.findElement(By.id("Tags")).sendKeys("Indiranagar, Bangalore, karnataka, india");


        waitFor(3000);

       /* Select dropdown = new Select(driver.findElement(By.id("Tags")));
        dropdown.selectByVisibleText("Indiranagar, Bangalore");
        waitFor(1000);*/

        WebElement dropdown1 = driver.findElement(By.id("ui-id-1"));
       /* dropdown1.click();*/

        List<WebElement> options = dropdown1.findElements(By.tagName("li"));
        for (WebElement option : options)
        {
            System.out.println(option.getText());
            if (option.getText().equals("Indiranagar, Bangalore, Karnataka, India")) {
                option.click();
            }
        }



               Select select = new Select(driver.findElement(By.id("travellersOnhome")));
        select.selectByVisibleText("1 room, 2 adults");
        waitFor(1000);
        driver.findElement(By.id("SearchHotelsButton")).submit();
        waitFor(2000);
        driver.findElement(By.linkText("Show all hotels in Bangalore")).isDisplayed();



       /* localityTextBox.sendKeys("Indiranagar, Bangalore");

        new Select(travellerSelection).selectByVisibleText("1 room, 2 adults");
        searchButton.click();

        driver.quit();*/

    }
}
