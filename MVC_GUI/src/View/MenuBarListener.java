package View;

import java.awt.event.ActionEvent;
import java.util.EventListener;

public interface MenuBarListener extends EventListener {

    void menuBarEventOccurred(ActionEvent ae);
}
