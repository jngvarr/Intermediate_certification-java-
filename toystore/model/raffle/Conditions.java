package toystore.model.raffle;

import java.util.Collection;

public class Conditions {
    private Collection<SinglePrize> prizes;


    public static class SinglePrize {
        private long productId;
        private int weight;
        private int maxNumber;
    }
}
