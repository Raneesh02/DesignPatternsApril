package org.example;

import org.testng.annotations.Test;
import testdata.Car;
import testdata.CarB;

public class CarTests {

    //With GPS + Cruise Control
    @Test
    public void carTest1BFluent(){
        //CarPage.verifyCarPresent()  //validate to car
        CarB carB = new CarB.CarBBuilder("honda", "civic")
                .setCruiseControl(true)
                .setGps(true)
                .build();



    }

    //With GPS + Cruise Control
    @Test
    public void carTest1B(){
        //CarPage.verifyCarPresent()  //validate to car
        CarB.CarBBuilder carBBuilder = new CarB.CarBBuilder("honda", "civic");
        carBBuilder.setCruiseControl(true);
        carBBuilder.setGps(true);
        CarB carB = carBBuilder.build();

    }

    //With GPS + transmission = manual
    @Test
    public void carTest1B2(){
        //CarPage.verifyCarPresent()  //validate to car
        CarB.CarBBuilder carBBuilder = new CarB.CarBBuilder("honda", "civic");
        carBBuilder.setGps(true);
        carBBuilder.setTransmission("manual");
        CarB carB = carBBuilder.build();

        //CarDetailPage.verifyName(carB.getName())

    }


    //With GPS + Cruise Control
    @Test
    public void carTest1(){
        //CarPage.verifyCarPresent()  //validate to car
        Car car = new Car(true, true);

    }

    //With Brand Honda + Civic
    @Test
    public void carTest2(){
        //CarPage.verifyCarPresent()  //validate to car
        Car car = new Car("Honda", "Civic");

        Car car1 = new Car("Honda", "Civic",true);
    }


    //With Brand Honda + Civic + 2024
    @Test
    public void carTest3(){
        //CarPage.verifyCarPresent()  //validate to car
        Car car = new Car("Honda", "Civic", 2024);
    }

}
