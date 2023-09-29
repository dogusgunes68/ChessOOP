package RockModels;

import TableModels.Block;
import TableModels.Table;

public abstract class Rock {
    String type;
    boolean white;

    public Rock(String type, boolean white){
        this.type = type;
        this.white = white;
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

    boolean isKilled = false;



}
