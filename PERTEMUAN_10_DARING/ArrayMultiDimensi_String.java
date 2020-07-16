/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERTEMUAN_10_DARING;

import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class ArrayMultiDimensi_String {
    public static void main(String[] args) {
        String menu[][] = {{"Soto", "10000"}, {"Sop", " 7000"}, {"Sate", "20000"},{"Teh", " 3000"}, {"Kopi", "4000"}};
        
        System.out.println("====== Daftar Menu Makanan dan Minuman ======");
        for(int i=0; i<menu.length; i++){
            for(int j=0; j<menu[0].length; j++){
                System.out.print(menu[i][j] + " ");
            }
            System.out.println(" ");
        }
        
        System.out.println(" ");
        String search = JOptionPane.showInputDialog(null, "Cari Harga Makanan/Minuman");
        for(int i=0; i<menu.length; i++){
            for(int j=0; j<menu[0].length; j++){
                if(menu[i][j].equals(search)){
                    JOptionPane.showMessageDialog(null, "Menu " + search + " memiliki harga Rp " + menu[i][j+1]);
                }
                System.out.print(menu[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
