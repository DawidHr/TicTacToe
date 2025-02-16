package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardPrinterTest {

    @Test
    public void printBoardTest() {
        Board board = new Board(BoardSize.BOARD3X3);
        board.getPoint(1,1).setSign("X");
        BoardPrinter.printBoard(board);
    }
}