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
public class Serializar {
    
    public static void main(String[] args) {
                //primero generamos un Usuario
                Usuario usr = new Usuario(20,"Pedro");
                //Generamos un modelo de la clase que serializa
                PersistenciaUsuario p = new PersistenciaUsuario();
                //ajustamos su atributo usuario
                p.setU(usr);
                //Ahora si comprimimos
                p.guardar();
    }
    
}
