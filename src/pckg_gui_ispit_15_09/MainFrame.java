package pckg_gui_ispit_15_09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private ViewPanel viewPanel;
    private FormPanel formPanel;

    private ToolBar toolBar;

    public MainFrame(){
        super("BMI APP");
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(450, 500);
        setResizable(false);
        initComps();
        layoutComps();
        activateFrame();

    }

    private void initComps(){
        viewPanel = new ViewPanel();
        formPanel = new FormPanel();
        toolBar = new ToolBar();
    }

    private void layoutComps(){
        setLayout(new BorderLayout());
        add(viewPanel, BorderLayout.CENTER);
        add(formPanel, BorderLayout.SOUTH);
        add(toolBar, BorderLayout.NORTH);
    }

    private void activateFrame(){

        toolBar.setToolBarListener(new ToolBarListener() {
            @Override
            public void clearEventOccurred() {
                viewPanel.clearText();
            }

            @Override
            public void saveEventOccurred() {

            }

            @Override
            public void loadEventOccurred() {

            }
        });

        formPanel.setFormPanelListener(new FormPanelListener() {
            @Override
            public void formPanelEventOccurred(FormPanelEvent formPanelEvent) {
                viewPanel.appendText(formPanelEvent + "\n");
            }
        });

    }


}
