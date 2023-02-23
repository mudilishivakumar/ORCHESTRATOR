package PageObjects;

import Utilities.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BaseClass {

    public LoginPage(WebDriver driver, WebDriverWait wait) {

        super(driver, wait);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//body/app-root[1]/app-signin[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]")
    @CacheLookup
    private WebElement emailField;

    @FindBy(xpath = "//body/app-root[1]/app-signin[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/input[1]")
    @CacheLookup
    private WebElement passwordField;

    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-signin[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/input[1]")
    @CacheLookup
    private WebElement signInButton;

    @FindBy(xpath = "//*[contains(@class,'has-error')]")
    @CacheLookup
    private WebElement errorMessageLabel;

    @FindBy(xpath = "//a[@href='/forgetpassword']")
    @CacheLookup
    private WebElement forgotPasswordLink;

    @FindBy(xpath = "//a[@href='/loginWithGoogle']")
    @CacheLookup
    private WebElement signInGoogleButton;

    @FindBy(xpath = "//a[@href='/loginWithFacebook']")
    @CacheLookup
    private WebElement signInFacebookButton;

    @FindBy(xpath = "//a[@href='/register']")
    @CacheLookup
    private WebElement registerLink;

    @FindBy(xpath = "//h1[text()='Sign In']")
    @CacheLookup
    private WebElement signInTitle;

    @FindBy(css = ".pt-4")
    @CacheLookup
    private WebElement mobiusLogo;

    public void fillEmailData(String email) {

        WaitUntilElementVisible(emailField);
        emailField.isEnabled();
        emailField.clear();
        emailField.sendKeys(email);
    }

    public void fillPasswordData(String password) {

        WaitUntilElementVisible(passwordField);
        passwordField.isEnabled();
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickSignInButton() {

        WaitUntilElementVisible(signInButton);
        signInButton.isEnabled();
        signInButton.click();
    }

    public boolean errorMessageIsDisplayed() {

        WaitUntilElementVisible(errorMessageLabel);
        errorMessageLabel.isDisplayed();
        return true;
    }

    public boolean loginPageIsDisplayed() {


        WaitUntilElementVisible(emailField);
        emailField.isDisplayed();
        WaitUntilElementVisible(passwordField);
        passwordField.isDisplayed();
        WaitUntilElementVisible(signInButton);
        signInButton.isDisplayed();

        return true;
    }

    public void mobiusLogo() {
        WaitUntilElementVisible(mobiusLogo);
        mobiusLogo.isDisplayed();
    }
}