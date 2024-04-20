package login_interface;

import locator_interfaces.HomePageInterface;
import locator_interfaces.LoginInterface;

public class LoginInterfaceUsage implements HomePageInterface, LoginInterface {

    public void doLogin(){
        System.out.println(a+" b"+b);
    }

}
