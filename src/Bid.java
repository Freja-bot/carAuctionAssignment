public class Bid {
    private String bidderName;
    private double amount;
    private Car car;

    public Bid(String bidderName, double amount, Car car) {
        this.bidderName = bidderName;
        this.amount = amount;
        this.car = car;
    }

    public String getBidderName() {
        return this.bidderName;
    }

    public double getAmount() {
        return this.amount;
    }

    public Car getCar() {
        return this.car;
    }

    @Override
    public String toString() {
        return  "bidderName=" + bidderName +
                ", amount=" + amount +
                ", Car -> " + car;
    }
}
