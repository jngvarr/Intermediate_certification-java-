package toystore.model.raffle;

import toystore.model.products.Product;

import java.util.List;

public class Raffle {
    private long id;
    private String name;
    private String description;
    private String comments;
    private Conditions conditions;

    public static class Results {
        private Raffle raffle;
        private List<Product> prizesWon;
    }
}
