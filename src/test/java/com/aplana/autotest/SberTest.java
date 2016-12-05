package com.aplana.autotest;

import io.github.bonigarcia.wdm.MarionetteDriverManager;
import com.aplana.autotest.steps.SberScenario;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Dmitry Baev charlie@yandex-team.ru
 *         Date: 28.10.13
 */
public class SberTest {

    private SberScenario steps;

    @Before
    public void setUp() throws Exception {
        MarionetteDriverManager.getInstance().setup();
        steps = new SberScenario(new FirefoxDriver());
    }

    @Test
    public void searchTest() throws Exception {
        steps.openMainPage();
        steps.chooseAccomm();
        steps.checkField();
        steps.fillField();
        steps.checkInfo();
        //steps.makeScreenShot();
        //steps.quit();
    }
}

