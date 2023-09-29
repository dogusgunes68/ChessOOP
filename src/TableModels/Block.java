package TableModels;

import RockModels.Rock;

public class Block {
    private int x;
    private int y;
    private boolean white;
    private Rock rock;

    public Block(int x, int y, boolean white, Rock rock){
        this.x = x;
        this.y = y;
        this.white = white;
        this.rock = rock;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isWhite() {
        return white;
    }

    public void setWhite(boolean white) {
        this.white = white;
    }

    public Rock getRock() {
        return rock;
    }

    public void setRock(Rock rock) {
        this.rock = rock;
    }


}
