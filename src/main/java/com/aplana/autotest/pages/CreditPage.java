package com.aplana.autotest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

/**
 * Created by Карина on 05.12.2016.
 */
public class CreditPage extends BasePage {
    String t;
    String chooseFee;
    String categories;
    @FindBy(xpath="//h2[text()=\"Калькулятор\"]")
    public WebElement pageH;

    @FindBy(xpath="//span[text()=\"Тип расчета\"]/../../../div/div/a")
    public WebElement type;

    @FindBy(xpath="//div[text()=\"По среднемесячному доходу\"]/..")
    public WebElement chooseType;

    @FindBy(xpath="//span[text()=\"Первоначальный взнос\"]/../../../div/div/a")
    public WebElement initialFee;

    @FindBy(xpath="//div[text()=\"от 50%\"]/..")
    public WebElement chooseInitialFee;

    @FindBy(xpath="//span[text()=\"Категория заемщика\"]/../../../div/div/a")
    public WebElement category;

    @FindBy(xpath="//div[text()=\"Общие условия\"]/../..")
    public WebElement chooseCategory;

    @FindBy(xpath="")
    public WebElement income;

    @FindBy(xpath="//button[text()=\"Рассчитать погашение\"]")
    public WebElement button;

    public CreditPage(WebDriver driver){this.driver = driver;}

    public void checkHeadName(){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h2[text()=\"Калькулятор\"]")));
        assertEquals("Калькулятор", pageH.getText());
    }
    public void clickField(){
        type.click();
        chooseType.click();
        //t =chooseType.getText();
        initialFee.click();
        chooseInitialFee.click();
        //chooseFee = chooseInitialFee.getText();
        category.click();
        chooseCategory.click();
        //categories = chooseCategory.getText();
        button.click();
    }

    public void comparison(String t, String chooseFee, String categories){
        assertEquals(t, chooseType.getText());
        assertEquals(chooseFee, chooseInitialFee.getText());
        assertEquals(categories, chooseCategory.getText());
    }
}
