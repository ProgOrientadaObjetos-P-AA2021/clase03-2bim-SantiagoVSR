/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias2;

/**
 *
 * @author ASUS
 */
public class Docente extends Persona{
    private double sueldo;
    public Docente(String n, String a, int e, double sl) {
        super(n, a, e);
        setSueldo(sl);
    }
    
    /*@Override
    public void setNombre(String n){
        nombre = n.toUpperCase();    
    }*/
    public void setSueldo(double sl){
        this.sueldo=sl;
        if(sueldo < 1000)
            sueldo = 1000;
        else
            sueldo =sl;
    }
    
    public double getSueldo(){
        return sueldo;
    }
    
    @Override
    public String toString(){
    
        return String.format("%s - %.2f", super.toString(), getSueldo());
    }
}
