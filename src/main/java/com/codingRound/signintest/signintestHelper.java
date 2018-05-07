package com.codingRound.signintest;
/*
@author - Sijo Jose
*/

import com.codingRound.commonhelper.CommonHelper;
import com.codingRound.commonhelper.PropertyHandler;
import org.openqa.selenium.By;
import org.testng.Assert;

public class signintestHelper  extends CommonHelper {

    //Creating instance of property file.
    PropertyHandler prop= PropertyHandler.getInstance();

    //To do a sign in test.
    public void shouldThrowAnErrorIfSignInDetailsAreMissing() {


        driver.get(prop.getValue("HOST"));
        waitFor(2000);

        driver.findElement(By.id("userAccountLink")).click();
        waitFor(2000);
        driver.findElement(By.id("SignIn")).click();
        waitFor(2000);

        //Switching the frame.
        driver.switchTo().frame(4);

        driver.findElement(By.id("signInButton")).click();

        String errors1 = driver.findElement(By.id("errors1")).getText();
        System.out.print(errors1);

        //Asserting the error message.
        Assert.assertTrue(errors1.contains("There were errors in your submission"));


    }
}