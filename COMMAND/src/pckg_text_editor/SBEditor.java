package pckg_text_editor;

public class SBEditor implements EditorOfText{

    private String text;

    private StringBuffer stringBuffer;

    public SBEditor() {
        stringBuffer = new StringBuffer();
    }

    @Override
    public boolean addTextToTextArea(String someText) {
        this.text = someText;
        stringBuffer.append(text).append("\n");
        System.out.println("Text added: " + text);
        printAllText();
        return true;
    }

    @Override
    public boolean removeTextFromTextArea(String someText) {
        boolean removed = false;
        if (stringBuffer.indexOf(someText) ==-1) {
            System.out.println("String: \n" + someText + "\nnot found in the TextEditor");
        } else {
            stringBuffer.delete(stringBuffer.indexOf(someText), stringBuffer.indexOf(someText) + someText.length());
            System.out.println("String is deleted!");
            removed = true;
            printAllText();
        }
        return removed;
    }

    @Override
    public void printAllText() {
        String all = stringBuffer.toString();
        System.out.println(all);
    }
}
