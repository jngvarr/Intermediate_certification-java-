package toystore.model.toytypes.transport.Car;

import toystore.model.interfaces.CanDrive;
import toystore.Toy;


public abstract class Car extends Toy implements CanDrive {
    private static int carNumber;

    public Car() {
        this.ID = super.ID + "-C" + ++carNumber;
        this.weight=60;
    }

    @Override
    public void drive() {
        System.out.println("drive");
    }
    public int getCarNumber(){
        return carNumber;
    }
}
