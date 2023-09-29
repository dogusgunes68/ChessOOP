package RockModels.Pawn;

import RockModels.Rock;
import TableModels.Block;
import TableModels.Table;

public class Pawn extends Rock {

    public Pawn(String type, boolean white, int x, int y) {
        super(type, white, x, y);
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
