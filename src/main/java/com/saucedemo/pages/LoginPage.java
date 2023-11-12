package com.saucedemo.pages;

import com.saucedemo.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends Base {
    public LoginPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy (id = "user-name")
    WebElement username;

    @FindBy (id = "password")
    WebElement password;

    @FindBy (id = "login-button")
    WebElement loginbutton;

    @FindBy(className = "error")
    WebElement errorMessage;

    public void login(String user,String pass) throws InterruptedException {
        Thread.sleep(3000);
        username.sendKeys(user);
        username.sendKeys(pass);
        loginbutton.click();

    }

    public void checkErrorMessage(String Error){
        String errorText = errorMessage.getText();
        Assert.assertEquals(errorText,Error);
    }

}
