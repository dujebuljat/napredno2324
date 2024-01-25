package pckg_srp_principle;

public class AuthenticationService {

    private static final int LENGTH = 8;

    public static boolean checkAuthenticationData(String userName, String password) {
        return false;
    }

    public static void validPassword(String password) {
        if (password.length() >= LENGTH) {
            System.out.println("This is valid strength for a password!");
        } else {
            System.out.println("Password too short!");
        }
    }
}
