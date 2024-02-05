package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001AccountRegistrationTest extends BaseClass {

    @Test
    public void verify_account_registration() {
        HomePage homePage = new HomePage(driver);
        homePage.clickMyAccount();
        homePage.clickRegister();

        AccountRegistrationPage accountRegistrationPage = new AccountRegistrationPage(driver);
        accountRegistrationPage.setFirstName(randomString().toUpperCase());
        accountRegistrationPage.setLastName(randomString().toUpperCase());
        accountRegistrationPage.setEmail(randomString()+"@gmail.com");
        accountRegistrationPage.setTelephone(randomNumber());

        String pass = randomAlphaNumeric();
        accountRegistrationPage.setPassword(pass);
        accountRegistrationPage.setConfirmPassword(pass);
        accountRegistrationPage.setPrivacyPolicy();
        accountRegistrationPage.clickContinue();

        String confirmMessage = accountRegistrationPage.getConfirmationMsg();
        Assert.assertEquals(confirmMessage, "Your Account Has Been Created!");
    }
}