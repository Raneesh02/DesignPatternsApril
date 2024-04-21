package testdata;

public class Car {

    String brand,model;
    int year;
    String transmission;
    boolean gps, cruiseControl;


    //Required fields
    public Car(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    //Required + Optional
    public Car(String brand, String model, boolean gps, boolean cruiseControl){
        this.brand = brand;
        this.model = model;
        this.gps = gps;
        this.cruiseControl = cruiseControl;
    }

    //Required + Optional
    public Car(String brand, String model, boolean gps){
        this.brand = brand;
        this.model = model;
        this.gps = gps;
    }

    public Car(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public Car(boolean gps, boolean cruiseControl){
        this.gps = gps;
        this.cruiseControl = cruiseControl;
    }





    //hit api to create car

}
