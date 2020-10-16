/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119011.latihan5.kambingglobal;

/**
 *
 * @author 
 *  Nama    : Reihan Wiyanda
 *  Kelas   : IF-1
 *  Nim     : 10119011
 */
public class KambingGlobal {
    //Variabel jumlahKambing menjadi variabel instance
      int jumlahKambing = 88;
      
      //Method untuk menampilkan jumlah kambing
        public void getjumlahKambing() {
            System.out.println("Jumlah Kambing : " + jumlahKambing);
        }
            public void tambahKambing() {
                jumlahKambing = jumlahKambing + 5;
                System.out.println("Jumlah Kambing setelah di tambahkan : " + jumlahKambing);
        }
            public static void main(String[] args) {
            KambingGlobal kambingSusu = new KambingGlobal();
            
            //Menampilkan jumlah kambing yang ada saat program pertama kali berjalan
            kambingSusu.getjumlahKambing();
            
            //Menambah satu kambing
            kambingSusu.tambahKambing();
            
            //Menampilkan jumlah kambing yang ada
            kambingSusu.getjumlahKambing();
            
    }
}