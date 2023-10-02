package RockModels.RockModels;

import RockModels.MoveStrategy.QueenMove;

public class Queen extends Rock {
    public Queen(String type, boolean white, int x, int y) {
        super(type, white, x, y, new QueenMove());
    }
}
