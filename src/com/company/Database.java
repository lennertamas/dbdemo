package com.company;

public class Database {

    private String name;

    public String getName() {
        return name;
    }

    public Database(String nm)
    {
        name = nm;
    }

    public void Execute(String command)
    {
        if (command.equals("Create table"))
        {
            Table table = new Table("Customers");

            Column column1 = new Column("Id", ColumnType.INTEGER);
            Column column2 = new Column("CustomerName", ColumnType.VARCHAR);

            table.AddColumn(column1);
            table.AddColumn(column2);

            for (Column col: table.getColumns())
            {
                System.out.println(col.getName());
            }
        }
    }
}