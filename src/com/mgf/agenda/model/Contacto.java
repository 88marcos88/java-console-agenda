package com.mgf.agenda.model;

import java.util.UUID;

public class Contacto {

    private final String id;

    private String nombre;

    private String telefono;

    private String apellidos;

    private String email;

    // constructor principal

    public Contacto(String nombre, String telefono, String apellidos,String email){


        if (nombre == null || nombre.isBlank()){
            throw new IllegalArgumentException("El nombre no puede ser null o vacio");
        }

        if (telefono == null || telefono.isBlank()){
            throw  new IllegalArgumentException("El teléfono no puede ser null o estar vacio");
        }

        this.id = UUID.randomUUID().toString();

        this.nombre = nombre;

        this.telefono = telefono;

        this.apellidos = apellidos;

        this.email = email;

    }


    //Sobrecargad de contructores
    public Contacto(String nombre, String telefono){

        this(nombre, telefono,null,null);

    }

    public Contacto(String nombre, String telefono,String apellidos){
        this(nombre, telefono, apellidos, null);
    }


    // get and set


    public String getId() {
        return id;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (telefono == null || telefono.isBlank()){
            throw  new IllegalArgumentException("El teléfono no puede ser null o estar vacio");
        }
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()){
            throw new IllegalArgumentException("El nombre no puede ser null o vacio");
        }
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        return nombre + " " + (apellidos != null ? apellidos : "") + " - " + telefono;
    }

}

