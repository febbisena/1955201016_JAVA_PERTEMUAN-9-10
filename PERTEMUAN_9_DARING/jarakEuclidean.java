/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERTEMUAN_9_DARING;

/**
 *
 * @author USER
 */
public class jarakEuclidean {
    public static void main(String[] args) {
        // Objek Math
        // Array
        
        // x = usia
        // y = berat badan
        // z = ipk
        
        double saya[] = {26, 67, 3.67};
        double anton[] = {25, 65, 3.60};
        double andi[] = {27, 70, 3.68};
        
        double d_saya_anton = Math.sqrt((Math.pow(saya[0] - anton[0], 2)) + (Math.pow(saya[1] - anton[1], 2)) + (Math.pow(saya[2] - anton[2], 2)));
            System.out.println("Hasil jarak euclidean antara saya dengan Anton adalah : " +d_saya_anton);
        double d_saya_andi = Math.sqrt((Math.pow(saya[0] - andi[0], 2)) + (Math.pow(saya[1] - andi[1], 2)) + (Math.pow(saya[2] - andi[2], 2)));
            System.out.println("Hasil jarak euclidean antara saya dengan Andi adalah : " +d_saya_andi);
        double hasilFinal = Math.min(d_saya_andi, d_saya_anton);
            System.out.println("Hasil final adalah " +hasilFinal);
    }
}
