/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enero21;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author natal
 */
public class Enero21 {

    private Scanner sc;
    
    public static void main(String[] args) {
        SalonGuitarras metodos = new SalonGuitarras();
        GuitarraAcustica guitarra1 = new GuitarraAcustica( 1, "negro", "usada", "Gibson","G1");
        GuitarraElectrica guitarra2 = new GuitarraElectrica(6, "Amarillo", "Nueva", "Fender","G2");
        GuitarraElectroAcustica guitarra3 = new GuitarraElectroAcustica(6, "Morado", "Nueva", "Washburn","G3");
        Guitarra guitarra4 = new GuitarraAcustica(6, "negro", "Usada", "Gibson","G4");
        Guitarra guitarra5 = new GuitarraElectrica(6, "negro", "Usada", "Gibson","G5");
        Guitarra bajo1 = new BajoElectrico(4, "blanco", "Nuevo", "Washburn", "B1");
        Guitarra bajo2 = new BajoElectrico(4, "blanco y negro", "Nuevo", "Washburn", "B2");
        
        metodos.agregarGuitarra(guitarra1);
        metodos.agregarGuitarra(guitarra2);
        metodos.agregarGuitarra(guitarra3);
        metodos.agregarGuitarra(guitarra4);
        metodos.agregarGuitarra(guitarra5);
        metodos.agregarGuitarra(bajo1);
        metodos.agregarGuitarra(bajo2);
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el serial de la guitarra");
        String serial=sc.nextLine();
        metodos.obtenerGuitarra(serial);
        
        System.out.println("Las guitarras que el salon posee son: ");
        System.out.println(metodos.consultarGuitarra());
   
        

        
        
    
        
        
        
}
    
   
}