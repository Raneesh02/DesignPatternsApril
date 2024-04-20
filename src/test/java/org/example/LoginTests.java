package org.example;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTests {

    @Test
    public void testLogin(){
        // driver.findElement(By.id('email').sendKeys("feaf@feiao.com");
        LoginPage loginPage = new LoginPage();
        loginPage.enterEmail("feaf@feiao.com");
        loginPage.enterPassword("pass");
        loginPage.clickLogin();

        //2nd Approach
        loginPage.doLogin("feawfawe","pass");

        //3rd Method Chaining
        HomePage homePage = loginPage.enterEmail("fewafawe").enterPassword("password").clickLogin();
        homePage.search("bluetooth tws").applyBrandFiler("Samsung");
    }


}
