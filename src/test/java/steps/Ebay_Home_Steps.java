package steps;

import Actions.Ebay_Home_actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Ebay_Home_Steps {
    private final Ebay_Home_actions ebayhomeActions;
    WebDriver driver;
    public Ebay_Home_Steps(common commonobject,Ebay_Home_actions ebayHomeActions) {
        this.driver = commonobject.getDriver();
        this.ebayhomeActions = ebayHomeActions;
    }

    @Given("I am on Ebay Home Page")
    public void i_am_on_ebay_home_page() {
        driver.get("https://ebay.com");
    }

    @When("I click on Advanced Link")
    public void i_click_on_advanced_link() {
        ebayhomeActions.clickAdvancedLink();
    }

    @Then("I land on the Advanced Search page")
    public void i_land_on_the_advanced_search_page() {
        Assert.assertEquals("https://www.ebay.com/sch/ebayadvsearch", driver.getCurrentUrl());
    }

    @When("I search for {string}")
    public void iSearchForProduct(String product) throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys(product);
        driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
        Thread.sleep(1000);
    }

    @Then("I validate at least {int} results are displayed")
    public void iValidateAtLeastResultsAreDisplayed(int count) {
        Assert.assertTrue(count < Integer.parseInt(driver.findElement(By.cssSelector
                ("h1.srp-controls__count-heading>span.BOLD:first-child")).getText().trim().replace(",", "")));
    }

    @When("I search for {string} in {string} category")
    public void iSearchForSoapInBabyCategory(String product, String category) throws InterruptedException {
        Select se = new Select(driver.findElement(By.xpath("//select[@id='gh-cat']")));
        se.selectByVisibleText(category);
        driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys(product);
        driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
        Thread.sleep(1000);
    }

    @When("I click on {string}")
    public void iClickOnLink(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }

    @Then("I validate the page navigates to {string} and title contains {string}")
    public void iValidateThePageNavigatesToUrlAndTitleContainsTitle(String url, String pageTitle) throws InterruptedException {
        Assert.assertEquals(url, driver.getCurrentUrl());
        Assert.assertEquals(pageTitle, driver.getTitle());
        Thread.sleep(4000);
    }
}
