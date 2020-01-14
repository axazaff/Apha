package co.uk.zoopla.hooks;

import co.uk.zoopla.commons.BrowserClass;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Hook extends BrowserClass
{
    public Scenario scenario;

@Before
    public void setup(Scenario scenario)
{
    this.scenario = scenario;
    launchbrower("Chrome");
}
@After
    public void tearDown()
{
    String dateNow = new SimpleDateFormat("ddMMyyyy")
            .format(new GregorianCalendar().getTime()); // gregorian calender is a calender from 1970. it calculates the time spam with milisecond.
    String timeNow = new SimpleDateFormat("HHmmss")
            .format(new GregorianCalendar().getTime());
    String filename = String.format("./Screenshot%s/screenshot_%s.png",dateNow,timeNow);

    if (scenario.isFailed())
    {
        try{
            byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);scenario.embed (screenshot,filename);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    closeBrowser();
}

}
