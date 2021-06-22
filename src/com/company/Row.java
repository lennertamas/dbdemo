package com.company;

import java.util.ArrayList;

public class Row extends ElementBase{

    private ArrayList<Cell> cells = new ArrayList<Cell>();

    public ArrayList<Cell> getCells() {
        return cells;
    }

    public Cell Add(String value) {
        CellString cellString = new CellString(value);
        cells.add(cellString);
        return cellString;
    }

    public Cell Add(int value) {
        CellInteger cellInteger = new CellInteger(value);
        cells.add(cellInteger);
        return cellInteger;
    }




}
