package com.saucedemo.testsuite;


import com.saucedemo.pages.LoginPage;
import com.saucedemo.testbase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class LoginPageTest extends TestBase {
    LoginPage loginPage = new LoginPage();

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials(){
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();

        String expectedErrorMessage = "PRODUCTS";
        String actualErrorMessage = loginPage.getErrorMessage();
        Assert.assertEquals( expectedErrorMessage, actualErrorMessage,"Login Secure area message not displayed");
    }
    @Test
    public void verifyThatSixProductsAreDisplayedOnPage(){
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();

        List<WebElement> verifydisplaylist = driver.findElements(By.xpath("//div[@class='inventory_list']//div[@class='inventory_item_name']\n"));
        System.out.println("Item display  : "  +  verifydisplaylist.size());

        int expectedImages = 6;

        org.junit.Assert.assertEquals("All Six products displayed on screen.",expectedImages,verifydisplaylist.size());
    }

}
