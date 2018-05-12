package steps;

import pages.PosterPage;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Rogoza Dimity on 12.05.2018.
 */
public class PosterStepsPage {

    @Step("Выбираем \"Кино\"")
    public void selectMovies(){
        new PosterPage().clickMovie();
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
    @Step("Выбираем фильм и проверяем название и кол-во кинотеатров")
    public void chooseMovieAndCheck(){
        new PosterPage().chooseMovieAndCheck();
    }
}
