package RockModels.RockModels;

import RockModels.MoveStrategy.PawnMove;
import RockModels.PawnToQueen.IPawnToQueen;
import RockModels.PawnToQueen.PawnToQueen;

public class Pawn extends Rock {

    private IPawnToQueen pawnToQueen = new PawnToQueen();

    public Pawn(String type, boolean white, int x, int y) {
        super(type, white, x, y, new PawnMove());
    }

    // change pawn to queen
    public void pawnToQueen(){
        pawnToQueen.pawnToQueen(this);
    }
}
