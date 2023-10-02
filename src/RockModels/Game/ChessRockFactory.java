package RockModels.Game;

import RockModels.RockModels.Pawn;
import RockModels.Position;
import RockModels.RockModels.Rock;

public class ChessRockFactory {
    public Rock createChessPiece(String type, boolean isWhite, Position position) {
        if (type.equalsIgnoreCase("Pawn")) {
            return new Pawn(type, isWhite, position.getX(), position.getY() );
        }
        if (type.equalsIgnoreCase("Castle")) {
            return new Pawn(type, isWhite, position.getX(), position.getY() );
        }
        if (type.equalsIgnoreCase("Knight")) {
            return new Pawn(type, isWhite, position.getX(), position.getY() );
        }
        if (type.equalsIgnoreCase("Elephant")) {
            return new Pawn(type, isWhite, position.getX(), position.getY() );
        }
        if (type.equalsIgnoreCase("Queen")) {
            return new Pawn(type, isWhite, position.getX(), position.getY() );
        }
        if (type.equalsIgnoreCase("King")) {
            return new Pawn(type, isWhite, position.getX(), position.getY() );
        }
        return null;
    }
}
