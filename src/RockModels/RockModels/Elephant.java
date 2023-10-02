package RockModels.RockModels;

import RockModels.MoveStrategy.ElephantMove;

public class Elephant extends Rock {
    public Elephant(String type, boolean white, int x, int y) {
        super(type, white, x, y, new ElephantMove());
    }
}
