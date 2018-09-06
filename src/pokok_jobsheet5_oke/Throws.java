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
public class Throws {
    public static void main(String[] args) {
        try{
        f();
        }
        catch(Exception n){
        System.err.println(n);
        }
    }

    private static void f() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
