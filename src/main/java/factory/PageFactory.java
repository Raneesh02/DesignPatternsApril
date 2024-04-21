package factory;

import androidpages.AndroidHomePage;
import pageinterfaces.HomePage;
import webpages.WebHomePage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public abstract class PageFactory {

    static Properties properties = new Properties();
    static String platform;

    public static PageFactory getPageFactory()  {
        try {
            String filePath = String.join(File.separator, "src", "main", "resources", "application.properties");
            FileInputStream fileInputStream = new FileInputStream(filePath);
            properties.load(fileInputStream);

            platform = properties.getProperty("platform");

            return switch (platform){
                case "web" -> new WebPageFactory();
                case "android" -> new AndroidPageFactory();
                default -> throw new IllegalArgumentException(" illegal platform" + platform);
            };


        } catch ( Exception e){
            System.out.println("page factory not initalized");
        }
        return null;
    }


    public abstract HomePage getHomePage();


//    public HomePage getLoginPage(){
//        HomePage homePage = null;
//        if(platform.equals("web")){
//            homePage = new WebHomePage();
//        }
//        else if (platform.equals("android")){
//            homePage = new AndroidHomePage();
//        }
//        else if (platform.equals("ios")){
//            homePage = new AndroidHomePage();
//        }
//        return homePage;
//    }

}
