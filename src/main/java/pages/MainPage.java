package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

import java.util.List;

/**
 * Created by Rogoza Dimity on 12.05.2018.
 */
public class MainPage {
    @FindBy(xpath = "//div[contains(@class,'widget_id')]//h1/a[contains(@class,'home-link_blue')]")
    List<WebElement> menuWidgets;

    public MainPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void chooseWidget(String widget) {
        for (WebElement item : menuWidgets) {
            if (item.getText().equalsIgnoreCase(widget)) {
                item.click();
                return;
            }
        }
        Assert.fail("Не найден элемент коллекции: " + widget);
    }
}
