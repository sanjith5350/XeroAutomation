package com.qa.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\Users\\Administrator\\eclipse-workspace\\Xero\\src\\test\\resources\\com\\qa\\feature\\xero.feature"},
		glue = {"com\\qa\\stepDefinitions"},
		dryRun=false,
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		
		)
public class MyTestRunner {

}
