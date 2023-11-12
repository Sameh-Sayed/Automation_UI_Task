package com.saucedemo.pages;

import com.saucedemo.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ProductsPage extends Base {
    public ProductsPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(className = "title")
    WebElement productlogo;

    public void checkLogo(){
        productlogo.isDisplayed();
    }

    public void addMostTwoExpensiveProduct(){
        Select sort = new Select(driver.findElement(By.className("product_sort_container")));
        sort.selectByVisibleText("Price (high to low)");
        Select addtoCart = new Select(driver.findElement(By.className("btn btn_primary btn_small btn_inventory ")));
        addtoCart.selectByIndex(0);
        addtoCart.selectByIndex(1);
    }

    public void clickOnCart(){
        driver.findElement(By.className("shopping_cart_link")).click();
    }

    }


