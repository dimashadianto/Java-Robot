package com.enigma.constant;

public enum Direction {

    N, E, S, W;

    public Direction turnRight() {
        return values()[(this.ordinal() + 1) % values().length];
    }

    public Direction turnLeft() {
        return values()[(this.ordinal() + values().length - 1) % values().length];
    }

}