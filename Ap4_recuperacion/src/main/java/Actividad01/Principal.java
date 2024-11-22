/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Actividad01;

/**
 *
 * @author Admin
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Curso curso1 = new Curso("Matemáticas", 40);
        Curso curso2 = new Curso("Historia", 30);

        Pais pais1 = new Pais("México", "Español");
        Pais pais2 = new Pais("Japón", "Japonés");

       
        System.out.println("Detalles del curso 1: " + curso1.getDetalles());
        System.out.println("Duración del curso 2: " + curso2.getDuracion() + " horas");

        
        pais1.mostrarInfo("América del Norte", 128);
        pais2.mostrarInfo("Asia", 126);

        pais1.saludar("Hola a todos desde México");
        pais2.saludar("Konnichiwa desde Japón");
    }
}

