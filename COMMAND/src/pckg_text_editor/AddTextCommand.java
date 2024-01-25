package pckg_text_editor;

public class AddTextCommand implements TextCommand{

    private EditorOfText textEditor;
    private String someText;

    public AddTextCommand(String someText, EditorOfText textEditor) {
        this.textEditor = textEditor;
        this.someText = someText;
    }

    @Override
    public boolean executeCommand() {
        return textEditor.addTextToTextArea(someText);
    }

    @Override
    public void undoCommand() {
        textEditor.removeTextFromTextArea(someText);
    }

    @Override
    public void redoCommand() {
        executeCommand();
    }
}
