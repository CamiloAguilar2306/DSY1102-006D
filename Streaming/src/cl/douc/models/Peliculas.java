/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.douc.models;

/**
 *
 * @author Cetecom
 */
public class Peliculas extends Cine {
    public int calificacionPelicula;
    public String nombrePelicula;

    public Peliculas() {
    }

    public Peliculas(int calificacionPelicula, String nombrePelicula) {
        this.calificacionPelicula = calificacionPelicula;
        this.nombrePelicula = nombrePelicula;
    }

    public Peliculas(int calificacionPelicula, String nombrePelicula, String nombre, String duracion, int codigo, int costoBase) {
        super(nombre, duracion, codigo, costoBase);
        this.calificacionPelicula = calificacionPelicula;
        this.nombrePelicula = nombrePelicula;
    }

    public int getCalificacionPelicula() {
        return calificacionPelicula;
    }

    public void setCalificacionPelicula(int calificacionPelicula) {
        this.calificacionPelicula = calificacionPelicula;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
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
        if (calificacionPelicula > 4.5);
        costoBase = (int) 0.10;
        
        
        
        return costoBase;
    }

    @Override
    public void registrarPrecios(int costoBase) {
            calificacionPelicula += costoBase;
    }

    @Override
    public String toString() {
        return "Peliculas{" + "calificacionPelicula=" + calificacionPelicula + ", nombrePelicula=" + nombrePelicula + '}';
    }

  


}
