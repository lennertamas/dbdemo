package com.company;

public class Column {

    private String name;
    private ColumnType type;

    public String getName() {
        return name;
    }
    public ColumnType getType() {
        return type;
    }

    public Column (String nm, ColumnType tp)
    {
        name = nm;
        type = tp;
    }
}
