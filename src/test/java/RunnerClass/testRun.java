package RunnerClass;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)

@CucumberOptions(
		features=".//Features/loginFeature.feature",
		glue="StepDefination",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty"}
		)
public class testRun {
//This class should be empty
}
