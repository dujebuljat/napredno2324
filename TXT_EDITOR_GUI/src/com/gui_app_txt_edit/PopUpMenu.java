package com.gui_app_txt_edit;

import javax.swing.*;

public class PopUpMenu extends JPopupMenu {

    // treba imati selectAll, paste, copy, delete, cut

    private JMenuItem selectAll;
    private JMenuItem copy;
    private JMenuItem paste;



    public PopUpMenu() {

        initComponents();
        layoutComponents();
        activatePopUpMenu();
    }

    private void initComponents() {

        selectAll = new JMenuItem("Select all");
        copy = new JMenuItem("Copy");
        paste = new JMenuItem("Paste");

        selectAll.setVisible(true);
        copy.setVisible(true);
        paste.setVisible(true);
    }

    private void layoutComponents() {
        add(selectAll);
        add(copy);
        add(paste);
    }

    private void activatePopUpMenu() {

    }
}
