package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by Rogoza Dimity on 12.05.2018.
 */
public class ScenarioSteps {

    MainStepsPage mainStepsPage = new MainStepsPage();

    PosterStepsPage posterStepsPage = new PosterStepsPage();

    @When("Выбрана афиша")
    public void selectPoster(){
        mainStepsPage.selectPoster();
    }
    @When("Выбрано \"Кино\"")
    public void selectMovies(){
        posterStepsPage.selectMovies();
    }

    @Then("Проверяем заголовок")
    public void checkTitle(){
        posterStepsPage.checkTitle();
    }
    @When("Заходим в календарь")
    public void lickCalendar(){
        posterStepsPage.clickCalendar();
    }
    @When("Выбираем \"завтра\"")
    public void clickTomorrow(){
        posterStepsPage.clickTomorrow();
    }
    @Then("Выбираем фильм и проверяем название и кол-во кинотеатров")
    public void chooseMovieAndCheck(){
        posterStepsPage.chooseMovieAndCheck();
    }
}
