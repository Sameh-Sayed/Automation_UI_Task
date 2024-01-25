package com.swinji.pages;

import com.swinji.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends Base {
    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "btnMyCoursesList")
    WebElement coursesbutton;


    public void clickCoursesButton(){
        coursesbutton.click();

    }

}
