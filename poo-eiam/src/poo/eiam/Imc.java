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
public class Imc {
    //El siguiente atributo es de tipo:
    //Composicion/Agregacion
    Usuario usr; 
    
    public String calcular(){
        
        float imc= usr.peso/(usr.altura*usr.altura);
                
        return "Aqui aparecera tu resultado: "+imc;
    }
}