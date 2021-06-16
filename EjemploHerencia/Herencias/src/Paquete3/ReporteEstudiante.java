/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete3;
import herencias2.Estudiante;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public class ReporteEstudiante extends Reporte{
    private double promedioMatricula;

    ArrayList<Estudiante> lista;

    public ReporteEstudiante(String r,ArrayList<Estudiante> ls) {
        super(r);
        establecerLista(ls);
    }
    
    public void establecerPromedioMatriculas(){
        double suma = 0;
        for(int i = 0; i < lista.size();i++){
            suma = suma + obtenerLista().get(i).getMatricula();
        }
       promedioMatricula = suma / lista.size(); 
    }

    public double obtenerPromedioMatriculas(){
       return promedioMatricula;
    }
    
    public void establecerLista(ArrayList<Estudiante> ls){
       lista = ls; 
    }
   
    public ArrayList<Estudiante> obtenerLista(){
       return lista;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("%sReporte de los Estudiantes:\n",
                super.toString());
        for (int i = 0; i < lista.size(); i++) {
            cadena = String.format("%s - %s %s - %.2f\n", cadena,
                    obtenerLista().get(i).getNombre(),
                    obtenerLista().get(i).getApellido(),
                    obtenerLista().get(i).getMatricula());
        }
        cadena = String.format("%s *Promedio de las matrículas: %.2f", cadena,
                obtenerPromedioMatriculas());
        return cadena;
    } 
}
