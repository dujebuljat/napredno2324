package com.gui_app_txt_edit;

import com.listeners.MenuBarEventsListener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;

public class MenuBar extends JMenuBar implements ActionListener {

    private JMenu fileMenu;
    private JMenu editMenu;

    private MenuBarEventsListener menuBarEventsListener;

    private JMenuItem openFile;
    private JMenuItem saveAsFile;
//    private JMenuItem saveFile;
    private JMenuItem exit;

    private JMenuItem selectAll;
    private JMenuItem copyItem;
    private JMenuItem pasteItem;

    public MenuBar() {

        initComponents();
        layoutComponents();
        activateMenuBar();
    }

    public void setMenuBarEventsListener(MenuBarEventsListener mbel) {
        this.menuBarEventsListener = mbel;
    }

    private void initComponents() {
        fileMenu = new JMenu("File");
        openFile = new JMenuItem("Open");
        saveAsFile = new JMenuItem("Save as");
        exit = new JMenuItem("Exit");

        openFile.setActionCommand("Open");
        saveAsFile.setActionCommand("Save as");
        exit.setActionCommand("Exit");

        openFile.setAccelerator(KeyStroke.getKeyStroke("ctrl O"));
        saveAsFile.setAccelerator(KeyStroke.getKeyStroke("ctrl shift S"));
        exit.setAccelerator(KeyStroke.getKeyStroke("ctrl Q"));

        editMenu = new JMenu("Edit");

        selectAll = new JMenuItem("Select all");
        selectAll.setActionCommand("Select all");
        selectAll.setAccelerator(KeyStroke.getKeyStroke("ctrl A"));

        copyItem = new JMenuItem("Copy");
        copyItem.setActionCommand("Copy");
        copyItem.setAccelerator(KeyStroke.getKeyStroke("ctrl C"));

        pasteItem = new JMenuItem("Paste");
        pasteItem.setActionCommand("Paste");
        pasteItem.setAccelerator(KeyStroke.getKeyStroke("ctrl V"));
    }

    private void layoutComponents() {
        fileMenu.add(openFile);
        fileMenu.add(saveAsFile);
        fileMenu.addSeparator();
        fileMenu.add(exit);

        add(fileMenu);

        editMenu.add(selectAll);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);

        add(editMenu);
    }

    private void activateMenuBar() {
        openFile.addActionListener(this);
        saveAsFile.addActionListener(this);
        exit.addActionListener(this);

        selectAll.addActionListener(this);
        copyItem.addActionListener(this);
        pasteItem.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (menuBarEventsListener != null) {
            menuBarEventsListener.menuBarEventOccurred(ae.getActionCommand());
        }

    }
}
