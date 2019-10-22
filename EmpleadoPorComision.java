package nomina;

public class EmpleadoPorComision extends Empleado{
    
    double VentasTotales;
    double tasaComision;
    
    public EmpleadoPorComision(String Nombre, String Apellido, String  NSS, double VentasTotales, double tasaComision) {
        super(Nombre, Apellido, NSS);
        this.VentasTotales = VentasTotales;
        this.tasaComision = tasaComision; 
    }
    public double ingresos(){
        return tasaComision*VentasTotales;
    }
    
}
