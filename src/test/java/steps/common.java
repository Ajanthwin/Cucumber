package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class common {

    WebDriver driver;
    @Before
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @After
    public void teardown(Scenario scenario) throws InterruptedException {
        if(scenario.isFailed()){
            final byte[] scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(scr,"image/png",scenario.getName());
        }
        driver.quit();
        Thread.sleep(1000);
    }

    public WebDriver getDriver(){
        return driver;
    }


}
