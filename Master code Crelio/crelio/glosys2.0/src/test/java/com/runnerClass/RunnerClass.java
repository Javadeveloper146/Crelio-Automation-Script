package com.runnerClass;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:feature", glue = "com.stepDefinition",

// ,"@LabSupervisorModule',@LabJuniorModule, @Test

//tags = "@Test",

		dryRun = false, monochrome = true)

public class RunnerClass {

}
