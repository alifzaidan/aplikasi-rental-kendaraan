/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import javax.swing.JOptionPane;
import main.formIsiData;
import main.formPilihMobil;
import main.formPilihMotor;
import main.menuUser;
import super_interface.isiDataIntrfc;

/**
 *
 * @author Alif
 */
public class isiDataCtr implements isiDataIntrfc{
    
    private static formIsiData idt;

    public isiDataCtr(formIsiData idt) {
        this.idt = idt;
    }
    
    @Override
    public void kosongkan_form() {
        idt.getNama().setEditable(true);
        idt.getNama().setText("");
        idt.getNIK().setText("");
        idt.getAlamat().setText("");
        idt.getNotelp().setText("");
        idt.getEmail().setText("");
    }
    
    @Override
    public void pilihMobil(){
        if (!idt.getNama().getText().isEmpty() && !idt.getNIK().getText().isEmpty() && !idt.getAlamat().getText().isEmpty() && !idt.getNotelp().getText().isEmpty() && !idt.getEmail().getText().isEmpty()) {
            String nama = idt.getNama().getText();
            String nik = idt.getNIK().getText();
            String alamat = idt.getAlamat().getText();
            String tlp = idt.getNotelp().getText();
            String email = idt.getEmail().getText();
            kosongkan_form();

            menuUser.jDesktopPane1.removeAll();
            menuUser.jDesktopPane1.repaint();
            formPilihMobil fp = new formPilihMobil(nama, nik, alamat, tlp, email);
            fp.setVisible(true);
            menuUser.jDesktopPane1.add(fp);
        } else {
            JOptionPane.showMessageDialog(null, "Data isian ada yang kosong");
        }
    }
    
    @Override
    public void pilihMotor(){
        if (!idt.getNama().getText().isEmpty() && !idt.getNIK().getText().isEmpty() && !idt.getAlamat().getText().isEmpty() && !idt.getNotelp().getText().isEmpty() && !idt.getEmail().getText().isEmpty()) {
            String nama = idt.getNama().getText();
            String nik = idt.getNIK().getText();
            String alamat = idt.getAlamat().getText();
            String tlp = idt.getNotelp().getText();
            String email = idt.getEmail().getText();
            kosongkan_form();

            menuUser.jDesktopPane1.removeAll();
            menuUser.jDesktopPane1.repaint();
            formPilihMotor fp = new formPilihMotor(nama, nik, alamat, tlp, email);
            fp.setVisible(true);
            menuUser.jDesktopPane1.add(fp);
        } else {
            JOptionPane.showMessageDialog(null, "Data isian ada yang kosong");
        }
    }
    
}
