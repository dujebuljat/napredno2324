package pckg_srp_principle;

import java.io.Serializable;

public class NewUser implements Serializable {

    private String mail;
    private int ID;
    private static int cntID = 20;

    public NewUser(String mail) {
        this.ID = cntID++;
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "NewUser{" +
                "mail='" + mail + '\'' +
                ", ID=" + ID +
                '}';
    }
}
