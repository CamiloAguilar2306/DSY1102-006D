/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package streaming;

import cl.douc.models.Peliculas;
import cl.douc.models.Documentales;
import cl.douc.models.Series;
import cl.douc.models.Cine;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
/**
 *
 * @author Cetecom
 */
public class Streaming{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List <Streaming>  streaming =  new ArrayList<>();
        Scanner scanner = new Scanner (System.in);
        Series series = new Series();
        

        Peliculas peliculas = new Peliculas();
        Documentales documentales = new Documentales();
        
        while(true){
            
            System.out.println(" 1: REGISTRO DE PELICULAS");
             System.out.println(" 2: REGISTRO DE SERIES");
              System.out.println(" 4: REGISTRO DE DOCUMENTALES");
                System.out.println(" 5: LISTAR TODO");
                 System.out.println(" 6: SALIR");
                 
                 
                 int opcion = scanner.nextInt();
                 switch (opcion){
                     case 1 :
                         String nombrePelicula = scanner.nextLine();
    
                         
                 }
              
        }
            
        
 }
     

    
}