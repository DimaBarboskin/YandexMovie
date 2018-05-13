package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by Rogoza Dimity on 12.05.2018.
 */
public class ScenarioSteps {

    MainStepsPage mainStepsPage = new MainStepsPage();

    PosterStepsPage posterStepsPage = new PosterStepsPage();

    @When("^выбран пункт меню \"(.+)\"$")
    public void chooseWidget(String widget){
        mainStepsPage.chooseWidget(widget);
    }

    @When("^выбран пункт кино \"(.+)\"$")
    public void selectMovies(String menuItem){
        posterStepsPage.selectMovies(menuItem);
    }

    @Then("проверяем заголовок")
    public void checkTitle(){
        posterStepsPage.checkTitle();
    }

    @When("заходим в календарь")
    public void lickCalendar(){
        posterStepsPage.clickCalendar();
    }

    @When("выбираем \"завтра\"")
    public void clickTomorrow(){
        posterStepsPage.clickTomorrow();
    }

    @When("выбираем фильм с рейтингом (.*)$")
    public void chooseMovie(String rating){
        posterStepsPage.chooseMovie(rating);
    }

    @Then("проверяем название и кол-во кинотеатров")
    public void checkMovie(){
        posterStepsPage.checkMovie();
    }
}
