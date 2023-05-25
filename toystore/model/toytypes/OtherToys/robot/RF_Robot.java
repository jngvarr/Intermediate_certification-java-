package toystore.model.toytypes.OtherToys.robot;

import toystore.model.interfaces.RFControl;

public class RF_Robot extends Robot implements RFControl {
    private int weight = 65;

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public void rfControl() {
        System.out.println("i`m rf-controlled robot");;
    }
}
