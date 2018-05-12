package steps;

import application.TestProperties;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * Created by Rogoza Dimity on 06.05.2018.
 */
public class BaseSteps {
    protected static WebDriver driver;
    protected static String firstUrl;
    public static Properties properties = TestProperties.getInstance().getProperties();

    public static WebDriver getDriver(){
        return driver;
    }

    @Before
    public static void setup() {
        switch (properties.getProperty("browser")){
            case "firefox":
                System.setProperty("webdriver.gecko.driver", properties.getProperty("webdriver.gecko.driver"));
                driver = new FirefoxDriver();
                break;
            case "chrome":
                System.setProperty("webdriver.chrome.driver", properties.getProperty("webdriver.chrome.driver"));
                driver = new ChromeDriver();
                break;
            default: System.setProperty("webdriver.chrome.driver", properties.getProperty("webdriver.chrome.driver"));
            driver = new ChromeDriver();
        }
        firstUrl = properties.getProperty("first.url");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(firstUrl);
    }
    @After
    public static void tearDown () {
        driver.quit();
    }
}
