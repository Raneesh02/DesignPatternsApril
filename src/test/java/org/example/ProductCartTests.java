package org.example;

import facades.PlaceOrderFacade;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;
import pages.ProductDetailPage;

public class ProductCartTests {
    PlaceOrderFacade placeOrderFacade = new PlaceOrderFacade();

    @Test
    public void testCart(){
        placeOrderFacade.verifyProductAddedtoCart("tws");
    }

    @Test
    public void testCart2(){
        placeOrderFacade.verifyProductAddedtoCart("tv");
    }


    @Test
    public void testCartMethodChaining(){
        HomePage homePage = new HomePage();
        homePage.addProduct("tv");
    }


    @Test
    public void testCartSimple(){
        HomePage homePage = new HomePage();
        homePage.search("ffe");

        ProductDetailPage productDetailPage = new ProductDetailPage();
        productDetailPage.addToCart();

        CartPage cartPage = new CartPage();
        cartPage.isProductAdded("fewf");
    }



}
