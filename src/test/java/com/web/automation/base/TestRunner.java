
package com.web.automation.base;
  
import org.junit.runner.RunWith;
  
import io.cucumber.junit.Cucumber; 
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
  
@RunWith(Cucumber.class)
  
@CucumberOptions(features = "src/test/resources/features",
  				   glue = {"com.web.automation.stepdefinitions","com.web.automation.base"}, 
  				   tags = "@TC_RP_002",
  				   plugin = {"pretty","html:target/CucumberReport.html"},
  				   snippets = SnippetType.CAMELCASE,
  				   dryRun = false
  				   )
public class TestRunner {
  
}
 