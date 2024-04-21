package factory;

import androidpages.AndroidHomePage;
import pageinterfaces.HomePage;
import webpages.WebHomePage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PageFactory {

    Properties properties = new Properties();
    String platform;

    public PageFactory()  {
        try {
            String filePath = String.join(File.separator, "src", "main", "resources", "application.properties");
            FileInputStream fileInputStream = new FileInputStream(filePath);
            properties.load(fileInputStream);

            platform = properties.getProperty("platform");
        } catch ( Exception e){
            System.out.println("page factory not initalized");
        }
    }


    public HomePage getHomePage(){
        HomePage homePage = null;
        if(platform.equals("web")){
            homePage = new WebHomePage();
        }
        else if (platform.equals("android")){
            homePage = new AndroidHomePage();
        }
        return homePage;
    }

}
