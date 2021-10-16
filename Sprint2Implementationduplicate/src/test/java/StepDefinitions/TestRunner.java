package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\ADARSHJH\\eclipse-workspace\\Sprint2Implementation\\src\\test\\resources\\Features\\tc01.feature"
,glue= {"StepDefinitions"},
monochrome=true,
plugin = { "pretty","html:target/HtmlReports","junit:target/JUnitReports/report.xml",
		"json:target/JSONReports/report.json"},
strict=true)







public class TestRunner {
	

}
