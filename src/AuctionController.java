import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AuctionController {

    private CarService carService;
    private BidService bidService;

    public AuctionController(CarService carService, BidService bidService){
        this.carService = carService;
        this.bidService = bidService;
    }

    public void start(){

        carService.createCar("VW", "Jetta",2024, 22585.50, "DH829LI");
        carService.createCar("Subaru", "Forester",2024, 28190.99, "FD872LL");
        carService.createCar("Acura", "Integra",2024, 32695.75, "NF743PN");
        carService.createCar("Subaru", "BRZ", 2023, 29615.00, "VX769OB");

        bidService.createBid("Trenton Gates", 35000.00, carService.getCarFromNumberPlate("FD872LL"));
        bidService.createBid("Elijah Solomon", 33000.59, carService.getCarFromNumberPlate("NF743PN"));
        bidService.createBid("Martin Sims", 37746.25, carService.getCarFromNumberPlate("DH829LI"));
        bidService.createBid("Kim Hancock", 30500.00, carService.getCarFromNumberPlate("FD872LL"));
        bidService.createBid("Ella Lawson", 34469.49, carService.getCarFromNumberPlate("NF743PN"));
        bidService.createBid("Finn Landers", 32899.99, carService.getCarFromNumberPlate("VX769OB"));
        bidService.createBid("Jasper Eddy", 29999.99, carService.getCarFromNumberPlate("VX769OB"));

        carService.printCars("List of cars");

        carService.sortCarsByReleaseYear(true);
        carService.printCars("List of cars (newest to oldest car)");

        carService.sortCars(new CarBrandComparator());
        carService.printCars("List of cars (sorted by brand)");

        carService.sortCars(new CarPriceComparator());
        carService.printCars("List of cars (lowest price first)");

        bidService.printBids("List of bids");

        bidService.sortBids(new BidAmountComparator(), true);
        bidService.printBids("List of bids (sorted by amount)");

        bidService.sortBids(new BidderNameComparator());
        bidService.printBids("List of bids (sorted by bidder name)");

        bidService.sortBids(new BidCarComparator());
        bidService.printBids("List of bids (sorted by car)");

    }

}
