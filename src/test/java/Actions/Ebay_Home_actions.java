package Actions;

import elements.Ebay_Home;
import org.openqa.selenium.WebDriver;
import steps.common;

public class Ebay_Home_actions {


    private WebDriver driver;
    Ebay_Home ebayHome;

    public Ebay_Home_actions(common commonobj) {
        this.driver = commonobj.getDriver();
        ebayHome = new Ebay_Home(driver);
    }

    public void clickAdvancedLink(){
        ebayHome.Advanced.click();
    }

    public void searchanitem(String str){
        ebayHome.productstextbox.sendKeys(str);
    }



}
