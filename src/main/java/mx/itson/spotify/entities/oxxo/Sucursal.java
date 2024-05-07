/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.spotify.entities.oxxo;

/**
 *
 * @author Uli23
 */
public class Sucursal {

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the Gerente
     */
    public String getGerente() {
        return Gerente;
    }

    /**
     * @param Gerente the Gerente to set
     */
    public void setGerente(String Gerente) {
        this.Gerente = Gerente;
    }
    
    private String nombre;
    private String telefono;
    private String Gerente;
    
    
}
