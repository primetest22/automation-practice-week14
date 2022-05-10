package com.automation.testsuite;

import com.automation.pages.*;
import com.automation.testbase.TestBase;
import com.google.common.base.Verify;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class SignPageTest extends TestBase {

    HomePage homePage;
    SignInPage signInPage;
    LoginPage loginPage;
    MyAccountPage myAccountPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        signInPage = new SignInPage();
        loginPage = new LoginPage();
        myAccountPage = new MyAccountPage();

    }

    @Test(groups = {"sanity","regression"})
    public void userShouldNavigateToSignInPageSuccessFully() {

        //Click on Sign In link
        homePage.clickOnSignInTabLink();
        //verify that "AUTHENTICATION" message is displayed
        Assert.assertEquals(signInPage.verifyAuthenticationText(), "AUTHENTICATION", "error");
    }

    @Test(dataProvider = "credentials", dataProviderClass = TestData.class,groups = {"sanity","regression"})
    public void verifyTheErrorMessageWithInValidCredentials(String username, String password,
                                                            String message) {
        // Click on sign in link
        homePage.clickOnSignInTabLink();

        // Enter "username" & "password"
        // Click on Sign in Button
        // Verify the Error message "message"
        loginPage.loginToApplication(username, password, message);

    }

    @Test(groups = {"smoke","regression"})
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials() {
        // Click on sign link
        homePage.clickOnSignInTabLink();
        // Enter EmailId
        loginPage.enterEmailId("abcxyz01@yahoo.com");
        // Enter Password
        loginPage.enterPassword("primetest");
        //Click on Sign Button
        loginPage.clickOnLoginButton();
        //Verify that Sign out link is displayed
        myAccountPage.verifySignOutLink();
        Assert.assertEquals(myAccountPage.verifySignOutLink(), "Sign out", "error");

    }

    @Test(groups = {"regression"})
    public void verifyThatUserShouldLogOutSuccessFully() {
        // Click on sign link
        homePage.clickOnSignInTabLink();
        // Enter EmailId
        loginPage.enterEmailId("abcxyz01@yahoo.com");
        // Enter Password
        loginPage.enterPassword("primetest");
        //Click on Sign Button
        loginPage.clickOnLoginButton();
        //Click on Sign out Link
        myAccountPage.clkOnSignOutLink();
        //Verify that Sign In Link displayed
        Assert.assertEquals(homePage.verifySignLinkText(), "Sign in", "error");
    }

}
