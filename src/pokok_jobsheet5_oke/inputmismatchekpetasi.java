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
import java.util.Scanner;
public class inputmismatchekpetasi {
    public static void main(String[] args) {
        int a = 100;
        System.out.println("masukkan nilai a");
        Scanner console = new Scanner(System.in);
        int b = console.nextInt();
        
        System.out.println("masukkan nialai b");
        int c = console.nextInt();
        double res=b/c;
        System.out.println("hasilnya adalah : "+res);
    }
}
