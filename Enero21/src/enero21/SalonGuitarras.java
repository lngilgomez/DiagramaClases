/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enero21;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author natal
 */
public class SalonGuitarras {

    
  private ArrayList<Guitarra> guitarras;

  public SalonGuitarras() {
  
      guitarras = new ArrayList<Guitarra>();
  }
    
  
  public Guitarra obtenerGuitarra(String serial){
      
      Guitarra guitarraObtenida = null;
      for (int i = 0; i< guitarras.size(); i++) {
          if (guitarras.get(i).getSerial().equalsIgnoreCase(serial)) {
              guitarraObtenida = guitarras.get(i);
              System.out.println(guitarraObtenida.toString());
              
          }
          
      }
      
      return guitarraObtenida;
}
  
  public void agregarGuitarra (Guitarra guitarra){
      

      guitarras.add(guitarra);
      
  

  }
  
  public String consultarGuitarra(){
      String guitarrasguardadas ="";
      
      for (int i = 0; i < guitarras.size(); i++) {
          guitarrasguardadas+= "\n" + (i+1) + ". " + guitarras.get(i).toString();
      }
  
      return guitarrasguardadas;
  }
    
    
}
