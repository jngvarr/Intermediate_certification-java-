package toystore.model.toytypes.transport.Vessel;

import toystore.model.interfaces.CanSail;
import toystore.Toy;

public abstract class Vessel extends Toy implements CanSail {
    private static int vesselNumber;

    public Vessel() {
        this.ID = super.ID + "-V" + ++vesselNumber;
        this.weight=80;
    }
    @Override
    public void sail() {
        System.out.println("Set sail!");
    }
}
