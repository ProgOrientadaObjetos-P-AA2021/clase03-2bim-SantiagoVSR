/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int tipo;
        String rango;
        System.out.println("Cual decea ingresar.\n1) Estudiante"
                    +"\n2) Docente \n3) Policia");

        tipo = sc.nextInt();
            sc.nextLine();
        
            System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();
            System.out.println("Ingrese su apellido: ");
        String apellido= sc.nextLine();
        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();
        if(tipo ==1){
            
            System.out.println("Ingrese cuanto vale la matricula: ");
            double matricula = sc.nextDouble();
            Estudiante esp1= new Estudiante(nombre, apellido, 
                    edad, matricula);
            System.out.println(esp1);
        }if(tipo ==2){
            System.out.println("Ingrese cual es su salario: ");
            double salario = sc.nextDouble();
            Docente dc= new Docente(nombre, apellido, 
                    edad, salario);
            System.out.println(dc);
        }if(tipo ==3){
            System.out.println("Ingrese el rango en el que se encuentre: ");
            rango =  sc.next();
            
            Policia pl= new Policia(nombre, apellido, 
                    edad, rango);
            System.out.println(pl);
        }else if(tipo >3) {
            System.out.println("No existe");
        }
        
        
         /*   
        // TODO code application logic here
       Estudiante e = new Estudiante("René", "Elizalde", 33, 100.2);
        System.out.println(e);
        // Un docente hereda de una Persona y adicionalmente tiene 
        // la característia sueldo
        Docente d = new Docente("Luis", "Alvarez", 40, 1200); // falta implementar
        System.out.println(d);
        
        // Un policia hereda de una Persona y adicionalmente tiene 
        // la característia rango
        Policia p = new Policia("ALEX", "MENDOZA", 35, "Cabo"); // falta implementar
        System.out.println(p);*/
        
    }
    
}
