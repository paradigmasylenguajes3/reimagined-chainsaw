/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.unlar.practico1;

import ar.edu.unlar.practico1.objects.Categoria;
import ar.edu.unlar.practico1.objects.Pelicula;

/**
 *
 * @author Administrador
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pelicula spiderman = new Pelicula();
        
        Categoria categoria = new Categoria();
        categoria.setNombre("Accion");
        
        Categoria otraCategoria = new Categoria();
        otraCategoria.setNombre("Ciencia Ficcion");
        
        spiderman.setTitulo("lejos de casa");
        spiderman.setAnioEstreno(1994);
        spiderman.setCategoria(categoria);
        
        System.out.println(spiderman);
        
        System.out.println("Programa Terminado!!");
        
    }
    
}
