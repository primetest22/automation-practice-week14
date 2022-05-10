package com.automation.testsuite;

import com.automation.pages.HomePage;
import com.automation.pages.ProductPage;
import com.automation.pages.WomenCategoryPage;
import com.automation.testbase.TestBase;
import com.google.common.base.Verify;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class WomenCategoryPageTest extends TestBase {

    HomePage homePage;
    WomenCategoryPage womenCategoryPage;
    ProductPage productPage;


    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        womenCategoryPage = new WomenCategoryPage();
        productPage = new ProductPage();

    }

    @Test(groups = {"sanity","regression"})
    public void verifyUserShouldNavigateToWomenCategoryPageSuccessfully() {
        // Click on WOMEN tab
        homePage.clickOnWomanTabLink();
        // Verify "WOMWN" text
        Assert.assertEquals(womenCategoryPage.verifyWomenText(), "WOMEN", "error");

    }
    @Test(dataProvider = "productdata", dataProviderClass = TestData.class,groups = {"smoke","regression"})
    public void verifyUserShouldAddProductToTheCartSuccessfully(String product, String qty, String
            size, String colour) throws InterruptedException {

        // Click on WOMEN tab
        homePage.clickOnWomanTabLink();
       // Click on the product "product"
        Thread.sleep(2000);
        womenCategoryPage.clkOnProductList(product);
        productPage.clkOnQnt(qty);
        productPage.clkOnSize(size);
        productPage.clkOnColoour(colour);
        productPage.clkAddCart();
        womenCategoryPage.clkPopUp();

    }


}
