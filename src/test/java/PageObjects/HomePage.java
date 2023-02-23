package PageObjects;

import Utilities.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BaseClass {

    public HomePage(WebDriver driver, WebDriverWait wait) {

        super(driver, wait);
        PageFactory.initElements(driver, this);
    }



    @FindBy(css = "#v-home-tab")
    @CacheLookup
    private WebElement homeButton;

    @FindBy(css = "#v-workflows-tab")
    @CacheLookup
    private WebElement workflows;

    @FindBy(css = "#v-pills-components-tab")
    @CacheLookup
    private WebElement toolBox;

    @FindBy(css="#v-pills-cockpit-tab")
    @CacheLookup
    private WebElement cockpit;

    @FindBy(css = "#v-pills-settings-tab")
    @CacheLookup
    private WebElement settings;



    public boolean homePageIsDisplayed() {

        WaitUntilElementVisible(homeButton);
        homeButton.isEnabled();
        homeButton.isDisplayed();
//        homeButton.click();

        WaitUntilElementVisible(workflows);
        workflows.isEnabled();
        workflows.isDisplayed();
//        settings.click();
        WaitUntilElementVisible(toolBox);
        toolBox.isEnabled();
        toolBox.isDisplayed();
//        toolBox.click();

        WaitUntilElementVisible(cockpit);
        cockpit.isEnabled();
        cockpit.isDisplayed();
//        cockpit.click();
        WaitUntilElementVisible(settings);
        settings.isEnabled();
        settings.isDisplayed();

//        settings.click();
        return true;
    }

    public void clickLogoButtons() {

        WaitUntilElementVisible(homeButton);
        homeButton.click();
        WaitUntilElementVisible(workflows);
        workflows.click();
        WaitUntilElementVisible(toolBox);
        toolBox.click();
        WaitUntilElementVisible(cockpit);
        cockpit.click();
        WaitUntilElementVisible(settings);

        settings.click();






    }

    public boolean homePageAfterLoginIsDisplayed() {

//        WaitUntilElementVisible(accountButton);
//        accountButton.isDisplayed();
//        WaitUntilElementVisible(cartWithBadge);
//        cartWithBadge.isDisplayed();
        return true;
    }
}
