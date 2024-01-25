package pckg_int_seg_principle;

public class MarketingDepartment extends DepartmentAuthentication{
    protected MarketingDepartment(String departmentName) {
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
        System.out.println("Authentication with pin...");
    }

    @Override
    public void authenticateWithFaceRecognition() {
        throw new UnsupportedOperationException("This authentication is not supported...");
    }
}
