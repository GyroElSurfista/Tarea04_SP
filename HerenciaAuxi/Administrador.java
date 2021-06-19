import java.util.ArrayList;
public class Administrador extends Empleado
{
    private ArrayList<String> registro;
    public Administrador(String nombre){
        super(nombre);
        super.sueldo = 5000;
        registro = new ArrayList<String>();
    }
    public String administrar(){
        registro.add("El dia de hoy...");
        return "Administrando la empresa";
    }
}
