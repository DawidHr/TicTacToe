package model;

public class BoardSizeMenu {

    public static void printMenu() {
        System.out.println("==================================");
        for (BoardSize board : BoardSize.values()) {
            System.out.println(board.getOption() + " - "+ board.getDescription());
        }
        System.out.println("==================================");
    }

    public static boolean checkIfOptionCorrect(String option) {
        return BoardSize.getBoardSizeByOption(option) != null;
    }

}
