import java.util.Comparator;

public class CarPriceComparator implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2){
        return Double.compare(car1.getBasePrice(), car2.getBasePrice());
    }
}
