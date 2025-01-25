package model;

import java.util.HashSet;
import java.util.Set;

public class WinningPoint {
    Set<Point> winning;

    public WinningPoint() {
        this.winning = new HashSet<>();
    }

    public Set<Point> getWinning() {
        return winning;
    }

    public void setWinning(Set<Point> winning) {
        this.winning = winning;
    }

    public void addItem(Point point) {
        this.winning.add(point);
    }
}
