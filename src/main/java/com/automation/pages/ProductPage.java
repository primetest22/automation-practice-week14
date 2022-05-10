package com.automation.pages;

import com.automation.customlisteners.CustomListeners;
import com.automation.utility.Utility;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends Utility {

    public ProductPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='quantity_wanted']")
    WebElement qnt;
    @FindBy(css = "#group_1")
    WebElement size;
    @FindBy(xpath = "//ul[@id='color_to_pick_list']//li")
    WebElement colour;
    @FindBy(xpath = "//span[contains(text(),'Add to cart')]")
    WebElement addCart;

    public void clkOnQnt(String qnt1) throws InterruptedException {
        clickOnElement(qnt);

        clearTextFromField(qnt);
        Thread.sleep(1500);
        sendTextToElement(qnt, qnt1);

    }

    public void clkAddCart() {
        clickOnElement(addCart);
    }

    public void clkOnColoour(String clr) {
        clickOnElement(colour, clr);
    }

    public void clkOnSize(String size1) throws InterruptedException {

        clickOnElement(size);
        selectByVisibleTextFromDropDown(size, size1);
    }

}
