import com.gui_app_txt_edit.MainFrame;

import javax.swing.*;

public class MainTest {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                new MainFrame();
            }
        });
    }
}
