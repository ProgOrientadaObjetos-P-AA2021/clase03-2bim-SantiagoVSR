/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete3;

import herencias2.Policia;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class ReportePolicia extends Reporte{
    
    private double promedioEdad;
    ArrayList<Policia> lista;
    
    public ReportePolicia(String r,ArrayList<Policia> ls) {
        super(r);
        establecerLista(ls);
    }
    
    public void establecerPromedioEdad() {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + obtenerLista().get(i).getEdad();
        }
        promedioEdad = suma / lista.size();
    }

    public double obtenerPromedioEdad() {
        return promedioEdad;
    }
    
    public void establecerLista(ArrayList<Policia> ls) {
        lista = ls;
    }

    public ArrayList<Policia> obtenerLista() {
        return lista;
    }

    @Override
    public String toString() {
        String cadena = String.format("%sReporte de la policia:\n",
                super.toString());
        for (int i = 0; i < lista.size(); i++) {
            cadena = String.format("%s - %s %s - %d\n", cadena,
                    obtenerLista().get(i).getNombre(),
                    obtenerLista().get(i).getApellido(),
                    obtenerLista().get(i).getEdad());
        }
        cadena = String.format("%s *Promedio de Edades: %.2f", cadena,
                obtenerPromedioEdad());
        return cadena;
    }
}
