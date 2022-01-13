package com.company.allure;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

public class StepsTest {

    private static final String REPOSITORY = "DaymianDark/qa_guru_work_book";
    private static final String NAME = "Issue name for test";

    @Test
    public void lambdaStepsTest() {

        step("Открываем главную страницу", () -> {
            open("https://github.com");
        });
        step("Изем репозиторий " + REPOSITORY, () -> {
            $(".header-search-input").click();
            $(".header-search-input").sendKeys(REPOSITORY);
            $(".header-search-input").submit();
        });
        step("Переходим в репозиторий " + REPOSITORY, () -> {
            $(linkText(REPOSITORY)).click();
        });
        step("Открываем таб Issues", () -> {
            $(partialLinkText("Issue")).click();
        });
        step("Проверяем наличие issue с именем " + NAME, () -> {
            $(withText(NAME)).should(Condition.visible);
        });
    }
}
