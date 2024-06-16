package api;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PositivOpeningPages {

    @Test
    public void positiveOpeningPage() {
        open("https://google.com"); // исправленный URL

        $(By.xpath("//textarea")).sendKeys("Hello World");
        $(By.xpath("//textarea")).pressEnter();
    }

    @Test
    public void positiveOpeningPage2() {
        open("https://google.com"); // исправленный URL

        $(By.xpath("//textarea")).sendKeys("Bye World");
        $(By.xpath("//textarea")).pressEnter();
    }
}