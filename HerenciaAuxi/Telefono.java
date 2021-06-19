public class Telefono
{
    boolean enEspera;
    public void recibirLlamada(){
        enEspera = true;
    }
    public String atenderLlamada(){
        return "Atendiendo llamada...";
    }
    public boolean getEnEspera(){
        return enEspera;
    }
}
