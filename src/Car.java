public class Car implements Comparable<Car>{
    private String brand;
    private String model;
    private int year;
    private double basePrice;
    private String numberPlate;

    public Car(String brand, String model, int year, double basePrice, String numberPlate) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.basePrice = basePrice;
        this.numberPlate = numberPlate;
    }

    public int getYear(){
        return this.year;
    }

    public String getBrand(){
        return this.brand;
    }

    public double getBasePrice() {
        return this.basePrice;
    }

    public String getModel() {
        return model;
    }

    public String getNumberPlate(){
        return this.numberPlate;
    }

    @Override
    public String toString() {
        return  "brand=" + brand +
                ", model=" + model +
                ", year=" + year +
                ", basePrice=" + basePrice +
                ", numberPlate=" + numberPlate;
    }

    @Override
    public int compareTo(Car otherCar) {
        return Integer.compare(year, otherCar.getYear());
    }
}
