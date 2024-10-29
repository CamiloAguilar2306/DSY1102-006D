/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.douc.models;

/**
 *
 * @author Cetecom
 */
public  abstract class Cine implements Subscripcion {
    
    public String nombre;
    public String duracion;
    public int codigo;
    public int costoBase;
    public String calificacion;

    public Cine() {
    }

    public Cine(String nombre, String duracion, int codigo, int costoBase) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.codigo = codigo;
        this.costoBase = costoBase;
    }

  
    @Override
    public String toString() {
        return "Cine{" + "nombre=" + nombre + ", duracion=" + duracion + ", codigo=" + codigo + ", costoBase=" + costoBase + ", calificacion=" + calificacion + '}';
    }


    
}
