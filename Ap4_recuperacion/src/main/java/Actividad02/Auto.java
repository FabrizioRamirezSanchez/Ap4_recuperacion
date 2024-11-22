/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad02;

/**
 *
 * @author Admin
 */
public class Auto {
     private String color;
    private String marca;

    
    public Auto(String color, String marca) {
        this.color = color;
        this.marca = marca;
    }

    
    public Auto() {
        this.color = "Color desconocido";
        this.marca = "Marca desconocida";
    }

    
    public void mostrarInfo() {
        System.out.println("Auto - Color: " + color + ", Marca: " + marca);
    }

   
    public void arrancar() {
        System.out.println("El auto " + marca + " de color " + color + " está arrancando.");
    }

   
    public void arrancar(String destino) {
        System.out.println("El auto " + marca + " está arrancando hacia " + destino + ".");
    }
}
