package pckg_text_editor;

public class AppTest {

    public static void main(String[] args) {

        TextEditor textEditor = new TextEditor();
        TextCommandInvoker textCommandInvoker = new TextCommandInvoker();
        AddTextCommand addTextCommand1 = new AddTextCommand("Fst string to add.", textEditor);
        textCommandInvoker.runCommand(addTextCommand1);
        AddTextCommand addTextCommand2 = new AddTextCommand("Snd string to add.", textEditor);
        textCommandInvoker.runCommand(addTextCommand2);
        AddTextCommand addTextCommand3 = new AddTextCommand("Trd string to add.", textEditor);
        textCommandInvoker.runCommand(addTextCommand3);
//        DeleteTextCommand deleteTextCommand1 = new DeleteTextCommand("Snd string to add.", textEditor);
//        textCommandInvoker.runCommand(deleteTextCommand1);
//        textCommandInvoker.undoCommand();
//        textCommandInvoker.redoCommand();
//        textCommandInvoker.redoCommand();



//            |    // RADI //     |
//            V                   V

//        SBEditor sbEditor = new SBEditor();
//        AddTextCommand addTextCommand4 = new AddTextCommand("4th string to add.", sbEditor);
//        textCommandInvoker.runCommand(addTextCommand4);
    }
}
