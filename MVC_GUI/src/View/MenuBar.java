package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuBar extends JMenuBar implements ActionListener {

    private JMenu fileMenu;
    private JMenu serverMenu;

    private JMenuItem saveToFileItem;
    private JMenuItem loadFromFileItem;
    private JMenuItem exit;
    private MenuBarListener menuBarListener;

    public MenuBar() {

        initMenuBar();
        layoutMenuBarComponents();
        activateMenuBar();
    }

    private void initMenuBar() {
        fileMenu = new JMenu("File");
        serverMenu = new JMenu("Server");

        saveToFileItem = new JMenuItem("Save");
        loadFromFileItem = new JMenuItem("Load");
        exit = new JMenuItem("Exit");
    }


    private void layoutMenuBarComponents() {
        fileMenu.add(saveToFileItem);
        fileMenu.add(loadFromFileItem);
        fileMenu.addSeparator();
        fileMenu.add(exit);

        this.add(fileMenu);
        add(serverMenu);
    }

    private void activateMenuBar() {
        saveToFileItem.addActionListener(this);
        loadFromFileItem.addActionListener(this);
        exit.addActionListener(this);

        saveToFileItem.setActionCommand("Save");
        loadFromFileItem.setActionCommand("Load");
        exit.setActionCommand("Exit");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (menuBarListener != null) {
            menuBarListener.menuBarEventOccurred(ae);
        }
    }

    public void setMenuBarListener(MenuBarListener menuBarListener) {
        this.menuBarListener = menuBarListener;
    }
}
