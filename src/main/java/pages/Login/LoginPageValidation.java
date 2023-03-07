package pages.Login;

import context.TestContext;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPageValidation extends LoginPage {
    public LoginPageValidation(TestContext testContext) {
        super(testContext);
    }

    public boolean isOnPage() {
        return isButtonLoginIsDisplay();
    }

    public boolean isUsernameFieldIsDisplay(){
        return getWait().until(ExpectedConditions.visibilityOf(inputUsername)).isDisplayed();
    }

    public boolean isPasswordFieldIsDisplay(){
        return getWait().until(ExpectedConditions.visibilityOf(inputPassword)).isDisplayed();
    }

    public boolean isButtonLoginIsDisplay(){
        return getWait().until(ExpectedConditions.visibilityOf(buttonlogin)).isDisplayed();
    }
}