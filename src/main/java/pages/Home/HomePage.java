package pages.Home;


import context.TestContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

public class HomePage extends BasePage {
    @FindBy(xpath = "//a[@href='/web/index.php/dashboard/index']/span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']")
    WebElement buttonDashboard;

    public HomePage(TestContext context) {
        super(context);
        PageFactory.initElements(context.driver, this);
    }

}
