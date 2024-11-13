package com.web.automation.base;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
				 glue = "com.web.automation.stepdefinitions",
				 tags = "@TC_LP_006")
public class TestRunner {

}
