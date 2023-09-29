package RockModels;

public class Castle extends Rock{
    public Castle(String type, boolean white, int x, int y) {
        super(type, white, x, y);
    }

    @Override
    protected void move() {
        // castle move
    }
}
