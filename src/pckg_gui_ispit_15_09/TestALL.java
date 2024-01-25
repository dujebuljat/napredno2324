package pckg_gui_ispit_15_09;

import javax.swing.*;

public class TestALL {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame();
            }
        });
    }
}
