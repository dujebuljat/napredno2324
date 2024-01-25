package pckg_int_seg_principle;

public interface Authentication {

    void authenticateUserNamePswd(String userName, String pswd);

    void authenticateWithFingerPrint();
    void authenticateWithPin(int pin);
    void authenticateWithFaceRecognition();

}