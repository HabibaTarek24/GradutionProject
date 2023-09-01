package StepsDef;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.P03_homePage;

public class D03_currenciesStepDef extends TestBase {
    P03_homePage HomepageObject = new P03_homePage(driver);

    @Given("user select euro Currencies")
    public void user_select_euro_currencies() {
      HomepageObject.SelectEuroFromDropDown();
    }

    @Then("the website change all price to Euro")
    public void theWebsiteChangeAllPriceToEuro() {
        HomepageObject.SelectCurrencies();
    }
}
