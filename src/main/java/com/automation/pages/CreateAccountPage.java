package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage extends Utility {

    public CreateAccountPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@id='uniform-id_gender1']")
    WebElement maleRadio;
    @FindBy(xpath = "//input[@id='customer_firstname']")
    WebElement firstName;
    @FindBy(xpath = "//input[@id='customer_lastname']")
    WebElement lastName;
    @FindBy(xpath = "//input[@id='passwd']")
    WebElement password;
    @FindBy(xpath = "//select[@id='days']")
    WebElement days;
    @FindBy(xpath = "//select[@id='months']")
    WebElement months;
    @FindBy(xpath = "//select[@id='years']")
    WebElement years;
    @FindBy(xpath = "//input[@id='newsletter']")
    WebElement newsletterCheckBox;
    @FindBy(xpath = "//input[@id='optin']")
    WebElement splOfferCheckBox;
    @FindBy(xpath = "//input[@id='firstname']")
    WebElement addFirstName;
    @FindBy(xpath = "//input[@id='lastname']")
    WebElement addLastName;
    @FindBy(css = "#address1")
    WebElement address;
    @FindBy(xpath = "//input[@id='city']")
    WebElement city;
    @FindBy(xpath = "//select[@id='id_state']")
    WebElement state;
    @FindBy(xpath = "//input[@id='postcode']")
    WebElement zip;
    @FindBy(xpath = "//input[@id='phone_mobile']")
    WebElement mobile;
    @FindBy(xpath = "//input[@id='alias']")
    WebElement futureRefAddress;
    @FindBy(xpath = "//button[@id='submitAccount']")
    WebElement subBtn;

    public void clkOnRegBtn() {
        clickOnElement(subBtn);
    }

    public void enterRefAddress(String refAdd) {
        sendTextToElement(futureRefAddress, refAdd);
    }

    public void enterMobile(String mbl) {
        sendTextToElement(mobile, mbl);
    }

    public void enterZip(String zp) {
        sendTextToElement(zip, zp);
    }

    public void selectState(String stat) {
        clickOnElement(state);
        selectByValueFromDropDown(state, stat);
    }

    public void enterCity(String cit) {
        sendTextToElement(city, cit);
    }

    public void enterAddress(String adrs) {
        sendTextToElement(address, adrs);
    }
    public void enterAddLstName(String addLstName) {
        sendTextToElement(addFirstName, addLstName);
    }
    public void enterAddFstName(String addFstName) {
        sendTextToElement(addFirstName, addFstName);
    }

    public void clkOnSplOfferCheckBox() {
        clickOnElement(splOfferCheckBox);
    }

    public void clkOnNewsLetterCheckBox() {
        clickOnElement(newsletterCheckBox);
    }

    public void selectMonth(String mnth) {
        clickOnElement(months);
        selectByValueFromDropDown(months, mnth);
    }

    public void selectYear(String yr) {
        clickOnElement(years);
        selectByValueFromDropDown(years, yr);
    }

    public void selectDay(String dy) {
        clickOnElement(days);
        selectByValueFromDropDown(days, dy);

    }

    public void enterPassword(String pswd) {
        sendTextToElement(password, pswd);
    }

    public void enterLstName(String lstName) {
        sendTextToElement(lastName, lstName);
    }

    public void enterFstName(String fstName) {
        sendTextToElement(firstName, fstName);
    }

    public void clkOnMaleRadio() {
        clickOnElement(maleRadio);
    }


}
