package toystore.model.toytypes.tableGame;

import toystore.Toy;

public abstract class TableGame extends Toy {

    private static int tgNumber;

    public TableGame() {
        this.ID = super.ID + "-TG" + ++tgNumber;
        this.weight=35;
    }
}
