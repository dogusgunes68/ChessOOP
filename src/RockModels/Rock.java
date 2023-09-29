package RockModels;

import TableModels.Block;
import TableModels.Table;

public abstract class Rock {
    String type;
    boolean white;
    Position position;
    boolean isKilled = false;

    public Rock(String type, boolean white, int x, int y){
        this.type = type;
        this.white = white;
        position = new Position(x,y);
    }

    protected abstract void move(Table table, Block startBlock, Block endBlock);

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isWhite() {
        return white;
    }

    public void setWhite(boolean white) {
        this.white = white;
    }

    public boolean isKilled() {
        return isKilled;
    }

    public void setKilled(boolean killed) {
        isKilled = killed;
    }
    public Position getPosition() {
        return position;
    }
    public void setPosition(Position position){
        this.position = position;
    }


}
