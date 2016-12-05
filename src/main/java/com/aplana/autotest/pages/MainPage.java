package com.aplana.autotest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.junit.Assert.assertTrue;

/**
 * Created by Карина on 05.12.2016.
 */
public class MainPage extends BasePage {
    @FindBy(xpath = "//span[text()=\"кредит\"]/../..")
    private WebElement clickCredit;

    @FindBy(xpath="//a[text()=\"Приобретение готового жилья\"]")
    private WebElement accommodation;

    public MainPage(WebDriver driver){this.driver = driver;}

    public void checkSberPage( ){
        assertTrue(driver.getCurrentUrl().contains("https://www.sberbank.ru/"));
    }

    public void gotoCreditPage() {
        //clickCredit = driver.findElement(By.xpath("//span[text()=\"кредит\"]/../.."));
        //System.out.println(clickCredit.getTagName());
        clickCredit.click();
        //accommodation = driver.findElement(By.xpath("//a[text()=\"Приобретение готового жилья\"]"));
        accommodation.click();
    }
}
