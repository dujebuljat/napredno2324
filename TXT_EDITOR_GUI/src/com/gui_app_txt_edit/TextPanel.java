package com.gui_app_txt_edit;

import javax.swing.*;
import java.awt.*;

public class TextPanel extends JPanel {

    private JTextArea textArea;
    private JScrollPane scrollPane;
    private PopUpMenu popUpMenu;

    public TextPanel() {

        initComponents();
        layoutComponents();
    }

    private void initComponents() {
        textArea = new JTextArea();
        textArea.setPreferredSize(new Dimension(680, 560));
        textArea.setBackground(Color.BLACK);
        textArea.setForeground(Color.WHITE);
        textArea.setFont(new Font("Monospace", Font.PLAIN, 14));
        scrollPane = new JScrollPane(textArea);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
    }

    private void layoutComponents() {
        add(scrollPane);
    }

    public void selectAllText() {
        textArea.selectAll();
    }

    public void deselectAll() {
        textArea.select(0, 0);
    }

    public String getSelectedText() {
        return textArea.getSelectedText();
    }

    public void pasteText(String text) {
        textArea.insert(text, textArea.getCaretPosition());
    }

    public void setPopUpMenu(PopUpMenu popUpMenu) {
        this.popUpMenu = popUpMenu;
    }
}
