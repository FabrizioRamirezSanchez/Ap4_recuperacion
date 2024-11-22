/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad01;

/**
 *
 * @author Admin
 */
public class Curso {
    private String nombre;
    private int duracion; 

   
    public Curso(String nombre, int duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
    }

    
    public String getDetalles() {
        return "Curso: " + nombre + ", Duración: " + duracion + " horas";
    }

    
    public int getDuracion() {
        return duracion;
    } 
}
