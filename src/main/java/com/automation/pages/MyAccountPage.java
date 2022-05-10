package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage extends Utility {

    public MyAccountPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Sign out")
    WebElement signOutLink;
    @FindBy(xpath = "//h1[contains(text(),'My account')]")
    WebElement myAccText;

    public String verifyMyAccText(){
        return getTextFromElement(myAccText);
    }
    public String verifySignOutLink() {
        return getTextFromElement(signOutLink);
    }
    public void clkOnSignOutLink(){
        clickOnElement(signOutLink);
    }

}
