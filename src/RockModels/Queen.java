package RockModels;

import TableModels.Block;
import TableModels.Table;

public class Queen extends Rock {
    public Queen(String type, boolean white) {
        super(type, white);
    }

    @Override
    protected void move(Table table, Block startBlock, Block endBlock) {

    }
}
