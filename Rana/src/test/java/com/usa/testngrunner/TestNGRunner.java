package com.usa.testngrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		plugin =	{"pretty","html:target/cucumber", "json:target/cucumber.json"},
		features =	"Feature/Rana.feature",
		glue = 		"com.usa.stepdef",
		tags = 		"@rana"
		
		
		
		
		)




public class TestNGRunner extends AbstractTestNGCucumberTests {

}
