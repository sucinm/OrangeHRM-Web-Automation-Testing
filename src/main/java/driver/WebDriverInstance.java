package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebDriverInstance {
    public static RemoteWebDriver initialize(Boolean isRunningOnHub) {
        RemoteWebDriver webDriver = null;

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--disable-dev-shm-usage", "--incognito", "--start-maximized", "window-size=1920,1080");
        options.addArguments("--remote-allow-origins=*");
        options.setHeadless(true);
        WebDriverManager.chromedriver().setup();

        webDriver = new ChromeDriver(options);

        assert webDriver != null;
        webDriver.get("https://opensource-demo.orangehrmlive.com/");
        return webDriver;
    }
}
