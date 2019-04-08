package com.training.test1;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TrainingTest2 {

    @Test
    public void startWebDriver(){

        FirefoxProfile profile = new FirefoxProfile();
        profile.setPreference("intl.accept_languages", "en-gb");

        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        driver.navigate().to("https://www.scrum.org/");
//        Assert.assertTrue("title should start with sth",
//                            driver.getTitle().startsWith("Google"));

        WebElement certificationsLink = driver.findElement(By.xpath("//a[@href=\"/professional-scrum-certifications\"]"));
        certificationsLink.click();

        WebElement searchScrumMasterLink = driver.findElement(By.xpath("//a[@href=\"/certification-list\"]"));
        Assert.assertTrue("Link not found", searchScrumMasterLink.getText().length() > 0);
        searchScrumMasterLink.click();

        WebElement editFirstName = driver.findElement(By.xpath("//input[@id=\"edit-first-name\"]"));
        editFirstName.sendKeys("Andy");

        WebElement editLastName = driver.findElement(By.xpath("//input[@id=\"edit-last-name\"]"));
        editLastName.sendKeys("Brandt");
        editLastName.submit();

        WebElement checkCert = driver.findElement(By.xpath(""));



//        List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'" + "Microsoft - Official Home Page" + "')]"));
//        Assert.assertTrue("Text not found!", list.size() > 0);
//
//
//        WebElement mssearchbox = driver.findElement(By.xpath("//input[@id='nqsbq']"));
//        mssearchbox.sendKeys("surface");
//
//        WebElement searchbutton = driver.findElement(By.xpath("//button[@class='ab_button']"));
//        searchbutton.click();
//
//        List<WebElement> list_search = driver.findElements(By.xpath("//*[contains(text(),'" + "surface site:microsoft.com" + "')]"));
//        Assert.assertTrue("Text not found!", list_search.size() > 0);
    }



}
