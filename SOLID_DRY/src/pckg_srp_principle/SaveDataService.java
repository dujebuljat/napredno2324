package pckg_srp_principle;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class SaveDataService {

    public static <T> void saveData(T someData, String path) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            bw.write(someData.toString());
            System.out.println("Data written to a file!");

        } catch (Exception e) {
            System.out.println("Unable to write in a file: " + path);
        }
    }

    public static <T> void saveData2BinFile(T someData, String path) {

    }

    public static <T> void saveData2TxtFile(T someData, String path) {

    }
}
