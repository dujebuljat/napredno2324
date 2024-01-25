package com.gui_app_txt_edit;

import com.commands.Command;
import com.commands.CopyCommand;
import com.commands.PasteCommand;
import com.commands.SelectAll;
import com.listeners.MenuBarEventsListener;

import javax.swing.*;
import java.awt.*;
import java.util.Stack;

public class MainFrame extends JFrame {

    private MenuBar menuBar;
    private TextPanel textPanel;
    private Command currentCommand;
    private final PopUpMenu popUpMenu;

    private final Stack<Command> undoCommandStack;
    private final Stack<Command> redoCommandStack;

    public MainFrame() {

        super("Simple Text editor");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setSize(700, 580);
        setVisible(true);

        undoCommandStack = new Stack<>();
        redoCommandStack = new Stack<>();
        popUpMenu = new PopUpMenu();

        initComponents();
        layoutComponents();
        activateMainFrame();
    }

    private void initComponents() {

        menuBar = new MenuBar();
        textPanel = new TextPanel();
        textPanel.setComponentPopupMenu(popUpMenu);

    }

    private void layoutComponents() {
        add(textPanel, BorderLayout.CENTER);
        setJMenuBar(menuBar);

    }

    private void activateMainFrame() {
        menuBar.setMenuBarEventsListener(new MenuBarEventsListener() {
            @Override
            public void menuBarEventOccurred(String command) {
                if(command.equals("Exit")) {
                    System.exit(0);
                }

                if(command.equals("Select all")) {
                    currentCommand = new SelectAll(textPanel);
                    currentCommand.runCommand();
                }

                if(command.equals("Copy")) {
                    currentCommand = new CopyCommand(textPanel);
                    currentCommand.runCommand();
                    undoCommandStack.push(currentCommand);
                    System.out.println("Copy command executed.");
                }

                if(command.equals("Paste")) {
                    currentCommand = new PasteCommand(textPanel);
                    currentCommand.runCommand();
                    undoCommandStack.push(currentCommand);
                }
            }
        });
    }

    private void listUndoStack() {
        System.out.println("\nUndo stack: ");
        for (Command c : undoCommandStack) {
            System.out.println(c);
        }
    }
}
