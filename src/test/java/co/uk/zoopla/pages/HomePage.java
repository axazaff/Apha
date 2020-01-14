package co.uk.zoopla.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage
{
    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }
    @FindBy(id = "search-input-location")
    private WebElement searchField;
    @FindBy(id = "forsale_price_min")
    private WebElement minPrice;
    @FindBy(name = "price_max")
    private WebElement maxPrice;
    @FindBy(name = "property_type")
    private WebElement propertType;
    @FindBy(id = "search-submit")
    private WebElement searchButton;

    public void enterLocation(String location)
    {
        searchField.clear();
        searchField.sendKeys(location);

    }
    public void selectMinimumPrice(String miniPrice)
    {
        SelectByText(minPrice,miniPrice);
    }
    public void selectMaximumPrice(String pricemax)
    {
        SelectByText(maxPrice,pricemax); // maxprice is webelement
    }
    public void selectPropertyType(String ptype)
    {
        SelectByText(propertType,ptype);
    }
    public SearchResultPage clickOnSearchButton()
    {
        searchButton.click();
        return new SearchResultPage(driver);
    }

}
