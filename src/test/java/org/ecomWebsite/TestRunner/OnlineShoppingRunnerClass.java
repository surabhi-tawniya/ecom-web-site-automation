package org.ecomWebsite.TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


public class OnlineShoppingRunnerClass {


    @RunWith(Cucumber.class)
    @CucumberOptions(
            monochrome = true,
            features = {"src/test/resources/features/"},
            glue = {"StepDefinations"},
            plugin = {"pretty","html:target/cucumber-html-report", "json:target/cucumber.json"})

    public class CucumberRunnerTest {
    }
}
