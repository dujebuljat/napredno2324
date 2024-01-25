package View;

import View.FormPanel;
import View.ViewPanel;
import Model.Programmer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;

public class MainFrame extends JFrame {

    private ViewPanel viewPanel;
    private FormPanel formPanel;

    private MenuBar menuBar;
    private final JFileChooser fileChooser;
    private static final String DIRDEFAULT = "Data";



    public MainFrame(){
        super("Simple App");

        fileChooser = new JFileChooser(new File(DIRDEFAULT));

        initAll();
        layoutComps();
        activateMainFrame();
    }

    private void activateMainFrame() {

        formPanel.setFormPanelListener(new FormPanelListener() {
            @Override
            public void formEventOccurred(FormEvent fe) {
                Programmer programmer = fe.getProgrammer();
                viewPanel.appendText(programmer.toString());
            }
        });

        menuBar.setMenuBarListener(new MenuBarListener() {
            @Override
            public void menuBarEventOccurred(ActionEvent ae) {
                if (ae.getActionCommand().equals("Exit")) {
                    System.exit(0);
                }

                if (ae.getActionCommand().equals("Save")) {
                    // command for save
                    System.out.println(ae.getActionCommand());
                }
            }
        });
    }

    private void layoutComps() {
        setLayout(new BorderLayout());
        add(viewPanel, BorderLayout.NORTH);
        add(formPanel, BorderLayout.CENTER);
        setJMenuBar(menuBar);
    }

    private void initAll() {

        setSize(700, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);

        viewPanel = new ViewPanel();
        formPanel = new FormPanel();
        menuBar = new MenuBar();

    }
}