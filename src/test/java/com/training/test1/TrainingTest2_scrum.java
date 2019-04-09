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

public class TrainingTest2_scrum {

    @Test
    public void trainingtest2(){

        FirefoxProfile profile = new FirefoxProfile();
        profile.setPreference("intl.accept_languages", "en-gb");

        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.navigate().to("https://www.scrum.org/");

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

        driver.close();
    }
}
