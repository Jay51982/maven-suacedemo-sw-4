package com.saucedemo.pages;


import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    //storing element in variable

    By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By userNameField = By.id("user-name");
    By passwordField = By.name("password");
    By loginButton = By.xpath("//input[@class='submit-button btn_action']");
    By errorMessage = By.xpath("//span[@class='title']");

    // for each element need to create method

    public String getWelcomeText(){

        return getTextFromElement(welcomeText);
    }
    public void enterUserName(String userName){

        sendTextToElement(userNameField,userName);
    }
    public void enterPassword(String password){

        sendTextToElement(passwordField,password);
    }

    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public String getErrorMessage(){
        return getTextFromElement(errorMessage);
    }
}
