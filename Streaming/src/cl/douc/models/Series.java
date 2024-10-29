/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.douc.models;

/**
 *
 * @author Cetecom
 */
public class Series extends Cine {
    public int  temporadasFinalizadas;
    public int numerodeTemporadas;

    public Series() {
    }

    public Series(int temporadasFinalizadas, int numerodeTemporadas) {
        this.temporadasFinalizadas = temporadasFinalizadas;
        this.numerodeTemporadas = 0;
    }

    public Series(int temporadasFinalizadas, int numerodeTemporadas, String nombre, String duracion, int codigo, int costoBase) {
        super(nombre, duracion, codigo, costoBase);
        this.temporadasFinalizadas = temporadasFinalizadas;
        this.numerodeTemporadas = 0;
    }

    public int getTemporadasFinalizadas() {
        return temporadasFinalizadas;
    }

    public void setTemporadasFinalizadas(int temporadasFinalizadas) {
        this.temporadasFinalizadas = temporadasFinalizadas;
    }

    public int getNumerodeTemporadas() {
        return numerodeTemporadas;
    }

    public void setNumerodeTemporadas(int numerodeTemporadas) {
        this.numerodeTemporadas = numerodeTemporadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCostoBase() {
        return costoBase;
    }

    public void setCostoBase(int costoBase) {
        this.costoBase = costoBase;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }


    

    @Override
    public double costoSubscripcion() {
        costoBase = 1200;
        if (numerodeTemporadas > 3);
        costoBase = (int) 0.8;
        
        
        
        return costoBase;
                
    }

    @Override
    public void registrarPrecios(int costoBase) {
       numerodeTemporadas += costoBase;
    }

  


}
