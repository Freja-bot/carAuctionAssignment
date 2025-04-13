import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BidService {

    private CarRepository carRepository;
    private BidRepository bidRepository;
    private List<Car> cars;
    private List<Bid> bids;

    public BidService(CarRepository carRepository, BidRepository bidRepository) {
        this.carRepository = carRepository;
        this.bidRepository = bidRepository;
        this.cars = carRepository.loadCars();
        this.bids = bidRepository.loadBids();
    }

    public void createBid(String bidderName, double amount, Car car){
        if(amount < car.getBasePrice()){
            throw new InvalidBidException("Invalid bud, bud skal være højere end bilens pris");
        }
        Bid bid = new Bid(bidderName, amount, car);
        this.bids.add(bid);
        this.bidRepository.saveBid(bid);
    }

    public void printBids(String title){
        System.out.println(title);
        for(Bid bid : this.bids){
            System.out.println(bid);
        }
        System.out.println('\n');
    }

    public void sortBids(Comparator<Bid> bidComparator){
        sortBids(bidComparator, false);
    }

    public void sortBids(Comparator<Bid> bidComparator, boolean isOrderReversed){
        if(isOrderReversed){
            Collections.sort(this.bids.reversed(), bidComparator);
        }else {
            Collections.sort(this.bids, bidComparator);
        }
    }

}
