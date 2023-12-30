package com.enigma.entity;

public class Position {
    private Integer x;
    private Integer y;

    public Position() {
    }

    public Position(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public void right() {
        this.x += 1;
    }

    public void left() {
        this.x -= 1;
    }

    public void top() {
        this.y += 1;
    }

    public void bottom() {
        this.y -= 1;
    }

}
