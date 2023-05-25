package toystore.model.toytypes.OtherToys.doll;

import toystore.Toy;

public abstract class Doll extends Toy {
    private static int dollNumber;

    public Doll() {
        this.ID = super.ID + "-D" + ++dollNumber;
        this.weight=40;
    }
}
