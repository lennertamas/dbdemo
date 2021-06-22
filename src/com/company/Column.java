package com.company;

public class Column extends ElementBase {

    private ColumnType type;

    public ColumnType getType() {
        return type;
    }

    public Column (String nm, ColumnType tp)
    {
        setName(nm);
        type = tp;
    }
}
