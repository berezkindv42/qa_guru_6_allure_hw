package com.company.allure;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static com.company.allure.LambdaSteps.NAME;
import static com.company.allure.LambdaSteps.REPOSITORY;

public class AnnotatedSteps {

    WebSteps webSteps = new WebSteps();

    @AfterEach
    public void saveSourses() {
        webSteps.attachPageSource(); // добавление аттачамента к отчету для всех степов
    }

    @Test
    public void annotatedStepsTest() {
        webSteps.openMainPage();
        webSteps.searchForRepository(REPOSITORY);
        webSteps.openRepositoryPage(REPOSITORY);
        webSteps.openIssuesTab();
        webSteps.shouldSeeIssueWithName(NAME);
    }
}
