import java.util.EventListener;

public interface RightPanelDataListener extends EventListener {

    void confirmBtnEventOccurred(DataEvent de);
    void resetAllBtnEventOccurred();
}
