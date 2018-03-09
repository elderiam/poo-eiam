/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen;

import java.util.ArrayList;

/**
 *
 * @author T-102
 */
public class Empleado {
    
    
            public static void main(String[] args) {
        
      /*       Trabajador trabajadores[] = new Trabajador[3];
             
             trabajadores[0]=new Thonorarios();
             trabajadores[1]=new Tplanta();
             trabajadores[2]=new Tproyecto();
      */ 
             ServicioNominas s= new ServicioNominas();
             
        /*     for(Trabajador traba: trabajadores){
             s.servicioPagar((Pago) traba);
             }
        */    
              ArrayList<Trabajador> trabajador=new ArrayList<>();
              trabajador.add(new Thonorarios());
              trabajador.add(new Tplanta());
              trabajador.add(new Tproyecto()); 
             
             for(Trabajador employment: trabajador){
                         s.servicioPagar((Pago)employment); // Todo este ejercicio es un arreglo mutable
                        }
                        trabajador.get(0).setNombre("Juan");
                        trabajador.get(0).setHoras(40);
                        int pagoh =(int) (trabajador.get(0).getHoras()*(1-trabajador.get(0).getHoras()*0.16)*250);
                        System.out.println(trabajador.get(0).getNombre()+" va recibir:$"+pagoh+"y su sueldo sale asi: pago= horas laboradas*(1-horas laboradas*0.16)*250");
                        
                        trabajador.get(1).setNombre("Pedro");
                        trabajador.get(1).setHoras(20);
                        int pagop =(int) (trabajador.get(1).getHoras()*250);
                        System.out.println(trabajador.get(1).getNombre()+" va recibir:$"+pagop+"y su sueldo sale asi: pago= horas laboradas*250");
                        
                        trabajador.get(2).setNombre("Ana");
                        trabajador.get(2).setHoras(100);
                        int pagopro =(int) (trabajador.get(2).getHoras()*200);
                        System.out.println(trabajador.get(2).getNombre()+" va recibir:$"+pagopro+"y su sueldo sale asi: pago= horas laboradas*200");
                
    }
}
