/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete3;

/**
 *
 * @author ASUS
 */
public class Reporte {
    protected String codigo;
    
    public Reporte(String r){
        establecerCodigo(r);
    }
    
    public void establecerCodigo(String r){
        codigo=r;
    }
    public String obtenerCodigo(){
        return codigo;
    }
    
    @Override
    public String toString(){
        return String.format("Codigo: %s", obtenerCodigo());
    }
}
