package pckg_lsp;

public class JavaProgrammer extends Programmer{
    protected JavaProgrammer(String name, int years) {
        super(name, years);
    }

    @Override
    public void code() {
        System.out.println("Coding in Java...");
    }

    @Override
    public void test() {
        System.out.println("Testing Java code...");
    }

    @Override
    public void refactor() {
        System.out.println("Refactoring Java code...");
    }

    @Override
    public void writeDocumentation() {
        System.out.println("Writing javadoc...");
    }

    @Override
    public void deployApp() {
        System.out.println("Deploying Java app...");
    }
}
