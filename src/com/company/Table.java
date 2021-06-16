package com.company;

import java.util.ArrayList;
import java.util.List;

public class Table {

    //variables
    private List<Column> columns;
    private List<Row> rows;
    private String name;


    //properties
    public List<Column> getColumns() {
        return columns;
    }

    public List<Row> getRows() {
        return rows;
    }

    public String getName() {
        return name;
    }

    //contructor
    public Table(String nm)
    {
        this.name = nm;
        this.columns = new ArrayList<Column>();
        this.rows = new ArrayList<Row>();
    }

    //methodes
    public void AddColumn(Column column)
    {
        columns.add(column);
    }

}
