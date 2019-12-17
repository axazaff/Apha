package co.uk.zoopla.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForSaleSearchSteps {
    WebDriver driver;
    WebElement searchfield;

    @Given("I navigate to zoopla homepage")
    public void i_navigate_to_zoopla_homepage() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://www.zoopla.co.uk/");
    }

    @When("I enter a {string} in the seach text box")
    public void i_enter_a_in_the_seach_text_box(String string) {
searchfield=driver.findElement(By.id("search-input-location"));
searchfield.sendKeys(string);

    }

    @When("I select {string} from minimum price dropdown")
    public void i_select_from_minimum_price_dropdown(String string) {

    }

    @When("I select {string} from maximum price dropdown")
    public void i_select_from_maximum_price_dropdown(String string) {

    }

    @When("I select {string} from property type dropdown")
    public void i_select_from_property_type_dropdown(String string) {

    }

    @When("I select {string} from Bedrooms dropdown")
    public void i_select_from_Bedrooms_dropdown(String string) {

    }

    @When("I click on Search button")
    public void i_click_on_Search_button() {

    }

    @Then("a list of {string} in {string} are displayed")
    public void a_list_of_in_are_displayed(String string, String string2) {

    }

}
