package com.automation.testsuite;

import com.automation.pages.CreateAccountPage;
import com.automation.pages.HomePage;
import com.automation.pages.MyAccountPage;
import com.automation.pages.SignInPage;
import com.automation.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AccountPageTest extends TestBase {

    HomePage homePage;
    SignInPage signInPage;
    CreateAccountPage createAccountPage;
    MyAccountPage myAccountPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        signInPage = new SignInPage();
        createAccountPage = new CreateAccountPage();
        myAccountPage = new MyAccountPage();

    }
    @Test(groups = {"sanity","regression"})
    public void verifyThatUserShouldCreateAccountSuccessfully() {

        //Click on Sign in Link
        homePage.clickOnSignInTabLink();
        // Enter email address
        signInPage.enterCreateActEmailId("abcxyz01010101@yahoo.com");
        // Click on "Create an account" button
        signInPage.clkOnCreatActBtn();
        //Fill all mandatory fields
        createAccountPage.clkOnMaleRadio();
        createAccountPage.enterFstName("abc");
        createAccountPage.enterLstName("xyz");
        createAccountPage.enterPassword("primetest");
        createAccountPage.selectDay("1");
        createAccountPage.selectMonth("1");
        createAccountPage.selectYear("2000");
        createAccountPage.clkOnNewsLetterCheckBox();
        createAccountPage.clkOnSplOfferCheckBox();
        createAccountPage.enterAddFstName("abc");
        createAccountPage.enterAddLstName("xyz");
        createAccountPage.enterAddress("abcxyz");
        createAccountPage.enterCity("amdavad");
        createAccountPage.selectState("1");
        createAccountPage.enterZip("00000");
        createAccountPage.enterMobile("00000000");
        createAccountPage.enterRefAddress("abc xyz");
        // Click on "Register" button
        createAccountPage.clkOnRegBtn();
        // Verify message "My Account"
        Assert.assertEquals(myAccountPage.verifyMyAccText(), "My Account", "error");

    }


}
