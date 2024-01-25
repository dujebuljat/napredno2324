package pckg_srp_principle;

public class Client {

    public static void main(String[] args) {
        NewUser newUser = new NewUser("mail1@domain.com");
        boolean authenticated = AuthenticationService.checkAuthenticationData("Username1", "pswd1233");
        System.out.println("Authentication success: " + authenticated);
        AuthenticationService.validPassword("pswd1233");
        SaveDataService.saveData2TxtFile(newUser, "file1.txt");
        SaveDataService.saveData2BinFile(newUser, "file1.bin");
    }
}
