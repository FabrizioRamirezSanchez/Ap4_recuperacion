/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad03;

/**
 *
 * @author Admin
 */
public class Persona {
      private String nombre;
    private int edad;

   
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    
    public String getNombre() {
        return nombre;
    }

   
    public void mostrarEdad(int edad) {
        System.out.println("Edad: " + edad + " años");
    }

   
    public void saludar() {
        System.out.println("¡Hola! Soy " + nombre);
    }
}
