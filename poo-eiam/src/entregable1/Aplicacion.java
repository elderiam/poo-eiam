/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entregable1;

/**
 *
 * @author GrobbierElder
 */
public class Aplicacion {
    
    public static void main(String[] args) {
        
        Usuario item=new Usuario();
        item.setAltura(1.83f);
        item.setPeso(82.5f);
        Imc prueba=new Imc();
        prueba.u=item;
        System.out.println(prueba.calcular());

    }
    
}
