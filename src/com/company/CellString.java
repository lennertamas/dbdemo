package com.company;

public class CellString extends Cell {
    public CellString(String vl) {
        this.setValue(vl);
    }
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    private String value;
}
