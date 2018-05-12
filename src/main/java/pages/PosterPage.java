package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;

import java.util.List;

/**
 * Created by Rogoza Dimity on 12.05.2018.
 */
public class PosterPage {

    @FindBy(xpath = "//a[contains(text(), 'Кино')]")
    WebElement movie;

    @FindBy(xpath = "//*[@class='feed-title rubric-title content-rubric__title']")
    WebElement movieInMoscow;

    @FindBy(xpath = "//*[starts-with(@class,'button2 button2_theme_normal button2_size_m button2_view_classic events-filter-date')]")
    WebElement date;

    @FindBy(xpath = "//*[contains(text(), 'Завтра')]")
    WebElement tomorrow;

    @FindBy(xpath = "//*[starts-with(@class,'button2 button2_theme_clear button2_size_l button2_view_classic subscribe-form-email')]")
    WebElement closeWindow;

    @FindBy(xpath = "//*[@class = 'event-heading__title']")
    WebElement nameChoiceMovie;

    @FindBy(xpath = "//*[@class = 'event-heading__place']")
    WebElement amountCinemasChoiceMovie;

    public PosterPage(){
        PageFactory.initElements(BaseSteps.getDriver(),this);
    }

    public void clickMovie(){
        movie.click();
    }

    public void checkTitle(){
        Assert.assertEquals("Не соответствует 'Кино в москве' ","Кино в Москве",movieInMoscow.getText());
    }

    public void clickDate(){
        closeWindow.click();
        WebDriverWait wait = new WebDriverWait(BaseSteps.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOf(date));
        date.click();
    }

    public void clickTomorrow(){
        tomorrow.click();
    }
    public void chooseMovieAndCheck(){
        BaseSteps.getDriver().findElement(By.xpath("//*[@class = 'tutorial-modal__close']")).click();
        List<WebElement> movies = BaseSteps.getDriver().findElements(By.xpath("//*[@itemprop='ratingValue']"));
        WebElement choiceMovie = null;
        for(WebElement movie : movies){
            if(Double.parseDouble(movie.getText()) >= 8.0) {
                choiceMovie = movie;
                break;
            }
            else
                continue;
        }
        String nameMovie = BaseSteps.getDriver().findElement(By.xpath("//*[@itemprop= 'ratingValue' and contains(text(),'"+choiceMovie.getText()+"')]/ancestor::div[starts-with(@class,'event event_id_')]/descendant::h2")).getText();
        String amountCinemas = BaseSteps.getDriver().findElement(By.xpath("//*[@itemprop= 'ratingValue' and contains(text(),'"+choiceMovie.getText()+"')]/ancestor::div[starts-with(@class,'event event_id_')]/descendant::div[@class ='event__place']")).getText();
        choiceMovie.click();
        WebDriverWait wait = new WebDriverWait(BaseSteps.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOf(nameChoiceMovie));
        wait.until(ExpectedConditions.visibilityOf(amountCinemasChoiceMovie));
        Assert.assertEquals("Фильм не совпадает:",nameMovie,nameChoiceMovie.getText());
        Assert.assertEquals("Кол-во кинотеатров не совпадает:",amountCinemas,amountCinemasChoiceMovie.getText());
    }
}
