/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.eiam;

/**
 *
 * @author GrobbierElder
 */
public class PooEiam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola Mundo");
        
        //Tenemos que generar antes los objetos de las 
        //clases anteriores
        Usuario x=new Usuario();
        x.setAltura(1.83f);
        x.setPeso(96.6f);                
        Imc algo=new Imc();
        algo.usr=x;
        //Calculamos el IMC a traves de su objeto
        System.out.println(algo.calcular());
            
        
    }
    
}
