package com.favio.recyclerview.modelos;

public class Persona {

    private Integer Id;
    private String Nombre;
    private String Apellido;
    private Integer Edad;

    public Persona(Integer id, String nombre, String apellido, Integer edad) {
        Id = id;
        Nombre = nombre;
        Apellido = apellido;
        Edad = edad;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void setEdad(Integer edad) {
        Edad = edad;
    }
}
