package org.example.model;

public class BoardItem {

    public Integer getEndPosition() {
        return end;
    }
    private final Integer end;
    public BoardItem(final Integer end) {
        this.end = end;
    }
}
