import java.util.EventObject;

public class SliderEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */

    private int fontSize;

    public SliderEvent(Object source, int fontSize) {
        super(source);
        this.fontSize = fontSize;
    }

    public int getFontSize() {
        return fontSize;
    }

    @Override
    public String toString() {
        return "SliderEvent{" +
                "fontSize=" + fontSize +
                ", source=" + source +
                '}';
    }
}
