/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadFacil;

import java.time.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GrobbierElder
 */
//Segunda forma de crear threads: Implementando la interface Runnable
public class ProbarThreadds implements Runnable{
    public static void main(String[] args) {
        //Creat el thread
        TareaX t1 = new TareaX();
        TareaX t2 = new TareaX();  
        Runnable r = new ProbarThreadds();
        Thread t3 = new Thread(r);
        //2. Inicializado
        t1.setName("Floky");
        t2.setName("Guero");
        t1.start(); 
        t2.start();
        t3.start();
        //3. En ejecucion lo da la JVM decide
        
        //4. Pausa no lo vamos a poner aqui, es en caso de que haga que dure cierto tiempo
        //5. Su muerte es cuando temrina su proceso
    }

    @Override
    public void run() {   
    //hacemos otra cosa
    while(true){
    LocalTime tiempo = LocalTime.now();
        int hora = tiempo.getHour();
        int minuto = tiempo.getMinute();
        int segundo = tiempo.getSecond();
            System.out.println("La hora es:"+hora+":"+minuto+":"+segundo);
        try {    
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ProbarThreadds.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }
    
    
}
