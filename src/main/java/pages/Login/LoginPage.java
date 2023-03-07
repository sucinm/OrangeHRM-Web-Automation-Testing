package pages.Login;

import context.TestContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

public class LoginPage extends BasePage {
    @FindBy(xpath = "//input[@name='username']")
    WebElement inputUsername;

    @FindBy(xpath = "//input[@name='password']")
    WebElement inputPassword;

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
    WebElement buttonlogin;

    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
    WebElement alertNotificationMessage;

    public LoginPage(TestContext context) {
        super(context);
        PageFactory.initElements(context.driver, this);
    }
}