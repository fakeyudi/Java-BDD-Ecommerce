package com.flipkart.StepDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
import io.cucumber.java.en.*;

public class FlipkartStepDefinitions {

    static WebDriver driver;

    @Given("^Launch Chrome browser")
    public void launchChrome(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.flipkart.com/");
    }

    @When("^Flipkart home page opens")
    public void launchFlipKart() throws InterruptedException {
        driver.get("https://www.flipkart.com/");
    }

    @Then("^Verify Login Text is Present")
    public void checkLogin(){
        WebElement login = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/span/span"));
        assert login.getText().equals("Login");
    }

    @Then("^Verify Email field is Present")
    public void checkEmailField(){
        WebElement emailField = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
        assert emailField.isDisplayed();
    }

    @Then("^Verify Password field is Present")
    public void checkPasswordField(){
        WebElement passwordField = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input"));
        assert passwordField.isDisplayed();
    }

    @Then("^Verify Login Button is Present")
    public void checkLoginButton(){
        WebElement loginButton = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button"));
        assert  loginButton.isDisplayed();
    }

    @Then("^Verify Close Button is Present")
    public void verifyCloseButton(){
        WebElement closeButton = driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
        assert closeButton.isDisplayed();
    }

    @Then("^Click Close Button")
    public void clickCloseButton(){
        WebElement closeButton = driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
        closeButton.click();
    }

    @Then("^Verify Top Categories is present")
    public void t07_checkCategoriesBanner(){
        WebElement categoriesBanner = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div"));
        assert categoriesBanner.isDisplayed();
    }

    @Then("^Click Mobiles")
    public void clickMobiles(){
        WebElement mobiles = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/a/div[2]"));
        mobiles.click();
    }

    @Then("^Click on first phone")
    public void clickFirstPhone(){
        WebElement firstPhone = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[4]/div/div[1]/a/div/img[2]"));
        firstPhone.click();
    }

    @Then("^Verify Filters")
    public void checkFilters(){
        WebElement filters = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[1]/div[2]/div[1]/div/section[1]/div/div/span"));
        assert filters.getText().equals("Filters");
    }

    @Then("^Reset price to 20000")
    public void updatePriceFilter(){
        WebElement price = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[1]/div[2]/div[1]/div/section[2]/div[4]/div[3]/select"));
        Select select = new Select(price);
        select.selectByVisibleText("₹30000+");
    }

    @Then("^Verify Need help")
    public void checkNeedHelp(){
        driver.findElement(By.tagName("body")).sendKeys(Keys.END);
        WebElement needHelp = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[1]/div[2]/div[2]/a/div[1]/span"));
        assert needHelp.getText().equals("Need help?");
    }

    @Then("^Close Browser")
    public void closeBrowser(){
        driver.close();
    }
}
