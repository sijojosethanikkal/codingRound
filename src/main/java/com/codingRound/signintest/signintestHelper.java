package com.codingRound.signintest;

import com.codingRound.commonhelper.CommonHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/*
@author - Sijo Jose
*/
public class signintestHelper  extends CommonHelper {


    public void shouldThrowAnErrorIfSignInDetailsAreMissing() {

        driver.get("https://www.cleartrip.com/");
        waitFor(2000);

        driver.findElement(By.id("userAccountLink")).click();
        waitFor(2000);
        driver.findElement(By.id("SignIn")).click();
        waitFor(2000);


        driver.switchTo().frame(4);

        driver.findElement(By.id("signInButton")).click();

        String errors1 = driver.findElement(By.id("errors1")).getText();
        System.out.print(errors1);

        Assert.assertTrue(errors1.contains("There were errors in your submission"));


    }
}