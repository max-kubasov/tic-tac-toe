package maxjava.tictactoe.component;

import maxjava.tictactoe.model.Cell;

public interface CellNumberConverter {

    Cell toCell(char number);

    char toNumber(Cell cell);
}
