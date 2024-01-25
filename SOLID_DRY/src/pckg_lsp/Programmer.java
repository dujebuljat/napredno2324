package pckg_lsp;

public abstract class Programmer implements Programming {

    protected String name;
    protected int yearsOfExperience;

    protected Programmer(String name, int years) {
        this.name = name;
        this.yearsOfExperience = years;
    }

    public void setYearsOfExperience(int years) {
        this.yearsOfExperience = years;
    }

}
