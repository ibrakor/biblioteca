package com.ibrakor.Biblioteca;

import java.util.Date;

public class Prestamo {
    private Libro libro;
    private Usuario usuario;
    private Date fechaprestamo;
    private Date fechadevolucion;


    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getFechaprestamo() {
        return fechaprestamo;
    }

    public void setFechaprestamo(Date fechaprestamo) {
        this.fechaprestamo = fechaprestamo;
    }

    public Date getFechadevolucion() {
        return fechadevolucion;
    }

    public void setFechadevolucion(Date fechadevolucion) {
        this.fechadevolucion = fechadevolucion;
    }

    public String toString() {
        return "El prestamo ha sido realizado por el usuario " + usuario.getNombre() + " " + usuario.getApellidos() + " con DNI " + usuario.getDnis() + " el dia " + getFechaprestamo() + " y la fecha de devolucion es el dia " + getFechadevolucion() + ". El libro prestado es " + libro.getTitulo() + " con ISBN " + libro.getIsbn() + ".";
    }
}