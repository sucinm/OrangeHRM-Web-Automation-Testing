package steps;

import context.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Home.HomePageValidation;
import pages.Login.LoginPageAction;
import pages.Login.LoginPageValidation;

public class LoginSteps {
    private final LoginPageAction action;
    private final LoginPageValidation loginPageValidation;
    private final HomePageValidation homePageValidation;

    public LoginSteps(TestContext context) {
        action = new LoginPageAction(context);
        loginPageValidation = new LoginPageValidation(context);
        homePageValidation = new HomePageValidation(context);
    }

    @Given("User already in Login page")
    public void userAlreadyInLoginPage() {
        loginPageValidation.isOnPage();
    }

    @When("User provide valid username and password")
    public void userProvideValidUsernameAndPassword() {
        action.setUsername("Admin");
        action.setPassword("admin123");
        action.clickLogin();
    }

    @Then("User directed to the dashboard page")
    public void userDirectedToTheDashboardPage() {
        Assert.assertTrue(homePageValidation.isOnPage());
    }

}
