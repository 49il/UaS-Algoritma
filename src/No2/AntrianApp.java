/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No2;

/**
 *
 * @author user
 */
public class AntrianApp {
    public static void main(String[] args) {
        Antrian antrian = new Antrian (10);
        antrian.enqueue(1);
        antrian.display();
        
        antrian.enqueue(8);
        antrian.display();
       
        System.out.println("Yang diambil dari antrian = "+antrian.dequeue());
       
        System.out.println("Nama saya adalah agil said ramadon");
       
        antrian.display();
        System.out.println(" ");
        antrian.enqueue(7);
        antrian.display();
        antrian.enqueue(6);
        antrian.display();
         
       
        System.out.println("Nilai yang paling depan= "+ antrian.peek());
       
      

    }
}
