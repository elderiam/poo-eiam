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
public class ValidarCantidades { //clase tipo modelo
    
    
    public static void valdarValorNegativo(float valor) throws NumeroNegativoException{
    
        if(valor < 0) throw new NumeroNegativoException();
        
    }
}
