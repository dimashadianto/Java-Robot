package com.enigma.service.impl;

import com.enigma.constant.Command;
import com.enigma.constant.Direction;
import com.enigma.entity.Position;
import com.enigma.service.RobotService;

import java.util.Scanner;

public class RobotServiceImpl implements RobotService {

    private Direction direction;
    private final Position position = new Position();

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("> Determine the robot starting position (Example : (N/E/S/W),2,3) : ");
        String[] inputPosition = scanner.nextLine().split(",");

        this.direction = Direction.valueOf(inputPosition[0]);
        this.position.setX(Integer.parseInt(inputPosition[1]));
        this.position.setY(Integer.parseInt(inputPosition[2]));

        System.out.print("> Input commands (A/L/R) : ");
        String[] commands = scanner.nextLine().split("");
        for (String c: commands) {
            move(Command.valueOf(c));
        }
    }

    @Override
    public void move(Command command) {
        switch (command) {
            case A:
                forward(command.toString());
                break;
            case L:
                this.direction = direction.turnLeft();
                System.out.printf("> %s > %s -> (%s,%s)\n", command, this.direction, this.position.getX(), this.position.getY());
                break;
            case R:
                this.direction = direction.turnRight();
                System.out.printf("> %s > %s -> (%s,%s)\n", command, this.direction, this.position.getX(), this.position.getY());
                break;
        }
    }

    @Override
    public void forward(String command) {
        switch (direction) {
            case N:
                this.position.top();
                break;
            case E:
                this.position.right();
                break;
            case S:
                this.position.bottom();
                break;
            case W:
                this.position.left();
                break;
        }
        System.out.printf("> %s > %s -> (%s,%s)\n", command, this.direction, this.position.getX(), this.position.getY());
    }

}