package com.enigma.service;

import com.enigma.constant.Command;

public interface RobotService {

    void run();
    void move(Command command);
    void forward(String command);

}