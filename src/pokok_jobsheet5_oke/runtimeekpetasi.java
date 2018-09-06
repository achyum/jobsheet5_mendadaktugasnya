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
public class runtimeekpetasi {
    public static void main(String[] args) {
        int a = 35;
        int b = 5;
        try{
        int x = a/b;
        System.out.println("hasil : "+x);
        int[] angka = {1,2,3,4,5};
        angka[24] = 72;
        int y = x/0;
        }
        catch(Exception e){
        System.out.println("salah");
        System.out.println(e);
        }
        System.out.println("selesai");
        
    }
}
