/*
 * Copyright 2021 Root101 (jhernandezb96@gmail.com, +53-5-426-8660).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Or read it directly from LICENCE.txt file at the root of this project.
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.root101.swing.prepared.exmaples;

import com.root101.swing.material.components.container.layout.VerticalLayoutContainer;
import com.root101.swing.material.components.textfield.MaterialFormatedTextField;
import com.root101.swing.material.components.textfield.MaterialFormatedTextFieldIcon;
import com.root101.swing.material.components.textfield.MaterialTextField;
import com.root101.swing.material.components.textfield.MaterialTextFieldIcon;
import com.root101.swing.material.standards.MaterialColors;
import com.root101.swing.prepared.textfield.MaterialPreparedTextFactory;
import com.root101.swing.ui.MaterialLookAndFeel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.UIManager;

/**
 *
 * @author Root101 (jhernandezb96@gmail.com, +53-5-426-8660)
 * @author JesusHdezWaterloo@Github
 */
public class EXAMPLE_TEXT_FIELDS extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public EXAMPLE_TEXT_FIELDS() {
        initComponents();

        jPanel1.setLayout(new BorderLayout());
        jPanel1.setBackground(MaterialColors.REDA_200);

        /*MaterialToggleButton btn = MaterialToggleFactory.buildButton();
        btn.addActionListener((ActionEvent e) -> {
            System.out.println(btn.isSelected());
        });
        this.add(btn);*/
        //-------------------SIMPLE-------------------------
        VerticalLayoutContainer.builder vlcSimple = VerticalLayoutContainer.builder();

        MaterialTextField textFieldDouble = MaterialPreparedTextFactory.buildDouble();
        textFieldDouble.setLabel("text field simple double");
        vlcSimple.add(textFieldDouble, true);

        MaterialTextFieldIcon textFieldDoubleIcon = MaterialPreparedTextFactory.buildDoubleIcon();
        textFieldDoubleIcon.setLabel("text field simple double icon");
        vlcSimple.add(textFieldDoubleIcon, true);

        MaterialTextField textFieldInt = MaterialPreparedTextFactory.buildInteger();
        textFieldInt.setLabel("text field simple integer");
        vlcSimple.add(textFieldInt, true);

        MaterialTextFieldIcon textFieldIntIcon = MaterialPreparedTextFactory.buildIntegerIcon();
        textFieldIntIcon.setLabel("text field simple integer icon");
        vlcSimple.add(textFieldIntIcon, true);
        //-------------------SIMPLE-------------------------

        //-------------------Formated-------------------------
        VerticalLayoutContainer.builder vlcFormated = VerticalLayoutContainer.builder();
        MaterialFormatedTextField formatedTextFieldMoney = MaterialPreparedTextFactory.buildFormatedMoney();
        formatedTextFieldMoney.setLabel("formated runtime money");
        vlcFormated.add(formatedTextFieldMoney, true);

        MaterialFormatedTextFieldIcon formatedTextFieldMoneyIcon = MaterialPreparedTextFactory.buildFormatedMoneyIcon();
        formatedTextFieldMoneyIcon.setLabel("formated runtime money icon");
        vlcFormated.add(formatedTextFieldMoneyIcon, true);
        //-------------------Formated-------------------------

        jPanel1.add(vlcSimple.build(), BorderLayout.WEST);
        jPanel1.add(vlcFormated.build(), BorderLayout.EAST);

    }

    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        this.setContentPane(jPanel1);

        pack();

        this.setSize(new Dimension(500, 500));
        this.setLocationRelativeTo(null);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new MaterialLookAndFeel());
        } catch (Exception e) {
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EXAMPLE_TEXT_FIELDS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
