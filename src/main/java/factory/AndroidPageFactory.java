package factory;

import androidpages.AndroidHomePage;
import pageinterfaces.HomePage;

public class AndroidPageFactory extends PageFactory {
    @Override
    public HomePage getHomePage() {
        return new AndroidHomePage();
    }
}
