package com.saucedemo.pages;

import com.saucedemo.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CartPage extends Base {
    public CartPage(){
        PageFactory.initElements(driver,this);
    }

    public void displayOfProduct(){

        Assert.assertEquals(true,driver.findElement(By.linkText("Sauce Labs Fleece Jacket")).isDisplayed());
        Assert.assertEquals(true,driver.findElement(By.linkText("Sauce Labs Backpack")).isDisplayed());
    }
    public void clickOnCheckout(){
        driver.findElement(By.className("btn btn_action btn_medium checkout_button ")).click();
    }




}
