package RockModels.Castling;

import RockModels.Position;
import RockModels.Rock;

public class Castling implements ICastling {
    @Override
    public void castlingMove(Rock king, Rock castle) {
        // Get king's position
        Position kingPosition = king.getPosition();
        king.setPosition(castle.getPosition());
        castle.setPosition(kingPosition);
    }
}
