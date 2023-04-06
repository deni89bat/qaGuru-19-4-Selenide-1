package com.github;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class SelenideRepositorySearch {
    @Test
    void shouldFindRepositoryAtTheTop() {
        open("https://github.com/");
        $(".header-search-input").setValue("selenide").pressEnter();
        $$("ul.repo-list li").first().$("a").click();
        $("#repository-container-header").shouldHave(Condition.text("selenide / selenide"));

        Configuration.holdBrowserOpen = true;


    }


}
