package RockModels.RockModels;

import RockModels.MoveStrategy.Castling.Castling;
import RockModels.MoveStrategy.Castling.ICastling;
import RockModels.MoveStrategy.KingMove;

public class King extends Rock {

    private ICastling castling = new Castling();

    public King(String type, boolean white, int x, int y) {
        super(type, white, x, y, new KingMove());
    }

    // castling
    public void castlingMove(Castle castle){
        castling.castlingMove(this, castle);
    }
}
