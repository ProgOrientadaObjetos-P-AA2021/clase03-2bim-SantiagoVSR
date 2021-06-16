/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete3;

import herencias2.Docente;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class ReporteDocente extends Reporte{
    private double promedioSueldo;
    ArrayList<Docente> lista;
    public ReporteDocente(String r, ArrayList<Docente> ls) {
        super(r);
        establecerLista(ls);
    }
    
    public void establecerPromedioSueldos() {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + obtenerLista().get(i).getSueldo();
        }
        promedioSueldo = suma / lista.size();
    }

    public double obtenerPromedioSueldos() {
        return promedioSueldo;
    } 

    public void establecerLista(ArrayList<Docente> ls) {
        lista = ls;
    }
    
    public ArrayList<Docente> obtenerLista() {
        return lista;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("%sReporte de los Docentes:\n",
                super.toString());
        for (int i = 0; i < lista.size(); i++) {
            cadena = String.format("%s - %s %s - %.2f\n", cadena,
                    obtenerLista().get(i).getNombre(),
                    obtenerLista().get(i).getApellido(),
                    obtenerLista().get(i).getSueldo());
        }
        cadena = String.format("%s *Promedio del sueldos: %.2f", cadena,
                obtenerPromedioSueldos());
        return cadena;
    }
}
