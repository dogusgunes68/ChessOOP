package RockModels.TableModels;

public class Table{

    // SINGLETON CLASS
    private static Table instance;

    private Block[][] blocks;

    public Table(Block[][] blocks) {
        this.blocks = blocks;
    }

    public static Table getInstance(Block[][] blocks) {
        if (instance == null) {
            instance = new Table(blocks);
        }
        return instance;
    }

    public boolean canCastling(){
        // castling control
        return true;
    }

    public Block getBlock(int x, int y){
        return blocks[x][y];
    }

}
