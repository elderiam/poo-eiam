/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadFacil;

/**
 *
 * @author GrobbierElder
 */
public class TerceraForma {

        public static void main(String[] args) {
            Thread t1 = new Thread(new Runnable(){
                public void run(){
                    System.out.println("Yo soy un thread bueno");   
                } //Se cierra el metodo run
            } //se cierra la interna anonima
            );  // se cierra el constructor
            // aqui ya andamos en el main
            t1.start();
        }
}
