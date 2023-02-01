
package com.mycompany.proyecto_7_sistemacaptacionclientes;

/**
 *
 * @author angegon
 */
public class Cliente {
    
    private String nombre ,apellido, email, telefono;
    
    public void setNombre(String valor){
        this.nombre = valor;
    }
    public String getNombre(){
        return nombre;
    }
    
    public void setApellido(String valor){
        this.apellido = valor;
    }
    public String getApellido(){
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", telefono=" + telefono + '}';
    }

    public String getNombreCompleto(){
        return nombre + " " + apellido;
    }
}
