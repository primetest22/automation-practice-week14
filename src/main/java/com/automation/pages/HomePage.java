package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends Utility {

    public HomePage() {
        PageFactory.initElements(driver, this);

    }

    @FindBy(linkText = "Women")
    WebElement womenLink;

    @FindBy(linkText = "Dresses")
    WebElement dressesLink;

    @FindBy(linkText = "T-shirts")
    WebElement tshirsLink;

    @FindBy(partialLinkText = "Sign")
    WebElement signLink;

    @FindBy(tagName = "//img[@alt='My Store']")
    WebElement logoLink;

    public String verifySignLinkText(){
        return getTextFromElement(signLink);
    }
    public void clickOnWomanTabLink() {
        clickOnElement(womenLink);
    }

    public void clickOnDressesTabLink() {
        clickOnElement(dressesLink);
    }

    public void clickOnTshirtTabLink() {
        clickOnElement(tshirsLink);
    }

    public void clickOnSignInTabLink() {
        clickOnElement(signLink);
    }

    public void clickOnLogoLink() {
        clickOnElement(logoLink);
    }

}
