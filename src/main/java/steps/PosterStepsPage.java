package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.PosterPage;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Rogoza Dimity on 12.05.2018.
 */
public class PosterStepsPage {

    public void setVariable(String str,WebElement element){
        str = element.getText();
    }

    @Step("Выбираем \"Кино\"")
    public void selectMovies(String menuItem){
        new PosterPage().chooseMenuItem(menuItem);
    }
    @Step("Проверяем заголовок")
    public void checkTitle(){
        new PosterPage().checkTitle();
    }
    @Step("Заходим в календарь")
    public void clickCalendar(){
        new PosterPage().clickDate();
    }
    @Step("Выбираем \"завта\"")
    public void clickTomorrow(){
        new PosterPage().clickTomorrow();
    }
    @Step("Выбираем фильм")
    public void chooseMovie(String rating){
       new PosterPage().chooseMovie(rating);
    }
    @Step("проверяем название и кол-во кинотеатров")
    public void checkMovie(){
        new PosterPage().checkMovie();
    }
}
