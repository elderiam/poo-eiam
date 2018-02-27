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
public class NumeroNegativoException extends Exception{ //clase entidad
    
    public NumeroNegativoException(){
    
       super("No es posible dar valores negativos");
    }
    
}
