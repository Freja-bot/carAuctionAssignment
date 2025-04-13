import java.util.Comparator;

public class BidCarComparator implements Comparator<Bid> {
    @Override
    public int compare(Bid bid1, Bid bid2) {
        Car car1 = bid1.getCar();
        Car car2 = bid2.getCar();
        int brandCompared = car1.getBrand().compareTo(car2.getBrand());
        if(brandCompared == 0){
            return car1.getModel().compareTo(car2.getModel());
        }else {
            return brandCompared;
        }
    }
}
