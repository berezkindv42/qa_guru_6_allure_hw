package com.company.allure;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

public class WebSteps {

    @Step("Открываем главную страницу")
    public void openMainPage() {
        open("https://github.com");
    }
    @Step("Изем репозиторий {repository}")
    public void searchForRepository(String repository) {
        $(".header-search-input").click();
        $(".header-search-input").sendKeys(repository);
        $(".header-search-input").submit();
    }
    @Step("Переходим в репозиторий")
    public void openRepositoryPage(String repository) {
        $(linkText(repository)).click();
    }
    @Step("Открываем таб Issues")
    public void openIssuesTab() {
        $(partialLinkText("Issue")).click();
    }
    @Step("Проверяем наличие issue с именем {name}")
    public void shouldSeeIssueWithName(String name) {
        $(withText(name)).should(Condition.visible);
    }

}
