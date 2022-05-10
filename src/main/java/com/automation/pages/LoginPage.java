package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static com.automation.driverfactory.ManageDriver.driver;

public class LoginPage extends Utility {

    public LoginPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]" )
    WebElement welcomeText;

    @FindBy(xpath = "//input[@id='email']")
    WebElement emailField;
    @FindBy(xpath = "//input[@id='passwd']")
    WebElement passwordField;
    @FindBy(xpath = "//button[@id='SubmitLogin']")
    WebElement loginButton;
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
     WebElement errorMessage;
   // @FindBy(xpath = "//li[contains(text(),'Invalid email address.')]")
   // WebElement error;
    @FindBy(xpath = "//div[@class='alert alert-danger']//li")
    WebElement error;

    public String verifyError(){
        return getTextFromElement(error);
    }
    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }

    public void enterEmailId(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String getErrorMessage() {
        return getTextFromElement(errorMessage);
    }

    public void loginToApplication(String username, String password,String message){

        enterEmailId(username);
        enterPassword(password);
        clickOnLoginButton();
        Assert.assertEquals(verifyError(),message,"Not Matching");


    }
}
