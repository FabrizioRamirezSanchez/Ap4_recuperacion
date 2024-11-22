/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad03;

/**
 *
 * @author Admin
 */
public class Presidente  extends Persona{
     private String pais;
     
       
    public Presidente(String nombre, int edad, String pais) {
        super(nombre, edad); 
        this.pais = pais;
    }

    
    public Presidente() {
        super("Desconocido", 0);
        this.pais = "Sin país asignado";
    }

    
    public String getDetalles() {
        return "Presidente " + getNombre() + " de " + pais;
    }

    
    public String getTitulo() {
        return "Presidente de " + pais;
    }

    
    public void dirigirDiscurso() {
        System.out.println(getNombre() + " está dirigiendo un discurso.");
    }

    
    public void anunciarMedida() {
        System.out.println("Anuncio importante desde " + pais + ".");
    }
}
