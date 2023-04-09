package com.github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DifferentElements {


    @Test
    void h1SpaceDiv() {

        open("https://topdisc.ru/catalog/smartfony_i_gadzhety/");
        String h1SpaceDiv = $("div div[style=\"z-index:327;\"]").getText();
        System.out.println("Поиск через $(\"h1___div\"): " + "\n" + h1SpaceDiv + "\n\n");

    }

    @Test
    void h1DotDiv() {

        open("https://topdisc.ru/catalog/smartfony_i_gadzhety/");
        String h1DotDiv = $("div").$("div[style=\"z-index:327;\"]").getText();
        System.out.println("Поиск через . $(\"h1\").$(\"div\")): " + "\n" + h1DotDiv);

    }

}

