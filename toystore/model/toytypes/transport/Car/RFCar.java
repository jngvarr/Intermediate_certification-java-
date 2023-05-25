package toystore.model.toytypes.transport.Car;

import toystore.model.interfaces.RFControl;

public class RFCar extends Car implements RFControl {
    private int weight = 75;

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public void rfControl() {
        System.out.println("i`m rf-controlled car");
    }
}
