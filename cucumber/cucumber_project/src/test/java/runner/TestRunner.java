package runner;

//import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;

@CucumberOptions(features="src/test/resources/EditAccount.feature" , glue="steps")
public class TestRunner extends BaseClass {

}
