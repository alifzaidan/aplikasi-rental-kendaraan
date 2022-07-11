/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package super_interface;

/**
 *
 * @author Alif
 */
public abstract class pilihKendaraanSuper {
    public String nama;
    public String nik;
    public String alamat;
    public String tlp;
    public String email;
    public abstract void tampilkan_data();
    public abstract void berikutnya();
    public abstract void cari();
    public abstract void klikTabel(java.awt.event.MouseEvent evt);
    public abstract void kembali();
}
