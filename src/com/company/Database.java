package com.company;

public class Database extends ElementBase{

    public Database(String nm)
    {
        setName(nm);
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

            Row row1 = new Row();
            row1.Add(1);
            row1.Add("Zoli");
            table.AddRow(row1);

            for (Row row: table.getRows()) {
                for (Cell cell: row.getCells()) {
                    if(cell.getClass() == CellInteger.class) {
                        CellInteger c = (CellInteger)cell;
                        System.out.println(c.getValue());
                    }
                }
            }



            for (Column col: table.getColumns())
            {
                System.out.println(col.getName());
            }
        }
    }
}
