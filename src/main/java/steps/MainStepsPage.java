package steps;

import pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Rogoza Dimity on 12.05.2018.
 */
public class MainStepsPage {

    @Step("Выбрать пункт меню")
    public void chooseWidget(String widget){
        new MainPage().chooseWidget(widget);
    }

}
