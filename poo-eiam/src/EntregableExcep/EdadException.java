/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntregableExcep;

/**
 *
 * @author GrobbierElder
 */
public class EdadException extends Exception{
    
    public EdadException(){
     
    super("No puedes ingresar si eres menor de 18 anos");
    }
}
