package com.nimble.testing.ui.base;

import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @Auther: YanQiu
 * @Date: 2018/12/09
 * @Description:
 */
public class MyChromeDriver extends ChromeDriver implements MyWebDriver{

    @Override
    public void quit(){
        // override this function, let it don't quit the browser.
    }

    @Override
    public void closeBrowser() {
        super.close();
        super.quit();
        DriverFactory.resetWebDriver();
    }
}
