package by.itacademy.zaitsev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeightCalcTest {
    @Test
    public void testFormWithEmptyValues() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");

        String inputCalculateXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        By inputCalculateBy = By.xpath(inputCalculateXpath);
        WebElement inputCalculateWebElement = driver.findElement(inputCalculateBy);
        inputCalculateWebElement.click();

        String inputGetResultXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[1]/td/b";
        By inputGetResultBy = By.xpath(inputGetResultXpath);
        WebElement inputGetResultWebElement = driver.findElement(inputGetResultBy);

        String actual = inputGetResultWebElement.getText();
        String expected = ("Не указано имя.\nРост должен быть в диапазоне 50-300 см.\nВес должен быть в диапазоне 3-500 кг.\nНе указан пол.");
        Assertions.assertEquals(expected, actual);

    }
}
