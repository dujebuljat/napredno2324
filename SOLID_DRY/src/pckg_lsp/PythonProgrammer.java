package pckg_lsp;

public class PythonProgrammer extends Programmer{
    protected PythonProgrammer(String name, int years) {
        super(name, years);
    }

    @Override
    public void code() {
        System.out.println("Coding in Python...");
    }

    @Override
    public void test() {
        System.out.println("Testing Python code...");
    }

    @Override
    public void refactor() {
        System.out.println("Refactoring Python code...");
    }

    @Override
    public void writeDocumentation() {
        System.out.println("Writing Python documentation...");
    }

    @Override
    public void deployApp() {
        System.out.println("Deploying Python app...");
    }
}
