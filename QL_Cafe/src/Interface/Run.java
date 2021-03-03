/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Models.TaiKhoan;

/**
 *
 * @author ThangIKCU
 */
public class Run {
    public static frmMain QlCafe;
    public static frmLogIn frmlg;
    public static TaiKhoan tk;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        lg();
    }
    public static void lg(){
        frmlg = new frmLogIn();
        frmlg.setVisible(true);       
    }  
    public static void QLCF(){
        QlCafe = new frmMain();
        QlCafe.setVisible(true);       
    }
   
   
}
