package RockModels.PawnToQueen;

import RockModels.Position;
import RockModels.RockModels.Queen;
import RockModels.RockModels.Rock;

public class PawnToQueen implements IPawnToQueen {
    @Override
    public void pawnToQueen(Rock pawn) {

        Position position = pawn.getPosition();
        // REMOVE PAWN
        pawn.remove();
        // CREATE QUEEN
        Queen queen = new Queen("Queen", pawn.isWhite(), position.getX(), position.getY());
        // REPLACE
        // add to the inside of game
    }
}
