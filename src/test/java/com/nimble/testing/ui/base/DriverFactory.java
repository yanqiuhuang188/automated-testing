package com.nimble.testing.ui.base;

import com.nimble.testing.utils.PropertiesUtil;
import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

/**
 * @Auther: YanQiu
 * @Date: 2018/12/09
 * @Description:
 */
public class DriverFactory implements DriverSource {

    private static WebDriver customDriver;
    private static MyWebDriver webDriverJustForCloseBrowser;

    public static void resetWebDriver() {
        DriverFactory.customDriver = null;
    }

    public static MyWebDriver getWebDriverJustForCloseBrowser() {
        return DriverFactory.webDriverJustForCloseBrowser;
    }

    @Override
    public WebDriver newDriver() {
        if (DriverFactory.customDriver != null) {
            return DriverFactory.customDriver;
        }

        Properties customProperties = PropertiesUtil.getProperties("custom.properties");
        String browserType = customProperties.getProperty("browserType", DriverType.CHROME.toString()).toUpperCase();
        DriverType customDriverType = DriverType.valueOf(browserType);

        switch (customDriverType) {
            case CHROME:
                System.setProperty("webdriver.chrome.driver", customProperties.getProperty("chromeDriverPath"));
                MyChromeDriver myChromeDriver = new MyChromeDriver();
                DriverFactory.webDriverJustForCloseBrowser = myChromeDriver;
                DriverFactory.customDriver = myChromeDriver;
                break;
            case IE:
                System.setProperty("webdriver.ie.driver", customProperties.getProperty("ieDriverPath"));
                MyInternetExploreDriver myInternetExploreDriver = new MyInternetExploreDriver();
                DriverFactory.webDriverJustForCloseBrowser = myInternetExploreDriver;
                DriverFactory.customDriver = myInternetExploreDriver;
                break;
            default:
                System.setProperty("webdriver.chrome.driver", customProperties.getProperty("chromeDriverPath"));
                MyChromeDriver defaultDriver = new MyChromeDriver();
                DriverFactory.webDriverJustForCloseBrowser = defaultDriver;
                DriverFactory.customDriver = defaultDriver;
                break;
        }
        DriverFactory.customDriver.manage().window().maximize();
        return DriverFactory.customDriver;
    }

    @Override
    public boolean takesScreenshots() {
        return true;
    }
}
