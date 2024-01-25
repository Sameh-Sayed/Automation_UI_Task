package com.swinji.pages;

import com.swinji.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CoursesPage extends Base {
    public CoursesPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "btnListAddCourse")
    WebElement addcoursebutton;

    @FindBy(id = "txtCourseName")
    WebElement coursename;


    @FindBy(id = "btnSaveCourse")
    WebElement savebutton;

    @FindBy(id = "txtCourseSearch")
    WebElement searchforcourse;

    @FindBy(className = "fa fa-search fa-lg")
    WebElement searchmagnifier;




    public void clickAddCourseButton() {
        addcoursebutton.click();

    }

    public void addNewCourse(String course) {
        coursename.sendKeys(course);
        Select selectSubject = new Select(driver.findElement(By.id("courseSubject")));
        selectSubject.selectByVisibleText("Others");

        Select selectGrade = new Select(driver.findElement(By.id("courseGrade")));
        selectGrade.selectByIndex(2);

        Select selectTeacher = new Select(driver.findElement(By.className("ui-select-match-text pull-left")));
        selectTeacher.selectByIndex(1);

        savebutton.click();


    }

    public void searchForCourse(String course){

        searchforcourse.sendKeys(course);
        searchmagnifier.click();

    }

    public void assertCourseAdded(){
        Assert.assertTrue(driver.findElement(By.linkText("New course")).isDisplayed());

    }

}


