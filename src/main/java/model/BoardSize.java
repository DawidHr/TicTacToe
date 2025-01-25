package model;

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
}
