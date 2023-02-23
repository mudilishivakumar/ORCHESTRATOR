package StepDefinitions;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import Utilities.PropertiesReader;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginSteps {

    private WebDriver driver = Hooks.driver;
    private WebDriverWait wait;

    public LoginSteps() throws Exception {

        PropertiesReader propertiesReader = new PropertiesReader();
        this.wait = new WebDriverWait(driver, propertiesReader.getTimeout());
    }


    @Given("Login form in login page")
    public void loginPageIsDisplayed() {
        LoginPage login = new LoginPage(driver, wait);
        login.mobiusLogo();

    }

    @When("Submit email using \"(.*)\" and password using \"(.*)\"")
    public void submitEmailPassword(String email, String password) {

        LoginPage login = new LoginPage(driver, wait);


        login.fillEmailData(email);
        login.fillPasswordData(password);
        login.clickSignInButton();
    }

    @Then("Success login to home page with displaying account button")
    public void successLogin() {

        HomePage home = new HomePage(driver, wait);
        Assert.assertTrue(home.homePageAfterLoginIsDisplayed());
    }

    @Then("Login failed with displaying error message")
    public void loginFailed() {

        LoginPage login = new LoginPage(driver, wait);
        Assert.assertTrue(login.errorMessageIsDisplayed());
    }

    @Then("^Then User verfiy the Page title$")
    public void then_User_verfiy_the_Page_title()  {
        String title=driver.getTitle();
        //Verify The Title
        if (title.equals("OrchestratorUi"))
        {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }


    @Then("^User able to click all the buttons in toolBar menu$")
    public void user_able_to_click_all_the_buttons_in_toolBar_menu() throws Throwable {
        HomePage home = new HomePage(driver, wait);
        home.clickLogoButtons();

    }

    @Then("^User is able to see all the Logos, Buttons in toolBar menu$")
    public void user_is_able_to_see_all_the_Logos_Buttons_in_toolBar_menu() throws Throwable {
        HomePage home = new HomePage(driver, wait);
        home.homePageIsDisplayed();

    }
}