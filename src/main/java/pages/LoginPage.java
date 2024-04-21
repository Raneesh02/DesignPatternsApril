package pages;

public class LoginPage {

    //Webelements
    //Webelement login= driver.findElement();

    //@FindBy(id="fewaf")
    //WebElement logn


    //methods
    public LoginPage enterEmail(String email) {
        System.out.println(email + " entered");
        //login element
        return this;
    }

    //methods
    public LoginPage enterPassword(String password) {
        System.out.println(password + " entered");
        //to do implementation
        return this;
    }

    public HomePage clickLogin() {
        System.out.println("Login clicked");
        return new HomePage();
    }

    public void doLogin(String email, String password){
        enterEmail("feawf");
        enterPassword("feawf");
        clickLogin();

    }


}
