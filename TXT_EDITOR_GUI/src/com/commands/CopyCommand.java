package com.commands;

import com.gui_app_txt_edit.TextPanel;

public class CopyCommand implements Command{

    private TextPanel textPanel;
    private String selectedText;

    public CopyCommand(TextPanel textPanel) {
        this.textPanel = textPanel;
    }

    @Override
    public void runCommand() {
        selectedText = textPanel.getSelectedText();
        System.out.println("Text to copy: " + selectedText);
    }

    @Override
    public void undoCommand() {
        textPanel.deselectAll();
    }
}
