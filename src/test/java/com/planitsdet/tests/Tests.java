package com.planitsdet.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.planitsdet.model.pages.LoginPage;

import org.junit.jupiter.api.Test;

public class Tests extends BaseTestSuite
{
    @Test
    public void verifyCreateAccountOnNonExistingEmail()
    {
        var loginPage = new LoginPage(driver).clickLoginNavlink().setEmail("notindatabase@email.com")
                .clickContinueButton();

        assertEquals("Create an account", loginPage.getCreateAccountPrompt());
    }

    // @Test
    // public void verifyCreateAccountOnNonExistingEmail {}

    // @Test
    // public void verifyCreateAccountOnNonExistingEmail {}s

}
