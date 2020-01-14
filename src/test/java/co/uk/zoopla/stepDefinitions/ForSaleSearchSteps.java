package co.uk.zoopla.stepDefinitions;

import co.uk.zoopla.pages.BasePage;
import co.uk.zoopla.pages.HomePage;
import co.uk.zoopla.pages.ProductDetailsPage;
import co.uk.zoopla.pages.SearchResultPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;


public class ForSaleSearchSteps extends BasePage {
    HomePage homePage = PageFactory.initElements(driver,HomePage.class);// homepage and stepdefinition are working together
    SearchResultPage searchResultPage =PageFactory.initElements(driver,SearchResultPage.class);
    ProductDetailsPage productDetailsPage = PageFactory.initElements(driver,ProductDetailsPage.class);



    @Given("I navigate to zoopla homepage")
    public void i_navigate_to_zoopla_homepage() {
        launchURL();
    }

    @When("I enter a {string} in the search text box")
    public void i_enter_in_the_seach_text_box(String search) {
        homePage.enterLocation(search);

    }

    @When("I select {string} from minimum price dropdown")
    public void i_select_from_minimum_price_dropdown(String minPrice) {
        homePage.selectMinimumPrice(minPrice);

    }

    @When("I select {string} from maximum price dropdown")
    public void i_select_from_maximum_price_dropdown(String maxPrice) {
        homePage.selectMaximumPrice(maxPrice);

    }

    @When("I select {string} from property type dropdown")
    public void i_select_from_property_type_dropdown(String ptype) {
        homePage.selectPropertyType(ptype);

    }

    @When("I select {string} from Bedrooms dropdown")
    public void i_select_from_Bedrooms_dropdown(String string) {

    }

    @When("I click on Search button")
    public void i_click_on_Search_button() {
        searchResultPage = homePage.clickOnSearchButton();

    }

    @Then("a list of {string} in {string} are displayed")
    public void a_list_of_in_are_displayed(String property, String location) {
        searchResultPage.isPropertyDisplayed(property,location);

    }

    @Then("I click on one of the result links")
    public void i_click_on_one_of_the_result_links() {
        // Write code here that turns the phrase above into concrete actions
        productDetailsPage = searchResultPage.clickOnOneOfTheResult();
    }


}
