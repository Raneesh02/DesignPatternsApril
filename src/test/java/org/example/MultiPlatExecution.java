package org.example;

import androidpages.AndroidHomePage;
import factory.PageFactory;
import org.testng.annotations.Test;
import pageinterfaces.HomePage;
import webpages.WebHomePage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class MultiPlatExecution {

    PageFactory pageFactory = PageFactory.getPageFactory();


    @Test
    public void testMultiPlat() throws IOException {

        HomePage homePage = pageFactory.getHomePage();
        homePage.searchEvent("search for movie");
        homePage.selectMovie();

    }

    @Test
    public void testMultiPlat2() throws IOException {

        HomePage homePage = pageFactory.getHomePage();
        homePage.searchEvent("Avatar");
        homePage.selectMovie();

    }


}
