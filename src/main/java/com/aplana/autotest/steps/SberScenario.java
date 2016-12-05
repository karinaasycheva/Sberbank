package com.aplana.autotest.steps;

import com.aplana.autotest.pages.CreditPage;
import com.aplana.autotest.pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.concurrent.TimeUnit;

/**
 * Created by Карина on 05.12.2016.
 */
public class SberScenario {
    private WebDriver driver;

    MainPage mainPage;
    CreditPage creditPage;

    public SberScenario(WebDriver driver) {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        mainPage = new MainPage(driver);
        PageFactory.initElements(driver, mainPage);
        creditPage = new CreditPage(driver);
        PageFactory.initElements(driver, creditPage);
    }

    @Step("Открыть главную страницу")
    public void openMainPage(){driver.get("http://www.sberbank.ru/");}

    @Step("Выбрать 'Приобретение готового жилья'")
    public void chooseAccomm(){mainPage.gotoCreditPage();}

    @Step("Проверка существования поля 'Калькулятор'")
    public void checkField(){creditPage.checkHeadName();}

    @Step("Заполнение поля 'Калькулятор'")
    public void fillField(){creditPage.clickField();}

    @Step("Проверка значений в 'Информации по кредиту'")
    public void checkInfo(){}
}
