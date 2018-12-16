package com.nimble.testing.ui;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * @Auther: YanQiu
 * @Date: 2018/12/09
 * @Description:
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "com.nimble.testing.ui.steps",
        features = {
                "src/test/resources/features/ui/01__login.feature"
        }
)
public class UiTestRunner {
}
