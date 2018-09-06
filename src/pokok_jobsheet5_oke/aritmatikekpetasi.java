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
public class aritmatikekpetasi {
    public static void main(String[] args) {
        int a = 100;
        System.out.println("enter the value for b");
        Scanner console = new Scanner(System.in);
        int b = console.nextInt();
        System.out.println("enter the value for c");
        int c = console.nextInt();
        int res=10/(b-c);
        System.out.println("the result is "+res);
    }
}
