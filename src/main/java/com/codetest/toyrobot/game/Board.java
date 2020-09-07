package com.codetest.toyrobot.game;

import java.util.ArrayList;

public class Board {
    private final int rows;
    private final int columns;
    private final ArrayList<Position> obstacles = new ArrayList();

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
    }

    public boolean isValidPosition(Position position) {
//        return (position.getX() < columns && position.getX() >= 0)
//                && (position.getY() < rows && position.getY() >= 0);
        return this.isOnTheBoard(position) && !this.isOccupied(position);
    }

    public boolean isOccupied(Position position) {
        for (int i = 0; i < this.obstacles.size(); i++) {
            Position positionCurr = this.obstacles.get(i);
            if (positionCurr.equals(position)) {
                return true;
            }
        }
        return false;
    }

    public boolean isOnTheBoard(Position position) {
        return (position.getX() < columns && position.getX() >= 0)
                && (position.getY() < rows && position.getY() >= 0);
    }


    public void addObstacle(Position nextPosition) {
        this.obstacles.add(nextPosition);
    }
}
