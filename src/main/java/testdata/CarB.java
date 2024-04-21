package testdata;

public class CarB {

    private String brand,model;
    private int year;
    private String transmission;
    private boolean gps, cruiseControl;

    private CarB(CarBBuilder carBBuilder){
        this.brand = carBBuilder.brand;
        this.model = carBBuilder.model;
        this.year = carBBuilder.year;
        this.gps = carBBuilder.gps;
        this.transmission = carBBuilder.transmission;
        //hit your APIs
    }

    public static class CarBBuilder{
        private String brand,model;
        private int year;
        private String transmission;
        private boolean gps, cruiseControl;

        public CarBBuilder setYear(int year) {
            this.year = year;
            return this;
        }

        public CarBBuilder setTransmission(String transmission) {
            this.transmission = transmission;
            return this;
        }

        public CarBBuilder setGps(boolean gps) {
            this.gps = gps;
            return this;
        }

        public CarBBuilder setCruiseControl(boolean cruiseControl) {
            this.cruiseControl = cruiseControl;
            return this;
        }



        public CarBBuilder(String brand, String model){
            this.brand = brand;
            this.model = model;
        }

        public CarB build(){

            return new CarB(this);
        }



    }

}
