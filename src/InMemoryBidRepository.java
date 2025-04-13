import java.util.ArrayList;
import java.util.List;
//TODO: safe guard saveBid method against creating duplicates
public class InMemoryBidRepository implements BidRepository{

    private List<Bid> savedBids;

    public InMemoryBidRepository(){
        this.savedBids = new ArrayList<>();
    }

    @Override
    public void saveBid(Bid bid){
        if(bid != null){
            savedBids.add(bid);
        }
    }

    @Override
    public List<Bid> loadBids(){
        return this.savedBids;
    }

}
