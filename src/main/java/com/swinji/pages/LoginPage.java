package com.swinji.pages;

import com.swinji.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage extends Base {
    public LoginPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy (id = "Email")
    WebElement email;

    @FindBy (id = "inputPassword")
    WebElement password;

    @FindBy (id = "btnLogin")
    WebElement loginbutton;



    public void login(String user,String pass) throws InterruptedException {
        Thread.sleep(3000);
        email.sendKeys(user);
        password.sendKeys(pass);
        loginbutton.click();

    }


}
