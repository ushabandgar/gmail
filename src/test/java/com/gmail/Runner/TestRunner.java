package com.gmail.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/Features",
glue="com.gmail.stepdefinations",tags="@today")
public class TestRunner extends AbstractTestNGCucumberTests{

}
