package pckg_abs_factory;

public abstract class Button extends Component {

    protected String buttonName;

    protected Button(String name) {
        this.buttonName = name;
    }

    public abstract void createButton();


}
