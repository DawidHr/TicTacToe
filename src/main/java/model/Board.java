package model;

import java.util.HashSet;
import java.util.Set;

public class Board {
    private Set<Point2> board;

    public Board(BoardSize boardSize) {
        board = new HashSet<>();
    }

    private void initBoard(int boardSize) {
        for(int x = 0; x < boardSize ; x++) {
            for(int y = 0; y < boardSize ; y++) {
                board.add(new Point2(x, y, "Empty"));
            }
        }
    }

    public void change(Point2 pointToChange) {
        for (Point2 point: board) {
            if (point.getX() == pointToChange.getX() && point.getY() == pointToChange.getY()) {
               if(isPointAwailable(point.getSign())) {
                   point.setSign(pointToChange.getSign());
               }
            }
        }
    }

    private boolean isPointAwailable(String sign) {
        return "Empty".equals(sign);
    }
}
