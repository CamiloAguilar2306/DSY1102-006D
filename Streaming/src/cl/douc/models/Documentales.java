/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.douc.models;

/**
 *
 * @author Cetecom
 */
public class Documentales extends Cine{
    public String enfoqueDocumental;
    public int duracionDocumental;
    public String nombreDocumental;

    public Documentales() {
    }

    public Documentales(String enfoqueDocumental, int duracionDocumental, String nombreDocumental) {
        this.enfoqueDocumental = enfoqueDocumental;
        this.duracionDocumental = duracionDocumental;
        this.nombreDocumental = nombreDocumental;
    }

    public Documentales(String enfoqueDocumental, int duracionDocumental, String nombreDocumental, String nombre, String duracion, int codigo, int costoBase) {
        super(nombre, duracion, codigo, costoBase);
        this.enfoqueDocumental = enfoqueDocumental;
        this.duracionDocumental = duracionDocumental;
        this.nombreDocumental = nombreDocumental;
    }

    public String getEnfoqueDocumental() {
        return enfoqueDocumental;
    }

    public void setEnfoqueDocumental(String enfoqueDocumental) {
        this.enfoqueDocumental = enfoqueDocumental;
    }

    public int getDuracionDocumental() {
        return duracionDocumental;
    }

    public void setDuracionDocumental(int duracionDocumental) {
        this.duracionDocumental = duracionDocumental;
    }

    public String getNombreDocumental() {
        return nombreDocumental;
    }

    public void setNombreDocumental(String nombreDocumental) {
        this.nombreDocumental = nombreDocumental;
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
        if (duracionDocumental > 90);
        costoBase = (int) 0.5;
        
        
        
        return costoBase;
    }

    @Override
    public void registrarPrecios(int costoBase) {
     duracionDocumental += costoBase;
    }
    
}
