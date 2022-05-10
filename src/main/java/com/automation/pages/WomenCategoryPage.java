package com.automation.pages;

import com.automation.customlisteners.CustomListeners;
import com.automation.utility.Utility;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WomenCategoryPage extends Utility {

    public WomenCategoryPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//h2[contains(text(),'Women')]")
    WebElement womenText;
    @FindBy(xpath = "//div[@class='subcategory-image']//a[@title='Tops']")
    WebElement topsLink;
    @FindBy(xpath = "//div[@class='subcategory-image']//a[@title='Dresses']")
    WebElement dressesLink;
    @FindBy(xpath = "//select[@id='selectProductSort']")
    WebElement sortBy;
    @FindBy(xpath = "//a[@class='product-name']")//a[@class='product-name']
    List<WebElement> productList;
    @FindBy(xpath = "//span[@title='Close window']")
    WebElement closeWindow;

    public void clkPopUp(){
        clickOnElement(closeWindow);
    }
    public void clkOnProductList(String text){
     for(WebElement list : productList){
         if(list.getText().equalsIgnoreCase(text) || (list.getText() == "Printed Summer Dress")){
             clickOnElement(list);
             break;
         }
     }

    }

    public void clkOnSortBy(String Atoz){
        selectByVisibleTextFromDropDown(sortBy,Atoz);
    }
    public void clkOnDressesLink(){
        clickOnElement(dressesLink);
    }
    public void clkOnTopsLink(){
        clickOnElement(topsLink);
    }
    public String verifyWomenText(){
        return getTextFromElement(womenText);
    }

}
