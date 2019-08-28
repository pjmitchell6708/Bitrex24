package com.Bitrix24.runners;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/default-cucumber-reports",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        },
        features = "C:\\Users\\pjmit\\OneDrive\\Documents\\IdeaProjects\\TMCProjects\\mooc-2013-OOProgrammingWithJava-PART1\\Bitrix24\\src\\test\\resources\\com.Bitrix24.features\\ActivityStream",
        glue = "com/Bitrix24/step_definitions",
        tags = "@login",
        dryRun = false
)
public class CukesRunner {
}
