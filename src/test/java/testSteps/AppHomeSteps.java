package testSteps;

import core.TestFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import utilities.TestConfig;
import utilities.common;

import java.io.IOException;

public class AppHomeSteps extends BaseSteps{

    public AppHomeSteps() throws IOException {
    }

    @Given("url is launched")
    public void urlIsLaunched() {
        aphm.navigate_to_URL();
    }

}

