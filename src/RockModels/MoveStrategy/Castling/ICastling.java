package RockModels.MoveStrategy.Castling;

import RockModels.RockModels.Rock;

public interface ICastling {
    void castlingMove(Rock king, Rock castle);
}
