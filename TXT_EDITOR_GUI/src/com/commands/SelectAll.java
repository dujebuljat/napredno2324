package com.commands;

import com.gui_app_txt_edit.TextPanel;

public class SelectAll implements Command{

    private final TextPanel textPanel;

    public SelectAll(TextPanel textPanel) {
        this.textPanel = textPanel;
    }

    @Override
    public void runCommand() {
        textPanel.selectAllText();
    }

    @Override
    public void undoCommand() {
        textPanel.deselectAll();
    }
}
