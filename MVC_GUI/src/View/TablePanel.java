package View;

import Model.DataBase;
import Model.Programmer;
import aux_pckg.CLSFieldNames;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;

public class TablePanel extends JPanel {

    private JTable table;
    private JScrollPane tableScrollPane;
    private AbstractTableModel absTableModel;
    private DataBase dataBase;

    public TablePanel(){
        this.table = new JTable();
        this.absTableModel = initTable();
        table.setModel(absTableModel);
        this.tableScrollPane = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//        setLayout();

    }

    public void getDataBase(DataBase dataBase){
        this.dataBase = dataBase;
    }

    public void showDataOnTable() {
        absTableModel.fireTableDataChanged();
    }

    private AbstractTableModel initTable() {

        CLSFieldNames clsFieldNames = new CLSFieldNames(Programmer.class);
        String[] colNames = clsFieldNames.getFieldNames();

        AbstractTableModel tableModel = new AbstractTableModel() {
            @Override
            public int getRowCount() {
                return dataBase.getProgrammersFromDB().size();
            }

            @Override
            public int getColumnCount() {
                return colNames.length;
            }

            @Override
            public Object getValueAt(int rowIndex, int columnIndex) {
                Programmer programmer = dataBase.getProgrammersFromDB().get(rowIndex);
                switch (columnIndex) {
                    case 0:
                        return programmer.getId();
                    case 1:
                        return programmer.getName();
                    case 2:
                        return programmer.getEmail();
                    case 3:
                        return programmer.getProgrammingLanguage();
                    case 4:
                        return programmer.getExperience();
                    case 5:
                        return programmer.getWorkingTime();
                    default:
                        System.out.println("This column index is not possible for this case!");
                }
                return null;
            }

            @Override
            public String getColumnName(int column) {
                return colNames[column];
            }
        };

        return tableModel;
    }

    public void setDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }
}
