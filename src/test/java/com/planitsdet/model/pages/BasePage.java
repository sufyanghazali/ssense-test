package com.planitsdet.model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage
{
    protected WebDriver driver;

    public BasePage(WebDriver driver)
    {
        this.driver = driver;
    }

    public MenswearPage clickMenswearNavlink()
    {
        driver.findElement(By.id("men-link")).click();
        return new MenswearPage(driver);
    }

    public LoginPage clickLoginNavlink()
    {
        driver.findElement(By.id("login-link")).click();
        return new LoginPage(driver);
    }

    public ShoppingBagPage clickShoppingBagNavlink()
    {
        driver.findElement(By.id("header-shopping-bag")).click();
        return new ShoppingBagPage(driver);
    }
}
