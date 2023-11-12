package com.saucedemo.pages;

import com.saucedemo.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CheckOutPage extends Base {
    public CheckOutPage(){
        PageFactory.initElements(driver,this);
    }

    public void checkPresenceOnPAge(){
        Assert.assertEquals(true,driver.findElement(By.className("title")).isDisplayed());
    }

    public void fillCheckoutForm(){
        driver.findElement(By.name("firstName")).sendKeys("Sameh");
        driver.findElement(By.name("lastName")).sendKeys("Ezzat");
        driver.findElement(By.id("postal-code")).sendKeys("002");

    }

    public void clickOnContinue(){
        driver.findElement(By.id("continue")).click();
    }
}
