package com.planitsdet.tests;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Unit test for simple App.
 */
public abstract class BaseTestSuite
{
    protected WebDriver driver;

    @BeforeEach
    public void setupTest()
    {
        ChromeOptions options = new ChromeOptions();
        // options.setBinary("C:\\Selenium\\chromedriver.exe");
        options.addArguments(
                "--user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/101.0.4951.67 Safari/537.");

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.manage().window().maximize();
        driver.navigate().to("https://www.ssense.com/en-au/");
        driver.manage().deleteAllCookies();
    }

    @AfterEach
    public void teardownTest()
    {
        driver.close();
    }

}
