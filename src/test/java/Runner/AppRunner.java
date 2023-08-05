package Runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(features = {"src/test/resources/AppFeature/TC001_EriBankLogin.feature","src/test/resources/AppFeature/TC002_MakePayment.feature" },
        glue = {"AppStepDefs"},   monochrome = true,
        dryRun = false,
        plugin = {
                "pretty","html:build/reports/feature.html"
        })
@Test
public class AppRunner extends AbstractTestNGCucumberTests {
}


