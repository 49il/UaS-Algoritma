/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No1;

/**
 *
 * @author user
 */
public class TumpukanApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
          UasTumpukan tumpukan=new UasTumpukan(10);
        tumpukan.push(1);
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(2);
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(3);
        tumpukan.baca();
        System.out.println(" ");
        System.out.println("Nilai Teratas = "+ tumpukan.peek());
        System.out.println(" ");
        System.out.println("Nama saya adalah Agil Said Ramadon");
        System.out.println(" ");
        System.out.println("Nilai yang di hapus = "+tumpukan.pop());
        System.out.println(" ");
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(4);
        tumpukan.baca();
       
    }
    }
    

