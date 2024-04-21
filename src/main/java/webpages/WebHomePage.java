package webpages;

import pageinterfaces.HomePage;

public class WebHomePage implements HomePage {
    @Override
    public void selectMovie() {
        System.out.println("web selectMovie");
    }

    @Override
    public void searchEvent(String event) {
        System.out.println("Web Event searched" + event);
    }
}
