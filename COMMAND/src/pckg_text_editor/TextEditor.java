package pckg_text_editor;

public class TextEditor implements EditorOfText{


    private String text;
    private int startPosition;
    private final StringBuilder stringBuilder;

    public TextEditor() {
        stringBuilder = new StringBuilder();
        startPosition = 0;
    }

    @Override
    public boolean addTextToTextArea(String someText) {
        this.text = someText;
        System.out.println("Before update: " + startPosition);
//        stringBuilder.append(someText).append("\n", startPosition, startPosition + someText.length());
        stringBuilder.append(text).append("\n");
        startPosition += someText.length();
        System.out.println("After update: " + startPosition);
        System.out.println("Text added: " + text);
        printAllText();
        return true;
    }

    @Override
    public boolean removeTextFromTextArea(String someText) {
        boolean removed = false;
        if (stringBuilder.indexOf(someText) ==-1) {
            System.out.println("String: \n" + someText + "\nnot found in the TextEditor");
        } else {
            startPosition = stringBuilder.indexOf(someText);
            stringBuilder.delete(startPosition, startPosition + someText.length());
            System.out.println("String is deleted!");
            removed = true;
            printAllText();
        }
        return removed;
    }

    @Override
    public void printAllText() {
        String all = stringBuilder.toString();
        System.out.println(all);
    }


//    private StringBuilder stringBuilder;
//
//    public TextEditor() {
//        stringBuilder = new StringBuilder();
//    }
//
//    public void addTextToTextArea(String someText) {
//        stringBuilder.append(someText);
//    }
//
//    public void removeTextFromTextArea(String someText) {
//        stringBuilder.delete(stringBuilder.length() - someText.length(), stringBuilder.length());
//    }



}
