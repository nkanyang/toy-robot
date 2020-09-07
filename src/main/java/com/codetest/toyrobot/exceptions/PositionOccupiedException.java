package com.codetest.toyrobot.exceptions;

public class PositionOccupiedException extends RobotException {
    private final String position;

    public PositionOccupiedException(String command, String position) {
        super(command);
        this.position = position;
    }

    @Override
    public String message() {
        return "Command: " + this.command + " ignored. "
                + "(Reason: Position (" + position + ") is occupied already.)";
    }
}
