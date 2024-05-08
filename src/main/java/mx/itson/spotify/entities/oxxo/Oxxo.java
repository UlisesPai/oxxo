/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.spotify.entities.oxxo;

import com.google.gson.Gson;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Uli23
 */
public class Oxxo {

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the gerente
     */
    public String getGerente() {
        return gerente;
    }

    /**
     * @param gerente the gerente to set
     */
    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    /**
     * @return the sucursal
     */
    public Sucursal getSucursal() {
        return sucursal;
    }

    /**
     * @param sucursal the sucursal to set
     */
    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the articulos
     */
    public List <Articulos> getArticulos() {
        return articulos;
    }

    /**
     * @param articulos the articulos to set
     */
    public void setArticulos(List <Articulos> articulos) {
        this.articulos = articulos;
    }
    
    //nuevo mensaje para el gitHub
    //Prueba para el GitHub
    private Date fecha;
    private String gerente;
    private Sucursal sucursal;
    private Cliente cliente;
    private List <Articulos> articulos;
    
    public Oxxo deserealizar (String json){
        Oxxo oxxo = new Oxxo();
        try{
            oxxo = new Gson().fromJson(json, Oxxo.class);
        }catch(Exception ex){
            System.err.println("Ocurrio un error al deserializar " + ex.getMessage());
        }
        return oxxo;
    }
    
}
