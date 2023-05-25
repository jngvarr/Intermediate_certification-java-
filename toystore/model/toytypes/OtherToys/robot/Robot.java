package toystore.model.toytypes.OtherToys.robot;

import toystore.Toy;

public abstract class Robot extends Toy {
    private static int robotNumber;

    public Robot() {
        this.ID = super.ID + "-R" + ++robotNumber;
    }
}
