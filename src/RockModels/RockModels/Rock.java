package RockModels.RockModels;

import RockModels.MoveStrategy.MoveStrategy;
import RockModels.Position;

public abstract class Rock {
    private String type;
    private boolean white;
    private Position position;
    private boolean isKilled = false;

    private MoveStrategy moveStrategy;

    public Rock(String type, boolean white, int x, int y, MoveStrategy moveStrategy){
        this.type = type;
        this.white = white;
        position = new Position(x,y);
        this.moveStrategy = moveStrategy;
    }

    // MOVE
    public void move(){
        moveStrategy.moveObject();
    }

    public void remove(){
        // symbolic remove
        this.position = null;
    }

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
