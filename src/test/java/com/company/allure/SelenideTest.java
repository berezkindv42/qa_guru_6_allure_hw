package com.company.allure;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideTest {

    @Test
    public void testIssueSearch() {
        open("https://github.com");

        $(".header-search-input").click();
        $(".header-search-input").sendKeys("DaymianDark/qa_guru_work_book");
        $(".header-search-input").submit();
        $(By.linkText("DaymianDark/qa_guru_work_book")).click();
    }

}
