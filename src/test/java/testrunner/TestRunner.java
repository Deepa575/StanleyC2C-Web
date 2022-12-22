package testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;
import io.cucumber.junit.CucumberOptions;
//import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"C:\\Users\\Vassar\\eclipse-workspace\\StanleyC2C-Web\\src\\test\\resources\\PositiveFlowFeatures\\LoginStanley.feature"},
        glue = {"stepdefinitions", "apphooks"},
        plugin = {"pretty",
        		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","html:target/cucumber-report.html","json:target/json-report.json"
				,"timeline:test-output/"
               
        },
        monochrome = true

)
public class TestRunner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
