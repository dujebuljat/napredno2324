import java.awt.*;
import java.util.EventObject;

public class DataEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */

    private String fontFamily;
    private int fontStyle;
    private int fontSize;

    public DataEvent(Object source, String fontFamily, int fontStyle, int fontSize) {
        super(source);
        this.fontFamily = fontFamily;
        this.fontStyle = fontStyle;
        this.fontSize = fontSize;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public int getFontStyle() {
        return fontStyle;
    }

    public int getFontSize() {
        return fontSize;
    }

    @Override
    public String toString() {
        return "DataEvent{" +
                "fontFamily='" + fontFamily + '\'' +
                ", fontStyle='" + fontStyle + '\'' +
                ", fontSize=" + fontSize +
                '}';
    }
}
