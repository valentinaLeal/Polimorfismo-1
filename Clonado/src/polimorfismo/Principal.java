/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author Estudiantes
 */
public class Principal {
    
    public static void main (String[] args ){
        
        Perro firulais;
        Perro rocky;
        firulais = new Perro();
        rocky = new Perro();
        
        for (int i=1; i<10; i++){
            firulais.ladrar();
        }
        
        rocky.ladrar(0);
        firulais.ladrar (0);
        rocky.ladrar(0);
   
    
    Cannisario rex;
    rex = new Cannisario();
    rex.detectarNarcoticos ();
    
    
    
            } 
}
