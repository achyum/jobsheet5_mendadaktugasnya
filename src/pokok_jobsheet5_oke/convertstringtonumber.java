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
public class convertstringtonumber {
    public static void main(String[] args) {
        try{
        String s = "lima";
        int i = Integer.parseInt(s);
        System.out.println("int value = " +i);
        }
        catch(NumberFormatException nfe){
        nfe.printStackTrace();
        }
    }
}
