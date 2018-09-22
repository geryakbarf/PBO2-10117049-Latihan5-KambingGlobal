/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117049.latihan5.kambingglobal;

/**
 *
 * @author Gery Akbar Fauzi
 * Nama                 : Gery Akbar Fauzi
 * Kelas                : PBO2
 * Nim                  : 10117049
 * Deskripsi Program    : Program ini berisi program dengan variabel instance 
 */
public class KambingGlobal {
    //variabel kambing menggunakan variabel instance
    int jumlahKambing = 88;
    
    //Method untuk menampilkan jumlah kambing
    public void getjumlahKambing(){
        System.out.println("Jumlah Kambing : "+ jumlahKambing +" ekor");
    }
    //Method untuk menambahkan kambing
    public void tambahKambing(){
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambahkan : "+ 
                jumlahKambing + " ekor");
    }
   
    public static void main(String[] args) {
        KambingGlobal kambingSusu = new KambingGlobal();
        
        //Menampilkan jumlah kambing saat program pertama kali berjalan
        kambingSusu.getjumlahKambing();
        
        //Menambah satu kambing
        kambingSusu.tambahKambing();
        
        //Menampilkan jumlah kambing yang ada
        kambingSusu.getjumlahKambing();
    }
    
}
