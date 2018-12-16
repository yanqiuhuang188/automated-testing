package com.nimble.testing.ui.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

/**
 * @Auther: YanQiu
 * @Date: 2018/12/09
 * @Description:
 */
public class BaseSteps {
    @And("^an user open the website \"([^\"]*)\"$")
    public void anUserOpenTheWebsite(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^user search the keyword \"([^\"]*)\"$")
    public void userSearchTheKeyword(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^user can see the search result$")
    public void userCanSeeTheSearchResult() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
