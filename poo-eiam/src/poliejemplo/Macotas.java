/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poliejemplo;

import java.util.*;

/**
 *
 * @author GrobbierElder
 */
public class Macotas {
    
             
    
    public static void main(String[] args) {
        
       
       
       Animal animales [] = new Animal [12];
       //Primero generamos a los gatos
       animales[0]=new Gato();
       animales[1]=new Gato();
       animales[2]=new Gato();
       
       animales[3]=new Perro();
       animales[4]=new Perro();
       
       animales[5]=new Pollo();
       animales[6]=new Pollo();
       animales[7]=new Pollo();
       animales[8]=new Pollo();
       animales[9]=new Pollo();
       
       animales[10]=new Raton();
       animales[11]=new Raton();
       
                    ServicioAnimales s= new ServicioAnimales();
       //La magia del polimorfismo
                        for(Animal animal:animales){
                          s.servicioHacerRuido((ComportamientoAnimal) animal);
                        }
      
                        //Vamos a generar un ArrayList y poner alli
                        //algunos animalitos
                        ArrayList<Animal> animalitos=new ArrayList<>(); 
                        animalitos.add(new Pollo());
                        animalitos.add(new Raton());
                        animalitos.add(new Gato());
                        animalitos.add(new Perro());
                        animalitos.add(new Perro());
                        
                        for(Animal pet: animalitos){
                         s.servicioHacerRuido((ComportamientoAnimal)pet); // Todo este ejercicio es un arreglo mutable
                        }
                        animalitos.get(0).setEdad(1);
                        System.out.println(animalitos.get(0).getEdad());
    }
    
 }

