/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SerializacionForm;

import java.io.*;

/**
 *
 * @author GrobbierElder
 */
public class Empleado implements Serializable{
    
    private String Nombre, Apaterno, Amaterno;
    private Float SueldoBase;
    private String Departamento;

    public Empleado() {
    }

    public Empleado(String Nombre, String Apaterno, String Amaterno, Float SueldoBase, String Departamento) {
        this.Nombre = Nombre;
        this.Apaterno = Apaterno;
        this.Amaterno = Amaterno;
        this.SueldoBase = SueldoBase;
        this.Departamento = Departamento;
    }

    @Override
    public String toString() {
        return "Empleado{" + "Nombre=" + Nombre + ", Apaterno=" + Apaterno + ", Amaterno=" + Amaterno + ", SueldoBase=" + SueldoBase + ", Departamento=" + Departamento + '}';
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApaterno() {
        return Apaterno;
    }

    public void setApaterno(String Apaterno) {
        this.Apaterno = Apaterno;
    }

    public String getAmaterno() {
        return Amaterno;
    }

    public void setAmaterno(String Amaterno) {
        this.Amaterno = Amaterno;
    }

    public Float getSueldoBase() {
        return SueldoBase;
    }

    public void setSueldoBase(Float SueldoBase) {
        this.SueldoBase = SueldoBase;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }


   
   
}
