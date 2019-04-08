package com.training.test1;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TrainingTest {

    @Test
    public void startWebDriver(){

        FirefoxProfile profile = new FirefoxProfile();
        profile.setPreference("intl.accept_languages", "en-gb");

        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        driver.navigate().to("https://www.google.com/webhp?hl=en&gl=en");
        Assert.assertTrue("title should start with sth",
                            driver.getTitle().startsWith("Google"));

        WebElement searchbox = driver.findElement(By.name("q"));
        searchbox.sendKeys("microsoft");
        searchbox.submit();


        List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'" + "Microsoft - Official Home Page" + "')]"));
        Assert.assertTrue("Text not found!", list.size() > 0);


        WebElement mssearchbox = driver.findElement(By.xpath("//input[@id='nqsbq']"));
        mssearchbox.sendKeys("surface");

        WebElement searchbutton = driver.findElement(By.xpath("//button[@class='ab_button']"));
        searchbutton.click();

        List<WebElement> list_search = driver.findElements(By.xpath("//*[contains(text(),'" + "surface site:microsoft.com" + "')]"));
        Assert.assertTrue("Text not found!", list_search.size() > 0);
    }



}
