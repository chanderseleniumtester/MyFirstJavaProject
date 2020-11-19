package TestSuite;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber; 

@RunWith(Cucumber.class) 
@CucumberOptions(
		
		format = {"pretty", "html:target/cucumber.html"},
		
		features= {"C:\\Users\\Tarun_PC\\Documents\\Testing Tools\\Nov_BDD\\Nov_BDD\\src\\main\\resources\\FeatureFiles\\Login.feature"}
				) 

public class runTest {

}
