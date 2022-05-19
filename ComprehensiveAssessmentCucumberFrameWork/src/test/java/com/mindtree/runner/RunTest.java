package com.mindtree.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features="./src/test/resources/UrbanLadderFeatures",
                 glue= {"com.mindtree.stepDefinitions"},
                 monochrome = true,
                 plugin= {"pretty","html:CucumberReports/HtmlReports",
                		 "junit:CucumberReports/JunitReports/report.xml",
                		 "json:CucumberReports/cucumber.json"}
                 )
                 
public class RunTest {

}
