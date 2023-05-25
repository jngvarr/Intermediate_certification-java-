package toystore.model.toytypes.transport.Aircraft;

import toystore.model.interfaces.CanFly;
import toystore.Toy;

public abstract class Aircraft extends Toy implements CanFly {
    private static int airCraftNumber;

    public Aircraft() {
        this.ID = super.ID + "-A" + ++airCraftNumber;
        this.weight=90;
    }
    @Override
    public void fly() {
        System.out.println("i wish i could fly");
    }
}
