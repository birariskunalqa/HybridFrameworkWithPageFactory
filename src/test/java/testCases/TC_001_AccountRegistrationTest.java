package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

import static utilities.RandomDataGenerator.*;

public class TC_001_AccountRegistrationTest extends BaseClass {

    @Test(groups= {"sanity","master"})
    public void verify_account_registration() {

        try
        {
            HomePage hp=new HomePage(driver);
            hp.clickMyAccount();

            hp.clickRegister();

            AccountRegistrationPage regpage=new AccountRegistrationPage(driver);

            regpage.setFirstName(randomString().toUpperCase());
            regpage.setLastName(randomString().toUpperCase());
            regpage.setEmail(randomString()+"@gmail.com");// randomly generated the email
            regpage.setTelephone(randomNumber());

            String password=randomAlphaNumeric();

            regpage.setPassword(password);
            regpage.setConfirmPassword(password);

            regpage.setPrivacyPolicy();
            regpage.clickContinue();

            String confmsg=regpage.getConfirmationMsg();

            Assert.assertEquals(confmsg, "Your Account Has Been Created!","Account creation failed");

        }
        catch(Exception e)
        {
            Assert.fail();
        }
    }
}