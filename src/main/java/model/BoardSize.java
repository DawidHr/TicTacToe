package model;

import java.util.Set;

public enum BoardSize {
    BOARD3X3(3, "Wielkość 3 na 3"),
    BOARD4X4(4, "Wielkość 4 na 4"),
    BOARD5X5(5, "Wielkość 5 na 5");

    int size;
    String name;

    BoardSize(int size, String name) {
        this.size = size;
        this.name = name;
    }

    public static BoardSize getBoardSizeByPoints(Set<Point> points) {
        int boardSize = points.size();
        if (boardSize == 9) {
            return BoardSize.BOARD3X3;
        } else if (boardSize == 12) {
            return BoardSize.BOARD4X4;
        } else {
            return BoardSize.BOARD5X5;
        }

    }
}
