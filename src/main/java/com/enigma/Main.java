package com.enigma;

import com.enigma.service.impl.RobotServiceImpl;

public class Main {
    public static void main(String[] args) {
        RobotServiceImpl robot = new RobotServiceImpl();
        robot.run();
    }
}