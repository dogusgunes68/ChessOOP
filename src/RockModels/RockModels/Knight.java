package RockModels.RockModels;

import RockModels.MoveStrategy.KnightMove;

public class Knight extends Rock {
    public Knight(String type, boolean white, int x, int y) {
        super(type, white, x, y, new KnightMove());
    }
}
