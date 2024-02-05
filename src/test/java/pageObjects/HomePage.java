package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public WebDriver driver;

    public HomePage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//a[@title='My Account']")
    WebElement linkMyAccount;

    @FindBy(xpath = "(//a[normalize-space()='Register'])[1]")
    WebElement linkRegister;

    public void clickMyAccount(){
        linkMyAccount.click();
    }

    public void clickRegister(){
        linkRegister.click();
    }
}