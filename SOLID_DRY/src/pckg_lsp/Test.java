package pckg_lsp;

public class Test {

    public static void main(String[] args) {

        AppDevelopmentCompany company = new AppDevelopmentCompany();
        company.setProgrammer(new JavaProgrammer("John", 5));
        company.developApp();
        company.setProgrammer(new PythonProgrammer("Mary", 3));
        company.developApp();
    }
}
