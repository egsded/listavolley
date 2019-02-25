package com.example.listavolley;

public class persona {
    private Integer id;
    private String Nombre;
    private String Apellido;
    private Integer Edad;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public void setEdad(Integer edad) {
        Edad = edad;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public Integer getEdad() {
        return Edad;
    }
}
