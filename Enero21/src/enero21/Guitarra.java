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
public abstract class Guitarra {

    private int numeroCuerdas;
    private String color;
    private String estadoGuitarra;
    private String marca;
    private String serial;

    public abstract void tocar();

    public abstract void afinar();

    public abstract void sonar();  
    
    public void cambiarCuerdas(){
    
        System.out.println("Cambiando Cuerdas");
        
    };

    public Guitarra(int numeroCuerdas, String color, String estadoGuitarra, String marca, String serial) {
        this.numeroCuerdas = numeroCuerdas;
        this.color = color;
        this.estadoGuitarra = estadoGuitarra;
        this.marca = marca;
        this.serial = serial;
    }

  
    public String toString() {
        return "Guitarra{" + "numeroCuerdas=" + numeroCuerdas + ", color=" + color + ", estadoGuitarra=" + estadoGuitarra + ", marca=" + marca + ", serial=" + serial + '}';
    }

    public int getNumeroCuerdas() {
        return numeroCuerdas;
    }

    public void setNumeroCuerdas(int numeroCuerdas) {
        this.numeroCuerdas = numeroCuerdas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEstadoGuitarra() {
        return estadoGuitarra;
    }

    public void setEstadoGuitarra(String estadoGuitarra) {
        this.estadoGuitarra = estadoGuitarra;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

   
   

}
