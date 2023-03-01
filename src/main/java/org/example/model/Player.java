package org.example.model;

public class Player {
    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    private Integer position;
    public Integer getId() {
        return id;
    }
    public Player(final Integer id) {
        this.id = id;
        this.position = 0;
    }
    Integer id;
}
