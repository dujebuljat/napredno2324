package pckg_basics;

import java.io.*;

public class Main {

    private static Writer writer;

    public static void main(String[] args) throws FileNotFoundException {

        writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File("C:\\Users\\dujeb\\Desktop\\Faks\\Napredno\\Napredno2324\\DECORATOR\\src\\pckg_basics\\DATA\\newFile.txt"))));
        String ex = "Some string to write";
        try {
            writer.write(ex);
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
