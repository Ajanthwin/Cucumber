package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ebay_advanced {

    WebDriver driver;
    @FindBy(xpath = "//input[@id='_nkw']") public WebElement SearchString;
    @FindBy(xpath = "//input[@id='_ex_kw']") public WebElement excludeString;
    @FindBy(xpath = "//input[@name='_udlo']") public WebElement minPrice;
    @FindBy(xpath = "//input[@name='_udhi']") public WebElement maxPrice;
    @FindBy(xpath = "//button[@class='btn btn--primary'][1]") public WebElement searchButton;

    public Ebay_advanced (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
