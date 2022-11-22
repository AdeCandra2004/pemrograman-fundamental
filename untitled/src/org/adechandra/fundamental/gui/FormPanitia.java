package org.adechandra.fundamental.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormPanitia {
    private JTextField textNama;
    private JTextField textKelas;
    private JTextField textDivisi;
    private JButton submitButton;
    private JPanel rootpanel;
    private JLabel labelTampilan;

    public FormPanitia() {
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Nama = textNama.getText();
                String Kelas = textKelas.getText();
                String Divisi = textDivisi.getText();
                Angkatan22 Orang = new Angkatan22();
                Orang.setNama(Nama);
                Orang.setKelas(Kelas);
                Orang.setDivisi(Divisi);
                labelTampilan.setText(Orang.toString());
            }
        });
    }

    public JPanel getRootpanel() {
        return rootpanel;
    }
}
