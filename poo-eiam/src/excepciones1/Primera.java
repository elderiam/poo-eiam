/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones1;

/**
 *
 * @author GrobbierElder
 */
public class Primera {
    
    public static void main(String[] args) {
        
        // vamos a crear un arreglo
        int[] valores={2,6,-8,5};
        
        for(int i=0; i<=valores.length; i++){  
          //  System.out.println("valor "+valores[i]);
        }
        
        //Esta excepcion es muy truculenta
        float x=5;
        int y=0; 
        // System.out.println(x/y); ArithmeticException
        int z=Integer.parseInt("x");
        System.out.println(z*2);//NumberFormatExcetion
    }
    
}
