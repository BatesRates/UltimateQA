package stepDefinitions;

import io.cucumber.java.en.Given;
import pageModels.UltimateQAPage;

public class FormStepDefs {
    @Given("user is on Ultimate QA page")
    public void userIsOnUltimateQAPage() {
        UltimateQAPage.openUltimateQA();

    }
}
