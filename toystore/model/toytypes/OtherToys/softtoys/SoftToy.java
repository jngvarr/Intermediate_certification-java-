package toystore.model.toytypes.OtherToys.softtoys;

import toystore.Toy;

public abstract class SoftToy extends Toy {
    private static int softNumber;

    public SoftToy() {
        this.ID = super.ID + "-ST" + ++softNumber;
        this.weight=30;
    }
}
