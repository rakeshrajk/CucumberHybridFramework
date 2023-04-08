package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/feature",
		glue={"stepdefinitions","hooks"},
		plugin= {"pretty","html:target/cucumber-reports/MyLovelyyyyyyyyNeha.html"},
		publish = true
		
		)
public class TestRunner {

}
