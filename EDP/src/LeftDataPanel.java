import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeftDataPanel extends JPanel {

    private JTextField userInputField;
    private JCheckBox mailChkBox;
    private JCheckBox smsChkBox;
    private JCheckBox msngChkBox;
    private JRadioButton monRBtn;
    private JRadioButton tueRBtn;
    private JRadioButton wedRBtn;
    private JRadioButton thrRBtn;
    private JRadioButton friRBtn;
    private ButtonGroup radioDaysGroup;
    private JButton sendMsgBtn;
    private LeftPanelDataListener leftPanelDataListener;

    public LeftDataPanel() {

        LeftDataPanel.super.setBackground(Color.green);

        initLeftPanelComps();
        layoutLeftPanelComps();
        activateLeftPanel();

    }

    public void setLeftPanelDataListener(LeftPanelDataListener leftPanelDataListener) {
        this.leftPanelDataListener = leftPanelDataListener;
    }

    private void activateLeftPanel() {

        sendMsgBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LeftPanelDataEvent leftPanelDataEvent = new LeftPanelDataEvent(this, smsChkBox.isSelected(), mailChkBox.isSelected(), msngChkBox.isSelected(), radioDaysGroup.getSelection().getActionCommand(), userInputField.getText());

                if (leftPanelDataListener != null) {
                    leftPanelDataListener.leftPanelDataEventOccurred(leftPanelDataEvent);
                } else {
                    System.out.println("Set panel listener...");
                }
            }
        });
    }

    private void layoutLeftPanelComps() {

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;

        add(Box.createVerticalStrut(20), gbc);

        gbc.gridy++;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(new JLabel("Input data: "), gbc);

        gbc.gridy++;
        add(userInputField, gbc);

        gbc.gridy++;
        gbc.weighty = 0.25;
        add(Box.createVerticalStrut(20), gbc);

        gbc.gridy++;
        gbc.weighty = 0.01;
        add(new JLabel("Notify with: "), gbc);
        // check box group
        gbc.gridy++;
        add(mailChkBox, gbc);

        gbc.gridy++;
        add(smsChkBox, gbc);

        gbc.gridy++;
        add(msngChkBox, gbc);

        gbc.gridy++;
        gbc.weighty = 0.25;
        add(Box.createVerticalStrut(20), gbc);
        // radio button group
        gbc.gridy++;
        gbc.weighty = 0.01;
        add(new JLabel("Meeting on day: "), gbc);
        gbc.gridy++;
        add(monRBtn, gbc);
        gbc.gridy++;
        add(tueRBtn, gbc);
        gbc.gridy++;
        add(wedRBtn, gbc);
        gbc.gridy++;
        add(thrRBtn, gbc);
        gbc.gridy++;
        add(friRBtn, gbc);

        gbc.gridy++;
        gbc.weighty = 0.25;
        add(Box.createVerticalStrut(20), gbc);
        // button area
        gbc.gridy++;
        gbc.weighty = 0.01;
        add(sendMsgBtn, gbc);

    }

    private void initLeftPanelComps() {

        userInputField = new JTextField(10);

        Border outer = BorderFactory.createEmptyBorder(5,5,5,5);
        Border inner = BorderFactory.createTitledBorder("Data - 1: ");
        Border panelBorder = BorderFactory.createCompoundBorder(outer, inner);
        setBorder(panelBorder);
        Dimension dims = getPreferredSize();
        dims.width = 250;
        setPreferredSize(dims);

        msngChkBox = new JCheckBox("Messenger");
        smsChkBox = new JCheckBox("SMS");
        mailChkBox = new JCheckBox("Mail");
        mailChkBox.setSelected(true);
        monRBtn = new JRadioButton("Monday");
        tueRBtn = new JRadioButton("Tuesday");
        wedRBtn = new JRadioButton("Wednesday");
        thrRBtn = new JRadioButton("Thursday");
        friRBtn = new JRadioButton("Friday");
        monRBtn.setActionCommand("Monday");
        tueRBtn.setActionCommand("Tuesday");
        wedRBtn.setActionCommand("Wednesday");
        thrRBtn.setActionCommand("Thursday");
        friRBtn.setActionCommand("Friday");
        monRBtn.setSelected(true);
        radioDaysGroup = new ButtonGroup();
        radioDaysGroup.add(monRBtn);
        radioDaysGroup.add(tueRBtn);
        radioDaysGroup.add(wedRBtn);
        radioDaysGroup.add(thrRBtn);
        radioDaysGroup.add(friRBtn);
        sendMsgBtn = new JButton("Send Message");
    }

    public void resetAllInLeft() {

        System.out.println("Reset all on left panel and request focus in text field...");
    }
}
