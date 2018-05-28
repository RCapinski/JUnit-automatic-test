package test.java.testrunner;

import org.junit.runner.RunWith;		
import cucumber.api.CucumberOptions;		
import cucumber.api.junit.Cucumber;		

@RunWith(Cucumber.class)				
@CucumberOptions(features= "src/test/java/features",glue={"test.java.stepdefinition"})
public class Runner 				
{		

}