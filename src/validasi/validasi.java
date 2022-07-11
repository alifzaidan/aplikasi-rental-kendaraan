/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validasi;

import java.awt.event.KeyEvent;
import javax.swing.*;

/**
 *
 * @author Alif
 */
public final class validasi {
    
    public validasi(){
        super();
    };
    
    public void pindah (java.awt.event.KeyEvent evt, JTextField kiri, JButton kanan){
        if(evt.getKeyCode()==KeyEvent.VK_PAGE_DOWN){
            kanan.requestFocus();
        }else if(evt.getKeyCode()==KeyEvent.VK_PAGE_UP){
            kiri.requestFocus();
        }
    }
}
