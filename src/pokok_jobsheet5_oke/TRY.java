/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokok_jobsheet5_oke;

/**
 *
 * @author SMK TELKOM
 */
public class TRY {
    public static void main(String[] args) {
        try{
        int a = 3/0;
        System.out.println("perintah selanjutnya");
        }
        catch(Exception kesalahan){
        System.err.println(kesalahan);
        }
        finally{
        System.out.println("terima kasih banyak sudah menjalankan program dengan baik");
        }
    }
}
