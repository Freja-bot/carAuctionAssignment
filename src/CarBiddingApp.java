public class CarBiddingApp {
    public static void main(String[] args) {
        CarRepository carRepository = new InMemoryCarRepository();
        BidRepository bidRepository = new InMemoryBidRepository();

        CarService carService = new CarService(carRepository);
        BidService bidService = new BidService(carRepository, bidRepository);

        AuctionController controller = new AuctionController(carService, bidService);
        controller.start();
    }

}
