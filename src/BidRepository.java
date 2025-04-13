import java.util.List;

public interface BidRepository {

    public void saveBid(Bid bid);

    public List<Bid> loadBids();

}
