/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion;

/**
 *
 * @author GrobbierElder
 */

import java.io.*;
import java.util.concurrent.ExecutionException;
public class PersistenciaUsuario {
    
    Usuario u;
    //Generamos el metodo para serializar a nuestro usuario

    public void guardar() {
    
        //  para serializar el primer paso es generar el archivo fisico donde estara nuestro obj tipo usr
        File file = new File("archivaldo.mio");
        
        //Despues lo abrimos para escribir sobre el
        try{
            FileOutputStream fos=new FileOutputStream(file);
        //luego serializamos
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        //guardamos nuestro usuario!!
        oos.writeObject(u);
        //Ponemos un mensaje
                System.out.println("Objeto guardado con exito!!");
                
                
        }catch(Exception e){
          System.out.println(e.getMessage());
        }
    }   
    public Usuario getU() {
        return u;
    }

    public void setU(Usuario u) {
        this.u = u;
    }
    
    public Usuario recobrarUsuario(){
    
        File file=new File("archivaldo.mio");
        Usuario recobrado=null;
        //El proceso inverso
        try{
         
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream  ois = new ObjectInputStream(fis);
         recobrado = (Usuario) ois.readObject();
         
        }catch(Exception e){
        
            System.out.println(e.getMessage());
            
        } 
         return recobrado;
    }
}
