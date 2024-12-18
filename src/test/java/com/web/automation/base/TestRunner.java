package com.web.automation.base;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
<<<<<<< HEAD
				 glue = {"com.web.automation.stepdefinitions","com.web.automation.base"},
				 tags = "@TC_RP_002",
				 plugin = {"pretty","html:target/CucumberReport.html"},
				 snippets = SnippetType.CAMELCASE,
				 dryRun = false)
=======
<<<<<<< HEAD
				 glue = {"com.web.automation.stepdefinitions","com.web.automation.base","com.web.automation.utils"},
				 tags = "@TC_RP_001 or @Login",
				 plugin = {"pretty","html:target/CucumberReport.html"},
				 snippets = SnippetType.CAMELCASE,
				 dryRun = false)
=======
<<<<<<< HEAD
				 glue = {"com.web.automation.stepdefinitions","com.web.automation.base","com.web.automation.utils"},
				 tags = "@TC_RP_001",
				 plugin = {"pretty","html:target/CucumberReport.html"},
				 snippets = SnippetType.CAMELCASE,
				 dryRun = false)
=======
				 glue = "com.web.automation.stepdefinitions",
				 tags = "not @TC_LP_004",
				 plugin = {"pretty","html:target/CucumberReport.html"},
				 snippets = SnippetType.CAMELCASE,
				 dryRun = true)
>>>>>>> 0dab827540aafca19fbda653044c1f21d7fcab7a
>>>>>>> main
>>>>>>> main
public class TestRunner {

}
