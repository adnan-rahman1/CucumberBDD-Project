package com.dk.cucumber.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;

public class Login {

    @Before("@SmokeTest")
    public void beforeHookTwo() {
        System.out.println("This is before hook from SmokeTest");
    }

    @After("@SmokeTest")
    public void afterHookTwo() {
        System.out.println("This is after hook SmokeTest");
    }

    @Before("@SanityTest")
    public void beforeHook() {
        System.out.println("Executing before hooki SanityTest");
    }

    @After("@SanityTest")
    public void afterHook() {
        System.out.println("Executing after hook SanityTest");
    }

    @Given("User open a browser")
    public void user_open_a_browser() {
        System.out.println("user open chrome browser");
    }

    @And("User enter {string} email address")
    public void userEnterEmailAddress(String email) {
        System.out.println("User enter email: " + email);
    }

    @And("User enter {string} password")
    public void userEnterPassword(String password) {
        System.out.println("User enter password: " + password);
    }

    @And("User click on login button")
    public void user_click_on_login_button() {
        System.out.println("user click on login button");
    }

    @Then("User close the browser")
    public void user_close_the_browser() {
        System.out.println("user close the browser");
    }

    @And("User navigate to website")
    public void userNavigateToWebsite(DataTable table) {
        List<List<String>> data = table.asLists();
        String browser = data.get(0).get(1);
        if (browser.equals("chrome"))
        {
//            Configure chrome browser
            System.out.println("chrome browser");
        }
        else if (browser.equals("firefox")) {
//            configure firefox browser
            System.out.println("firefox browser");
        }

    }
}
