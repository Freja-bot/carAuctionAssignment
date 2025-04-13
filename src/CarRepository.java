import java.util.List;

public interface CarRepository {

    public void saveCar(Car car);

    public List<Car> loadCars();

}
