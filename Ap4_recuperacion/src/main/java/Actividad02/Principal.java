/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Actividad02;

/**
 *
 * @author Admin
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal animal1 = new Animal("Perro", "Ladrar");
        Animal animal2 = new Animal("Gato", "Maullar");

        Auto auto1 = new Auto("Rojo", "Toyota");
        Auto auto2 = new Auto();

        //  método de Animal
        System.out.println("Animal 1: " + animal1.getDescripcion());
        System.out.println("Animal 2 sonido: " + animal2.getSonido());

        //  método de Auto
        auto1.mostrarInfo();
        auto2.mostrarInfo();

        auto1.arrancar();
        auto2.arrancar();
    }
   }
    
