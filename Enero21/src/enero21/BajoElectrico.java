/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enero21;

/**
 *
 * @author natal
 */
public class BajoElectrico extends Guitarra{

    public BajoElectrico(int numeroCuerdas, String color, String estadoGuitarra, String marca, String serial) {
        super(numeroCuerdas, color, estadoGuitarra, marca, serial);
    }

    @Override
    public void tocar() {
        System.out.println("Tocando Bajo");
    }

    @Override
    public void afinar() {
        System.out.println("afinando bajo");
    }

    @Override
    public void sonar() {
        System.out.println("sonando bajo");
    }
    
    
    
    
    
}
