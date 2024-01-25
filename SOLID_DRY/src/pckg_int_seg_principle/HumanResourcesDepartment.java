package pckg_int_seg_principle;

public class HumanResourcesDepartment extends DepartmentAuthentication{
    protected HumanResourcesDepartment(String departmentName) {
        super(departmentName);
    }

    @Override
    public void authenticateUserNamePswd(String userName, String pswd) {
        System.out.println("Authentication with username and password...");
    }

    @Override
    public void authenticateWithFingerPrint() {
        throw new UnsupportedOperationException("This authentication is not supported...");
    }

    @Override
    public void authenticateWithPin(int pin) {
        throw new UnsupportedOperationException("This authentication is not supported...");
    }

    @Override
    public void authenticateWithFaceRecognition() {
        throw new UnsupportedOperationException("This authentication is not supported...");
    }
}
