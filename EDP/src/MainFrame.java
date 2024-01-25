import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {


    private PresentationPanel presentationPanel;
    private LeftDataPanel leftDataPanel;
    private RightDataPanel rightDataPanel;

    public MainFrame() {
        setTitle("Presentation app");
        setSize(1280, 720);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        initFrameComps();
        layoutFrameComps();
        activateFrame();
    }

    private void initFrameComps() {
        presentationPanel = new PresentationPanel();
        leftDataPanel = new LeftDataPanel();
        rightDataPanel = new RightDataPanel();
    }

    private void layoutFrameComps() {
        setLayout(new BorderLayout());
        add(presentationPanel, BorderLayout.CENTER);
        add(leftDataPanel, BorderLayout.WEST);
        add(rightDataPanel, BorderLayout.EAST);
    }

    private void activateFrame() {

        leftDataPanel.setLeftPanelDataListener(new LeftPanelDataListener() {
            @Override
            public void leftPanelDataEventOccurred(LeftPanelDataEvent leftDataPanelDataEvent) {
                presentationPanel.setDataOnPanel(leftDataPanelDataEvent.toString());
                rightDataPanel.enableAll();
            }
        });

        rightDataPanel.setSliderEventListener(new SliderEventListener() {
            @Override
            public void sliderEventOccurred(SliderEvent se) {
                int fontSize = se.getFontSize();
                Font font1 = new Font(Font.SANS_SERIF, Font.BOLD, fontSize);
                presentationPanel.changeFontSize(font1);
            }
        });

        rightDataPanel.setRightPanelDataListener(new RightPanelDataListener() {
            @Override
            public void confirmBtnEventOccurred(DataEvent de) {
                presentationPanel.setDataOnPanel(de.toString());
                presentationPanel.getTxtArea().setFont(new Font(de.getFontFamily(), de.getFontStyle(), de.getFontSize()));
            }

            @Override
            public void resetAllBtnEventOccurred() {
                leftDataPanel.resetAllInLeft();
                presentationPanel.clearAll();
            }
        });
    }
}