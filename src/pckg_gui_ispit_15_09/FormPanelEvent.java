package pckg_gui_ispit_15_09;

import java.util.EventObject;

public class FormPanelEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */

    private String height;
    private String weight;
    private String ageCategory;
    public FormPanelEvent(Object source, String height, String weight, String ageCategory) {
        super(source);
        this.height = height;
        this.weight = weight;
        this.ageCategory = ageCategory;
    }

    public String getHeight() {
        return height;
    }

    public String getWeight() {
        return weight;
    }

    public String getAgeCategory() {
        return ageCategory;
    }

    @Override
    public String toString() {
        return "FormPanelEvent{" +
                "height='" + height + '\'' +
                ", weight='" + weight + '\'' +
                ", ageCategory='" + ageCategory + '\'' +
                '}';
    }
}
