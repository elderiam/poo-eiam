/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SerializacionForm;

import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author GrobbierElder
 */
public class PersistenciaEmpleado {
    
        ArrayList<Empleado> empleados;
    
      public PersistenciaEmpleado(){
      empleados = new ArrayList<>();
      }
      
        public void guardarEmpleado(Empleado e){
            
            File file = new File("empleado.mio");
           if(file.exists()){
               empleados = buscarTodos();
           }

           try{

               FileOutputStream fos=new FileOutputStream(file);
               ObjectOutputStream oos=new ObjectOutputStream(fos);
               empleados.add(e);
               oos.writeObject(empleados);
                   System.out.println("Formulario guardado con exito!!");

           }catch(Exception exc){
             System.out.println(exc.getMessage());
           }
        }      
      
        public ArrayList<Empleado> buscarTodos(){
        
            File file =  new File("empleado.mio");
            try{
                FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis);
                empleados = (ArrayList<Empleado>) ois.readObject();
            }catch(Exception e){
                
            }
            
            return empleados;
        }
}
