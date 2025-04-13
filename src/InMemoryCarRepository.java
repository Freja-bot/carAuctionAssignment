import java.util.ArrayList;
import java.util.List;
//TODO: safe guard saveCar method against creating duplicates
public class InMemoryCarRepository implements CarRepository{

    private List<Car> savedCars;

    public InMemoryCarRepository(){
        this.savedCars = new ArrayList<>();
    }

    @Override
    public void saveCar(Car car){
        if(car != null){
            savedCars.add(car);
        }
    }

    @Override
    public List<Car> loadCars(){
        return this.savedCars;
    }

}
