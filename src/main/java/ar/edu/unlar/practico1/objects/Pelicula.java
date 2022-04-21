/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.unlar.practico1.objects;

/**
 *
 * @author Administrador
 */
public class Pelicula {
    private String titulo;
    private Integer anioEstreno;
    
    private Categoria categoria;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAnioEstreno() {
        return anioEstreno;
    }

    public void setAnioEstreno(Integer anioEstreno) {
        this.anioEstreno = anioEstreno;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", anioEstreno=" + anioEstreno + "categoria="+categoria.getNombre()+'}';
    }
    
    
    
}
