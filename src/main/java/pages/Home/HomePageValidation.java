package pages.Home;


import context.TestContext;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.Home.HomePage;

public class HomePageValidation extends HomePage {
    public HomePageValidation(TestContext testContext) {
        super(testContext);
    }

    public boolean isOnPage(){
        return getWait().until(ExpectedConditions.visibilityOf(buttonDashboard)).isDisplayed();
    }
}
