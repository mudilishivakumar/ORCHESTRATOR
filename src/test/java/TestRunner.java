import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.File;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "StepDefinitions",
        format = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "junit:target/cucumber-reports/CucumberTestReport.xml",
                "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"
        }
)
public class TestRunner {
        @AfterClass
        public static void writeExtentReport() {
                Reporter.loadXMLConfig(new File("config/report.xml"));
        }

}
