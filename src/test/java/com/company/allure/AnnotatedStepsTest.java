package com.company.allure;

import org.junit.jupiter.api.Test;

import static com.company.allure.StepsTest.NAME;
import static com.company.allure.StepsTest.REPOSITORY;

public class AnnotatedStepsTest {

    @Test
    public void annotatedStepsTest() {
        WebSteps webSteps = new WebSteps();
        webSteps.openMainPage();
        webSteps.searchForRepository(REPOSITORY);
        webSteps.openRepositoryPage(REPOSITORY);
        webSteps.openIssuesTab();
        webSteps.shouldSeeIssueWithName(NAME);
    }
}
