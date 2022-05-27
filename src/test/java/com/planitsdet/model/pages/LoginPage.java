package com.planitsdet.model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage
{
    public LoginPage(WebDriver driver)
    {
        super(driver);
    }

    // GETTERS
    public String getCreateAccountPrompt()
    {
        return "Create an account";
    }

    // SETTERS
    public LoginPage setEmail(String email)
    {
        driver.findElement(By.id("email")).sendKeys(email);
        return this;
    }

    public LoginPage clickContinueButton()
    {
        driver.findElement(By.cssSelector("button[data-test='loginLandingContinueButton']")).click();
        return this;
    }
}