package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
       plugin = {"pretty", "html:target/cucumber-report.html"},
       features = "src/test/resources/features",
      // tags = "@ignore",
       glue = {"steps"}

)

public class RunCucumber {
}
