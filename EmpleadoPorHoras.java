/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomina;

/**
 *
 * @author poo02alu05
 */
public class EmpleadoPorHoras extends Empleado{
    
    private double Sueldo;
    private int Horas;
    
    public EmpleadoPorHoras(String Nombre, String Apellido, String NSS, double Sueldo, int Horas) {
        super(Nombre, Apellido, NSS);
        this.Sueldo=Sueldo;
        this.Horas=Horas;
    }
    
     public double getSueldo(){
        return Sueldo;
    }
    
    public int getHoras(){
        return Horas;
    } 
     
    public double ingresos(){
        return Horas<40?Horas*Sueldo:40*Sueldo+(Horas-40)*Sueldo*1.5;
    }
}
