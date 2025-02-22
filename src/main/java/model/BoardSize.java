package model;

import java.util.Arrays;
import java.util.Optional;
import java.util.Set;

public enum BoardSize {
    BOARD3X3(1,3, "Wielkość 3 na 3"),
    BOARD4X4(2, 4, "Wielkość 4 na 4"),
    BOARD5X5(3, 5, "Wielkość 5 na 5");

    private final int option;
    private final int size;
    private final String description;

    BoardSize(int option, int size, String description) {
        this.option = option;
        this.size = size;
        this.description = description;
    }

    public static BoardSize getBoardSizeByOption(String option) {
        if (option == null)
            return null;

        Optional<BoardSize> selectedBoardSize = Arrays.stream(BoardSize.values()).filter(o -> option.equals(o.getOption())).findFirst();
        return selectedBoardSize.isPresent() ? selectedBoardSize.get() : null;
    }

    public int getOption() {
        return option;
    }

    public int getSize() {
        return size;
    }

    public String getDescription() {
        return description;
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
