package com.dk.cucumber.runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

/*
// This is for JUnit not for TestNG
@RunWith(Cucumber.class)
 */
@CucumberOptions(
        features = {"src/test/java/com/dk/cucumber/features"},
        glue = {"com.dk.cucumber.steps"},
        plugin = {
                "pretty",
//                default html report cucumber
                "html:target/cucumber/myhtmlreport.html",
//                default report comes from cucumber
//                Json report must needed for developer and JVM Report
                "json:target/cucumber/myjsonreport.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        }
)
public class BaseRunner extends AbstractTestNGCucumberTests {

        @Test
        public void testSample() {
                System.out.println("Running from jenkins 004");
        }
}
