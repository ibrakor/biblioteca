package com.ibrakor.Biblioteca;

import java.util.Date;

public class Libro {
    private String titulo;
    private Integer isbn;
    private String autor;
    private String genero;
    private Date fechapublicacion;


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getIsbn() {
        return isbn;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getFechapublicacion() {
        return fechapublicacion;
    }

    public void setFechapublicacion(Date fechapublicacion) {
        this.fechapublicacion = fechapublicacion;
    }
}
