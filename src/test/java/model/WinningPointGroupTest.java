package model;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class WinningPointGroupTest {

    WinningPointGroup winningPointGroup;

    @Test
    public void winOptionTest() {
        winningPointGroup = new WinningPointGroup(BoardSize.BOARD3X3);
        Set<WinningPoint> winOptions = winningPointGroup.getWinningPoints();
        assertEquals(8, winOptions.size());
    }
}