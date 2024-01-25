import com.swinji.base.Base;
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features",glue ="steps",plugin = {"pretty" , "html:target/reports/report.html"},dryRun = true )

public class TestRunner extends Base {



}
