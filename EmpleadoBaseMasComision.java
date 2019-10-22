package nomina;
 
public class EmpleadoBaseMasComision extends EmpleadoPorComision{
    double salarioBase;
    public EmpleadoBaseMasComision(String Nombre, String Apellido, String NSS, double VentasTotales, double tasaComision, double salarioBase) {
        super(Nombre, Apellido, NSS, VentasTotales, tasaComision);
        this.salarioBase=salarioBase;
    }
    public double ingresos(){
        return super.ingresos()+salarioBase;
    }
    public double getSalarioBase(){
        return salarioBase;
    }
    public double setSalarioBase(double nuevoSalario){
        return nuevoSalario;
    }
}
