/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author emmnavmoj
 */
public class Cliente {
    // Atributos
    private String nombre;
    private String apellidos;
    private String email;
    private String telefono;
    private Date fechaAlta;
    private String provincia;
    
    // Constructor
    public Cliente(String nombre, String apellidos, Date fechaAlta, String provincia, String email, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.telefono = telefono;
        this.fechaAlta = fechaAlta;
        this.provincia = provincia;
    }    
 
    // Getter y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public String getEmail() {
        return email;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public Date getFechaAlta() {
        return fechaAlta;
    }
    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
    public String getProvincia() {
        return provincia;
    }
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    
    // toString para volcar el objeto en la tabla
    public String[] toArrayString() {
        // Definimos el formato dd/MM/yyyy
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fechaF = sdf.format(fechaAlta); // Formateamos la fecha
        return new String[]{nombre, apellidos, fechaF, provincia, email, telefono};
    }    
}
