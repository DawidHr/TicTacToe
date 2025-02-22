package model;

public class Player {
    private String name;
    private String sign;
    private boolean isBot = false;

    public Player(String name, String sign) {
        this.name = name;
        this.sign = sign;
    }

    public Player(String name, String sign, boolean isBot) {
        this.name = name;
        this.sign = sign;
        this.isBot = isBot;
    }

    public boolean isBot() {
        return isBot;
    }

    public String getSign() {
        return sign;
    }

    public String getName() {
        return name;
    }
}
