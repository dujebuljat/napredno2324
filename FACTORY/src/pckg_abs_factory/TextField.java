package pckg_abs_factory;

public abstract class TextField extends Component {

    protected int numberOfColumns;

    protected TextField(int columns) {
        this.numberOfColumns = columns;
    }

    public abstract void createTextField();
}
