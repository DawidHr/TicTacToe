package model;

import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    Board board;

    @Test
    public void isBoard3x3CorrectTest() {
        board = new Board(BoardSize.BOARD3X3);
        Set<Point> boardList = board.getBoard();
        assertEquals(9, boardList.size());
        boolean allPointCharacterCorrect = boardList.stream().allMatch(point -> "Empty".equals(point.getSign()));
        assertTrue(allPointCharacterCorrect);
    }

    @Test
    public void isBoard4x4CorrectTest() {
        board = new Board(BoardSize.BOARD4X4);
        Set<Point> boardList = board.getBoard();
        assertEquals(16, boardList.size());
        boolean allPointCharacterCorrect = boardList.stream().allMatch(point -> "Empty".equals(point.getSign()));
        assertTrue(allPointCharacterCorrect);
    }

    @Test
    public void isBoard5x5CorrectTest() {
        board = new Board(BoardSize.BOARD5X5);
        Set<Point> boardList = board.getBoard();
        assertEquals(25, boardList.size());
        boolean allPointCharacterCorrect = boardList.stream().allMatch(point -> "Empty".equals(point.getSign()));
        assertTrue(allPointCharacterCorrect);
    }

    @Test
    public void changePointTest() {
        Point pointToChange = new Point(2, 2, "X");
        board = new Board(BoardSize.BOARD3X3);
        board.change(pointToChange);
        Set<Point> boardList = board.getBoard();
        Optional<Point> optionalPoint = boardList.stream().filter(point -> point.getX() == pointToChange.getX()).filter(point -> point.getY() == pointToChange.getY()).findFirst();
        Point selectedPoint = null;
        if (optionalPoint.isPresent()) {
            selectedPoint = optionalPoint.get();
        }
        assertNotNull(selectedPoint);
        assertEquals(pointToChange.getSign(), selectedPoint.getSign());
        long count = boardList.stream().filter(point -> pointToChange.getSign().equals(point.getSign())).count();
        assertEquals(1, count);
    }

    @Test
    public void changeNotAwailablePointTest() {
        Point pointToChange = new Point(1, 1, "X");
        Point secondPointToChange = new Point(1, 1, "Y");
        board = new Board(BoardSize.BOARD3X3);
        board.change(pointToChange);
        board.change(secondPointToChange);
        Set<Point> boardList = board.getBoard();

        long count = boardList.stream().filter(point -> pointToChange.getSign().equals(point.getSign())).count();
        assertEquals(1, count);
        count = boardList.stream().filter(point -> secondPointToChange.getSign().equals(point.getSign())).count();
        assertEquals(0, count);
    }
}