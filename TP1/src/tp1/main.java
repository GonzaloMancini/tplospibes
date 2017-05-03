/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

/**
 *
 * @author tecnica7
 */
public class main {
   public static void main(String[] args) {
      
       Cuadrado cuad = new Cuadrado();
       cuad.setAltura(2);
       cuad.setBase(1);        
       cuad.mostrarArea();
       
       Triangulo triang = new Triangulo();
       triang.setAltura(2);
       triang.setBase(4);        
       triang.mostrarArea();
       
       Rombo romb = new Rombo();
       romb.setAltura(3);
       romb.setBase(4);
       romb.mostrarArea();
       
       Trapecio trap = new Trapecio();
       trap.setAltura(4);
       trap.setBase(2);
       trap.mostrarArea();
    } 
    
}
