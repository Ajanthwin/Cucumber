package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ebay_Home {


    private final WebDriver driver;

    @FindBy(linkText = "Advanced")
    public WebElement Advanced;
    @FindBy(xpath = "//input[@id='gh-ac']")
    public WebElement productstextbox;
    @FindBy(xpath = "//input[@id='gh-btn']")
    public WebElement button;
    @FindBy(css = "h1.srp-controls__count-heading>span.BOLD:first-child")
    public WebElement resultsCount;


    public Ebay_Home(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
