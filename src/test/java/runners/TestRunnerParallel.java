package runners;

import com.saucedemo.base.Base;
import io.cucumber.testng.CucumberOptions;

    @CucumberOptions(features = "login.feature/MyTest" , tags = "",glue = "steps",plugin = ( "json:target/reports/report.json"))
    public class TestRunnerParallel extends Base {

    }


