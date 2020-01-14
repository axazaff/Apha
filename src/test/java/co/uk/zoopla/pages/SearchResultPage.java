package co.uk.zoopla.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class SearchResultPage  extends BasePage{

    public SearchResultPage(WebDriver driver)
    {
        this.driver = driver;
       PageFactory.initElements(driver, this); // gives us capability of preserving the state of driver and pass it to from one object to another
    }
    @FindBy(tagName = "h1")
    private WebElement title;
    @FindBy(css = "listing-result-price.text-price")
    private List<WebElement> results;


    public void isPropertyDisplayed(String property,String location)
    {
        String titleText = title.getText();
        Assert.assertTrue(titleText.contains(property));
        Assert.assertTrue(titleText.contains(location));
    }
    public ProductDetailsPage clickOnOneOfTheResult()
    {
        Random ran = new Random();
        int resultSize = results.size();
        int randomisedNumber = ran.nextInt(resultSize - 1);
        results.get(randomisedNumber).click();
        return new ProductDetailsPage(driver);

    }
}
