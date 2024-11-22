/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad01;

/**
 *
 * @author Admin
 */
public class Pais {
      private String nombre;
    private String idioma;

    
    public Pais(String nombre, String idioma) {
        this.nombre = nombre;
        this.idioma = idioma;
    }

   
    public void mostrarInfo(String region, int poblacionMillones) {
        System.out.println("País: " + nombre);
        System.out.println("Idioma: " + idioma);
        System.out.println("Región: " + region);
        System.out.println("Población: " + poblacionMillones + " millones");
    }

   
    public void saludar(String mensaje) {
        System.out.println(nombre + " dice: " + mensaje);
    }
}
