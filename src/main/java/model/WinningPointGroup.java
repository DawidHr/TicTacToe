package model;

import java.util.HashSet;
import java.util.Set;

public class WinningPointGroup {
    Set<WinningPoint> winningPoints;

    public WinningPointGroup(BoardSize boardSize) {
        this.winningPoints = new HashSet<>();
        initWinningOptions(boardSize.size);
    }

    private void initWinningOptions(int size) {
        prepareHorizontalWinOptions(size);
        prepareVerticalWinOption(size);
        prepareSlashWinningOptions(size);
        prepareBackSlashWinningOptions(size);
    }

    private void prepareVerticalWinOption(int size) {
        for (int x = 0; x < size; x++) {
            processOneRowWithVerticalWin(size, x);
        }
    }

    private void prepareHorizontalWinOptions(int size) {
        for (int y = 0; y < size; y++) {
            processOneRowWithHorizontalWin(size, y);
        }
    }

    private void processOneRowWithHorizontalWin(int size, int y) {
        for (int x = 0; x < size; x++) {
            if (x + 2 < size) {
                WinningPoint winOption = new WinningPoint();
                winOption.addItem(new Point(x, y));
                winOption.addItem(new Point(x + 1, y));
                winOption.addItem(new Point(x + 2, y));
                winningPoints.add(winOption);
            }
        }
    }

    private void processOneRowWithVerticalWin(int size, int x) {
        for (int y = 0; y < size; y++) {
            if (y + 2 < size) {
                WinningPoint winOption = new WinningPoint();
                winOption.addItem(new Point(x, y));
                winOption.addItem(new Point(x, y + 1));
                winOption.addItem(new Point(x, y + 2));
                winningPoints.add(winOption);
            }
        }
    }

    private void prepareBackSlashWinningOptions(int size) {
        for (int y = size - 1; y >= 0; y--) {
            for (int x = size - 1; x >= 0; x--) {
                if (y + 1 < size && x + 1 < size) {
                    if (y + 2 < size && x + 2 < size) {
                        WinningPoint winOption = new WinningPoint();
                        winOption.addItem(new Point(x, y));
                        winOption.addItem(new Point(x + 1, y + 1));
                        winOption.addItem(new Point(x + 2, y + 2));
                        winningPoints.add(winOption);
                    }
                }
            }
        }
    }

    private void prepareSlashWinningOptions(int size) {
        for (int y = size - 1; y >= 0; y--) {
            for (int x = size - 1; x >= 0; x--) {
                if (y + 1 < size && x + 1 < size) {
                    if (y + 2 < size && x + 2 < size) {
                        WinningPoint winOption = new WinningPoint();
                        winOption.addItem(new Point(x, y));
                        winOption.addItem(new Point(x + 1, y + 1));
                        winOption.addItem(new Point(x + 2, y + 2));
                        winningPoints.add(winOption);
                    }
                }
            }
        }
    }

    public Set<WinningPoint> getWinningPoints() {
        return winningPoints;
    }

    public void setWinningPoints(Set<WinningPoint> winningPoints) {
        this.winningPoints = winningPoints;
    }

    public void addItem(WinningPoint winningPoints) {
        this.winningPoints.add(winningPoints);
    }
}
