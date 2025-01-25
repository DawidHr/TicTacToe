package model;

public class Point2 extends Point {
    String sign;

    public Point2(int x, int y, String sign) {
        super(x, y);
        this.sign = sign;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
