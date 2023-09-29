package RockModels.Pawn;

import RockModels.Rock;
import TableModels.Block;
import TableModels.Table;

public class Pawn extends Rock {
    public Pawn(String type, boolean white) {
        super(type, white);
    }

    @Override
    protected void move(Table table, Block startBlock, Block endBlock) {
        // Pawn moves
    }

    public void pawnToQueen(){
        IPawnToQueen pawnToQueen = new PawnToQueen();

        pawnToQueen.pawnToQueen(this);

    }
}