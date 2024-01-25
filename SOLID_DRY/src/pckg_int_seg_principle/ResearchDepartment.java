package pckg_int_seg_principle;

public class ResearchDepartment extends DepartmentAuthentication{
    protected ResearchDepartment(String departmentName) {
        super(departmentName);
    }

    @Override
    public void authenticateUserNamePswd(String userName, String pswd) {
        System.out.println("Support");
    }

    @Override
    public void authenticateWithFingerPrint() {
        System.out.println("Support");
    }

    @Override
    public void authenticateWithPin(int pin) {
        System.out.println("Support");
    }

    @Override
    public void authenticateWithFaceRecognition() {
        System.out.println("Support");
    }
}
