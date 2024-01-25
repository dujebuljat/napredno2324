import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class RightDataPanel extends JPanel {

    private JList<String> fontFamilyList;
    private JComboBox<String> fontCombo;
    private JSlider fontSizeSlider;
    private JButton confirmBtn;
    private JButton resetAllBtn;
    private JScrollPane listScPane;
    private SliderEventListener sliderEventListener;
    private RightPanelDataListener rightPanelDataListener;

    public RightDataPanel() {

        RightDataPanel.super.setBackground(Color.CYAN);

        Border outer = BorderFactory.createEmptyBorder(5,5,5,5);
        Border inner = BorderFactory.createTitledBorder("Data - 2: ");
        Border panelBorder = BorderFactory.createCompoundBorder(outer, inner);
        setBorder(panelBorder);
        Dimension dims = getPreferredSize();
        dims.width = 400;
        setPreferredSize(dims);

        initRightDataPanelComps();
        layoutRightPanelComps();
        disableAll();
        activateRightDataPanel();
    }

    public void setSliderEventListener(SliderEventListener sliderEventListener) {
        this.sliderEventListener = sliderEventListener;
    }

    public void setRightPanelDataListener(RightPanelDataListener rightPanelDataListener) {
        this.rightPanelDataListener = rightPanelDataListener;
    }

    private void activateRightDataPanel() {

        confirmBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String fontFamily = fontFamilyList.getSelectedValue();
                int fontStyle = getStyle();
                int fontSize = fontSizeSlider.getValue();
                if (rightPanelDataListener != null) {
                    DataEvent de = new DataEvent(this, fontFamily, fontStyle, fontSize);
                    rightPanelDataListener.confirmBtnEventOccurred(de);
                }
            }

            private int getStyle() {

                String style = fontCombo.getSelectedItem().toString();
                switch (style) {
                    case "Bold":
                        return Font.BOLD;
                    case "Plain":
                        return Font.PLAIN;
                    case "Italic":
                        return Font.ITALIC;
                    default:
                        return Font.PLAIN;
                }
            }
        });

        fontSizeSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                JSlider slider = (JSlider) e.getSource();
                int num = slider.getValue();
                System.out.println("Font size: " + num);
                if (sliderEventListener != null) {
                    SliderEvent se = new SliderEvent(this, num);
                    sliderEventListener.sliderEventOccurred(se);
                }
            }
        });

        resetAllBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fontFamilyList.setSelectedIndex(0);
                fontCombo.setSelectedIndex(0);
                fontSizeSlider.setValue(10);
                disableAll();
                if (rightPanelDataListener != null) {
                    rightPanelDataListener.resetAllBtnEventOccurred();
                }
            }
        });
    }

    private void layoutRightPanelComps() {

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridy = 0;
        gbc.gridx = 0;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(new JLabel("Font family: "), gbc);

        gbc.gridy++;
        add(listScPane, gbc);

        //praznina - razmak
        gbc.gridy++;
        gbc.weighty = 0.20;
        add(Box.createHorizontalStrut(40), gbc);

        gbc.gridy++;
        add(new JLabel("Font Style"), gbc);

        gbc.gridy++;
        add(fontCombo, gbc);

        gbc.gridy++;
        add(Box.createVerticalStrut(30), gbc);

        gbc.gridy++;
        add(new JLabel("Font size"), gbc);

        gbc.gridy++;
        add(fontSizeSlider, gbc);

        gbc.gridy++;
        add(Box.createVerticalStrut(30), gbc);

        gbc.gridy++;
        add(confirmBtn, gbc);

        gbc.gridx++;
        add(resetAllBtn, gbc);
    }

    private void disableAll() {
        listScPane.setEnabled(false);
        fontCombo.setEnabled(false);
        fontSizeSlider.setEnabled(false);
        confirmBtn.setEnabled(false);
        resetAllBtn.setEnabled(false);
        fontFamilyList.setEnabled(false);
    }

    public void enableAll() {
        listScPane.setEnabled(true);
        fontCombo.setEnabled(true);
        fontSizeSlider.setEnabled(true);
        confirmBtn.setEnabled(true);
        resetAllBtn.setEnabled(true);
        fontFamilyList.setEnabled(true);
    }

    private void initRightDataPanelComps() {

        fontFamilyList = new JList<>();
        DefaultListModel<String> fontListModel = new DefaultListModel<>();
        fontListModel.addElement("Serif");
        fontListModel.addElement("SansSerif");
        fontListModel.addElement("Monospaced");
        fontListModel.addElement("Dialog");
        fontListModel.addElement("DialogInput");
        fontFamilyList.setModel(fontListModel);
        fontFamilyList.setSelectedIndex(0);
        listScPane = new JScrollPane(fontFamilyList, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        listScPane.setBorder(BorderFactory.createEtchedBorder());

        fontCombo = new JComboBox<>();
        DefaultComboBoxModel<String> fontComboModel = new DefaultComboBoxModel<>();
        fontComboModel.addElement("Plain");
        fontComboModel.addElement("Bold");
        fontComboModel.addElement("Italic");
        fontCombo.setModel(fontComboModel);
        fontCombo.setSelectedIndex(0);

        fontSizeSlider = new JSlider(JSlider.HORIZONTAL, 8, 18, 11);
        fontSizeSlider.setMajorTickSpacing(2);
        fontSizeSlider.setMinorTickSpacing(1);
        fontSizeSlider.setPaintLabels(true);
        fontSizeSlider.setPaintTicks(true);

        confirmBtn = new JButton("Confirm Font");
        resetAllBtn = new JButton("Reset All");
    }
}
