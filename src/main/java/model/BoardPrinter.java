package model;

public class BoardPrinter {
    public static void printBoard(Board board) {
        BoardSize boardSize = BoardSize.getBoardSizeByPoints(board.getBoard());

        System.out.println("======================================================");

        for (int i = boardSize.size; i >= 1; i--) {
            for (int j = 1; j <= boardSize.size; j++) {
                String pointSign = " ";
                Point selectedPoint = board.getPoint(j, i);
                if (selectedPoint != null) {
                   pointSign = selectedPoint.getSign();
                }
                System.out.print("| " + pointSign + " |");
            }
            System.out.println("\n______________________________________");
        }

        System.out.println("======================================================");
    }

}
