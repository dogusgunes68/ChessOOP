package RockModels.RockModels;

import RockModels.MoveStrategy.CastleMove;
import RockModels.MoveStrategy.Castling.Castling;
import RockModels.MoveStrategy.Castling.ICastling;

public class Castle extends Rock{

    private ICastling castling = new Castling();

    public Castle(String type, boolean white, int x, int y) {
        super(type, white, x, y, new CastleMove());
    }

    // castling
    public void castlingMove(King king){
        castling.castlingMove(king, this);
    }
}
