package com.company;

import java.util.ArrayList;
import java.util.List;

public class Table extends ElementBase{

    //variables
    private List<Column> columns;
    private List<Row> rows;


    //properties
    public List<Column> getColumns() {
        return columns;
    }

    public List<Row> getRows() {
        return rows;
    }


    //contructor
    public Table(String nm)
    {
        setName(nm);
        this.columns = new ArrayList<Column>();
        this.rows = new ArrayList<Row>();
    }

    //methodes
    public void AddColumn(Column column)
    {
        columns.add(column);
    }

    public void AddRow(Row row)
    {
        rows.add(row);
    }


}
