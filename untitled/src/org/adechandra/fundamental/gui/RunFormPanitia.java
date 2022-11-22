package org.adechandra.fundamental.gui;

import javax.swing.*;

public class RunFormPanitia {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Formulir Pendaftaran Panitia");
        jFrame.setContentPane(new FormPanitia().getRootpanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setSize(700,550);
        jFrame.setVisible(true);
    }
}
