package pckg_gui_ispit_15_09;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormPanel extends JPanel {

    private JTextField height;
    private JTextField weight;

    private JRadioButton senior;
    private JRadioButton junior;

    private ButtonGroup buttonGroup;

    private JButton btnCalculate;

    private FormPanelListener formListener;

    public FormPanel(){
        initComps();
        layoutComps();
        activatePanel();
    }

    private void initComps(){

        Dimension dim = getPreferredSize();
        dim.height = 200;
        setPreferredSize(dim);

        height = new JTextField(10);
        weight = new JTextField(10);

        senior = new JRadioButton("Senior");
        junior = new JRadioButton("Junior");

        senior.setActionCommand("Senior");
        junior.setActionCommand("Junior");

        buttonGroup = new ButtonGroup();
        buttonGroup.add(senior);
        buttonGroup.add(junior);
        senior.setSelected(true);

        btnCalculate = new JButton("Calculate");

        Border innerBorder = BorderFactory.createTitledBorder("Calculate BMI");
        Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
    }

    private void layoutComps(){
        setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();

        gc.gridx = 0;
        gc.gridy = 0;
        gc.anchor = GridBagConstraints.LINE_END;

        add(new JLabel("Height: "), gc);

        gc.gridx++;
        gc.anchor = GridBagConstraints.LINE_START;
        add(height, gc);

        gc.gridx = 0;
        gc.gridy++;
        gc.anchor = GridBagConstraints.LINE_END;
        add(new JLabel("Weight: "), gc);

        gc.gridx++;
        gc.anchor = GridBagConstraints.LINE_START;
        add(weight, gc);

        gc.gridx++;
        gc.gridy = 0;

        add(Box.createHorizontalStrut(10), gc);

        gc.gridx++;
        gc.anchor = GridBagConstraints.LINE_END;
        add(new JLabel("Age category"), gc);

        gc.gridx++;
        gc.gridy++;
        gc.anchor = GridBagConstraints.LINE_START;

        add(senior, gc);
        gc.gridy++;
        add(junior, gc);

        gc.gridy++;

        add(Box.createVerticalStrut(10), gc);

        gc.gridy++;
        add(btnCalculate, gc);

    }

    public void setFormPanelListener(FormPanelListener listener){
        this.formListener = listener;
    }

    private void activatePanel(){

        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(formListener != null){
                    String heightData = height.getText();
                    String weightData = weight.getText();
                    String ageCategory = buttonGroup.getSelection().getActionCommand();
                    FormPanelEvent ev = new FormPanelEvent(this, heightData, weightData, ageCategory);
                    formListener.formPanelEventOccurred(ev);
                }
                System.out.println("Action performed!!!");
            }
        });

    }


}
