package com.company;

public class CellInteger extends Cell {
    public CellInteger(int value) {
        this.setValue(value);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    private int value;
}

