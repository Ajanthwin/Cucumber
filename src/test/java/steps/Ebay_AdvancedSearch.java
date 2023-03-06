package steps;

import Actions.Ebay_Home_actions;
import Actions.Ebay_advanced_actions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay_AdvancedSearch {

    private Ebay_advanced_actions ebayadvactions;
    WebDriver driver;
    public Ebay_AdvancedSearch(common commonobject,Ebay_advanced_actions ebayadvactions) {
        this.driver = commonobject.getDriver();
        this.ebayadvactions = ebayadvactions;
    }

    @Given("I am on Ebay Advanced Search Page")
    public void i_am_on_ebay_advanced_search_page() {

        driver.get("https://www.ebay.com/sch/ebayadvsearch");
    }
    @When("I click on Ebay Logo")
    public void i_click_on_ebay_logo() {

        driver.findElement(By.linkText("Home")).click();
    }
    @Then("I land on the Ebay home page")
    public void i_land_on_the_ebay_home_page() {

        Assert.assertEquals("https://www.ebay.com/", driver.getCurrentUrl());
     }
    @When("I advanced search an item")
    public void i_advanced_search_an_item(DataTable dataTable) throws InterruptedException {
        ebayadvactions.advancedsearch(dataTable);
        Thread.sleep(3000);
    }
}
