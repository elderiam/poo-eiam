/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuestionario;

import java.util.*;
/**
 *
 * @author GrobbierElder
 */
public class AplicacionCuestionario {
    
    
    public static void main(String[] args) {
        //Generamos las respuestas
        
        Opcion op1=new Opcion("Futbol",true);
        Opcion op2=new Opcion("Basketball", false);
        Opcion op3=new Opcion("Baseball", false);
        Opcion op4=new Opcion("Golf", false);
        
        ArrayList<Opcion> opciones = new ArrayList<>();
        opciones.add(op1);
        opciones.add(op2);
        opciones.add(op3);
        opciones.add(op4);
        
        //Creamos la pregunta
        Pregunta p1=new Pregunta();
        p1.setTitulo("Cual es el deporte mas popular en Mexico?");
        p1.setOpciones(opciones);
        
        //Generamos el modelo
        
        ModeloCuestionario modelo = new ModeloCuestionario();
        modelo.agregarPregunta(p1);
        ArrayList<Pregunta> c= modelo.obtenerCuestionario();
        
        //Iteremoslo
        for(Pregunta p:c){
            System.out.println(p.getTitulo());
                for(Opcion o: p.getOpciones())
                System.out.println(o.getTitulo()+" "+o.isCorrecta());
        }
    }
}
