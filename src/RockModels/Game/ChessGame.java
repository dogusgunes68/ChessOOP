package RockModels.Game;

import RockModels.RockModels.Pawn;
import RockModels.Position;
import RockModels.TableModels.Block;
import RockModels.TableModels.Table;

import java.util.ArrayList;

public class ChessGame extends Game{

    @Override
    void initialize() {
        // initilize
        // example create pawns using FACTORY PATTERN
        ChessRockFactory factory = new ChessRockFactory();
        ArrayList<Pawn> whitePawns = new ArrayList<>();
        for (int i=0;i<9;i++){
            whitePawns.add((Pawn) factory.createChessPiece("Pawn", true, new Position(i,1)));
        }

        //create table
        BlockFactory blockFactory = new BlockFactory();
        Block [][] blocks = blockFactory.createBlocks();
        Table chessTable = new Table(blocks);

        System.out.println("initialized");
    }

    @Override
    void startPlay() {
        // start game
        System.out.println("started");
    }

    @Override
    void endPlay() {
        // end game
        System.out.println("ended");
    }
}
