package com.nimble.testing.ui.base;

import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * @Auther: YanQiu
 * @Date: 2018/12/09
 * @Description:
 */
public class MyInternetExploreDriver extends InternetExplorerDriver implements MyWebDriver{

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
