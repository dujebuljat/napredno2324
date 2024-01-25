package pckg_text_editor;

public interface TextCommand {

    boolean executeCommand();

    void undoCommand();

    void redoCommand();
}
