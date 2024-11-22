/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Actividad03;

/**
 *
 * @author Admin
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        Persona persona1 = new Persona("Juan", 30);
        Presidente presidente1 = new Presidente("María", 45, "País ABC");
        Presidente presidente2 = new Presidente();

        
        System.out.println("Nombre de la persona: " + persona1.getNombre());
        persona1.mostrarEdad(30);
        persona1.saludar();

        
        System.out.println("Detalles del presidente 1: " + presidente1.getDetalles());
        System.out.println("Título del presidente 2: " + presidente2.getTitulo());

        presidente1.dirigirDiscurso();
        presidente2.dirigirDiscurso();
    }
   }
    
