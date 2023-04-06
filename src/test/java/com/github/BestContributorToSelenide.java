package com.github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class BestContributorToSelenide {
    @Test
    void andreiSolntsevShouldBeTheFirstContributor() {
        open("https://github.com/selenide/selenide");


    }

}
