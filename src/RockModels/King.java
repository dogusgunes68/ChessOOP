package RockModels;

import RockModels.Castling.Castling;
import RockModels.Castling.ICastling;
import TableModels.Block;
import TableModels.Table;

public class King extends Rock {

    public King(String type, boolean white, int x, int y) {
        super(type, white, x, y);
    }

    @Override
    protected void move(Table table, Block startBlock, Block endBlock) {
        // King moves
    }

}
