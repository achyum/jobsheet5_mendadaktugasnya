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
public class classtest implements cloneable {

    /**
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
   public test clone() throws CloneNotSupportedException{
   return (test) super.clone();
   }
    public static void main(String[] args) {
    try {
            new test().clone();
        } 
    catch( CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

