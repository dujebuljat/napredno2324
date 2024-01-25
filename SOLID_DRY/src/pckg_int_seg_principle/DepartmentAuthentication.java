package pckg_int_seg_principle;

public abstract class DepartmentAuthentication implements Authentication{

    protected String departmentName;

    protected DepartmentAuthentication(String departmentName){
        this.departmentName = departmentName;
    }
}
