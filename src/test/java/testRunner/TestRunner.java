package testRunner;

import core.TestFactory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import utilities.common;


@RunWith(Cucumber.class)
    @CucumberOptions(features= {"src/test/resources/feature"}
            ,glue= {"testSteps"}
//            ,tags= {"@1"}
            ,plugin= {"html:target/cucumber-html-report","json:target/cucumber.json"})



    public class TestRunner {

        @AfterClass
        public static void cleanup() {
//            common.driver.close();
//            common.driver.quit();
        }
    }




