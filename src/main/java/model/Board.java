package model;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Board {
    private Set<Point> board;

    public Board(BoardSize boardSize) {
        board = new HashSet<>();
        initBoard(boardSize.getSize());
    }

    private void initBoard(int boardSize) {
        for(int x = 1; x <= boardSize ; x++) {
            for(int y = 1; y <= boardSize ; y++) {
                board.add(new Point(x, y, "Empty"));
            }
        }
    }

    public void change(Point pointToChange) {
        for (Point point: board) {
            if (point.getX() == pointToChange.getX() && point.getY() == pointToChange.getY()) {
               if(isPointAwailable(point.getSign())) {
                   point.setSign(pointToChange.getSign());
               }
            }
        }
    }

    public boolean isPointAwailable(String sign) {
        return "Empty".equals(sign);
    }

    public Set<Point> getBoard() {
        return board;
    }

    public Point getPoint(int x, int y) {
        Point result = null;
        Optional<Point> selectedPoint = this.getBoard().stream().filter(point -> point.getY() == y).filter(point -> point.getX() == x).findFirst();

        if(selectedPoint.isPresent())
            result = selectedPoint.get();

        return result;
    }
}
