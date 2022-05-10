package com.automation.pages;
import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends Utility {

    public SignInPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='email']")
    WebElement emailField;

    @FindBy(xpath = "//input[@id='passwd']")
    WebElement passwordField;

    @FindBy(xpath = "//i[@class='icon-lock left']")
    WebElement logInBtn;

    @FindBy(xpath = "//button[@id='SubmitCreate']")
    WebElement creatActBtn;

    @FindBy(xpath = "//h1[contains(text(),'Authentication')]")
    WebElement authenticationText;

    @FindBy(xpath = "//h1[contains(text(),'Create an account')]")
    WebElement creatActText;

    @FindBy(xpath = "//input[@id='email_create']")
    WebElement createActEmailId;

    public void enterCreateActEmailId(String crtActEmail){
        sendTextToElement(createActEmailId,crtActEmail);
    }
    public void enterEmail(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(emailField, password);
    }

    public void clkOnLoginBtn() {
        clickOnElement(logInBtn);
    }

    public void clkOnCreatActBtn() {
        clickOnElement(creatActBtn);
    }

    public String verifyAuthenticationText() {
        return getTextFromElement(authenticationText);
    }

    public String verifyCreateActText() {
        return getTextFromElement(creatActText);
    }


}
