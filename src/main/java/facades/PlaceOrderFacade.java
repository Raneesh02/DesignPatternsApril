package facades;

import pages.CartPage;
import pages.HomePage;
import pages.ProductDetailPage;

public class PlaceOrderFacade {

    public void verifyProductAddedtoCart(String productName){
        HomePage homePage = new HomePage();
        homePage.search(productName);

        ProductDetailPage productDetailPage = new ProductDetailPage();
        productDetailPage.addToCart();

        CartPage cartPage = new CartPage();
        cartPage.isProductAdded(productName);

    }

}
