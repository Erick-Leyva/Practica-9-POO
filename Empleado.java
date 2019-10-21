package nomina;


public class Empleado {
    private String Nombre;
    private String Apellido;
    private String NSS;
    public Empleado(String Nombre, String Apellido, String NSS){
        this.Nombre=Nombre;
        this.Apellido=Apellido;
        this.NSS=NSS;
    }
    public String getNombre(){
        return Nombre;
    }
    public String getApellido(){
        return Apellido;
    }
    public String getNSS(){
        return NSS;
    }
    @Override
    public String toString(){ 
       return"Nombre: "+getNombre()+"\nApellido: "+getApellido()+"\nNumero de Seguro Social: "+getNSS();
    }
    public double ingresos(){
        return 0;
    }
}
