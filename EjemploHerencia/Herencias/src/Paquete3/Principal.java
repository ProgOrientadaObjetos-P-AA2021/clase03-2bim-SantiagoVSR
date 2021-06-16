/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete3;

import herencias2.*;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Principal {
    public static void main(String[] args) {
        
        Estudiante est1 = new Estudiante("René", "Elizalde", 33, 100.2);
        Docente doc1 = new Docente("José", "Hincapié", 40, 1000); 
        Policia pol1 = new Policia("María", "MENDOZA", 35, "Cabo");
        Estudiante est2 = new Estudiante("Patricia", "Velez", 31, 100.2);
        Docente doc2 = new Docente("Luis", "Alvarez", 38, 1000); 
        Policia pol2 = new Policia("ALEX", "Medina", 33, "Cabo");
        
        ArrayList listaDocente = new ArrayList<>();
        listaDocente.add(doc1);
        listaDocente.add(doc2);
        
        ArrayList listaEstudiante = new ArrayList<>();
        listaEstudiante.add(est1);
        listaEstudiante.add(est2);

        ArrayList listaPolicia = new ArrayList<>();
        listaPolicia.add(pol1);
        listaPolicia.add(pol2);
        
        ReporteDocente rd = new ReporteDocente("0001Doc", listaDocente);
        rd.establecerPromedioSueldos();
        ReporteEstudiante re = new ReporteEstudiante("0001Est", listaEstudiante);
        re.establecerPromedioMatriculas();
        ReportePolicia rp = new ReportePolicia("0001Pol", listaPolicia);
        rp.establecerPromedioEdad();
        
        System.out.println(rd);
        System.out.println("");
        System.out.println(re);
        System.out.println("");
        System.out.println(rp);
        
    }
}
