/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERTEMUAN_10_DARING;

/**
 *
 * @author USER
 */
public class ArrayMultiDimensi_3x3 {
    public static void main(String[] args) {
        int matriksA[][] = {{7,9,5},
                           {1,5,0},
                           {4,1,2}};
        int matriksB[][] = {{5,7,3},
                           {0,4,6},
                           {3,4,5}};
        
        // MENAMPILKAN MATRIKS A
        System.out.println("Matriks A");
        for(int i=0; i<matriksA.length; i++){
            for(int j=0; j<matriksA[i].length; j++){
                System.out.print(matriksA[i][j] + " ");
            }
            System.out.println();
        }
        
        // MENAMPILKAN MATRIKS B
        System.out.println("");
        System.out.println("Matriks B");
        for(int k=0; k<matriksB.length; k++){
            for(int l=0; l<matriksB[0].length; l++){
                System.out.print(matriksB[k][l] + " ");
            }
            System.out.println();
        }
        
        // MATRIKS C = HASIL PERHITUNGAN MATRIKS A & B
        int matriksC[][] = new int[matriksA.length][matriksA[0].length];
        
        // PENGURANGAN MATRIKS
        System.out.println();
        System.out.println("Hasil Pengurangan");
        System.out.println();
        for(int m=0; m<matriksC.length; m++){
            for(int n=0; n<matriksC[0].length; n++){
                matriksC[m][n] = matriksA[m][n] - matriksB[m][n];
                System.out.print(matriksC[m][n] + "\t");
            }
            System.out.println();
        }
        
        // PENJUMLAHAN MATRIKS
        System.out.println();
        System.out.println("Hasil Penjumlahan");
        System.out.println();
        for(int m=0; m<matriksC.length; m++){
            for(int n=0; n<matriksC[0].length; n++){
                matriksC[m][n] = matriksA[m][n] + matriksB[m][n];
                System.out.print(matriksC[m][n] + "\t");
            }
            System.out.println();
        }
        
        // PERKALIAN MATRIKS
        System.out.println();
        System.out.println("Hasil Perkalian");
        System.out.println();
        for(int m=0; m<matriksC.length; m++){
            for(int n=0; n<matriksC.length; n++){
                matriksC[m][n] = 0;
                for(int p=0; p<matriksC.length; p++){
                    matriksC[m][n] = matriksC[m][n] + matriksA[m][p] * matriksB[p][n];
                }
                System.out.print(matriksC[m][n] + "\t");
            }
            System.out.println();
        }
    }
}
