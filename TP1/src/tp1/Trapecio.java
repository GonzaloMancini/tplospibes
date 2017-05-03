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
public class Trapecio extends Figura {
    void mostrarArea() {
        area=(base+base*altura)/2;
        System.out.println("Area del trapecio: " + area);
        
    }
    
}
