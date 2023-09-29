package RockModels.Pawn;

import RockModels.Queen;
import RockModels.Rock;

public class PawnToQueen implements IPawnToQueen {
    @Override
    public void pawnToQueen(Rock pawn) {
        // REMOVE PAWN

        // CREATE QUEEN
        Queen queen = new Queen("Queen", pawn.isWhite());

        // REPLACE
    }
}
