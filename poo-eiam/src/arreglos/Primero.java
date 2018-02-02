/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author GrobbierElder
 */
public class Primero {
    
    public static void main(String[] args) {
        
        //Arreglos no mutables
        int x[]={5,-2,6};
        int []y= {5,-2,6};
        //Para obtener un elemento del arreglo 
        //usamos:
        System.out.println(x[2]);
        //Todos los arreglos no mutables
        //tienen una propiedad para saber
        //su tamano
            System.out.println(x.length);
            
        //Vamos a iterar el areglo  con un ciclo for
        for(int i=0; i<x.length; i++){
            
            System.out.println(x[i]);
        }
        //Lo mismo pero con el for mejorado
        for(int a:x){
            System.out.println(a);
        }
    }
    
}
