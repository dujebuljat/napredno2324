package pckg_srp_principle;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class User {

    private String userName;
    private String password;
    private String mail;
    private int ID;
    private static int cntID = 20;

    public User(String userName, String password, String mail) {
        this.ID = cntID++;
        this.userName = userName;
        this.password = password;
        this.mail = mail;
    }

    public boolean validAuthentication(String userName, String pswd) {
        return this.userName.equals(userName) && this.password.equals(pswd);
    }

    public void validPassword() {
        System.out.println("The length of the password is: " + this.password.length());
        if (this.password.length() < 8) {
            System.out.println("This is not a valid password.");
        }
    }

    public void saveUserData(String path) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            bw.write(this.toString());
            System.out.println("Data written to a file!");

        } catch (IOException e) {
//            System.out.println("Error: " + e.getMessage());
            System.out.println("Unable to write in a file: " + path);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", mail='" + mail + '\'' +
                ", ID=" + ID +
                '}';
    }
}
