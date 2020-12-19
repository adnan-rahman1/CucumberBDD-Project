package com.dk.cucumber.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Product {
    @Given("User navigate to macy website")
    public void userNavigateToMacyWebsite() {
        System.out.println("user navigate to macy website");
    }

    @And("User select a {string} shirt")
    public void userSelectAShirt(String color) {
        System.out.println("User select " + color  + " color shirt");
    }

    @And("User enter {string} payment information")
    public void userEnterPaymentInformation(String option) {
        System.out.println("user enter his " + option + " payment information");
    }

    @Then("User buy the selected shirt")
    public void userBuyTheSelectedShirt() {
        System.out.println("user buy the selected shirt");
    }
}
