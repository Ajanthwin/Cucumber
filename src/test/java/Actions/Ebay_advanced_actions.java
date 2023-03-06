package Actions;

import elements.Ebay_Home;
import elements.Ebay_advanced;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebDriver;
import steps.Ebay_AdvancedSearch;
import steps.common;

public class Ebay_advanced_actions {
    private WebDriver driver;
    Ebay_advanced ebayAdvanced;

    public Ebay_advanced_actions(common commonobj) {
        this.driver = commonobj.getDriver();
         ebayAdvanced = new Ebay_advanced(driver);
    }

    public void advancedsearch(DataTable dataTable){
        ebayAdvanced.SearchString.sendKeys(dataTable.cell(1,0));
        ebayAdvanced.excludeString.sendKeys(dataTable.cell(1,1));
        ebayAdvanced.minPrice.sendKeys(dataTable.cell(1,2));
        ebayAdvanced.maxPrice.sendKeys(dataTable.cell(1,3));
        ebayAdvanced.searchButton.click();
    }

}
