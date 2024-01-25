package pckg_gui_ispit_15_09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolBar extends JToolBar implements ActionListener {

    private JButton clearAll;
    private JButton saveData;
    private JButton loadData;
    private JButton btnExit;

    private ToolBarListener toolBarListener;

    public ToolBar() {

        Dimension dim = getPreferredSize();
        dim.height = 50;
        setPreferredSize(dim);
        initComps();
        layoutComps();
    }


    private void initComps() {
        clearAll = new JButton("Clear");
        saveData = new JButton("Save");
        loadData = new JButton("Load");
        btnExit = new JButton("Exit");

        clearAll.addActionListener(this);
        saveData.addActionListener(this);
        loadData.addActionListener(this);
        btnExit.addActionListener(this);
    }

    private void layoutComps() {
         add(clearAll);
         addSeparator();
         add(saveData);
         addSeparator();
         add(loadData);
         addSeparator();
         add(btnExit);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        // get selected button
        JButton clicked = (JButton) ae.getSource();
        if (clicked == clearAll) {
            if (toolBarListener != null){
                toolBarListener.clearEventOccurred();
            }
            System.out.println("Clear all");
        } else if (clicked == saveData) {
            System.out.println("Save data");
            if(toolBarListener != null)
                toolBarListener.saveEventOccurred();
        } else if (clicked == loadData) {
            System.out.println("Load data");
            if(toolBarListener != null)
                toolBarListener.loadEventOccurred();
        } else if (clicked == btnExit) {
            System.exit(0);
        }
    }

    public void setToolBarListener(ToolBarListener toolBarListener){
        this.toolBarListener = toolBarListener;
    }
}
