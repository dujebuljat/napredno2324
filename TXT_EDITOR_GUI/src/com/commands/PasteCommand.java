package com.commands;

import com.gui_app_txt_edit.TextPanel;

public class PasteCommand implements Command{

    private TextPanel textPanel;

    public PasteCommand(TextPanel textPanel) {
        this.textPanel = textPanel;
    }

    @Override
    public void runCommand() {
        String text = "Neki kopirani tekst - treba doci do njega";
        textPanel.pasteText(text);

    }

    @Override
    public void undoCommand() {

    }
}
