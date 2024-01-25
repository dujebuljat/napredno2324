package pckg_text_editor;

import java.util.Stack;

public class TextCommandInvoker {


    private TextCommand textCommand;
    private final Stack<TextCommand> undoStack;
    private final Stack<TextCommand> redoStack;

    public TextCommandInvoker() {
        this.undoStack = new Stack<>();
        this.redoStack = new Stack<>();
    }

    public void runCommand(TextCommand textCommand) {
        this.textCommand = textCommand;
        if (textCommand.executeCommand()) {
            undoStack.push(textCommand);
        } else {
            System.out.println("Command is not executed due to some reason!");
        }
        getStackStatus();
    }

    public void undoCommand() {
        if(undoStack.isEmpty()) {
            System.out.println("Nothing to undo");
        } else {
            this.textCommand = undoStack.pop();
            this.textCommand.undoCommand();
            redoStack.push(textCommand);
            getStackStatus();
        }
    }

    public void redoCommand() {
        if(redoStack.isEmpty()) {
            System.out.println("Nothing to redo!!!");
        } else {
            this.textCommand = redoStack.pop();
            this.textCommand.redoCommand();
            undoStack.push(textCommand);
            getStackStatus();
        }
    }

    private void getStackStatus() {
        System.out.println("Undo stack:\n");
        System.out.println(undoStack);
        System.out.println("Redo stack:\n");
        System.out.println(redoStack);
    }


//    private TextCommand textCommand;
//    private Stack<TextCommand> undoStack;
//    private Stack<TextCommand> redoStack;
//
//    public TextCommandInvoker() {
//        undoStack = new Stack<>();
//        redoStack = new Stack<>();
//    }
//
//    public void setTextCommand(TextCommand textCommand) {
//        this.textCommand = textCommand;
//    }
//
//    public void executeCommand() {
//        textCommand.executeCommand();
//        undoStack.push(textCommand);
//        System.out.println("Undo stack size: " + undoStack.size());
//        System.out.println(undoStack);
//        System.out.println(redoStack);
//    }
//
//    public void undoCommand() {
//        if (!undoStack.isEmpty()) {
//            TextCommand command = undoStack.pop();
//            command.undoCommand();
//            redoStack.push(command);
//            System.out.println("Undo stack size: " + undoStack.size());
//            System.out.println(undoStack);
//            System.out.println(redoStack);
//        }else {
//            System.out.println("Nothing to undo");
//        }
//    }
//
//    public void redoCommand() {
//        if (!redoStack.isEmpty()) {
//            TextCommand command = redoStack.pop();
//            command.redoCommand();
//            undoStack.push(command);
//            System.out.println("Undo stack size: " + undoStack.size());
//            System.out.println(undoStack);
//            System.out.println(redoStack);
//        }else {
//            System.out.println("Nothing to redo");
//        }
//    }
}
