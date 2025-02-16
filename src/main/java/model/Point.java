package model;

public class Point {
    int x;
    int y;
    String sign;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        this.sign = "";
    }

    public Point(int x, int y, String sign) {
        this.x = x;
        this.y = y;
        this.sign = sign;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
