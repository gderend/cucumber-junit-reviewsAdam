package com.cydeo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin ={"html:target/cucumber-report.html"},//especially for reports
        features= "src/test/resources/features",
        glue="com/cydeo/step_definations",
        tags="@validLogin",
        dryRun = false, //in order to get snippets
        publish = true // in order to generate public link for reports

)
public class CukesRunner {
}
