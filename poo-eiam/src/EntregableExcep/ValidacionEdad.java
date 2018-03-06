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
public class ValidacionEdad {
    
    public static void EdadException(int edad) throws EdadException{
    
    if(edad<18) throw new EdadException();
    
    } 
    
}
