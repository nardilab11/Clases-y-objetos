/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Cancion {
    //Atributos
    public String nombre;
    //metodos
    
    public Cancion(String titulo){
        this.nombre = titulo;
    }    
    // Hace obligatorio poner un titulo, que queda asignado a nombre
    public void sonar(){
        System.out.println("Sonando " + this.nombre);
        //this.: haga referencia al nombre que tiene en la memoria
    }
}
