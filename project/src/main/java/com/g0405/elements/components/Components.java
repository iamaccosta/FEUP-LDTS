package com.g0405.elements.components;

import com.g0405.elements.Position;

public abstract class Components {
    private Position position;

    public Components(int x, int y){
        this.position = new Position(x, y);
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position){
        this.position.setX(position.getX());
        this.position.setY(position.getY());
    }
}

