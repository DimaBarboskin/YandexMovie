package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

/**
 * Created by Rogoza Dimity on 12.05.2018.
 */
public class MainPage {
    @FindBy(xpath = "//*[@data-statlog = 'afisha.title.link']")
    WebElement poster;

    public MainPage(){
        PageFactory.initElements(BaseSteps.getDriver(),this);
    }

    public void clickPoster(){
        poster.click();
    }
}
