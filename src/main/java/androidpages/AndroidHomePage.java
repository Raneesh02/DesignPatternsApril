package androidpages;

import pageinterfaces.HomePage;

public class AndroidHomePage implements HomePage {
    @Override
    public void selectMovie() {
        System.out.println("Android selectMovie");
    }

    @Override
    public void searchEvent(String event) {
        System.out.println("Android searchEvent"+ event);
    }

    //android related elements and their methods

}
