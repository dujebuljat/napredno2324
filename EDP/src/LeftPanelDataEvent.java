import java.util.EventObject;

public class LeftPanelDataEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */

    private boolean sms;
    private boolean mail;
    private boolean msngr;
    private String day;
    private String userInput;

    public LeftPanelDataEvent(Object source, boolean sms, boolean mail, boolean msngr, String day, String userInput) {
        super(source);
        this.day = day;
        this.mail = mail;
        this.sms = sms;
        this.msngr = msngr;
        this.userInput = userInput;
    }

    public boolean isSms() {
        return sms;
    }

    public boolean isMail() {
        return mail;
    }

    public boolean isMsngr() {
        return msngr;
    }

    public String getDay() {
        return day;
    }

    public String getUserInput() {
        return userInput;
    }

    @Override
    public String toString() {
        return "LeftDataPanelDataEvent{" +
                "sms=" + sms +
                ", mail=" + mail +
                ", msngr=" + msngr +
                ", day='" + day + '\'' +
                ", userInput='" + userInput + '\'' +
                '}';
    }
}
