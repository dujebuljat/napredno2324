import javax.swing.*;
import java.awt.*;

public class PresentationPanel extends JPanel {

    private JTextArea txtArea;
    private JScrollPane scPaneTxt;

    public PresentationPanel() {

        txtArea = new JTextArea();
        txtArea.setBackground(Color.BLACK);
        txtArea.setForeground(Color.red);
        scPaneTxt = new JScrollPane(txtArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        setLayout(new BorderLayout());
        add(scPaneTxt, BorderLayout.CENTER);
    }

    public JTextArea getTxtArea() {
        return txtArea;
    }

    public void setDataOnPanel(String data) {

        txtArea.append(data + "\n");
    }

    public void changeFontSize(Font font1) {
        txtArea.setFont(font1);
    }

    public void clearAll() {
        txtArea.selectAll();
        txtArea.replaceSelection(null);
    }
}
