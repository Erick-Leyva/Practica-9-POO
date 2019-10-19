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
public class EmpleadoAsalariado extends Empleado{
    
    private double SalarioSemanal;

    public EmpleadoAsalariado(String Nombre, String Apellido, String NSS,double SalarioSemanal) {
        super(Nombre, Apellido, NSS);
        this.SalarioSemanal=SalarioSemanal;
    }
    
    public double getSalarioSemanal(){
        return SalarioSemanal;
    }
    
    public double ingresos(){
        return getSalarioSemanal();
    }
}
