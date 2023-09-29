package RockModels;

import TableModels.Block;
import TableModels.Table;

public class King extends Rock {
    public King(String type, boolean white) {
        super(type, white);
    }

    @Override
    protected void move(Table table, Block startBlock, Block endBlock) {
        // King moves
    }

}
