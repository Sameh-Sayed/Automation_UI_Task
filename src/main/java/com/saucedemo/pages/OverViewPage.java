package com.saucedemo.pages;

import com.saucedemo.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class OverViewPage extends Base {
    public OverViewPage(){
        PageFactory.initElements(driver,this);
    }

    public void checkPresenceOnOverViewPage(){
        Assert.assertEquals(true,driver.findElement(By.partialLinkText("Checkout: Overview")).isDisplayed());
    }
    public void verifyTotalAmount(){


    }
    public void verifyURLMatches(){
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/checkout-step-two.html");
    }

}
