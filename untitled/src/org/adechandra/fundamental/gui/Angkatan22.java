package org.adechandra.fundamental.gui;

public class Angkatan22 {
    private String Nama;
    private String Kelas;
    private String Divisi;

    public Angkatan22() {
    }

    public Angkatan22(String nama, String kelas, String divisi) {
        Nama = nama;
        Kelas = kelas;
        Divisi = divisi;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getKelas() {
        return Kelas;
    }

    public void setKelas(String kelas) {
        Kelas = kelas;
    }

    public String getDivisi() {
        return Divisi;
    }

    public void setDivisi(String divisi) {
        Divisi = divisi;
    }

    @Override
    public String toString() {
        return "Angkatan22{" +
                "Nama='" + Nama + '\'' +
                ", Kelas='" + Kelas + '\'' +
                ", Divisi='" + Divisi + '\'' +
                '}';
    }
}
