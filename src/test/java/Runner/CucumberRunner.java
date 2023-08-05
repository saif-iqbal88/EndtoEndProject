package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(features = {"src/test/resources/Feature/TC_001_addCustomer.feature","src/test/resources/Feature/TC_002_Open_Account.feature"},
        glue = {"StepDefinition"},   monochrome = true,
        dryRun = false,
        plugin = {
                "pretty","html:build/reports/feature.html"
        })
@Test
public class CucumberRunner extends AbstractTestNGCucumberTests {
}
