public class AtencionCliente extends Empleado
{
    private Telefono telf; 
    public AtencionCliente(String nombre){
        super(nombre);
        super.sueldo = 4000;
        telf = new Telefono();
    }
    public String atenderCliente(){
        String reporte = "";
        telf.recibirLlamada();
        if(telf.getEnEspera()){
            telf.atenderLlamada(); 
            reporte = "Cliente atendido";
        }else{
            reporte = "Ningun cliente en espera";
        }
        return reporte;
    }
}
