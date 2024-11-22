/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad02;

/**
 *
 * @author Admin
 */
public class Animal {
    private String tipo;
    private String sonido;

  
    public Animal(String tipo, String sonido) {
        this.tipo = tipo;
        this.sonido = sonido;
    }

        public Animal() {
        this.tipo = "Animal desconocido";
        this.sonido = "Sonido desconocido";
    }

    
    public String getDescripcion() {
        return "Tipo: " + tipo + ", Sonido: " + sonido;
    }

   
    public String getSonido() {
        return sonido;
    }
}
