package RockModels.Game;

import RockModels.TableModels.Block;

public class BlockFactory {
    // Create chess table's blocks
    public Block [][] createBlocks(){
        boolean isWhite = true;
        Block [][] blocks = new Block[8][8];
        for (int i=0;i<8;i++){
            for (int j=0;j<8;j++){
                isWhite = !isWhite;
                blocks[i][j] = new Block(i,j,isWhite, null);
            }
        }

        return blocks;
    }
}
