package TableModels;

import ICastling;

public class Table{

    // SINGLETON CLASS
    private static Table instance;

    private Block[][] blocks;

    private Table(Block[][] blocks) {
        this.blocks = blocks;
    }

    public static Table getInstance(Block[][] blocks) {
        if (instance == null) {
            instance = new Table(blocks);
        }
        return instance;
    }

    public Block getBlock(int x, int y){
        return blocks[x][y];
    }

}
