import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CarService {

    private CarRepository carRepository;
    private List<Car> cars;

    public CarService(CarRepository carRepository){
        this.carRepository = carRepository;
        this.cars = this.carRepository.loadCars();
    }

    public void createCar(String brand, String model, int year, double basePrice, String numberPlate){
        Car car = new Car(brand, model, year, basePrice, numberPlate);
        this.carRepository.saveCar(car);
    }

    public Car getCarFromNumberPlate(String numberPlate){
        if(this.cars.isEmpty()){
            throw new NoCarsException("Ingen Biler På Auktion");
        }
        for(Car car : this.cars){
            if(numberPlate.equals(car.getNumberPlate())){
                return car;
            }
        }
        throw new NoCarsException("Ingen Bil Med Denne Nummerplade");
    }

    public void sortCarsByReleaseYear(boolean isOrderReversed){
        if(isOrderReversed){
            Collections.sort(cars.reversed());
        }else {
            Collections.sort(cars);
        }
    }

    public void sortCars(Comparator<Car> carComparator){
        sortCars(carComparator, false);
    }

    public void sortCars(Comparator<Car> carComparator, boolean isOrderReversed){
        if(isOrderReversed){
            Collections.sort(this.cars.reversed(), carComparator);
        }else {
            Collections.sort(this.cars, carComparator);
        }
    }

    public void printCars(String title){
        System.out.println(title);
        for(Car car : this.cars){
            System.out.println(car);
        }
        System.out.println('\n');
    }

}
